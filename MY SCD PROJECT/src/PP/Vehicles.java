package PP;

import java.awt.BorderLayout;
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
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class Vehicles extends JFrame {

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
	public Vehicles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          HOTEL MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(60, 11, 477, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblRoomsOrHotel = new JLabel("VEHICLE OR CAR FOR PICK AND DROP");
		lblRoomsOrHotel.setForeground(Color.WHITE);
		lblRoomsOrHotel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblRoomsOrHotel.setBounds(70, 47, 477, 39);
		contentPane.add(lblRoomsOrHotel);
		
		JLabel lblNewLabel_1 = new JLabel("FILL THIS REQUIRMENTS");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(321, 97, 369, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PERSON");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(321, 115, 82, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblFloor = new JLabel("DESTINATION");
		lblFloor.setForeground(Color.WHITE);
		lblFloor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFloor.setBounds(321, 135, 110, 27);
		contentPane.add(lblFloor);
		
		JLabel lblYourDate = new JLabel("YOUR DATE ");
		lblYourDate.setForeground(Color.WHITE);
		lblYourDate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblYourDate.setBounds(321, 153, 234, 27);
		contentPane.add(lblYourDate);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDate.setBounds(321, 173, 82, 27);
		contentPane.add(lblDate);
		
		JLabel lblMonth = new JLabel("MONTH");
		lblMonth.setForeground(Color.WHITE);
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMonth.setBounds(321, 191, 82, 27);
		contentPane.add(lblMonth);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Submit().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(321, 377, 226, 16);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\trent-haaland-ApIqCKHmZ30-unspla.jpg"));
		lblNewLabel_3.setBounds(49, 101, 215, 292);
		contentPane.add(lblNewLabel_3);
		
		V1 = new JTextField();
		V1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V1.setBounds(321, 267, 223, 19);
		contentPane.add(V1);
		V1.setColumns(10);
		
		v2 = new JTextField();
		v2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v2.setColumns(10);
		v2.setBounds(414, 143, 131, 19);
		contentPane.add(v2);
		
		v3 = new JTextField();
		v3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v3.setColumns(10);
		v3.setBounds(383, 173, 161, 19);
		contentPane.add(v3);
		
		v4 = new JTextField();
		v4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v4.setColumns(10);
		v4.setBounds(383, 194, 161, 20);
		contentPane.add(v4);
		
		v5 = new JTextField();
		v5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v5.setColumns(10);
		v5.setBounds(383, 215, 161, 18);
		contentPane.add(v5);
		
		JLabel lblPhNo = new JLabel("Ph NO.");
		lblPhNo.setForeground(Color.WHITE);
		lblPhNo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPhNo.setBounds(321, 211, 82, 27);
		contentPane.add(lblPhNo);
		
		JButton Vcheck = new JButton("CHECK");
		Vcheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int person;
				try {
					person=Integer.parseInt(v1.getText());
					V1.setText("PERSON  :" +person);
					
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Invalid Input !! Please Enter person in Numerical Number" );
				}
				V2.setText("DESTINATION  :" +v2.getText());
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
		Vcheck.setBounds(320, 240, 224, 19);
		contentPane.add(Vcheck);
		
		V2 = new JTextField();
		V2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V2.setColumns(10);
		V2.setBounds(321, 297, 223, 19);
		contentPane.add(V2);
		
		V34 = new JTextField();
		V34.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V34.setColumns(10);
		V34.setBounds(321, 327, 223, 19);
		contentPane.add(V34);
		
		V5 = new JTextField();
		V5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V5.setColumns(10);
		V5.setBounds(321, 357, 223, 19);
		contentPane.add(V5);
		
		v1 = new JTextField();
		v1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v1.setColumns(10);
		v1.setBounds(383, 118, 161, 19);
		contentPane.add(v1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\photo-1421800475598-bb9e5c25d444.jpg"));
		lblNewLabel_4.setBounds(0, 0, 627, 418);
		contentPane.add(lblNewLabel_4);
	}
}
