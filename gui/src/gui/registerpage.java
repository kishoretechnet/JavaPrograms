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
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class registerpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerpage frame = new registerpage();
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
	public registerpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterPage = new JLabel("REGISTER PAGE");
		lblRegisterPage.setForeground(new Color(128, 0, 0));
		lblRegisterPage.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 26));
		lblRegisterPage.setBounds(94, 13, 268, 27);
		contentPane.add(lblRegisterPage);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(36, 65, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAge.setBounds(36, 94, 56, 16);
		contentPane.add(lblAge);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEmail.setBounds(36, 123, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(36, 152, 93, 16);
		contentPane.add(lblPassword);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO");
		lblMobileNo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMobileNo.setBounds(36, 181, 93, 16);
		contentPane.add(lblMobileNo);
		
		textField = new JTextField();
		textField.setBounds(146, 63, 195, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				String name=textField.getText();
				String age=textField_1.getText();
				String email=textField_2.getText();
				String password=textField_3.getText();
				String mobile=textField_4.getText();
				String str="insert into register values('"+name+"','"+age+"','"+email+"','"+password+"','"+mobile+"')";
				Class.forName("org.h2.Driver");
				Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/ceb","sa","");
				Statement stm=con.createStatement();
				stm.executeUpdate(str);
				JOptionPane.showMessageDialog(btnRegister,"Inserted");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
				
			}			
		
		});
	
		btnRegister.setForeground(new Color(186, 85, 211));
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRegister.setBounds(63, 215, 113, 25);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(255, 0, 0));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnReset.setBounds(224, 216, 97, 25);
		contentPane.add(btnReset);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 92, 195, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 121, 195, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(146, 150, 195, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(146, 179, 195, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
