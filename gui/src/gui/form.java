package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;

public class form extends JFrame {

	private JPanel contentPane;
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
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 93, 432, 160);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(25, 13, 54, 16);
		panel.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAge.setBounds(23, 42, 56, 16);
		panel.add(lblAge);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(25, 73, 56, 16);
		panel.add(lblEmail);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO");
		lblMobileNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMobileNo.setBounds(25, 102, 93, 16);
		panel.add(lblMobileNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 10, 210, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 39, 210, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 70, 210, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 99, 210, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try
			{
				String n=textField_1.getText();
				String a=textField_2.getText();
				String str1="update register set age='"+a+"' where name='"+n+"'";
				Class.forName("org.h2.Driver");
				Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/ceb","sa","");
				Statement stm=con.createStatement();
				stm.executeUpdate(str1);
				JOptionPane.showMessageDialog(btnUpdate,"DATA UPDATED...");
			}
			catch(Exception t)
			{
				JOptionPane.showMessageDialog(btnUpdate,"DATA NOT UPDATED!!!");
				System.out.println(t);
			}
			}
		});
		btnUpdate.setForeground(new Color(255, 127, 80));
		btnUpdate.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 16));
		btnUpdate.setBounds(142, 55, 116, 25);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try
			{
				String n=textField_1.getText();
				String str="delete from register where name='"+n+"'";
				Class.forName("org.h2.Driver");
				Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/ceb","sa","");
				Statement stm=con.createStatement();
				stm.execute(str);
				JOptionPane.showMessageDialog(btnDelete,"DATA DELETED...");
				
			}
			catch(Exception t)
			{
				System.out.print(t);
			}
			}
		});
		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 16));
		btnDelete.setBounds(291, 55, 116, 25);
		contentPane.add(btnDelete);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 16));
		btnSearch.setForeground(new Color(0, 139, 139));
		btnSearch.setBounds(0, 55, 108, 25);
		contentPane.add(btnSearch);
		
		JLabel lblForm = new JLabel("FORM");
		lblForm.setForeground(new Color(0, 0, 128));
		lblForm.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 18));
		lblForm.setBounds(169, 13, 56, 16);
		contentPane.add(lblForm);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String u=textField_1.getText();
					String str="select age,email,mobileno from register where name='"+u+"'";
					Class.forName("org.h2.Driver");
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/ceb","sa","");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					textField_2.setText(rs.getString(1));
					textField_3.setText(rs.getString(2));
					textField_4.setText(rs.getString(3));
					JOptionPane.showMessageDialog(btnSearch,"SERACH...");
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnSearch,"DATA IS NOT AVAILABLE");
					System.out.println("DATA IS NOT AVAILABLE");
				}
			}
		});
	}
}
