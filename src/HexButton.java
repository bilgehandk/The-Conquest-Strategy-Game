import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JButton;

public class HexButton extends JButton implements Area{

    private static final long serialVersionUID = 8703517515706326251L;
    Polygon bounds;
    String character;
    Boolean clicked;
    int flag = 0;
    int btnIndex;
    int owner = 0;
    // AREA HAS-A RELATIONSHIP
    boolean isClicked = false;
    
    ArrayList<Soldier> areaSoldier = new ArrayList();
    
//    
//    public void addDefaultSoldier() {
//    	areaSoldier.add(new Jackman(5));
//    }
//    
    public void addSoldier(int i, int amount) {
    	if(i == 0) {
    		areaSoldier.add(new Jackman(amount));
    	}else if(i == 1) {
    		areaSoldier.add(new Archer(amount));
    	}else {
    		areaSoldier.add(new Spearman(amount));
    	}
    }
    
    public int getSoldierPower() {
    	int totalPower = 0;
    	for(Soldier a : areaSoldier) {
    		totalPower += a.getCalculatedPower();
    	}
    	return totalPower;
    }
    
    public int getBtnIndex() {
		return btnIndex;
	}

	public void setBtnIndex(int btnIndex) {
		this.btnIndex = btnIndex;
	}

    /**
     * Creates a hexagonal button with a single character label
     * @param character
     */
    public HexButton(String character, int btnIndex) {
    	this.btnIndex = btnIndex;
        this.calculateBounds();
        this.setBackground(Color.GRAY);
        this.setForeground(Color.WHITE);
        this.character = character;
        this.clicked = false;
		this.setOpaque(true);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
    }
    
    /**
     * Creates a hexagon of certain height / width and ratio multiplier
     * @param width
     * @param height
     * @param ratio
     * @return
     */
    private Polygon hexagon(int width, int height, double ratio) {
        Polygon hexagon = new Polygon();
        for (int i = 0; i < 6; i++) {
            int x = width / 2 + (int)((width - 2) / 2 * Math.cos(i * 2 * Math.PI / 6) * ratio);
            int y = height / 2 + (int)((height - 2) / 2 * Math.sin(i * 2 * Math.PI / 6) * ratio);            
            hexagon.addPoint(x,y);
        }        
        return hexagon;
    }
    
    private void calculateBounds() {                
        this.bounds = this.hexagon(this.getWidth(), this.getHeight(), 1.0);
    }

    /**
     * Returns whether a certain point is within the bounds of this button.
     */
    @Override
    public boolean contains(Point p) {
        return this.bounds.contains(p);
    }

    /**
     * Returns whether supplied x,y coordinates is within the bounds of this button.
     */
    @Override
    public boolean contains(int x, int y) {
        return this.bounds.contains(x, y);
    }

    /**
     * Sets the dimension of the button
     */
    @Override
    public void setSize(Dimension d) {
        super.setSize(d);
        this.calculateBounds();
    }

    /**
     * Sets the dimension of the button
     */
    @Override
    public void setSize(int w, int h) {
        super.setSize(w, h);
        this.calculateBounds();
    }

    /**
     * Sets the bounds of the button
     */
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        this.calculateBounds();
    }

    /**
     * Sets the bounds of the button
     */
    @Override
    public void setBounds(Rectangle r) {
        super.setBounds(r);
        this.calculateBounds();
    }

    /**
     * Draws the button
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        
        // Draw the black border
        graphics.setColor(Color.BLACK);
        Polygon stroke = this.hexagon(getWidth(), getHeight(), 1.05);
        graphics.drawPolygon(stroke);
        graphics.fillPolygon(stroke);

        // Draw the inside background
        Polygon inside = this.hexagon(getWidth(), getHeight(), 0.9);
        graphics.setColor(getBackground());
        graphics.drawPolygon(inside);
        graphics.fillPolygon(inside);
        
        // Draw the label
        Font font = new Font("Arial", Font.BOLD, 16);
        graphics.setFont(font);
        graphics.setColor(getForeground());
        
        FontMetrics fontMetrics = getFontMetrics( font );
        int width = fontMetrics.stringWidth(this.character + "");
        int height = fontMetrics.getHeight();
        
        graphics.drawString(this.character + "", (getWidth() - width) / 2 , (getHeight() + height - 25) / 2);
        
    }
    
    /**
     * Performs some visual changes and changes the logic clicked state.
     */
    public void click() {
        this.clicked = true;
        this.setBackground(Color.MAGENTA);
        this.setForeground(Color.BLACK);        
    }
    
    /**
     * Returns the clicked state of the button
     */
    public Boolean isClicked() {
        return this.clicked;
    }

	

	public void setBounds(Polygon bounds) {
		this.bounds = bounds;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public Boolean getClicked() {
		return clicked;
	}

	public void setClicked(Boolean clicked) {
		this.clicked = clicked;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setOwnership(int owner) {
		this.owner = owner;
	}
    
}