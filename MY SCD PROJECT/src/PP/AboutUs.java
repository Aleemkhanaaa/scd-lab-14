package PP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rooms frame = new Rooms();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutUs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          HOTEL MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(60, 11, 477, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblRoomsOrHotel = new JLabel("                            ABOUT US");
		lblRoomsOrHotel.setForeground(Color.BLACK);
		lblRoomsOrHotel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblRoomsOrHotel.setBounds(70, 47, 477, 39);
		contentPane.add(lblRoomsOrHotel);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(330, 354, 217, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblProjectDevelopedBy = new JLabel("SOFTWARE ENGINEERING DEPARTMENT");
		lblProjectDevelopedBy.setForeground(Color.BLACK);
		lblProjectDevelopedBy.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblProjectDevelopedBy.setBounds(60, 93, 501, 39);
		contentPane.add(lblProjectDevelopedBy);
		
		JLabel lblMuhammadAleemKhan = new JLabel("MUHAMMAD ALEEM KHAN  2019-SE-080");
		lblMuhammadAleemKhan.setForeground(Color.BLACK);
		lblMuhammadAleemKhan.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblMuhammadAleemKhan.setBounds(60, 143, 477, 39);
		contentPane.add(lblMuhammadAleemKhan);
		
		JLabel lblMaheenSyedse = new JLabel("MAHEEN SYED                           2019-SE-087");
		lblMaheenSyedse.setForeground(Color.BLACK);
		lblMaheenSyedse.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblMaheenSyedse.setBounds(60, 193, 477, 39);
		contentPane.add(lblMaheenSyedse);
		
		JLabel lblMuhammadAfifse = new JLabel("MUHAMMAD AFIF                    2019-SE-081");
		lblMuhammadAfifse.setForeground(Color.BLACK);
		lblMuhammadAfifse.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblMuhammadAfifse.setBounds(60, 245, 477, 39);
		contentPane.add(lblMuhammadAfifse);
		
		JLabel lblHasanIkramse = new JLabel("HASAN IKRAM                            2019-SE-067");
		lblHasanIkramse.setForeground(Color.BLACK);
		lblHasanIkramse.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblHasanIkramse.setBounds(60, 295, 477, 39);
		contentPane.add(lblHasanIkramse);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\afrah-puUx-3kFVbg-unsplash (1).jpg"));
		lblNewLabel_1.setBounds(0, 0, 628, 418);
		contentPane.add(lblNewLabel_1);
	}
}
