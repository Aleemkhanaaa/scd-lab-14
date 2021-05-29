package PP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Submit extends JFrame  {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-179,359
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Submit frame = new Submit();
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
	public Submit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                       THANK YOU SO MUCH ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(20, 23, 557, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblYourRequairmentsAre = new JLabel("        YOUR REQUIRMENTS ARE SUBMITTED");
		lblYourRequairmentsAre.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblYourRequairmentsAre.setBounds(20, 108, 557, 71);
		contentPane.add(lblYourRequairmentsAre);
		
		JLabel lblSuccessfully = new JLabel("                                SUCCESSFULLY");
		lblSuccessfully.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSuccessfully.setBounds(20, 162, 557, 71);
		contentPane.add(lblSuccessfully);
		
		JLabel lblOurEmployeeWill = new JLabel("    OUR EMPLOYEE WILL CONTACT YOU WITH IN 5 MINT");
		lblOurEmployeeWill.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblOurEmployeeWill.setBounds(20, 226, 557, 71);
		contentPane.add(lblOurEmployeeWill);
		
		JButton btnNewButton = new JButton("BACK TO HOME");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AfterLoginMainManu().setVisible(true);
			}
		});
		btnNewButton.setBounds(172, 298, 241, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\MY SCD PROJECT\\pics use\\photo-1498496294664-d9372eb521f3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 627, 418);
		contentPane.add(lblNewLabel_1);
	}

}
