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
import java.awt.event.ActionEvent;

public class SoldierAddFrame extends JFrame {

	private JPanel contentPane;
	private JTextField soldierAmount;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SoldierAddFrame(HexButton sent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pick type of the soldier");
		lblNewLabel.setBounds(21, 41, 159, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox soldiercmbBox = new JComboBox();
		soldiercmbBox.setModel(new DefaultComboBoxModel(new String[] {"Jackman", "Archer", "Spearman"}));
		soldiercmbBox.setBounds(229, 37, 138, 27);
		contentPane.add(soldiercmbBox);
		
		JLabel lblNewLabel_1 = new JLabel("How many do you want to add?");
		lblNewLabel_1.setBounds(21, 91, 205, 16);
		contentPane.add(lblNewLabel_1);
		
		soldierAmount = new JTextField();
		soldierAmount.setBounds(271, 86, 64, 26);
		contentPane.add(soldierAmount);
		soldierAmount.setColumns(10);
		
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
				dispose();
			}
		});
		applyBtn.setBounds(109, 175, 117, 29);
		contentPane.add(applyBtn);
	}
}
