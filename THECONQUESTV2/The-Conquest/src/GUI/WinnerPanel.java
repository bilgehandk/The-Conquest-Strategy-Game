package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.RiskGameSys;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class WinnerPanel extends JFrame {

	private JPanel contentPane;
	public JTextArea textArea; 

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public WinnerPanel(JFrame jr, StartPanel sp) { 
		RiskFrame rf = (RiskFrame)jr; 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 
		textArea = new JTextArea(); 
		textArea.setBounds(102, 99, 331, 61); 
		contentPane.add(textArea); 
		if(RiskGameSys.win == true) 
			textArea.setText("Player1: "+RiskGameSys.getPlayer1().getNickname()+" wins!"); 
		else 
			textArea.setText("Player2: "+RiskGameSys.getPlayer2().getNickname()+" wins!"); 
		
		JButton btnFinishButton = new JButton("START A NEW GAME!");
		btnFinishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp.setVisible(true);
				rf.dispose();
				dispose();
				
			}
		});
		btnFinishButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFinishButton.setBounds(102, 199, 348, 33);
		contentPane.add(btnFinishButton);
		
		JLabel lblNewLabel = new JLabel("CONGRATULATIONS!!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(125, 10, 286, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("YOU HAVE CONQURED YOUR ENEMY !");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(89, 56, 358, 33);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(102, 99, 331, 61);
		contentPane.add(textArea);
	}
}
