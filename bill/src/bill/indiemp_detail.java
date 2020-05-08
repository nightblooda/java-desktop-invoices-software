package bill;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.MatteBorder;

public class indiemp_detail extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					indiemp_detail frame = new indiemp_detail();
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
	public indiemp_detail(int emp_Id,String emp_Name,String emp_Mobile,String emp_Aadhar,Date emp_Join,int emp_Presents) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1243, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(3, 3, 1223, 687);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1229, 86);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Detail");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 27));
		lblNewLabel.setBounds(216, 10, 281, 66);
		panel_1.add(lblNewLabel);
		
		
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblName.setBounds(118, 111, 73, 28);
		panel.add(lblName);
		
		JLabel lblMobNo = new JLabel("Mob No. ");
		lblMobNo.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblMobNo.setBounds(147, 149, 88, 28);
		panel.add(lblMobNo);
		
		JLabel lblAdharNo = new JLabel("Adhar No.");
		lblAdharNo.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblAdharNo.setBounds(496, 149, 99, 28);
		panel.add(lblAdharNo);
		
		JLabel lblJoinDate = new JLabel("Join Date : ");
		lblJoinDate.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblJoinDate.setBounds(893, 111, 111, 28);
		panel.add(lblJoinDate);
		
		JLabel lblHimanshuChoudharyAnd = new JLabel(emp_Name);
		lblHimanshuChoudharyAnd.setFont(new Font("SansSerif", Font.PLAIN, 19));
		lblHimanshuChoudharyAnd.setBounds(201, 111, 491, 28);
		panel.add(lblHimanshuChoudharyAnd);
		
		JLabel label = new JLabel(emp_Mobile);
		label.setFont(new Font("SansSerif", Font.PLAIN, 19));
		label.setBounds(263, 149, 119, 28);
		panel.add(label);
		
		JLabel label_1 = new JLabel(emp_Aadhar);
		label_1.setFont(new Font("SansSerif", Font.PLAIN, 19));
		label_1.setBounds(622, 149, 136, 28);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel(String.valueOf(emp_Join));
		label_2.setFont(new Font("SansSerif", Font.PLAIN, 19));
		label_2.setBounds(1015, 111, 119, 28);
		panel.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(null);
		panel_2.setBounds(35, 217, 560, 440);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 560, 440);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
//		JScrollPane scrollPane3= new JScrollPane();
//		scrollPane3.setBounds(0, 0, 860, 730);
//		panel_1.add(scrollPane3);
//		
//		JPanel panelhai2 = new JPanel();
//		scrollPane3.setViewportView(panelhai2);
//		panelhai2.setLayout(new BoxLayout(panelhai2, BoxLayout.X_AXIS));
//		
//		JPanel panelhaina2= new JPanel();
//		panelhai2.add(panelhaina2);
//		panelhaina2.setLayout(new MigLayout("", "[825px]", "[130px][grow,fill][grow,fill]"));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(0, 0, 560, 440);
		panel_4.add(scrollPane);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(250,250,250));
		panel_5.setBorder(null);
		scrollPane.setViewportView(panel_5);
		panel_5.setLayout(new MigLayout("", "[grow][500px,grow][grow]", "[30px][55px][grow]"));
		
		JLabel lblTotalPayments = new JLabel("Payments :");
		lblTotalPayments.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_5.add(lblTotalPayments, "cell 1 0");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(250,250,250));
		panel_5.add(panel_6, "cell 1 1,grow");
		panel_6.setLayout(new MigLayout("", "[100px][100px][grow][100px][100px]", "[25px][30px]"));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_5.add(panel_7, "cell 1 2,grow");
		panel_7.setLayout(new MigLayout("", "[grow]", "[60px,grow]"));
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_6.add(lblDate, "cell 0 0,alignx center");
		
		JDateChooser dateChooser = new JDateChooser();
		panel_6.add(dateChooser, "cell 1 0,grow");
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_6.add(lblAmount, "cell 3 0,alignx center");
		
		textField_1 = new JTextField();
		panel_6.add(textField_1, "cell 4 0,grow");
		textField_1.setColumns(10);
		
		JLabel lblDate_1 = new JLabel("Reason :");
		lblDate_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_6.add(lblDate_1, "cell 0 1,alignx center");
		
		textField = new JTextField();
		panel_6.add(textField, "cell 1 1 4 1,growx");
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(635, 217, 560, 440);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPanenext = new JScrollPane();
		scrollPanenext.setViewportBorder(null);
		scrollPanenext.setBounds(0, 0, 560, 440);
		panel_3.add(scrollPanenext);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBorder(null);
		panel_51.setBackground(new Color(250,250,250));
		scrollPanenext.setViewportView(panel_51);
		panel_51.setLayout(new MigLayout("", "[grow][500px,grow][grow]", "[30px][55px][grow]"));
		
		JLabel lblTotalHolidays = new JLabel("Holidays :");
		lblTotalHolidays.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_51.add(lblTotalHolidays, "cell 1 0");
		
		JPanel panel_61 = new JPanel();
		panel_61.setBackground(new Color(250,250,250));
		panel_51.add(panel_61, "cell 1 1,grow");
		panel_61.setLayout(new MigLayout("", "[100px][100px][grow][100px][100px]", "[25px][30px]"));
		
