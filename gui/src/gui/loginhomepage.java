package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginhomepage extends JFrame {

	private JPanel contentPane;
	private JLabel lblSelectAnyLogin;
	private JButton btnAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginhomepage frame = new loginhomepage();
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
	public loginhomepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUser = new JButton("USER");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new userloginpage().setVisible(true);
			}
		});
		btnUser.setForeground(Color.GREEN);
		btnUser.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnUser.setBounds(77, 128, 112, 34);
		contentPane.add(btnUser);
		
		lblSelectAnyLogin = new JLabel("SELECT ANY LOGIN");
		lblSelectAnyLogin.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 26));
		lblSelectAnyLogin.setBounds(95, 34, 266, 48);
		contentPane.add(lblSelectAnyLogin);
		
		btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new adminloginpage().setVisible(true);
			}
		});
		btnAdmin.setForeground(Color.RED);
		btnAdmin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdmin.setBounds(257, 128, 112, 36);
		contentPane.add(btnAdmin);
	}
}
