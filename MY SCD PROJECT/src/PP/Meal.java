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

public class Meal extends JFrame {

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
	public Meal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          HOTEL MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(60, 11, 477, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblRoomsOrHotel = new JLabel("        MEAL (if you stay in our hotel)");
		lblRoomsOrHotel.setForeground(Color.WHITE);
		lblRoomsOrHotel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblRoomsOrHotel.setBounds(70, 47, 477, 39);
		contentPane.add(lblRoomsOrHotel);
		
		JLabel lblNewLabel_1 = new JLabel("FILL THIS REQUIRMENTS");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(42, 97, 369, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MEMBERS");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(42, 115, 82, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblFloor = new JLabel("ROOM NO.");
		lblFloor.setForeground(Color.WHITE);
		lblFloor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFloor.setBounds(42, 135, 110, 27);
		contentPane.add(lblFloor);
		
		JLabel lblDate = new JLabel("DISH ");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDate.setBounds(42, 173, 82, 27);
		contentPane.add(lblDate);
		
		JLabel lblMonth = new JLabel("EXTRA");
		lblMonth.setForeground(Color.WHITE);
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMonth.setBounds(42, 191, 82, 27);
		contentPane.add(lblMonth);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Submit().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(42, 377, 226, 16);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\pablo-merchan-montes-dc_JMu8lb5U.jpg"));
		lblNewLabel_3.setBounds(292, 115, 200, 260);
		contentPane.add(lblNewLabel_3);
		
		V1 = new JTextField();
		V1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V1.setBounds(42, 267, 223, 19);
		contentPane.add(V1);
		V1.setColumns(10);
		
		v2 = new JTextField();
		v2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v2.setColumns(10);
		v2.setBounds(135, 143, 131, 19);
		contentPane.add(v2);
		
		v3 = new JTextField();
		v3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v3.setColumns(10);
		v3.setBounds(104, 173, 161, 19);
		contentPane.add(v3);
		
		v4 = new JTextField();
		v4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v4.setColumns(10);
		v4.setBounds(104, 194, 161, 20);
		contentPane.add(v4);
		
		v5 = new JTextField();
		v5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v5.setColumns(10);
		v5.setBounds(104, 215, 161, 18);
		contentPane.add(v5);
		
		JLabel lblPhNo = new JLabel("Ph NO.");
		lblPhNo.setForeground(Color.WHITE);
		lblPhNo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPhNo.setBounds(42, 211, 82, 27);
		contentPane.add(lblPhNo);
		
		JButton Vcheck = new JButton("CHECK");
		Vcheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V1.setText("MEMBERS  :" +v1.getText());
				V2.setText("ROOM NO.  :" +v2.getText());
				int members;
				try {
					members=Integer.parseInt(v1.getText());
					V1.setText("MEMBERS  :" +members);
					
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Invalid Input !! Please Enter Members in Numerical Number" );
				}
				int roomNo;
				try {
					roomNo=Integer.parseInt(v2.getText());
					V2.setText("FLOOR  :" +roomNo);
					
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Invalid Input !! Please Enter ROOM NO. in Numerical Number" );
				}
				V34.setText("DISH  :" +v3.getText());
				V5.setText("EXTRA.  :" +v5.getText());
			}
		});
		Vcheck.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Vcheck.setBounds(41, 240, 224, 19);
		contentPane.add(Vcheck);
		
		V2 = new JTextField();
		V2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V2.setColumns(10);
		V2.setBounds(42, 297, 223, 19);
		contentPane.add(V2);
		
		V34 = new JTextField();
		V34.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V34.setColumns(10);
		V34.setBounds(42, 327, 223, 19);
		contentPane.add(V34);
		
		V5 = new JTextField();
		V5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		V5.setColumns(10);
		V5.setBounds(42, 357, 223, 19);
		contentPane.add(V5);
		
		v1 = new JTextField();
		v1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		v1.setColumns(10);
		v1.setBounds(104, 118, 161, 19);
		contentPane.add(v1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\siyuan-g_V2rt6iG7A-unsplash.jpg"));
		lblNewLabel_4.setBounds(0, 0, 627, 417);
		contentPane.add(lblNewLabel_4);
	}
}
