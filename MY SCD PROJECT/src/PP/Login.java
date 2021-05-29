package PP;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Window.Type;

public class Login extends JFrame  {


	private JPanel contentPane;
	private JTextField user;
	private JPasswordField Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setForeground(new Color(102, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          HOTEL MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(39, 30, 551, 77);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		contentPane.add(lblNewLabel);
		
		JLabel lblWelcome = new JLabel("              WELCOME CUSTOMER");
		lblWelcome.setBounds(39, 93, 551, 77);
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 28));
		contentPane.add(lblWelcome);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setBounds(246, 181, 110, 37);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(lblNewLabel_1);
		
		JLabel username = new JLabel("USERNAME");
		username.setBounds(73, 242, 126, 37);
		username.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(username);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(60, 229, 546, 2);
		contentPane.add(separator);
		
		JLabel Password = new JLabel("PASSWORD");
		Password.setBounds(74, 291, 126, 37);
		Password.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(Password);
		
		user = new JTextField();
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		user.setBounds(246, 249, 322, 27);
		contentPane.add(user);
		user.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(60, 339, 546, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(82, 352, 159, 27);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				synchronized(this) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectscd?characterEncoding=latin1","root","myrootpass");
					Statement stmt = con.createStatement();
					String sql="Select * from login where username='"+user.getText()+ "' and password='"+Pass.getText().toString()+"'" ;
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						
						new AfterLoginMainManu().setVisible(true);
						final String msgs =  "LOGIN SUCCESFULLY";
					    JOptionPane.showMessageDialog(null, msgs );
					}
					else {
						final String msg =  "LOGIN FAILED";
						JOptionPane.showMessageDialog(null, msg );
				}
					
					}
				catch(Exception e)
				{
					
					System.out.println(e);
				}
				}
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(262, 354, 159, 27);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(btnReset);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Home().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBounds(431, 354, 159, 27);
		contentPane.add(btnBack);
		
		Pass = new JPasswordField();
		Pass.setBounds(247, 298, 321, 27);
		contentPane.add(Pass);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\white-bedroom-mockup-with-decorative-elements_176382-1987.jpg"));
		lblNewLabel_2.setBounds(0, 0, 626, 418);
		contentPane.add(lblNewLabel_2);
	}
}
