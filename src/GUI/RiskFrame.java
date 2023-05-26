package GUI;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.HexButton;
import Classes.Player;
import Classes.RiskGameSys;

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
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class RiskFrame extends JFrame {
	SoldierAddFrame soldierAddFrame;
	StartPanel startPanel = new StartPanel();
	WinnerPanel winPanel;
	AttackPanel attackPanel;
	JTextPane textRound;
	
	private JPanel contentPane;

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
		RiskFrame rf = this;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		for(int i=0; i<40; i++) {
			if(i == 0) {
				HexButton player1SpawnPoint = new HexButton(player1.getNickname(), i); 
				RiskGameSys.Areas.add(player1SpawnPoint);
			}else if(i == 39) {
				HexButton player2SpawnPoint = new HexButton(player2.getNickname(), i);
				RiskGameSys.Areas.add(player2SpawnPoint);
				
			}else {
				HexButton btnNewButton = new HexButton("-", i);
				RiskGameSys.Areas.add(btnNewButton);
				
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Player p = RiskGameSys.checkWinner();
						if(RiskGameSys.finishScreen==true)
						{
							
							
							if(p.equals(player1))
							{
								RiskGameSys.win = true;
							}
							else {
								RiskGameSys.win = false;
							}
							winPanel = new WinnerPanel(rf);
							winPanel.setVisible(true);
						}
						else {
						
							if(player1.isTurn())
							{
								if(btnNewButton.getOwnership() == 0 || btnNewButton.getOwnership() == 1) {
									if(RiskGameSys.searchClicked() == null) {
										btnNewButton.isClicked = true;
									}else {
										HexButton found = RiskGameSys.searchClicked();
										if(found.equals(btnNewButton)) {
											soldierAddFrame = new SoldierAddFrame(btnNewButton, player1, rf);
											soldierAddFrame.setVisible(true);
											found.isClicked = false;
											btnNewButton.setOwnership(1);
											RiskGameSys.changeColor(player1, btnNewButton);
											RiskGameSys.playerTurner();
										}else if(found.getOwnership() == 2){
											attackPanel = new AttackPanel(btnNewButton, found);
											attackPanel.setVisible(true);
										}else {
											found.isClicked = false;
											btnNewButton.isClicked = false;
										}
									}
									//soldierAddFrame = new SoldierAddFrame(btnNewButton, player1);
									//btnNewButton.setOwnership(1);	
								}else {
									HexButton found = RiskGameSys.searchClicked();
									found.isClicked = false;
									attackPanel = new AttackPanel(found, btnNewButton);
									attackPanel.setVisible(true);
									RiskGameSys.playerTurner();
								}
							}else {
								if(btnNewButton.getOwnership() == 0 || btnNewButton.getOwnership() == 2) {
									if(RiskGameSys.searchClicked() == null) {
										btnNewButton.isClicked = true;
									}else {
										HexButton found = RiskGameSys.searchClicked();
										if(found.equals(btnNewButton)) {
											soldierAddFrame = new SoldierAddFrame(btnNewButton, player2, rf);
											soldierAddFrame.setVisible(true);
											found.isClicked = false;
											btnNewButton.setOwnership(2);
											
											RiskGameSys.changeColor(player2, btnNewButton);
											RiskGameSys.playerTurner();
										}else if(found.getOwnership() == 1) {
											attackPanel = new AttackPanel(btnNewButton, found);
											attackPanel.setVisible(true);
										}else {
											found.isClicked = false;
											btnNewButton.isClicked = false;
										}
									}
								//soldierAddFrame = new SoldierAddFrame(btnNewButton, player2);
								//btnNewButton.setOwnership(2);
								}else {
									HexButton found = RiskGameSys.searchClicked();
									attackPanel = new AttackPanel(found, btnNewButton);
									attackPanel.setVisible(true);
									found.isClicked = false;
									RiskGameSys.playerTurner();
								}
								//player1.setTurn(true);
								//player2.setTurn(false);	
							}
						}
					}
				});
			}
			//HexButton btnNewButton = i == 0 || i == 39 ? new HexButton("a",i) : new HexButton("b", i);
			RiskGameSys.Areas.get(0).setBounds(17, 6, 75, 75);
			contentPane.add(RiskGameSys.Areas.get(0));
		}	
		
		int x1=17,y1=6,k=0;
		for(int j=1;j<=4;j++) {
		
		boolean yc=true;
		for(int i=0;i<500;i+=50)
		{
		
			if(yc)
			{
				RiskGameSys.Areas.get(k).setBounds(x1+i, y1, 75, 75);
				contentPane.add(RiskGameSys.Areas.get(k));
				y1+=28;
				yc=false;
			}
			
			else
			{
				RiskGameSys.Areas.get(k).setBounds(x1+i, y1, 75, 75);
				contentPane.add(RiskGameSys.Areas.get(k));
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
		
		JLabel player1Turn = new JLabel("");
		player1Turn.setBounds(48, 405, 98, 16);
		contentPane.add(player1Turn);
		
		JLabel player2Turn = new JLabel("");
		player2Turn.setBounds(453, 405, 98, 16);
		contentPane.add(player2Turn);
		
		textRound = new JTextPane();
		textRound.setBounds(281, 383, 59, 38);
		contentPane.add(textRound);
		textRound.setText(""+RiskGameSys.getRoundCount());
				
	}

	public JTextPane getTextRound() {
		return textRound;
	}
}
