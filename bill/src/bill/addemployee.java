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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

public class addemployee extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField aadhar_no;
	private JTextField mobile_no;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					addemployee frame = new addemployee();
//					frame.setUndecorated(true);
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
	public addemployee() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(470, 100, 670, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250,250,250));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Border redBorder= BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(3, 68, 664, 224);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblNewLabel.setBounds(41, 46, 94, 19);
		panel.add(lblNewLabel);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("SansSerif", Font.PLAIN, 17));
		name.setBorder(redBorder);
		name.setBounds(131, 46, 248, 19);
		panel.add(name);
		name.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblMobileNo.setBounds(410, 131, 94, 19);
		panel.add(lblMobileNo);
		
		JLabel lblDate = new JLabel("Join Date : ");
		lblDate.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblDate.setBounds(410, 46, 94, 19);
		panel.add(lblDate);
		
		JLabel lblAdharNo = new JLabel("Adhar No.");
		lblAdharNo.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblAdharNo.setBounds(41, 131, 85, 19);
		panel.add(lblAdharNo);
		
		aadhar_no = new JTextField();
		aadhar_no.setHorizontalAlignment(SwingConstants.CENTER);
		aadhar_no.setColumns(10);
		aadhar_no.setFont(new Font("SansSerif", Font.PLAIN, 17));
		aadhar_no.setBorder(redBorder);
		aadhar_no.setBounds(154, 135, 212, 19);
		panel.add(aadhar_no);
		
		mobile_no = new JTextField();
		mobile_no.setHorizontalAlignment(SwingConstants.CENTER);
		mobile_no.setColumns(10);
		mobile_no.setFont(new Font("SansSerif", Font.PLAIN, 17));
		mobile_no.setBorder(redBorder);
		mobile_no.setBounds(503, 135, 107, 19);
		panel.add(mobile_no);
		
		JDateChooser date = new JDateChooser();
		date.setBounds(503, 44, 103, 19);
		date.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
		date.setFont(new Font("SansSerif", Font.PLAIN,13));
		panel.add(date);
		
		JLabel lblEnterTheEmployee = new JLabel("Enter the Employee Details");
		lblEnterTheEmployee.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblEnterTheEmployee.setBounds(198, 10, 301, 48);
		contentPane.add(lblEnterTheEmployee);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Connection con= null;
//				try {
//					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//					
//					con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
//					if(!con.isClosed())
//						System.out.println("Successfully connected");
//					String emp_name= name.getText();
////					int emp_mobile_no= Integer.parseInt(mobile_no.getText());
//					String emp_mobile_no= mobile_no.getText();
//					String emp_aadhar_no= aadhar_no.getText();
////					int emp_aadhar_no= Integer.parseInt(aadhar_no.getText());
//					java.util.Date emp_join_date= date.getDate();
//					java.sql.Date sqlDate= new java.sql.Date(emp_join_date.getTime());
//					if(emp_name!= null) {
//						if(aadhar_no.getText() != "") {
//							String sql_query= "SELECT * FROM employee WHERE aadhar_no=?";
//							try {
//								PreparedStatement stmt= con.prepareStatement(sql_query);
//								stmt.setString(1, emp_aadhar_no);
//								ResultSet resultSet= stmt.executeQuery();
//								if(resultSet.next()) {
//									JOptionPane.showMessageDialog(null, "Employee already exists.");
//								}else {
//								    String sql_query1="INSERT INTO employee(name,join_date,mobile_no,aadhar_no) values(?,?,?,?)";
//								    PreparedStatement preparedstmt= con.prepareStatement(sql_query1);
//								    preparedstmt.setString(1, emp_name);
//								    preparedstmt.setDate(2,sqlDate);
//								    preparedstmt.setString(3, emp_mobile_no);
//								    preparedstmt.setString(4, emp_aadhar_no);
//								    int result= preparedstmt.executeUpdate();
//								    if(result!= 0) {
//								    	JOptionPane.showMessageDialog(null, "Employee details added successfully.");
//										dispose();
//
//								    }
//								    
//								}
//							} catch (SQLException e1) {
//								// TODO Auto-generated catch block
//								e1.printStackTrace();
//							}
//							
////							System.out.println(username_field + password_field);
//							
//						}else {
//							JOptionPane.showMessageDialog(null, "Enter Aadhar Number of employee.");
//
//						}
//					}else {
//						JOptionPane.showMessageDialog(null, "Enter the name of employee.");
//
//					}
//					//System.out.println(emp_aadhar_no +" " +emp_mobile_no);
//					}catch(Exception ex) {
////						System.err.println("Exception: "+ ex.getMessage());
//						JOptionPane.showMessageDialog(null, "Enter full employee detail.");
//
//					}finally {
//						try {
//							if(con != null)
//								con.close();
//						}catch(SQLException ex) {}
//					}

				DB db= new DB();
				
				String emp_name= name.getText();
			String emp_mobile_no= mobile_no.getText();
			String emp_aadhar_no= aadhar_no.getText();
			java.util.Date emp_join_date= date.getDate();
			java.sql.Date sqlDate= new java.sql.Date(emp_join_date.getTime());
			if(emp_name!= null && !emp_name.isEmpty()) {
				
				if(emp_mobile_no.length()!= 10) {
					JOptionPane.showMessageDialog(null, "Invalid Mobile No.");
					return;
				}
				if(aadhar_no.getText() != null && !aadhar_no.getText().isEmpty()) {
					if(emp_aadhar_no.length()!= 12) {
						JOptionPane.showMessageDialog(null, "Invalid Aadhar No.");
						return;
					}
				String sql= "INSERT INTO employee(name,join_date,mobile_no,aadhar_no) values('"+emp_name+"', '"+sqlDate+"', '"+emp_mobile_no+"', '"+emp_aadhar_no+"')";
				int rst1= db.executeOther(sql);
				if(rst1>0) {
					db.close();
					JOptionPane.showMessageDialog(null,"Employee Detail added successfully.");
					
				}else {
					db.close();
					JOptionPane.showMessageDialog(null, "Error occured, Enter again.");
				}
				}else {
					JOptionPane.showMessageDialog(null, "Enter aadhar no.");
				}
			}else {
				JOptionPane.showMessageDialog(null, "Enter employee name.");
			}
				
				
				
		
	

			}
		});
		btnSave.setBackground(Color.WHITE);
		btnSave.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnSave.setBounds(259, 326, 93, 37);
		contentPane.add(btnSave);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(379, 326, 93, 37);
		contentPane.add(btnClose);
	}
}
