package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class userpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userpage frame = new userpage();
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
	public userpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserPage = new JLabel("USER PAGE");
		lblUserPage.setFont(new Font("Algerian", Font.ITALIC, 16));
		lblUserPage.setForeground(SystemColor.controlDkShadow);
		lblUserPage.setBounds(157, 26, 98, 23);
		contentPane.add(lblUserPage);
		
		JLabel lblWelcomeToUser = new JLabel("WELCOME TO USER PAGE");
		lblWelcomeToUser.setForeground(new Color(255, 0, 0));
		lblWelcomeToUser.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblWelcomeToUser.setBounds(12, 104, 420, 30);
		contentPane.add(lblWelcomeToUser);
	}
}
