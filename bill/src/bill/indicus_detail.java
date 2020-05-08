package bill;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable.PrintMode;
import javax.swing.border.MatteBorder;
import java.awt.FlowLayout;

public class indicus_detail extends JFrame {

	private JPanel contentPane;
	boolean billone8aa= false;
	JTextArea area= new JTextArea();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					indicus_detail frame = new indicus_detail();
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
	public indicus_detail(String billvehicle) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1243, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(3, 3, 1237, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250,250,250));
		panel_1.setBounds(0, 40, 1237, 148);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(billvehicle);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(476, 10, 276, 64);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 21));
		panel_1.add(lblNewLabel);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_8.setBounds(93, 73, 291, 34);
		panel_1.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		DB db= new DB();
		String csql= "select COUNT(billno) as tbill, SUM(total) as tamount, sum(remain) as tremain from cusbillone where cusbillone.vehicleno='"+billvehicle+"'";
		ResultSet crs= db.executeQuery(csql);
		try {
			if(crs.next()) {
				JLabel lblNewLabel_1 = new JLabel("Total No. of Bills : ");
				lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				panel_8.add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel(crs.getString("tbill"));
				lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
				panel_8.add(lblNewLabel_2);
				
				JPanel panel_10 = new JPanel();
				panel_10.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
				panel_10.setBackground(Color.WHITE);
				panel_10.setBounds(459, 73, 291, 34);
				panel_1.add(panel_10);
				panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
				JLabel label_1 = new JLabel("Total Payment Done : ");
				label_1.setHorizontalAlignment(SwingConstants.CENTER);
				label_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
				panel_10.add(label_1);
				
				JLabel label_2 = new JLabel(crs.getString("tamount"));
				label_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
				panel_10.add(label_2);
				
				JPanel panel_11 = new JPanel();
				panel_11.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
				panel_11.setBackground(Color.WHITE);
				panel_11.setBounds(827, 73, 291, 34);
				panel_1.add(panel_11);
				panel_11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
				JLabel label_3 = new JLabel("Total Payment Remaining : ");
				label_3.setHorizontalAlignment(SwingConstants.CENTER);
				label_3.setFont(new Font("SansSerif", Font.PLAIN, 17));
				panel_11.add(label_3);
				
				JLabel label_4 = new JLabel(crs.getString("tremain"));
				label_4.setFont(new Font("SansSerif", Font.PLAIN, 17));
				panel_11.add(label_4);
				
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 187, 1237, 540);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1237, 612);
		panel_2.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_3);
		panel_3.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setBounds(0, 3, 1237, 39);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(1176, 0, 51, 31);
		panel_7.add(btnNewButton);
		
		
		
		
		
		
		
		
			//DB db= new DB();
			
			try {
				String sql= "select * from cusbillone where cusbillone.vehicleno='"+billvehicle+"'";
				ResultSet rs= db.executeQuery(sql);
				int emprow_i =0;	
				if (rs.last()) {
					  emprow_i = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
				int emppayc= emprow_i;
				System.out.println(emppayc);
				int k= 0;
				int setrowbtn= 0;
				JPanel panelar[]= new JPanel[emppayc];
				JPanel paneldetailar[]= new JPanel[emppayc];
				

				while (rs.next()) {

					
					
					JPanel panel_4 = new JPanel();
					panel_4.setBackground(Color.WHITE);
					panel_3.add(panel_4, "cell 0 "+k+",grow");
					panel_4.setLayout(new MigLayout("", "[grow][760px][grow]", "[70px]10px[]17px[660px,grow][]150px"));
					
					JPanel panel_010 = new JPanel();
					panel_010.setBackground(Color.WHITE);
					panel_4.add(panel_010, "cell 1 1,grow");
					panel_010.setLayout(new MigLayout("", "[5px]13px[]13px[grow]13px[200px]13px[5px]", "[25px]13px[25px]13px[25px]"));
					
					JLabel lblBillNo = new JLabel("Bill No. ");
					lblBillNo.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(lblBillNo, "cell 1 0");
					
					
					Border noneBorder= BorderFactory.createMatteBorder(0,0,0,0, Color.BLACK);
					Border redBorder= BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
					
					JTextField billone1 = new JTextField(rs.getString("billno"));
					billone1.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(billone1, "cell 1 0,aligny bottom");
					billone1.setBorder(redBorder);
					billone1.setColumns(10);
					
					JLabel lablDate= new JLabel("Date : ");
					lablDate.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(lablDate, "flowx,cell 3 0");
					
					JDateChooser billone2 = new JDateChooser(rs.getDate("date"));
					billone2.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(billone2, "cell 3 0,grow");

					
					JLabel lblMs = new JLabel("M/s.");
					lblMs.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(lblMs, "flowx,cell 1 1");
					
					JTextField billone3 = new JTextField(rs.getString("name"));
					panel_010.add(billone3, "cell 1 1,grow");
					billone3.setFont(new Font("SansSerif", Font.BOLD, 17));
					billone3.setBorder(redBorder);
					billone3.setColumns(10);
					
					JLabel lblMoblieNo = new JLabel("Moblie No.");
					lblMoblieNo.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(lblMoblieNo, "cell 2 1,alignx right");
					
					JTextField billone4= new JTextField(rs.getString("mobileno"));
					billone4.setFont(new Font("SansSerif", Font.BOLD, 17));
					billone4.setBorder(redBorder);
					panel_010.add(billone4,"cell 3 1,grow");
					
					JLabel lblvehicleNo= new JLabel("Vehicle No. ");
					lblvehicleNo.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(lblvehicleNo,"cell 1 2");
					
					JTextField billone5= new JTextField(rs.getString("vehicleno"));
					billone5.setFont(new Font("SansSerif", Font.BOLD, 17));
					billone5.setBorder(redBorder);
					panel_010.add(billone5,"cell 1 2,grow");
					
					JLabel lblvehicletype= new JLabel("Vehicle Type: ");
					lblvehicletype.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(lblvehicletype,"cell 2 2");
					
					JTextField billone6= new JTextField(rs.getString("vehicletype"));
					billone6.setFont(new Font("SansSerif", Font.BOLD, 17));
					billone6.setBorder(redBorder);
					panel_010.add(billone6,"cell 2 2,grow");
					
					JLabel lblpresentkm= new JLabel("Present K.M.: ");
					lblpresentkm.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(lblpresentkm,"cell 3 2");
					
					JTextField billone7= new JTextField(rs.getString("presentkm"));
					billone7.setFont(new Font("SansSerif", Font.BOLD, 17));
					panel_010.add(billone7,"cell 3 2,growx,aligny bottom");
					billone7.setBorder(redBorder);
					
					JTextField total= new JTextField(rs.getString("total"));
					JTextField remain= new JTextField(rs.getString("remain"));
					
					String prebillno= rs.getString("billno");
					String sql1 = "select * from cusbilltwo where billno='"+prebillno+"'";
					ResultSet rs1 = db.executeQuery(sql1);
					
						JPanel panel_9;
				        JScrollPane ScrollPane9;
				        JTable table;
				        Object[][] data = {
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
						        {1,"avija","sivja", "FN1","LN1",10},
//						        {1,"avija","sivja", "FN1","LN1",10},
						        };
						    int indx=0;
				        while(rs1.next()) {
				        	data[indx][0]=rs1.getString("itemno");
				        	data[indx][1]=rs1.getString("particulars");
				        	data[indx][2]=rs1.getString("quantity");
				        	data[indx][3]=rs1.getString("rate");
				        	data[indx][4]=rs1.getString("gst");
				        	data[indx][5]=rs1.getString("amount");
				        	indx++;
				        }
				        if(indx<=15) {
				        while(indx<=15) {
				        	data[indx][0]= "";
				        	data[indx][1]= "";
				        	data[indx][2]= "";
				        	data[indx][3]= "";
				        	data[indx][4]= "";
				        	data[indx][5]= "";
				        	indx++;
				        }
				        }
				        
				        
				        //System.out.println(rs1.getInt("itemno")[0]);
				        panel_9 = new JPanel();
				                
				       

//				        table = new JTable(data, new Object[]{"S No.","Particulars",",Quantity","Rate","GST %","Amount"});
				        table = new JTable() {
				        	@Override
				        	    public Printable getPrintable(PrintMode printMode, MessageFormat headerFormat, MessageFormat footerFormat) {
				        	       return new TablePrintable(this, printMode, headerFormat, footerFormat);
				        	    }
				        	};
				        table.setFillsViewportHeight(true);
				        table.setShowHorizontalLines(false);
				        Object[][] hello = new Object[][]{
			        		{data[0][0], data[0][1], data[0][2], data[0][3], data[0][4], data[0][5]},
			        		{data[1][0], data[1][1], data[1][2], data[1][3], data[1][4], data[1][5]},
			        		{data[2][0], data[2][1], data[2][2], data[2][3], data[2][4], data[2][5]},
			        		{data[3][0], data[3][1], data[3][2], data[3][3], data[3][4], data[3][5]},
			        		{data[4][0], data[4][1], data[4][2], data[4][3], data[4][4], data[4][5]},
			        		{data[5][0], data[5][1], data[5][2], data[5][3], data[5][4], data[5][5]},
			        		{data[6][0], data[6][1], data[6][2], data[6][3], data[6][4], data[6][5]},
			        		{data[7][0], data[7][1], data[7][2], data[7][3], data[7][4], data[7][5]},
			        		{data[8][0], data[8][1], data[8][2], data[8][3], data[8][4], data[8][5]},
			        		{data[9][0], data[9][1], data[9][2], data[9][3], data[9][4], data[9][5]},
			        		{data[10][0], data[10][1], data[10][2], data[10][3], data[10][4], data[10][5]},
			        		{data[11][0], data[11][1], data[11][2], data[11][3], data[11][4], data[11][5]},
			        		{data[12][0], data[12][1], data[12][2], data[12][3], data[12][4], data[12][5]},
			        		{data[13][0], data[13][1], data[13][2], data[13][3], data[13][4], data[13][5]},
			        		{data[14][0], data[14][1], data[14][2], data[14][3], data[14][4], data[14][5]},
			        		{data[15][0], data[15][1], data[15][2], data[15][3], data[15][4], data[15][5]},
//			        		{data[16][0], data[16][1], data[16][2], data[16][3], data[16][4], data[16][5]},
			        	};
//				        Object[][] hello= new Object[emppayc][6];
//				        for(int l= 0; l<emppayc; l++) {
//				        	hello[l][0]= data[l][0];
//				        	hello[l][1]= data[l][1];
//				        	hello[l][2]= data[l][2];
//				        	hello[l][3]= data[l][3];
//				        	hello[l][4]= data[l][4];
//				        	hello[l][5]= data[l][5];
//				        }
				        table.setModel(new DefaultTableModel(hello,new String[] {
				        		"S No.", "Particulars", "Quantity", "Rate", "GST %", "Amount"
				        	}
				        ));

				        table.getColumnModel().getColumn(0).setPreferredWidth(35);
				        table.getColumnModel().getColumn(1).setPreferredWidth(350);
				        table.getColumnModel().getColumn(2).setPreferredWidth(55);
				        table.getColumnModel().getColumn(3).setPreferredWidth(60);
				        table.getColumnModel().getColumn(4).setPreferredWidth(50);
				         



				        JTableHeader Theader = table.getTableHeader();
				        
				        Theader.setBackground(new Color(240, 240, 240)); // change the Background color
				        Theader.setForeground(Color.BLACK); // change the Foreground
				        
				        Theader.setFont(new Font("Tahome", Font.BOLD, 17)); // font name style size
				        ((DefaultTableCellRenderer)Theader.getDefaultRenderer())
				                .setHorizontalAlignment(JLabel.CENTER); // center header text
				        
				        table.setFont(new Font("Tahome", Font.BOLD, 15));
				        
				        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
				        rightRenderer.setHorizontalAlignment(JLabel.CENTER);

				        TableModel tableModel = table.getModel();

				        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
				        {
				            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
				        }
				        
				        DefaultTableCellRenderer centerRenderer= new DefaultTableCellRenderer();
				        centerRenderer.setHorizontalAlignment(JLabel.LEFT);
				        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
				        
				        JPanel panel_5 = new JPanel();
				        panel_5.setBackground(new Color(250,250,250));
				        panel_4.add(panel_5, "cell 1 0,grow");
				        panel_5.setLayout(null);
				        
				        JButton btnSaveChanges = new JButton("Save Changes");
				        btnSaveChanges.setBackground(Color.WHITE);
						btnSaveChanges.setFont(new Font("SansSerif", Font.BOLD, 17));
						btnSaveChanges.setOpaque(true);
						btnSaveChanges.setForeground(Color.BLACK);
						btnSaveChanges.setFocusPainted(false);
						btnSaveChanges.setBorder(null);
				        btnSaveChanges.setBounds(270, 19, 132, 35);
				        JCheckBox billone8 = new JCheckBox("Payment Status");
				        billone8aa= rs.getBoolean("payment");
				        billone8.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(billone8aa) {
									billone8aa= false;
								}else {
									billone8aa= true;
								}
								if(billone8aa) {
									billone8.setForeground(Color.GREEN);
//									billsave.setBackground(Color.BLACK);
									remain.setText("0.00");

								}else {
									billone8.setForeground(Color.RED);
//									billsave.setBackground(Color.RED);
								}
//								if(billone8.isSelected()) {
//									billone8a= true;
//									billone8.setForeground(Color.GREEN);
//								}
							}
						});
				        if(rs.getBoolean("payment")) {
				        	billone8.setForeground(Color.GREEN);
				        }else {
				        	billone8.setForeground(Color.RED);
				        }

				        btnSaveChanges.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int bill_warning= JOptionPane.showConfirmDialog(null, "Do you want to update the bill.", "Bill Update", JOptionPane.YES_NO_OPTION);
								if(bill_warning== 0) {
								String billone1a= billone1.getText();
								java.util.Date billone2at= billone2.getDate();
								java.sql.Date billone2a= new java.sql.Date(billone2at.getTime());
								String billone3a= billone3.getText();
								String billone4a= billone4.getText();
								String billone5a= billone5.getText();
								String billone6a= billone6.getText();
								String billone7a= billone7.getText();
								boolean billone8a= false;
								
								if(billone8.isSelected()) {
									billone8a= true;
								}
								int rows= table.getRowCount();
								float total_am= 0;
								int billtwo1a;
								float billtwo6a;
								float billtwo5a;
								float billtwo4a;
								int billtwo3a;
														//System.out.println(billtwo1a+" "+billtwo2+" "+billtwo3+" "+billtwo4+" "+billtwo5+" "+billtwo6a);
								if(remain.getText().isEmpty() && billone8aa== false) {
									JOptionPane.showMessageDialog(null,"Enter the remaining amount.");
									return;
								}
								if(remain.getText().isEmpty() && billone8aa== true) {
									remain.setText("0.00");
								}
								if(billone8aa== false && remain.getText().equals("0.00")) {
									JOptionPane.showMessageDialog(null, "Enter the remaining amount.");
									return;
								}
								if(billone1a==null || billone2a==null || billone5a==null) {
									JOptionPane.showMessageDialog(null, "Enter Bill no., Date and Vehicle no.");
//									dispose();
								}else {
									
//									
//								
//
//									
//									
//									
//									for(int row= 0; row< rows; row++) {
//										String billtwo1= (String)table.getValueAt(row, 0);
//										String billtwo2= (String)table.getValueAt(row, 1);
//										String billtwo3= (String)table.getValueAt(row, 2);
//										String billtwo4= (String)table.getValueAt(row, 3);
//										String billtwo5= (String)table.getValueAt(row, 4);
//										String billtwo6= (String)table.getValueAt(row, 5);
//										
//
//										try {
//										   billtwo1a = Integer.parseInt(billtwo1);
//										}
//										catch (NumberFormatException e1)
//										{
//										   billtwo1a = 0;
//										}
//										
//										try {
//										   billtwo6a = Float.parseFloat(billtwo6);
//										}
//										catch (NumberFormatException e1)
//										{
//										   billtwo6a = 0;
//										}
//										
//										try {
//											   billtwo3a = Integer.parseInt(billtwo3);
//										}
//										catch (NumberFormatException e1)
//										{
//										   billtwo3a = 0;
//										}
//										
//										try {
//										   billtwo4a = Float.parseFloat(billtwo4);
//										}
//										catch (NumberFormatException e1)
//										{
//										   billtwo4a = 0;
//										}
//										
//										try {
//										   billtwo5a = Float.parseFloat(billtwo5);
//										}
//										catch (NumberFormatException e1)
//										{
//										   billtwo5a = 0;
//										}
//										total_am= total_am + billtwo6a;
//										
//								}									
									String sql= "update cusbillone set date='"+billone2a+"',name='"+billone3a+"',mobileno='"+billone4a+"',vehicleno='"+billone5a+"',vehicletype='"+billone6a+"',presentkm='"+billone7a+"',total="+total.getText()+",payment="+billone8a+",remain="+remain.getText()+" where billno='"+prebillno+"'";
									int adem= db.executeOther(sql);
									
									if(adem!= 0) {
								    	JOptionPane.showMessageDialog(null, "Employee details updated successfully.");
										//dispose();
									}else {
										JOptionPane.showMessageDialog(null, "Error occured, try again from starting.");
									}
									
								
//								String del_sql= "delete s,t from cusbillone s inner join cusbilltwo t on s.billno= t.billno where (s.billno="+billone1a+")";
//								db.executeOther(del_sql);
//								String ins_sql= "INSERT INTO cusbilltwo(billno,itemno,particulars,quantity,rate,gst,amount) values('"+billone1a+"',"+billtwo1+",'"+billtwo2+"',"+billtwo3a+","+billtwo4a+","+billtwo5a+","+billtwo6a+")";
//								int rst1= db.executeOther(ins_sql);
								}
							}else {
								return;
							}
				        }
						});
				        panel_5.add(btnSaveChanges);
				        
				        JButton btnPrint = new JButton("Print");
				        btnPrint.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
								area.setText("                                                                              K.S. Automobiles"+"\r\n"+"\r\n");
								area.setText(area.getText()+"         Plot No. 7, Pravasi Nagar, Opp.Murlipura Thana, Road No. 1,Murlipura, Jaipur-302039 (RAJ.)\r\n");
								area.setText(area.getText()+"-------------------------------------------------------------------------------------------------------------------------------------------------------"+"\r\n");
								
								area.setText(area.getText()+"\r\n"+"          Bill No.   ");
								area.setText(area.getText()+billone1.getText());
								area.setText(area.getText()+"                                                                                   Date : ");
								area.setText(area.getText()+formatter.format(billone2.getDate()));
								area.setText(area.getText()+"\r\n"+"          Name :   "+billone3.getText()+"                                                                    Mobile No : "+billone4.getText());
								area.setText(area.getText()+"\r\n"+"          Vehicle No : "+billone5.getText()+"                        Vehicle Type : "+billone6.getText()+"                     KM : "+billone7.getText()+"\r\n"+"\r\n");
								MessageFormat header= new MessageFormat(area.getText());
								JTextArea areafot= new JTextArea();
								areafot.setText("\r\n"+"                                                                                                                                            Total : "+total.getText()+"\r\n");
								areafot.setText(areafot.getText()+ "1. All subject to Jaiput Jurisdiction only.\r\n");
								areafot.setText(areafot.getText()+"2. Check your wheel alignment on every 3000 km. for longer life of your tyre.\r\n");
								areafot.setText(areafot.getText()+"3. Re Checking time 12.00 PM to 4.00 PM\r\n");
								areafot.setText(areafot.getText()+"4. E and O.E");
								areafot.setText(areafot.getText()+"                                                                                                                        Auth. Sign "+"\r\n"+"\r\n"+"\r\n");

								//areafot.setText(areafot.getText()+"                                                                             Auth. Sign");
								//areafot.setText("\r\n                                                        Total : "+total.getText()+"\r\n                                            Remaining Amount : "+remain.getText()+"\r\n1. All subject to Jaiput Jurisdiction only.\r\n2. Check your wheel alignment on every 3000 km. for longer life of your tyre.\r\n3. Re Checking time 12.00 PM to 4.00 PM\r\n4. E and O.E                Auth. Sign");
								MessageFormat footer= new MessageFormat(areafot.getText());
								System.out.println(area);
								try {
									table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
									
								}catch(PrinterException pe) {
									pe.printStackTrace();
								}

							}
						});
				        btnPrint.setBackground(Color.WHITE);
						btnPrint.setFont(new Font("SansSerif", Font.BOLD, 17));
						btnPrint.setOpaque(true);
						btnPrint.setForeground(Color.BLACK);
						btnPrint.setFocusPainted(false);
						btnPrint.setBorder(null);
				        btnPrint.setBounds(593, 19, 132, 35);
				        panel_5.add(btnPrint);
				        
				        JLabel label = new JLabel(String.valueOf(k+1));
				        label.setFont(new Font("SansSerif", Font.BOLD, 17));
				        label.setBounds(35, 29, 46, 21);
				        panel_5.add(label);
				        
