import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class MarketPanel extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarketPanel frame = new MarketPanel();
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
	public MarketPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 399);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Market Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(220, 10, 172, 33);
		getContentPane().add(lblNewLabel);
		
		JLabel lblGoldLabel = new JLabel("Amount of Gold ");
		lblGoldLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGoldLabel.setBounds(20, 67, 158, 19);
		getContentPane().add(lblGoldLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(324, 67, 158, 19);
		getContentPane().add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Type of Solider you waant to purchase :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 143, 285, 24);
		getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jackman", "Archer", "Spearman"}));
		comboBox.setBounds(324, 147, 158, 21);
		getContentPane().add(comboBox);
		
		
		comboBox.addItem("Jackman");
        comboBox.addItem("Archer");
        comboBox.addItem("Spear Soldier");
        
        JButton btnPurchaseButton = new JButton("Purchase");
        btnPurchaseButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnPurchaseButton.setBounds(236, 217, 139, 21);
        getContentPane().add(btnPurchaseButton);
		
	}
}
