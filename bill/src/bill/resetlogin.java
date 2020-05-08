package bill;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class resetlogin extends JFrame {

	private JPanel contentPane;
	private JTextField old_password;
	private JTextField new_password;
	private JTextField old_username;
	private JTextField new_username;
	boolean gained= false;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					resetlogin frame = new resetlogin();
//					frame.setUndecorated(true);
//					frame.setLocationRelativeTo(null);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public resetlogin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 200, 748, 319);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Border redBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
		Border fullBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 250, 250));
		panel_1.setBounds(0, 1, 750, 51);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change User Details");
		lblNewLabel.setBounds(290, 10, 210, 28);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 21));
		
		old_password = new JTextField();
		old_password.setFont(new Font("SansSerif", Font.PLAIN, 15));

		old_password.setBorder(redBorder);
		old_password.setBounds(536, 72, 139, 19);
		panel.add(old_password);
		old_password.setColumns(10);
		
		JLabel lblOldPassword = new JLabel("Current Password");
		lblOldPassword.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblOldPassword.setBounds(389, 75, 139, 13);
		panel.add(lblOldPassword);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		lblNewPassword.setBounds(160, 148, 114, 13);
		panel.add(lblNewPassword);
		
		new_password = new JTextField();
		new_password.setFont(new Font("SansSerif", Font.PLAIN, 15));
		new_password.setBorder(redBorder);
		new_password.setColumns(10);
		new_password.setBounds(284, 145, 139, 19);
		panel.add(new_password);
		
		JButton change_password = new JButton("Change");
		change_password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con= null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					
					con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
					if(!con.isClosed()) {
						System.out.println("Successfully connected");}
					String oldPassword= old_password.getText();
					String oldUsername= old_username.getText();
					String newPassword= new_password.getText();

					if(oldPassword != null && !oldPassword.isEmpty() || oldUsername != null && !oldUsername.isEmpty()) {
						if(newPassword != null && !newPassword.isEmpty()) {

//							String sql_query= "SELECT * FROM user WHERE password=? AND username=?";
							String sql_query= "UPDATE user SET password=? WHERE password=? AND username=?";
							try {
								PreparedStatement stmt= con.prepareStatement(sql_query);
								stmt.setString(1, newPassword);
								stmt.setString(2, oldPassword);
								stmt.setString(3, oldUsername);
								
								//stmt.executeUpdate();
								if(stmt.executeUpdate() > 0) {
									JOptionPane.showMessageDialog(null, "New Password is set");
								}else {
									JOptionPane.showMessageDialog(null, "Invalid user details");
								}
								stmt.close();
								old_password.setText("");
								old_username.setText("");

							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
//							dispose();

						}else {
						    JOptionPane.showMessageDialog(null, "Enter new password");

						}
					}else {
					    JOptionPane.showMessageDialog(null, "Invalid user details");

					}
					}catch(Exception ex) {
						System.err.println("Exception: "+ ex.getMessage());
					}finally {
						try {
							if(con != null)
								con.close();
						}catch(SQLException ex) {}
					}
	
			}
		});
		change_password.setBackground(new Color(250, 250, 250));
		change_password.setFont(new Font("SansSerif", Font.BOLD, 13));
		change_password.setBounds(528, 145, 85, 21);
		panel.add(change_password);
		
		JLabel lblChangePassword = new JLabel("Change Password:");
		lblChangePassword.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblChangePassword.setBounds(116, 114, 188, 27);
		panel.add(lblChangePassword);
		
		JLabel label_1 = new JLabel("Change Password:");
		label_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		label_1.setBounds(116, 190, 188, 27);
		panel.add(label_1);
		
		JLabel lblOldUsername = new JLabel("Current Username");
		lblOldUsername.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblOldUsername.setBounds(50, 75, 140, 13);
		panel.add(lblOldUsername);
		
		old_username = new JTextField();
		old_username.setFont(new Font("SansSerif", Font.PLAIN, 15));
		old_username.setBorder(redBorder);
		old_username.setColumns(10);
		old_username.setBounds(194, 72, 139, 19);
		panel.add(old_username);
		
		JLabel lblNewUsername = new JLabel("New Username");
		lblNewUsername.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewUsername.setBounds(160, 227, 114, 13);
		panel.add(lblNewUsername);
		
		new_username = new JTextField();
		new_username.setFont(new Font("SansSerif", Font.PLAIN, 15));
		new_username.setBorder(redBorder);
		new_username.setColumns(10);
		new_username.setBounds(284, 224, 139, 19);
		panel.add(new_username);
		
		JButton change_username = new JButton("Change");
		change_username.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con= null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					
					con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
					if(!con.isClosed()) {
						System.out.println("Successfully connected");}
					String oldPassword= old_password.getText();
					String oldUsername= old_username.getText();
					String newUsername= new_username.getText();

					if(oldPassword != null && !oldPassword.isEmpty() || oldUsername != null && !oldUsername.isEmpty()) {
						if(newUsername != null && !newUsername.isEmpty()) {

//							String sql_query= "SELECT * FROM user WHERE password=? AND username=?";
							String sql_query= "UPDATE user SET username=? WHERE password=? AND username=?";
							try {
								PreparedStatement stmt= con.prepareStatement(sql_query);
								stmt.setString(1, newUsername);
								stmt.setString(2, oldPassword);
								stmt.setString(3, oldUsername);
								
								if(stmt.executeUpdate() >0) {
									JOptionPane.showMessageDialog(null, "New Username is set");
								}else {
									JOptionPane.showMessageDialog(null, "Invalid user detail.");
								}
								stmt.close();
								old_password.setText("");
								old_username.setText("");

							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
//							dispose();

						}else {
						    JOptionPane.showMessageDialog(null, "Enter new username");

						}
					}else {
					    JOptionPane.showMessageDialog(null, "Invalid user details");

					}
					}catch(Exception ex) {
						System.err.println("Exception: "+ ex.getMessage());
					}finally {
						try {
							if(con != null)
								con.close();
						}catch(SQLException ex) {}
					}
			}
		});
		change_username.setFont(new Font("SansSerif", Font.BOLD, 13));
		change_username.setBackground(new Color(250, 250, 250));
		change_username.setBounds(528, 224, 85, 21);
		panel.add(change_username);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		btnNewButton.setBounds(360, 273, 86, 29);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(fullBorder);
		btnNewButton.setOpaque(true);
		btnNewButton.setFocusPainted(false);
	}
}
