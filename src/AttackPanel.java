import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class AttackPanel extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttackPanel frame = new AttackPanel();
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
	
	
	public AttackPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Attack Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(198, 20, 190, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How many soldier will you use?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 149, 216, 33);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea.setBounds(355, 154, 159, 27);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("Which soldier type will you use?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(32, 68, 235, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnAttackButton = new JButton("Attack!!");
		btnAttackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAttackButton.setBounds(69, 240, 134, 40);
		contentPane.add(btnAttackButton);
		
		JRadioButton rdbtnJackmanButton = new JRadioButton("Jackman");
		buttonGroup.add(rdbtnJackmanButton);
		rdbtnJackmanButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnJackmanButton.setBounds(355, 70, 134, 21);
		contentPane.add(rdbtnJackmanButton);
		
		JRadioButton rdbtnSpearRadioButton = new JRadioButton("Spear Solider");
		buttonGroup.add(rdbtnSpearRadioButton);
		rdbtnSpearRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSpearRadioButton.setBounds(355, 114, 134, 21);
		contentPane.add(rdbtnSpearRadioButton);
		
		JRadioButton rdbtnArcherRadioButton = new JRadioButton("Archer");
		buttonGroup.add(rdbtnArcherRadioButton);
		rdbtnArcherRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnArcherRadioButton.setBounds(355, 93, 134, 21);
		contentPane.add(rdbtnArcherRadioButton);
		
		JButton btnSkipButton = new JButton("Skip Round");
		btnSkipButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSkipButton.setBounds(355, 240, 169, 40);
		contentPane.add(btnSkipButton);
		
		JLabel lblNewLabel_3 = new JLabel("Do you want to add diffrent type of soldier ?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(32, 196, 298, 20);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chckbxYesCheckBox = new JCheckBox("Yes");
		buttonGroup_1.add(chckbxYesCheckBox);
		chckbxYesCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxYesCheckBox.setBounds(355, 198, 93, 21);
		contentPane.add(chckbxYesCheckBox);
		
		JCheckBox chckbxNoCheckBox = new JCheckBox("No");
		buttonGroup_1.add(chckbxNoCheckBox);
		chckbxNoCheckBox.setBounds(461, 198, 93, 21);
		contentPane.add(chckbxNoCheckBox);
		
	       
	}
}
