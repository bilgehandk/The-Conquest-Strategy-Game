package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Archer;
import Classes.HexButton;
import Classes.Jackman;
import Classes.Player;
import Classes.RiskGameSys;
import Classes.Spearman;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class SoldierAddFrame extends JFrame {

	private JPanel contentPane;
	private JTextField soldierAmount;
	private JButton applyBtn;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SoldierAddFrame(HexButton sent, Player player, JFrame jr) {
		RiskFrame rf = (RiskFrame)jr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buy Soldier");
		lblNewLabel.setBounds(21, 59, 159, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox soldiercmbBox = new JComboBox();
		soldiercmbBox.setModel(new DefaultComboBoxModel(new String[] {"Jackman", "Archer", "Spearman"}));
		soldiercmbBox.setBounds(229, 55, 138, 27);
		contentPane.add(soldiercmbBox);
		
		JLabel lblNewLabel_1 = new JLabel("How many do you want to add?");
		lblNewLabel_1.setBounds(21, 110, 205, 16);
		contentPane.add(lblNewLabel_1);
		
		soldierAmount = new JTextField();
		soldierAmount.setBounds(272, 105, 64, 26);
		contentPane.add(soldierAmount);
		soldierAmount.setColumns(10);
		

		JLabel errorMsg = new JLabel("");
		errorMsg.setBounds(21, 16, 269, 16);
		contentPane.add(errorMsg);
		
		
		applyBtn = new JButton("Apply");
		applyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int price;
				int amount = Integer.parseInt(soldierAmount.getText());
				int index = soldiercmbBox.getSelectedIndex();

				
				if(index == 0) {
					price = amount * Jackman.getPrice();
				}else if(index == 1)
					price = amount * Archer.getPrice();
				else
					price = amount * Spearman.getPrice();
				
				if(price > player.getGold())
					errorMsg.setText("NOT ENOUGH GOLD TO PURCHASE");
				else {
					
					sent.addSoldier(index, amount);
					sent.setCharacter(sent.getSoldierPower()+"");
					RiskGameSys.increaseRoundCount();
					rf.getTextRound().setText(""+RiskGameSys.getRoundCount());
					System.out.println(RiskGameSys.getRoundCount());
					
					RiskGameSys.buySoldier(player, price);
					System.out.println(player.getColor());
					dispose();
					
				}
			}
		});
		applyBtn.setBounds(23, 177, 117, 29);
		contentPane.add(applyBtn);
		
		JLabel lblNewLabel_2 = new JLabel("ARCHER -> 5 Gold");
		lblNewLabel_2.setBounds(229, 162, 126, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("SPEARMAN -> 7 Gold");
		lblNewLabel_2_1.setBounds(229, 190, 168, 16);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("JACKMAN -> 10 Gold");
		lblNewLabel_2_2.setBounds(229, 218, 138, 16);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel playerGold = new JLabel("");
		playerGold.setBounds(365, 16, 61, 16);
		contentPane.add(playerGold);
		
		playerGold.setText(player.getGold() + " Gold");
		
		JButton dltButton = new JButton("Delete");
		dltButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RiskGameSys.DeleteButton(sent);
				sent.setCharacter("-");
				dispose();
			}
		});
		dltButton.setBounds(21, 224, 119, 26);
		contentPane.add(dltButton);
		
	}

	public JButton getApplyBtn() {
		return applyBtn;
	}
}
