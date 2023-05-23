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
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RiskFrame extends JFrame {
	ArrayList<HexButton> hexButtons= new ArrayList<>();
	
	SoldierAddFrame soldierAddFrame;
	StartPanel startPanel = new StartPanel();
	
	

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

	/**
	 * Create the frame.
	 */
	public RiskFrame(Player player1, Player player2) {
		player1.setGold(100);
		player2.setGold(100);
		player1.setTurn(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		Icon icon = new ImageIcon("./hexagon.png");
		
		for(int i=0; i<42; i++) {
			if(i == 0) {
				HexButton player1SpawnPoint = new HexButton(player1.getNickname(), i); 
				hexButtons.add(player1SpawnPoint);
			}else if(i == 39) {
				HexButton player2SpawnPoint = new HexButton(player2.getNickname(), i);
				hexButtons.add(player2SpawnPoint);
			}else {
				HexButton btnNewButton = new HexButton("-", i);
				hexButtons.add(btnNewButton);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						if(player1.isTurn())
						{
							soldierAddFrame = new SoldierAddFrame(btnNewButton, player1);
							player1.setTurn(false);
							player2.setTurn(true);
						}else {
							soldierAddFrame = new SoldierAddFrame(btnNewButton, player2);
							player1.setTurn(true);
							player2.setTurn(false);
						}
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
			}
			//HexButton btnNewButton = i == 0 || i == 39 ? new HexButton("a",i) : new HexButton("b", i);
			
				
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
		
		JLabel lblNewLabel = new JLabel("ROUND");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(247, 347, 121, 16);
		contentPane.add(lblNewLabel);
		
		JLabel player1Text = new JLabel("");
		player1Text.setBounds(48, 347, 98, 16);
		contentPane.add(player1Text);
		player1Text.setText(player1.getNickname());
		
		JLabel player2Text = new JLabel("");
		player2Text.setBounds(453, 347, 107, 16);
		contentPane.add(player2Text);
		player2Text.setText(player2.getNickname());
		
		JLabel roundText = new JLabel("");
		roundText.setHorizontalAlignment(SwingConstants.CENTER);
		roundText.setBounds(247, 405, 121, 16);
		contentPane.add(roundText);
		roundText.setText(RiskGameSys.getRound() + "");
		
		JLabel player1Turn = new JLabel("");
		player1Turn.setBounds(48, 405, 98, 16);
		contentPane.add(player1Turn);
		
		JLabel player2Turn = new JLabel("");
		player2Turn.setBounds(453, 405, 98, 16);
		contentPane.add(player2Turn);
		
	}
}
