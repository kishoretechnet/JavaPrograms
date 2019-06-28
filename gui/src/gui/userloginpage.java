package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class userloginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userloginpage frame = new userloginpage();
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
	public userloginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserLoginPage = new JLabel("USER LOGIN PAGE");
		lblUserLoginPage.setForeground(Color.GRAY);
		lblUserLoginPage.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 26));
		lblUserLoginPage.setBounds(88, 32, 242, 35);
		contentPane.add(lblUserLoginPage);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(37, 95, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(37, 136, 96, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(161, 92, 199, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 134, 199, 22);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String name=textField.getText();
					String str1="select * from register where name='"+name+"'";
					Class.forName("org.h2.Driver");
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/ceb","sa","");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(str1);
					rs.next();
					String name1=rs.getString(1);
					if(name.equals(name1))
					{
				new userpage().setVisible(true);
					}
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnLogin.setForeground(Color.GREEN);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogin.setBounds(77, 193, 97, 25);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnReset.setForeground(Color.BLACK);
		btnReset.setBounds(233, 194, 97, 25);
		contentPane.add(btnReset);
	}
}
