package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argo) {
				{
					new loginhomepage().setVisible(true);
				}
			}
		});
		btnLogin.setForeground(Color.GREEN);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLogin.setBounds(143, 65, 97, 25);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new registerpage().setVisible(true);
				
				
				
			}
		});
		btnRegister.setForeground(Color.RED);
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRegister.setBounds(132, 115, 123, 25);
		contentPane.add(btnRegister);
		
		JLabel lblLoginVerification = new JLabel("LOGIN VERIFICATION");
		lblLoginVerification.setForeground(Color.BLUE);
		lblLoginVerification.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 20));
		lblLoginVerification.setBounds(87, 27, 246, 25);
		contentPane.add(lblLoginVerification);
	}
}
