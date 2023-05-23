import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class StartPanel extends JFrame {

	private JPanel contentPane;
	private JTextField player1Nick;
	private JTextField player2Nick;
	public static Player player1;
	public static Player player2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPanel frame = new StartPanel();
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
	public StartPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to The Conquest!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(147, 0, 456, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNameLabel = new JLabel("Please enter your name : ");
		lblNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNameLabel.setBounds(26, 99, 245, 27);
		contentPane.add(lblNameLabel);
		
		JLabel lblColorLabel = new JLabel("Please choose your country color : ");
		lblColorLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColorLabel.setBounds(26, 165, 245, 27);
		contentPane.add(lblColorLabel);
		
		JComboBox player2cmbBox = new JComboBox();
		player2cmbBox.setModel(new DefaultComboBoxModel(new String[] {"Blue", "Yellow", "Red", "Purple", "Green", "Orange"}));
		player2cmbBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		player2cmbBox.setBounds(523, 169, 134, 21);
		contentPane.add(player2cmbBox);
		
		player2cmbBox.addItem("Blue");
        player2cmbBox.addItem("Yellow");
        player2cmbBox.addItem("Red");
        player2cmbBox.addItem("Purple");
        player2cmbBox.addItem("Green");
        player2cmbBox.addItem("Orange");
        
        JComboBox player1cmbBox = new JComboBox();
        player1cmbBox.setModel(new DefaultComboBoxModel(new String[] {"Blue", "Yellow", "Red", "Purple", "Green", "Orange"}));
        player1cmbBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
        player1cmbBox.setBounds(345, 169, 134, 21);
        contentPane.add(player1cmbBox);
        
        player1Nick = new JTextField();
        player1Nick.setBounds(349, 100, 130, 26);
        contentPane.add(player1Nick);
        player1Nick.setColumns(10);
        
        player2Nick = new JTextField();
        player2Nick.setBounds(527, 100, 130, 26);
        contentPane.add(player2Nick);
        player2Nick.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Player 1");
        lblNewLabel_1.setBounds(345, 67, 134, 16);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Player 2");
        lblNewLabel_1_1.setBounds(523, 67, 134, 16);
        contentPane.add(lblNewLabel_1_1);
		
        
        JButton btnStartButton = new JButton("Start Your Journey!");
        btnStartButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		player1 = new Player(player1Nick.getText(), player1cmbBox.getSelectedItem().toString());
        		player2 = new Player(player2Nick.getText(), player2cmbBox.getSelectedItem().toString());
        		
        		RiskFrame theGame = new RiskFrame(player1, player2);
        		RiskGameSys.setFirstColor(player1, player2);
        		
        		setVisible(false);
        		theGame.setVisible(true);
        	}
        });
        btnStartButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnStartButton.setBounds(225, 256, 300, 41);
        contentPane.add(btnStartButton);
        
      
		
	}
}
