package Classes;
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
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarketPanel extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField numOfSoldiertextField;

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
		setBounds(100, 100, 578, 364);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Market Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(177, 10, 209, 33);
		getContentPane().add(lblNewLabel);
		
		JLabel lblGoldLabel = new JLabel("Amount of Gold ");
		lblGoldLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGoldLabel.setBounds(20, 67, 158, 19);
		getContentPane().add(lblGoldLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setEditable(false);
		textPane.setBounds(324, 67, 158, 19);
		getContentPane().add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Type of Solider you waant to purchase :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 155, 285, 24);
		getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(324, 157, 158, 21);
		getContentPane().add(comboBox);
		
		
		comboBox.addItem("Jackman");
        comboBox.addItem("Archer");
        comboBox.addItem("Spear Soldier");
        
        JButton btnPurchaseButton = new JButton("Purchase");
        btnPurchaseButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnPurchaseButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnPurchaseButton.setBounds(212, 262, 139, 33);
        getContentPane().add(btnPurchaseButton);
        
        JCheckBox chckbxYesCheckBox = new JCheckBox("Yes");
        buttonGroup.add(chckbxYesCheckBox);
        chckbxYesCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chckbxYesCheckBox.setBounds(324, 113, 93, 21);
        getContentPane().add(chckbxYesCheckBox);
        
        JCheckBox chckbxNoCheckBox = new JCheckBox("No");
        buttonGroup.add(chckbxNoCheckBox);
        chckbxNoCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chckbxNoCheckBox.setBounds(430, 113, 93, 21);
        getContentPane().add(chckbxNoCheckBox);
        
        JLabel lblNewLabel_2 = new JLabel("Do you want to add new soldier ?");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(20, 113, 262, 20);
        getContentPane().add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("How many soldier do you want to add ?");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(20, 206, 295, 19);
        getContentPane().add(lblNewLabel_3);
        
        numOfSoldiertextField = new JTextField();
        numOfSoldiertextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        numOfSoldiertextField.setBounds(324, 208, 158, 19);
        getContentPane().add(numOfSoldiertextField);
        numOfSoldiertextField.setColumns(10);
		
	}
}
