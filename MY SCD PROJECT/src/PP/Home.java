package PP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Window.Type;

public class Home extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setForeground(new Color(102, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("          HOTEL MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(39, 30, 551, 77);
		contentPane.add(lblNewLabel);
		
		JLabel lblWelcome = new JLabel("              WELCOME CUSTOMER");
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblWelcome.setBounds(39, 93, 551, 77);
		contentPane.add(lblWelcome);
		
		JButton btnNewButton = new JButton("ABOUT US");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AboutUs().setVisible(true);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBounds(98, 199, 285, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Login().setVisible(true);
				this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton_1.setBounds(98, 262, 285, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FOR BOOKING");
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new DirectBooking().setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(98, 325, 285, 48);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\278604045.jpg"));
		lblNewLabel_2.setBounds(0, 0, 645, 420);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(555, 99, -447, -8);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(88, 93, 476, 14);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setToolTipText("");
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(113, 168, 411, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(24, 30, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(544, 227, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\f\\Desktop\\download.jpg"));
		lblNewLabel_5.setBounds(150, 248, 451, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(544, 248, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\f\\Desktop\\ddddd.jpg"));
		lblNewLabel_7.setBounds(88, 168, 502, 73);
		contentPane.add(lblNewLabel_7);
	}
}
