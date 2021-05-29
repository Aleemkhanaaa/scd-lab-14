package PP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class DirectBooking extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterLoginMainManu frame = new AfterLoginMainManu();
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
	public DirectBooking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("          HOTEL MANAGEMENT SYSTEM");
		label.setFont(new Font("Times New Roman", Font.BOLD, 28));
		label.setBounds(27, -11, 551, 77);
		contentPane.add(label);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(55, 379, 523, -279);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBackground(Color.BLACK);
		table_1.setBorder(new LineBorder(Color.BLACK, 8));
		table_1.setBounds(70, 160, 72, -60);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(55, 99, 1, 1);
		contentPane.add(table_2);
		
		JLabel lblNewLabel_3 = new JLabel("                 OUR SERVICES");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_3.setBounds(97, 48, 441, 39);
		contentPane.add(lblNewLabel_3);
		
		JList list = new JList();
		list.setBounds(97, 288, 81, -127);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("ROOMS OR HOTEL BOOKING");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Rooms().setVisible(true);
			}
		});
		btnNewButton.setBounds(80, 111, 453, 39);
		contentPane.add(btnNewButton);
		
		JButton btnVehicleOrCar = new JButton("VEHICLE OR CAR FOR PICK AND DROP");
		btnVehicleOrCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vehicles().setVisible(true);
			}
		});
		btnVehicleOrCar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnVehicleOrCar.setBounds(85, 178, 453, 39);
		contentPane.add(btnVehicleOrCar);
		
		JButton btnEventsBooking = new JButton("EVENTS BOOKING");
		btnEventsBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Events().setVisible(true);
			}
		});
		btnEventsBooking.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEventsBooking.setBounds(80, 242, 453, 39);
		contentPane.add(btnEventsBooking);
		
		JButton btnBackToHome = new JButton("BACK TO HOME");
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
				
			}
		});
		btnBackToHome.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBackToHome.setBounds(193, 306, 251, 39);
		contentPane.add(btnBackToHome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\aaa.jpg"));
		lblNewLabel.setBounds(0, 0, 645, 442);
		contentPane.add(lblNewLabel);
	}
}
