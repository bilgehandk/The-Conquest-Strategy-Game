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

public class StartPanel extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlayer;

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
		lblNewLabel.setBounds(147, 10, 456, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNameLabel = new JLabel("Please enter your name : ");
		lblNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNameLabel.setBounds(70, 99, 245, 27);
		contentPane.add(lblNameLabel);
		
		txtPlayer = new JTextField();
		txtPlayer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPlayer.setText("Player 1");
		txtPlayer.setBounds(457, 103, 200, 19);
		contentPane.add(txtPlayer);
		txtPlayer.setColumns(10);
		
		JLabel lblColorLabel = new JLabel("Please choose your countrey color : ");
		lblColorLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColorLabel.setBounds(70, 166, 245, 27);
		contentPane.add(lblColorLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(457, 169, 200, 21);
		contentPane.add(comboBox);
		
		comboBox.addItem("Blue");
        comboBox.addItem("Yellow");
        comboBox.addItem("Red");
        comboBox.addItem("Purple");
        comboBox.addItem("Green");
        comboBox.addItem("Orange");
        
        JButton btnStartButton = new JButton("Start Your Journey!");
        btnStartButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnStartButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnStartButton.setBounds(225, 256, 300, 41);
        contentPane.add(btnStartButton);
		
		
	}
}
