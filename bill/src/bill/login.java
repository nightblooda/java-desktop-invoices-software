package bill;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel lblautobillImg;
	private JLabel lblusername;
	private JLabel lblpassword;

	int xx, yy;

	/**Launch Application*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setUndecorated(true);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**Create Frame*/
	
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 80, 271, 195);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label autobillHeader = new Label("Auto-Bill");
		autobillHeader.setBounds(185, 44, 294, 40);
		contentPane.add(autobillHeader);
		autobillHeader.setAlignment(Label.CENTER);
		autobillHeader.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 36));
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				xx = e.getX();
				yy = e.getY();
			}
		});
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				login.this.setLocation(x - xx, y - yy);
			}
		});
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 685, 38);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		

		lblautobillImg = new JLabel("");
		lblautobillImg.setBounds(22, 10, 225, 176);
		lblautobillImg.setIcon(new ImageIcon(login.class.getResource("/images/billcrop.png")));
		panel.add(lblautobillImg);
		
		
		JLabel lbltopIcon = new JLabel("New label");
		lbltopIcon.setIcon(new ImageIcon(login.class.getResource("/images/icons8_online_payment_with_a_credit_card_30px.png")));
		lbltopIcon.setBounds(10, 0, 35, 38);
		panel_1.add(lbltopIcon);
		
		JLabel lblAutobill = new JLabel("Auto-Bill");
		lblAutobill.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblAutobill.setForeground(Color.WHITE);
		lblAutobill.setBounds(55, 0, 81, 38);
		panel_1.add(lblAutobill);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("SansSerif", Font.BOLD, 17));
		usernameField.setBounds(379, 119, 224, 33);
		usernameField.setForeground(Color.BLACK);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("SansSerif", Font.BOLD, 17));
		passwordField.setBounds(379, 180, 226, 33);
		contentPane.add(passwordField);
		
		lblusername = new JLabel("");
		lblusername.setIcon(new ImageIcon(login.class.getResource("/images/user30px.png")));
		lblusername.setBounds(321, 119, 30, 33);
		contentPane.add(lblusername);
		
		lblpassword = new JLabel("");
		lblpassword.setIcon(new ImageIcon(login.class.getResource("/images/icons8_Password_30px.png")));
		lblpassword.setBounds(321, 180, 36, 33);
		contentPane.add(lblpassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER)
				userlogin();
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userlogin();
		
			}
		});
        btnLogin.setBorder(new LineBorder(Color.BLACK, 3));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setOpaque(true);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(379, 242, 87, 33);
		btnLogin.setFocusPainted(false);
		contentPane.add(btnLogin);
		
		
		
		JButton btnClose = new JButton("Close");
		btnClose.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					System.exit(0);
				}
			}
		});
        btnClose.setBorder(new LineBorder(Color.BLACK, 3));
		btnClose.setBackground(Color.WHITE);
		btnClose.setFocusPainted(false);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClose.setBounds(523, 242, 80, 33);
		contentPane.add(btnClose);
		
		
	}
	
	public void userlogin() {
		String username_field= usernameField.getText();
		String password_field= String.valueOf(passwordField.getPassword());
		if(username_field!= null && !username_field.isEmpty()) {
			if(password_field!= null && !password_field.isEmpty()) {
				DB db= new DB();
				
				try {
					String sql= "SELECT * FROM user WHERE username='"+username_field+"' AND password='"+password_field+"'";
					ResultSet rst1= db.executeQuery(sql);
					if(rst1.next()) {
						db.close();
						dispose();
						home homeframe= new home();
						homeframe.setUndecorated(true);
						homeframe.setVisible(true);
					}else {
						db.close();
						JOptionPane.showMessageDialog(null, "Invalid Login Details.");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}else {
				JOptionPane.showMessageDialog(null, "Enter password.");
			}
				
		}else {
			JOptionPane.showMessageDialog(null, "Enter username.");
		}
	}
}

//prepared statement
//Connection con= null;
//try {
//	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//	
//	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
//	if(!con.isClosed())
//		System.out.println("Successfully connected");
//	String username_field= usernameField.getText();
//	String password_field=String.valueOf(passwordField.getPassword());
//
//	if(username_field!= null && !username_field.isEmpty()) {
//		if(password_field!= null && !password_field.isEmpty()) {
//			String sql_query= "SELECT * FROM user WHERE username=? AND password=?";
//			try {
//				PreparedStatement stmt= con.prepareStatement(sql_query);
//				stmt.setString(1, username_field);
//				stmt.setString(2, password_field);
//				ResultSet resultSet= stmt.executeQuery();
//				if(resultSet.next()) {
//					home takeme= new home();
//					takeme.setUndecorated(true);
//					takeme.setVisible(true);
//					dispose();
//				}else {
//				    JOptionPane.showMessageDialog(null, "Invalid user details");
//
//                    usernameField.setText("");
//                    passwordField.setText("");
//				}
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
////			System.out.println(username_field + password_field);
//			
//		}else {
//			JOptionPane.showMessageDialog(null, "Enter the password.");
//		}
//	}else {
//		JOptionPane.showMessageDialog(null, "Enter the username.");
//	}
//	}catch(Exception ex) {
//		System.err.println("Exception: "+ ex.getMessage());
//	}finally {
//		try {
//			if(con != null)
//				con.close();
//		}catch(SQLException ex) {}
//	}