//		JPanel panel_71 = new JPanel();
//		panel_5.add(panel_7, "cell 1 2,grow");
		
		
		
		try
		{ 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
		String sql = "select * from emp_payments where empid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, emp_Id);
		ResultSet rs = ps.executeQuery();
		int emprow_i =0;	
		if (rs.last()) {
			  emprow_i = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
//		JButton empbuttons[] = new JButton[emprow_i];
		int emppayc= emprow_i;
		JPanel emppaypanel[] = new JPanel[emppayc];
//		JLabel emppaylabel_10[]= new JLabel[emppayc];
//		JLabel emppaylblDate_2[]= new JLabel[emppayc];
//		JLabel emppaylabel_6[]= new JLabel[emppayc];
//		JLabel emppaylblAmount_1[]= new JLabel[emppayc];
//		JLabel emppaylabel_9[]= new JLabel[emppayc];
//		JLabel emppaylblReason[]= new JLabel[emppayc];
//		JLabel emppaylabel_7[]= new JLabel[emppayc];
		int emp_btn_i= 0;
		int setrowbtn= 0;
			while (rs.next()) {


				JPanel panel_8 = new JPanel();
				panel_8.setBackground(Color.WHITE);
//				panel_7.add(panel_8, "cell 0 0");
				panel_8.setLayout(new MigLayout("", "[30px][100px][100px][grow][100px][100px]", "[25px][30px]"));
				
				JLabel label_10 = new JLabel("");
				label_10.setText(String.valueOf(emp_btn_i + 1));

				label_10.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8.add(label_10, "cell 0 0");
				
				JLabel lblDate_2 = new JLabel("Date :  ");
				lblDate_2.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8.add(lblDate_2, "cell 1 0,alignx right");
				
				JLabel label_6 = new JLabel(rs.getString("date"));
				label_6.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8.add(label_6, "cell 2 0");
				
				JLabel lblAmount_1 = new JLabel("Amount :  ");
				lblAmount_1.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8.add(lblAmount_1, "cell 4 0,alignx right");
				
				
				JLabel label_9 = new JLabel(rs.getString("amount"));
				label_9.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8.add(label_9, "cell 5 0");
				
				JLabel lblReason = new JLabel("Note :  ");
				lblReason.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8.add(lblReason, "cell 1 1,alignx right");
				
				JLabel label_7 = new JLabel(rs.getString("reason"));
				label_7.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8.add(label_7, "cell 2 1 4 1");

				
				
				
				panel_7.add(panel_8, "cell 0 "+setrowbtn);
				setrowbtn++;
			
			 emppaypanel[emp_btn_i]= panel_8;
			 emp_btn_i++;
			}

		
		
		
		}
		catch(Exception ex)
		{
		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
		JOptionPane.ERROR_MESSAGE);
		}
		
		
		

		
		
		
		//start
