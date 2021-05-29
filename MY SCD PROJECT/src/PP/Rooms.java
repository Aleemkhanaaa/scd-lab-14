package PP;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Rooms extends JFrame {

	private JPanel contentPane;
	private JTextField V1;
	private JTextField v2;
	private JTextField v3;
	private JTextField v4;
	private JTextField v5;
	private JTextField V2;
	private JTextField V34;
	private JTextField V5;
	private JTextField v1;

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
	public Rooms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          HOTEL MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(60, 11, 477, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblRoomsOrHotel = new JLabel("             ROOMS OR HOTEL BOOKING");
		lblRoomsOrHotel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblRoomsOrHotel.setBounds(70, 47, 477, 39);
		contentPane.add(lblRoomsOrHotel);
		
		JLabel lblNewLabel_1 = new JLabel("FILL THIS REQUIRMENTS");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(60, 86, 369, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROOMS");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(60, 104, 82, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblFloor = new JLabel("FLOOR");
		lblFloor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFloor.setBounds(60, 124, 82, 27);
		contentPane.add(lblFloor);
		
		JLabel lblYourDate = new JLabel("YOUR DATE ");
		lblYourDate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblYourDate.setBounds(60, 142, 234, 27);
		contentPane.add(lblYourDate);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDate.setBounds(60, 162, 82, 27);
		contentPane.add(lblDate);
		
		JLabel lblMonth = new JLabel("MONTH");
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMonth.setBounds(60, 180, 82, 27);
		contentPane.add(lblMonth);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectscd","root","myrootpass");
					String sql="insert into rroom values(? , ?)" ;
					PreparedStatement ptst=con.prepareStatement(sql);
					ptst.setString(1,v1.getText() );
					ptst.setString(2,v5.getText() );
					ptst.executeUpdate();
					new Submit().setVisible(true);
					con.close();
					}
				catch(Exception E)
				{
					new Submit().setVisible(true);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(60, 366, 223, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\1.1.jpg"));
		lblNewLabel_3.setBounds(316, 97, 200, 296);
		contentPane.add(lblNewLabel_3);
		
		V1 = new JTextField();
		V1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V1.setBounds(60, 256, 223, 19);
		contentPane.add(V1);
		V1.setColumns(10);
		
		v2 = new JTextField();
		v2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v2.setColumns(10);
		v2.setBounds(122, 127, 161, 19);
		contentPane.add(v2);
		
		v3 = new JTextField();
		v3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v3.setColumns(10);
		v3.setBounds(122, 162, 161, 19);
		contentPane.add(v3);
		
		v4 = new JTextField();
		v4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v4.setColumns(10);
		v4.setBounds(122, 183, 161, 20);
		contentPane.add(v4);
		
		v5 = new JTextField();
		v5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v5.setColumns(10);
		v5.setBounds(122, 204, 161, 18);
		contentPane.add(v5);
		
		JLabel lblPhNo = new JLabel("Ph NO.");
		lblPhNo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPhNo.setBounds(60, 200, 82, 27);
		contentPane.add(lblPhNo);
		
		JButton Vcheck = new JButton("CHECK");
		Vcheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int room;
					try {
						room=Integer.parseInt(v1.getText());
						V1.setText("ROOM  :" +room);
						
						
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Input !! Please Enter Room in Numerical Number" );
					}
					int floor;
					try {
						floor=Integer.parseInt(v2.getText());
						V2.setText("FLOOR  :" +floor);
						
						
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Input !! Please Enter Floor in Numerical Number" );
					}
					final int year = 2021;
					int day,month;
					try {
						day=Integer.parseInt(v3.getText());
						month=Integer.parseInt(v4.getText());
						V34.setText("DATE  :" +day+ "-"+month+"-"+year );
						
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Input !! Please Enter Day And Month In Numerical Numbers" );
					}
					int phone;
					try {
						phone=Integer.parseInt(v5.getText());
						V5.setText("Phone Number  :" +phone);
						
						
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Input !! Please Enter PhoneNumber in Numerical Numbers" );
					}
				
			}
		});
		Vcheck.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Vcheck.setBounds(59, 229, 224, 19);
		contentPane.add(Vcheck);
		
		V2 = new JTextField();
		V2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V2.setColumns(10);
		V2.setBounds(60, 286, 223, 19);
		contentPane.add(V2);
		
		V34 = new JTextField();
		V34.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V34.setColumns(10);
		V34.setBounds(60, 316, 223, 19);
		contentPane.add(V34);
		
		V5 = new JTextField();
		V5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V5.setColumns(10);
		V5.setBounds(60, 346, 223, 19);
		contentPane.add(V5);
		
		v1 = new JTextField();
		v1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		v1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v1.setColumns(10);
		v1.setBounds(122, 107, 161, 19);
		contentPane.add(v1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\photo-1513694203232-719a280e022f.jpg"));
		lblNewLabel_4.setBounds(0, 0, 709, 462);
		contentPane.add(lblNewLabel_4);
	}
}
