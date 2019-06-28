package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class adminhomepage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JButton btnDeleteUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminhomepage frame = new adminhomepage();
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
	public adminhomepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 385, 855);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);	
		
		JButton btnViewUser = new JButton("VIEW USER");
		btnViewUser.setForeground(new Color(139, 0, 0));
		btnViewUser.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 16));
		btnViewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String name=textField.getText();
					String str="select * from register where name='"+name+"'";
					Class.forName("org.h2.Driver");
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/ceb","sa","");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(str);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception t)
				{
					System.out.println(t);
					JOptionPane.showMessageDialog(btnViewUser,"NO USER FIND");
				}
			}
		});
		btnViewUser.setBounds(12, 41, 159, 25);
		contentPane.add(btnViewUser);
		
		textField = new JTextField();
		textField.setBounds(193, 61, 160, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnDeleteUser = new JButton("DELETE USER");
		btnDeleteUser.setForeground(new Color(255, 69, 0));
		btnDeleteUser.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 16));
		btnDeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String namee=textField.getText();
					String str="delete from register where name='"+namee+"'";
					Class.forName("org.h2.Driver");
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/ceb","sa","");
					Statement stm=con.createStatement();
					stm.execute(str);
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDeleteUser.setBounds(10, 79, 161, 25);
		contentPane.add(btnDeleteUser);
		
		JLabel lblAdminHomePage = new JLabel("ADMIN HOME PAGE");
		lblAdminHomePage.setForeground(new Color(0, 0, 255));
		lblAdminHomePage.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 16));
		lblAdminHomePage.setBounds(118, 12, 211, 16);
		contentPane.add(lblAdminHomePage);}
}