//		JPanel panel_8 = new JPanel();
//		panel_7.add(panel_8, "cell 0 0");
//		panel_8.setLayout(new MigLayout("", "[30px][100px][100px][grow][100px][100px]", "[25px][30px]"));
//		
//		JLabel label_10 = new JLabel("1.");
//		label_10.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_8.add(label_10, "cell 0 0");
//		
//		JLabel lblDate_2 = new JLabel("Date :  ");
//		lblDate_2.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_8.add(lblDate_2, "cell 1 0,alignx right");
//		
//		JLabel label_6 = new JLabel("Date");
//		label_6.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_8.add(label_6, "cell 2 0");
//		
//		JLabel lblAmount_1 = new JLabel("Amount :  ");
//		lblAmount_1.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_8.add(lblAmount_1, "cell 4 0,alignx right");
//		
//		
//		JLabel label_9 = new JLabel("Date");
//		label_9.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_8.add(label_9, "cell 5 0");
//		
//		JLabel lblReason = new JLabel("Reason :  ");
//		lblReason.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_8.add(lblReason, "cell 1 1,alignx right");
//		
//		JLabel label_7 = new JLabel("Date");
//		label_7.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_8.add(label_7, "cell 2 1 4 1");
//
//		//end
//		
//		JPanel panel_9 = new JPanel();
//		panel_7.add(panel_9, "cell 0 1");
//		panel_9.setLayout(new MigLayout("", "[30px][100px][100px][grow][100px][100px]", "[25px][30px]"));
//		
//		JLabel label_11 = new JLabel("1.");
//		label_11.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9.add(label_11, "cell 0 0");
//		
//		JLabel lblDate_3 = new JLabel("Date :  ");
//		lblDate_3.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9.add(lblDate_3, "cell 1 0,alignx right");
//		
//		JLabel label_8 = new JLabel("Date");
//		label_8.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9.add(label_8, "cell 2 0");
//		
//		JLabel lblAmount_1a = new JLabel("Amount :  ");
//		lblAmount_1a.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9.add(lblAmount_1a, "cell 4 0,alignx right");
//		
//		JLabel label_9a = new JLabel("Date");
//		label_9a.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9.add(label_9a, "cell 5 0");
//		
//		JLabel lblReasona = new JLabel("Reason :  ");
//		lblReasona.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9.add(lblReasona, "cell 1 1,alignx right");
//		
//		JLabel label_7a = new JLabel("Date");
//		label_7a.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9.add(label_7a, "cell 2 1 4 1");
//		
//		JPanel panel_9b = new JPanel();
//		panel_7.add(panel_9b, "cell 0 2");
//		panel_9b.setLayout(new MigLayout("", "[30px][100px][100px][grow][100px][100px]", "[25px][30px]"));
//		
//		JLabel label_11b = new JLabel("1.");
//		label_11b.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9b.add(label_11b, "cell 0 0");
//		
//		JLabel lblDate_3b = new JLabel("Date :  ");
//		lblDate_3b.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9b.add(lblDate_3b, "cell 1 0,alignx right");
//		
//		JLabel label_8b = new JLabel("Date");
//		label_8b.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9b.add(label_8b, "cell 2 0");
//		
//		JLabel lblAmount_1b = new JLabel("Amount :  ");
//		lblAmount_1b.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9b.add(lblAmount_1b, "cell 4 0,alignx right");
//		
//		JLabel label_9b = new JLabel("Date");
//		label_9b.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9b.add(label_9b, "cell 5 0");
//		
//		JLabel lblReasonb = new JLabel("Reason :  ");
//		lblReasonb.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9b.add(lblReasonb, "cell 1 1,alignx right");
//		
//		JLabel label_7b = new JLabel("Date");
//		label_7b.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_9b.add(label_7b, "cell 2 1 4 1");
		
		
		
		
		
		
		
