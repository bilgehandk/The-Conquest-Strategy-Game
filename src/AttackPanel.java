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

public class AttackPanel extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 601, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Attack Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(221, 20, 190, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How many soldier will you use?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(32, 161, 216, 33);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setBounds(355, 167, 159, 27);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("Which soldier type will you use?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(32, 68, 235, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Attack");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(250, 243, 117, 27);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnJackmanButton = new JRadioButton("Jackman");
		buttonGroup.add(rdbtnJackmanButton);
		rdbtnJackmanButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnJackmanButton.setBounds(355, 70, 134, 21);
		contentPane.add(rdbtnJackmanButton);
		
		JRadioButton rdbtnSpearRadioButton = new JRadioButton("Spear Solider");
		buttonGroup.add(rdbtnSpearRadioButton);
		rdbtnSpearRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnSpearRadioButton.setBounds(355, 114, 134, 21);
		contentPane.add(rdbtnSpearRadioButton);
		
		JRadioButton rdbtnArcherRadioButton = new JRadioButton("Archer");
		buttonGroup.add(rdbtnArcherRadioButton);
		rdbtnArcherRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnArcherRadioButton.setBounds(355, 91, 134, 21);
		contentPane.add(rdbtnArcherRadioButton);
		
	       
	}
}