//				        JCheckBox billone8 = new JCheckBox("Payment Status");
				        billone8.setBackground(Color.WHITE);
				        billone8.setBounds(78, 19, 162, 35);
				        panel_5.add(billone8);
				        billone8.setHorizontalAlignment(SwingConstants.CENTER);
				        billone8.setFont(new Font("SansSerif", Font.BOLD, 17));
				        billone8.setBorder(noneBorder);
				        billone8.setSelected (rs.getBoolean("payment"));
				        
				        JButton btnDelete = new JButton("Delete");
				        btnDelete.addActionListener(new ActionListener() {
				        	public void actionPerformed(ActionEvent e) {
				        		int bill_warning= JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Bill.", "Bill Delete", JOptionPane.YES_NO_OPTION);
								if(bill_warning== 0) {
									String billone1a= billone1.getText();
									String del_sql= "delete s,t from cusbillone s left join cusbilltwo t on s.billno= t.billno where (s.billno="+billone1a+")";
									db.executeOther(del_sql);
								}else {
									return;
								}
				        	}
				        });
				        btnDelete.setOpaque(true);
				        btnDelete.setForeground(Color.BLACK);
				        btnDelete.setFont(new Font("SansSerif", Font.BOLD, 17));
				        btnDelete.setFocusPainted(false);
				        btnDelete.setBorder(null);
				        btnDelete.setBackground(Color.WHITE);
				        btnDelete.setBounds(433, 19, 132, 35);
				        panel_5.add(btnDelete);
				        panel_9.setLayout(new BorderLayout(0, 0));
						
				        table.setRowHeight(37);
				        ScrollPane9 = new JScrollPane(table);
				        ScrollPane9.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
				        panel_9.add(ScrollPane9, BorderLayout.CENTER);
	//			        panel_9.add(table);
						panel_4.add(panel_9, "cell 1 2,grow");
						

						JPanel panel_011 = new JPanel();
						panel_011.setBackground(Color.WHITE);
						panel_4.add(panel_011, "cell 1 3,grow");
						panel_011.setLayout(new MigLayout("", "[5px]13px[grow]13px[200px]13px[5px]", "[25px]7px[20px]3px[20px]3px[20px]3px[20px]3px[20px]3px[20px]"));  
						
						JLabel total_amount= new JLabel("Total: ");
						total_amount.setFont(new Font("SansSerif", Font.BOLD, 17));
						panel_011.add(total_amount,"cell 1 0,alignx right");
						