//		JLabel label_3 = new JLabel("1.");
//		label_3.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_7.add(label_3, "flowx,cell 0 0,alignx leading");
//		
//		JLabel lblDate_2 = new JLabel("Date :  ");
//		lblDate_2.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_7.add(lblDate_2, "cell 1 0,alignx right");
//		
//		JLabel label_7 = new JLabel("Date");
//		label_7.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_7.add(label_7, "cell 2 0");
//		
//		JLabel lblAmount_1 = new JLabel("Amount :  ");
//		lblAmount_1.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_7.add(lblAmount_1, "cell 3 0,alignx right");
//		
//		JLabel label_8 = new JLabel("Date");
//		label_8.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_7.add(label_8, "cell 4 0");
//		
//		JLabel lblIDontKnow = new JLabel("Reason : ");
//		lblIDontKnow.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_7.add(lblIDontKnow, "cell 1 1");
//		
//		JLabel label_9 = new JLabel("Date");
//		label_9.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_7.add(label_9, "cell 2 1 3 1");
//		panel_7.setLayout(new MigLayout("", "[100px][100px][grow][100px][100px]", "[25px][30px][grow]"));
		
		JLabel lblHDate = new JLabel("Date");
		lblHDate.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_61.add(lblHDate, "cell 0 0,alignx center");
		
		JDateChooser dateHChooser = new JDateChooser();
		panel_61.add(dateHChooser, "cell 1 0,grow");
		
		JLabel lblHDate_1 = new JLabel("Note :");
		lblHDate_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_61.add(lblHDate_1, "cell 0 1,alignx center");
		
		JTextField textFieldnext = new JTextField();
		panel_61.add(textFieldnext, "cell 1 1 4 1,growx");
		textFieldnext.setColumns(10);
		
		JPanel panel_81 = new JPanel();
		panel_81.setBackground(Color.WHITE);
		panel_51.add(panel_81, "cell 1 2,grow");
		panel_81.setLayout(new MigLayout("", "[]", "[]"));
		
