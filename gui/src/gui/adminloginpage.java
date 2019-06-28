package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class adminloginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminloginpage frame = new adminloginpage();
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
	public adminloginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminLoginPage = new JLabel("ADMIN LOGIN PAGE");
		lblAdminLoginPage.setForeground(new Color(0, 128, 128));
		lblAdminLoginPage.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 26));
		lblAdminLoginPage.setBounds(81, 25, 267, 35);
		contentPane.add(lblAdminLoginPage);
		
		JLabel lblAdminName = new JLabel("ADMIN NAME");
		lblAdminName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAdminName.setBounds(40, 101, 116, 16);
		contentPane.add(lblAdminName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(50, 143, 106, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(182, 99, 206, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String n=textField.getText();
					String p=textField_1.getText();
					String str1="select * from adminlogin where adminname='"+n+"' and adminpass='"+p+"'";
					Class.forName("org.h2.Driver");
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/ceb","sa","");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(str1);
					rs.next();
					String n1=rs.getString(1);
					String p1=rs.getString(2);
					if(n.equals(n1)&&p.equals(p1))
					{
						new adminhomepage().setVisible(true);
					}
				}	
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnLogin, "login fail");
					System.out.println("LOGIN FAIL");
				}
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogin.setForeground(new Color(128, 128, 0));
		btnLogin.setBounds(83, 195, 97, 25);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnReset.setForeground(new Color(255, 0, 0));
		btnReset.setBounds(240, 196, 97, 25);
		contentPane.add(btnReset);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 141, 206, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
