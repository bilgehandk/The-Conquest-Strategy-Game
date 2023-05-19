import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextArea;

public class RiskFrame extends JFrame {
	ArrayList<HexButton> hexButtons= new ArrayList<>();
	
	SoldierAddFrame soldierAddFrame;

	private JPanel contentPane;
	
	 public HexButton searchClicked() {
	    	for(HexButton a : hexButtons) {
	    		if(a.isClicked)
	    			return a;
	    	}
	    	return null;
	   }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RiskFrame frame = new RiskFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public RiskFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		Icon icon = new ImageIcon("./hexagon.png");
		
		for(int i=0; i<42; i++) {
			
			HexButton btnNewButton = i == 0 || i == 39 ? new HexButton("a",i) : new HexButton("b", i);
			if(i == 0 || i == 39)
			{
				btnNewButton.setBackground(RiskGameSys.setFirstColor("RED"));
			}
			
			hexButtons.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					soldierAddFrame = new SoldierAddFrame(btnNewButton);
					soldierAddFrame.setVisible(true);
					
					//btnNewButton.addDefaultSoldier();
					//System.out.println(btnNewButton);
					
					//btnNewButton.setCharacter(btnNewButton.getSoldierPower() + "");	
					if(searchClicked() == null) {
						btnNewButton.isClicked = true;
					}else {
						HexButton found = searchClicked();
						if(btnNewButton.getSoldierPower() == found.getSoldierPower())
							System.out.println("It is equal");
					}
					//btnNewButton.paintComponent(getGraphics());
					
					//btnNewButton.setCharacter(btnNewButton.getBtnIndex()+"");
				}
			});	
			hexButtons.get(0).setBounds(17, 6, 75, 75);
			contentPane.add(hexButtons.get(0));
		}
		
		
		
		
		
		
		int x1=17,y1=6,k=0;
		
		
		for(int j=1;j<=4;j++) {
		
		boolean yc=true;
		for(int i=0;i<500;i+=50)
		{
		
			if(yc)
			{
				hexButtons.get(k).setBounds(x1+i, y1, 75, 75);
				contentPane.add(hexButtons.get(k));
				y1+=28;
				yc=false;
			}
			
			else
			{
				hexButtons.get(k).setBounds(x1+i, y1, 75, 75);
				contentPane.add(hexButtons.get(k));
				y1-=28;
				yc=true;
			}
			
			
			k++;
			
			
			
		}
		
		x1=17;
		y1+=56;
		
}
		
	
		
		contentPane.setLayout(null);
		
		
		
		
		
	}
}