//						JTextField total= new JTextField();
						total.setFont(new Font("SansSerif", Font.BOLD, 17));
						panel_011.add(total,"cell 2 0,grow");
						total.setBorder(redBorder);
						
						JLabel remain_amount= new JLabel("Remaining Amount : ");
						remain_amount.setFont(new Font("SansSerif", Font.BOLD, 17));
						panel_011.add(remain_amount,"cell 1 1,alignx right");
						
//						JTextField remain= new JTextField();
						remain.setFont(new Font("SansSerif", Font.BOLD, 17));
						panel_011.add(remain,"cell 2 1,grow");
						remain.setBorder(redBorder);
						
						JTextField aftertotal1= new JTextField("1. All subject to Jaipur Jurisdiction only.");
						aftertotal1.setFont(new Font("SansSerif", Font.BOLD, 13));
						panel_011.add(aftertotal1,"cell 1 2,grow");
						aftertotal1.setBorder(noneBorder);
						
						JTextField aftertotal2= new JTextField("2. Check your wheel alignment on every 3000 km. for longer life of your tyre.");
						aftertotal2.setFont(new Font("SansSerif", Font.BOLD, 13));
						panel_011.add(aftertotal2,"cell 1 3,grow");
						aftertotal2.setBorder(noneBorder);
						
						JTextField aftertotal3= new JTextField("3. Re Checking time 12.00 PM to 4.00 PM.");
						aftertotal3.setFont(new Font("SansSerif", Font.BOLD, 13));
						panel_011.add(aftertotal3,"cell 1 4,grow");
						aftertotal3.setBorder(noneBorder);
						
						JTextField aftertotal4= new JTextField("4. E and O.E");
						aftertotal4.setFont(new Font("SansSerif", Font.BOLD, 13));
						panel_011.add(aftertotal4,"cell 1 5,grow");
						aftertotal4.setBorder(noneBorder);
						
						JLabel sign= new JLabel("Auth. Signature");
						sign.setFont(new Font("SansSerif", Font.BOLD, 17));
						panel_011.add(sign,"cell 2 5,alignx right");

						
						
						panelar[k]= panel_4;
						
						JPanel panel_6 = new JPanel();
						panel_6.setBackground(Color.BLACK);
						panel_6.setBounds(0, 0, 1229, 42);
						panel.add(panel_6);
						panel_6.setLayout(null);
						k++;
				}

				
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}


	

}
}