//		JPanel panel_8c = new JPanel();
//		panel_8c.setBackground(Color.WHITE);
//		panel_51.add(panel_8c, "cell 1 2,grow");
//		panel_8c.setLayout(new MigLayout("", "[100px][100px][grow][100px][100px]", "[25px][30px]"));	
		
		try
		{ 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
		String sql = "select * from emp_holidays where empid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, emp_Id);
		ResultSet rs = ps.executeQuery();
		int empholic =0;	
		if (rs.last()) {
			  empholic = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
//		JButton empbuttons[] = new JButton[emprow_i];
		JPanel empholipanel[] = new JPanel[empholic];
//		JLabel emppaylabel_10[]= new JLabel[emppayc];
//		JLabel emppaylblDate_2[]= new JLabel[emppayc];
//		JLabel emppaylabel_6[]= new JLabel[emppayc];
//		JLabel emppaylblAmount_1[]= new JLabel[emppayc];
//		JLabel emppaylabel_9[]= new JLabel[emppayc];
//		JLabel emppaylblReason[]= new JLabel[emppayc];
//		JLabel emppaylabel_7[]= new JLabel[emppayc];
		int emp_holi_i= 0;
		int setrowbtn= 0;
			while (rs.next()) {

				JPanel panel_8d = new JPanel();
				panel_8d.setBackground(Color.WHITE);
//				panel_7.add(panel_8, "cell 0 0");
				panel_8d.setLayout(new MigLayout("", "[30px][100px][100px][grow][100px][100px]", "[25px][30px]"));
				
				JLabel label_10d = new JLabel("");
				label_10d.setText(String.valueOf(emp_holi_i + 1));

				label_10d.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8d.add(label_10d, "cell 0 0");
				
				JLabel lblDate_2d = new JLabel("Date :  ");
				lblDate_2d.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8d.add(lblDate_2d, "cell 1 0,alignx right");
				
				JLabel label_6d = new JLabel(rs.getString("date"));
				label_6d.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8d.add(label_6d, "cell 2 0");

				JLabel lblReasond = new JLabel("Note :  ");
				lblReasond.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8d.add(lblReasond, "cell 1 1,alignx right");
				
				JLabel label_7d = new JLabel(rs.getString("reason"));
				label_7d.setFont(new Font("SansSerif", Font.BOLD, 17));
				panel_8d.add(label_7d, "cell 2 1 4 1");

				
				
				
				panel_81.add(panel_8d, "cell 0 "+setrowbtn);
				setrowbtn++;
			
			 empholipanel[emp_holi_i]= panel_8d;
			 emp_holi_i++;
			}

		
		
		
		}
		catch(Exception ex)
		{
		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
		JOptionPane.ERROR_MESSAGE);
		}

		
		JLabel lblPresents = new JLabel("Presents : ");
		lblPresents.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblPresents.setBounds(869, 149, 111, 28);
		panel.add(lblPresents);
		
		JLabel label_4 = new JLabel(String.valueOf(emp_Presents));
		label_4.setFont(new Font("SansSerif", Font.PLAIN, 19));
		label_4.setBounds(998, 149, 64, 28);
		panel.add(label_4);
		
		
		
		JButton btnNewButton = new JButton("Save Changes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dateChooser.getDate()== null && dateHChooser.getDate()== null) {
					JOptionPane.showMessageDialog(null, "Enter the detail to submit");
				}else {
					Connection con= null;
					try {
						Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
						
						con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
						if(!con.isClosed())
							System.out.println("Successfully connected");
						if(dateChooser.getDate()!= null) {
						//java.sql.Date paydate= (Date) dateChooser.getDate();
						java.util.Date paydatea= dateChooser.getDate();
						java.sql.Date paydate= new java.sql.Date(paydatea.getTime());
						String payamount= textField_1.getText();
						String payreason= textField.getText();
						//int emp_mobile_no= Integer.parseInt(mobile_no.getText());
//						String emp_mobile_no= mobile_no.getText();
//						String emp_aadhar_no= aadhar_no.getText();
////						int emp_aadhar_no= Integer.parseInt(aadhar_no.getText());
//						java.util.Date emp_join_date= date.getDate();
//						java.sql.Date sqlDate= new java.sql.Date(emp_join_date.getTime());
						
								try {
									    String sql_query1="INSERT INTO emp_payments(amount,date,reason,empid) values(?,?,?,?)";
									    PreparedStatement preparedstmt= con.prepareStatement(sql_query1);
									    preparedstmt.setString(1, payamount);
									    preparedstmt.setDate(2, paydate);
									    preparedstmt.setString(3, payreason);
									    preparedstmt.setInt(4, emp_Id);
									    preparedstmt.execute();

									    
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
//								System.out.println(username_field + password_field);
							
						}
						if(dateHChooser.getDate()!= null) {
							java.util.Date holidatea= dateHChooser.getDate();
							java.sql.Date holidate= new java.sql.Date(holidatea.getTime());
							String holireason= textFieldnext.getText();
							//int emp_mobile_no= Integer.parseInt(mobile_no.getText());
//							String emp_mobile_no= mobile_no.getText();
//							String emp_aadhar_no= aadhar_no.getText();
////							int emp_aadhar_no= Integer.parseInt(aadhar_no.getText());
//							java.util.Date emp_join_date= date.getDate();
//							java.sql.Date sqlDate= new java.sql.Date(emp_join_date.getTime());
							
									try {
										    String sql_query1="INSERT INTO emp_holidays(date,reason,empid) values(?,?,?)";
										    PreparedStatement preparedstmt= con.prepareStatement(sql_query1);
										    preparedstmt.setDate(1, holidate);
										    preparedstmt.setString(2, holireason);
										    preparedstmt.setInt(3, emp_Id);
										    preparedstmt.execute();
										    	

										    
										
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									
//									System.out.println(username_field + password_field);

						}
						//System.out.println(emp_aadhar_no +" " +emp_mobile_no);
						JOptionPane.showMessageDialog(null, "Employee details added successfully.");
						dispose();
						}catch(Exception ex) {
							System.err.println("Exception: "+ ex.getMessage());
							//JOptionPane.showMessageDialog(null, "Something went wrong try again.");

						}finally {
							try {
								if(con != null)
									con.close();
							}catch(SQLException ex) {}
						}

				}
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(833, 30, 178, 35);
		panel_1.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setOpaque(true);
		btnClose.setForeground(Color.BLACK);
		btnClose.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnClose.setFocusPainted(false);
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(1055, 30, 116, 35);
		panel_1.add(btnClose);
	}
}
