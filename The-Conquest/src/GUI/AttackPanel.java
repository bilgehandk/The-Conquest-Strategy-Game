package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.HexButton;
import Classes.RiskGameSys;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AttackPanel extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	
	
	public AttackPanel(HexButton attackSide, HexButton defendSide) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Attack Frame");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(198, 20, 190, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How many soldier power will you use?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(31, 85, 250, 33);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtSoldier = new JTextArea();
		txtSoldier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSoldier.setBounds(365, 92, 159, 27);
		contentPane.add(txtSoldier);
		
		JButton btnAttackButton = new JButton("Attack!!");
		btnAttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RiskGameSys.attackFunc(attackSide, defendSide, Integer.parseInt(txtSoldier.getText()));
				RiskGameSys.increaseRoundCount();
				dispose();
				
			}
		});
		btnAttackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAttackButton.setBounds(95, 220, 134, 40);
		contentPane.add(btnAttackButton);
		
		JButton btnSkipButton = new JButton("Skip Round");
		btnSkipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RiskGameSys.increaseRoundCount();
				dispose();
			}
		});
		btnSkipButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSkipButton.setBounds(352, 220, 169, 40);
		contentPane.add(btnSkipButton);
		
	       
	}
}
