import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RiskFrame extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RiskFrame frame = new RiskFrame();
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
	public RiskFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Icon icon = new ImageIcon("./hexagon.png");
		HexButton btnNewButton = new HexButton('b');
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(17, 6, 75, 75);
		contentPane.add(btnNewButton);
		
		HexButton btnNewButton_1 = new HexButton((Character) null);
		btnNewButton_1.setBounds(67, 34, 75, 75);
		contentPane.add(btnNewButton_1);
		
		HexButton btnNewButton_2 = new HexButton((Character) null);
		btnNewButton_2.setBounds(117, 6, 75, 75);
		contentPane.add(btnNewButton_2);
		
		HexButton btnNewButton_3 = new HexButton((Character) null);
		btnNewButton_3.setBounds(168, 34, 75, 75);
		contentPane.add(btnNewButton_3);
		
		HexButton btnNewButton_4 = new HexButton((Character) null);
		btnNewButton_4.setBounds(217, 6, 75, 75);
		contentPane.add(btnNewButton_4);
		
		HexButton btnNewButton_5 = new HexButton((Character) null);
		btnNewButton_5.setBounds(269, 34, 75, 75);
		contentPane.add(btnNewButton_5);
		
		HexButton btnNewButton_6 = new HexButton((Character) null);
		btnNewButton_6.setBounds(319, 6, 75, 75);
		contentPane.add(btnNewButton_6);
		
		HexButton btnNewButton_7 = new HexButton((Character) null);
		btnNewButton_7.setBounds(373, 34, 75, 75);
		contentPane.add(btnNewButton_7);
		
		HexButton btnNewButton_8 = new HexButton((Character) null);
		btnNewButton_8.setBounds(425, 6, 75, 75);
		contentPane.add(btnNewButton_8);
		
		HexButton btnNewButton_9 = new HexButton((Character) null);
		btnNewButton_9.setBounds(475, 34, 75, 75);
		contentPane.add(btnNewButton_9);
		
		HexButton btnNewButton_10 = new HexButton((Character) null);
		btnNewButton_10.setBounds(425, 63, 75, 75);
		contentPane.add(btnNewButton_10);
		
		HexButton btnNewButton_11 = new HexButton((Character) null);
		btnNewButton_11.setBounds(319, 63, 75, 75);
		contentPane.add(btnNewButton_11);
		
		HexButton btnNewButton_12 = new HexButton((Character) null);
		btnNewButton_12.setBounds(217, 63, 75, 75);
		contentPane.add(btnNewButton_12);
		
		HexButton btnNewButton_13 = new HexButton((Character) null);
		btnNewButton_13.setBounds(117, 63, 75, 75);
		contentPane.add(btnNewButton_13);
		
		HexButton btnNewButton_14 = new HexButton((Character) null);
		btnNewButton_14.setBounds(67, 95, 75, 75);
		contentPane.add(btnNewButton_14);
		
		HexButton btnNewButton_15 = new HexButton((Character) null);
		btnNewButton_15.setBounds(117, 121, 75, 75);
		contentPane.add(btnNewButton_15);
		
		HexButton btnNewButton_16 = new HexButton((Character) null);
		btnNewButton_16.setBounds(168, 95, 75, 75);
		contentPane.add(btnNewButton_16);
		
		HexButton btnNewButton_17 = new HexButton((Character) null);
		btnNewButton_17.setBounds(168, 151, 75, 75);
		contentPane.add(btnNewButton_17);
		
		HexButton btnNewButton_18 = new HexButton((Character) null);
		btnNewButton_18.setBounds(217, 121, 75, 75);
		contentPane.add(btnNewButton_18);
		
		HexButton btnNewButton_19 = new HexButton((Character) null);
		btnNewButton_19.setBounds(269, 95, 75, 75);
		contentPane.add(btnNewButton_19);
		
		HexButton btnNewButton_20 = new HexButton((Character) null);
		btnNewButton_20.setBounds(373, 95, 75, 75);
		contentPane.add(btnNewButton_20);
		
		HexButton btnNewButton_21 = new HexButton((Character) null);
		btnNewButton_21.setBounds(319, 121, 75, 75);
		contentPane.add(btnNewButton_21);
		
		HexButton btnNewButton_22 = new HexButton((Character) null);
		btnNewButton_22.setBounds(269, 152, 75, 75);
		contentPane.add(btnNewButton_22);
		
		HexButton btnNewButton_23 = new HexButton((Character) null);
		btnNewButton_23.setBounds(217, 182, 75, 75);
		contentPane.add(btnNewButton_23);
		
		HexButton btnNewButton_24 = new HexButton((Character) null);
		btnNewButton_24.setBounds(475, 95, 75, 75);
		contentPane.add(btnNewButton_24);
		
		HexButton btnNewButton_25 = new HexButton((Character) null);
		btnNewButton_25.setBounds(425, 121, 75, 75);
		contentPane.add(btnNewButton_25);
		
		HexButton btnNewButton_26 = new HexButton((Character) null);
		btnNewButton_26.setBounds(373, 151, 75, 75);
		contentPane.add(btnNewButton_26);
		
		HexButton btnNewButton_27 = new HexButton((Character) null);
		btnNewButton_27.setBounds(319, 182, 75, 75);
		contentPane.add(btnNewButton_27);
		
		HexButton btnNewButton_29 = new HexButton((Character) null);
		btnNewButton_29.setBounds(217, 238, 75, 75);
		contentPane.add(btnNewButton_29);
		
		HexButton btnNewButton_30 = new HexButton((Character) null);
		btnNewButton_30.setBounds(319, 239, 75, 75);
		contentPane.add(btnNewButton_30);
		
		HexButton btnNewButton_31 = new HexButton((Character) null);
		btnNewButton_31.setBounds(67, 152, 75, 75);
		contentPane.add(btnNewButton_31);
		
		HexButton btnNewButton_32 = new HexButton((Character) null);
		btnNewButton_32.setBounds(269, 269, 75, 75);
		contentPane.add(btnNewButton_32);
		
		HexButton btnNewButton_28 = new HexButton((Character) null);
		btnNewButton_28.setBounds(67, 210, 75, 75);
		contentPane.add(btnNewButton_28);
		
		HexButton btnNewButton_33 = new HexButton((Character) null);
		btnNewButton_33.setBounds(373, 269, 75, 75);
		contentPane.add(btnNewButton_33);
		
		HexButton btnNewButton_34 = new HexButton((Character) null);
		btnNewButton_34.setBounds(425, 238, 75, 75);
		contentPane.add(btnNewButton_34);
		
		HexButton btnNewButton_35 = new HexButton((Character) null);
		btnNewButton_35.setBounds(475, 269, 75, 75);
		contentPane.add(btnNewButton_35);
		
		HexButton btnNewButton_36 = new HexButton((Character) null);
		btnNewButton_36.setBounds(475, 208, 75, 75);
		contentPane.add(btnNewButton_36);
		
		HexButton btnNewButton_37 = new HexButton((Character) null);
		btnNewButton_37.setBounds(475, 150, 75, 75);
		contentPane.add(btnNewButton_37);
		
		HexButton btnNewButton_38 = new HexButton((Character) null);
		btnNewButton_38.setBounds(525, 6, 75, 75);
		contentPane.add(btnNewButton_38);
		
		HexButton btnNewButton_39 = new HexButton((Character) null);
		btnNewButton_39.setBounds(67, 269, 75, 75);
		contentPane.add(btnNewButton_39);
		
		HexButton btnNewButton_40 = new HexButton((Character) null);
		btnNewButton_40.setBounds(117, 238, 75, 75);
		contentPane.add(btnNewButton_40);
		
		HexButton btnNewButton_41 = new HexButton((Character) null);
		btnNewButton_41.setBounds(168, 269, 75, 75);
		contentPane.add(btnNewButton_41);
		
		
		
	}
}
