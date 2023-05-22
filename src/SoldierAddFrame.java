import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SoldierAddFrame(HexButton sent, Player player) {
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
		errorMsg.setBounds(21, 16, 191, 16);
		contentPane.add(errorMsg);
		
		
		JButton applyBtn = new JButton("Apply");
		applyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = Integer.parseInt(soldierAmount.getText());
				int index = soldiercmbBox.getSelectedIndex();
				//System.out.println(amount + soldierType);
				sent.addSoldier(index, amount);
				sent.setCharacter(sent.getSoldierPower()+"");
				RiskGameSys.increaseRoundCount();
				System.out.println(RiskGameSys.getRoundCount());
				
				if(index == 0) {
					if(amount * Jackman.getPrice() > player.getGold()) {
						errorMsg.setText("NOT ENOUGH GOLD TO PURCHASE");
					}else {
						dispose();
					}
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
		
	}
}
