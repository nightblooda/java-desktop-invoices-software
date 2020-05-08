package bill;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.print.PrinterException;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;

public class bnm extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	int xx, yy;
	boolean check1= true, check2= true, check3= true, check4= false;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label_8;
	private JTextField textField_4;
	private JLabel label_9;
	private JLabel label_10;
	private JTextField textField_5;
	private JPanel panel_15;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bnm frame = new bnm();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		panel_5.setBackground(new Color(95, 0, 160));
		panel_6.setBackground(new Color(95, 0, 160));
		panel_7.setBackground(new Color(95, 0, 160));
		panel_8.setBackground(new Color(95, 0, 160));
		
	}

	/**
	 * Create the frame.
	 */
	
	public bnm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setBounds(100, 50, 1228, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.setBackground(new Color(75, 0, 130));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1228, 39);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				xx = e.getX();
				yy = e.getY();
			}
		});
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				bnm.this.setLocation(x - xx, y - yy);
			}
		});
		contentPane.setLayout(null);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnX = new JButton("X");
		btnX.setBackground(Color.WHITE);
		btnX.setBorder(new LineBorder(Color.WHITE, 0));

		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnX.setFocusPainted(false);

		btnX.setBounds(1169, 10, 49, 21);
		panel.add(btnX);
		
		JButton button = new JButton("-");
		button.setBorder(new LineBorder(Color.WHITE, 0));

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(Frame.ICONIFIED);
			}
		});
		button.setFocusPainted(false);

		button.setBackground(Color.WHITE);
//		button.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				frame.setState(Frame.ICONIFIED);
//			}
//		});
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		button.setBounds(1114, 10, 45, 21);
		panel.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(bnm.class.getResource("/images/icons8_online_payment_with_a_credit_card_30px.png")));
		label_1.setBounds(10, 2, 39, 29);
		panel.add(label_1);
		
		JLabel lblAutobill = new JLabel("Auto-Bill");
		lblAutobill.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblAutobill.setForeground(new Color(255, 255, 255));
		lblAutobill.setBounds(59, 7, 111, 21);
		panel.add(lblAutobill);
		
		
	
		layeredPane= new JLayeredPane();
		layeredPane.setBounds(370, 40, 857, 725);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel_1, "name_617631664933073");
		panel_1.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(75, 0, 130));
		panel_9.setBounds(75, 25, 678, 111);
		panel_1.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(245, 245, 245));
		panel_10.setBounds(0, 508, 820, 185);
		panel_1.add(panel_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		layeredPane.add(panel_2, "name_617635230092734");
		panel_2.setLayout(null);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(new Color(245, 245, 245));
		panel_24.setBounds(0, 1, 857, 87);
		panel_2.add(panel_24);
		
		JLabel lblCustomersDetail = new JLabel("Customers Detail");
		lblCustomersDetail.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomersDetail.setFont(new Font("SansSerif", Font.BOLD, 37));
		lblCustomersDetail.setBounds(165, 22, 545, 39);
		panel_24.add(lblCustomersDetail);
		
		textField_49 = new JTextField();
		textField_49.setBackground(Color.WHITE);
		textField_49.setBounds(215, 128, 298, 26);
		Border redBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
		textField_49.setBorder(redBorder);
		panel_2.add(textField_49);
		textField_49.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setOpaque(true);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("SansSerif", Font.PLAIN, 17));
		btnSearch.setFocusPainted(false);
		btnSearch.setBorder(new LineBorder(Color.WHITE, 0));
		btnSearch.setBackground(Color.BLACK);
		btnSearch.setBounds(546, 117, 109, 39);
		panel_2.add(btnSearch);
		
		JLabel lblCustomers = new JLabel("Customers :");
		lblCustomers.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblCustomers.setBounds(125, 202, 109, 39);
		panel_2.add(lblCustomers);
		
		textField_50 = new JTextField();
		textField_50.setBackground(Color.WHITE);
		textField_50.setBorder(null);
		textField_50.setFont(new Font("SansSerif", Font.BOLD, 17));
		textField_50.setText("2000");
		textField_50.setBounds(238, 215, 65, 19);
		textField_50.setEditable(false);
		panel_2.add(textField_50);
		textField_50.setColumns(10);
		
		JButton btnHrCa = new JButton("HR 26 CA 420");
		btnHrCa.setOpaque(true);
		btnHrCa.setForeground(Color.WHITE);
		btnHrCa.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnHrCa.setFocusPainted(false);
		btnHrCa.setBorder(new LineBorder(Color.WHITE, 0));
		btnHrCa.setBackground(Color.LIGHT_GRAY);
		btnHrCa.setBounds(30, 263, 178, 39);
		panel_2.add(btnHrCa);
		
		JButton button_1 = new JButton("HR 26 CA 420");
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		button_1.setFocusPainted(false);
		button_1.setBorder(new LineBorder(Color.WHITE, 0));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(238, 263, 178, 39);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("HR 26 CA 420");
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		button_2.setFocusPainted(false);
		button_2.setBorder(new LineBorder(Color.WHITE, 0));
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(444, 263, 178, 39);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("HR 26 CA 420");
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		button_3.setFocusPainted(false);
		button_3.setBorder(new LineBorder(Color.WHITE, 0));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(649, 263, 178, 39);
		panel_2.add(button_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBackground(Color.WHITE);
		layeredPane.add(panel_3, "name_617637852305677");
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 855, 700);
		panel_3.add(scrollPane);
		
		JPanel panel_25 = new JPanel();
//		panel_25.setPreferredSize(new Dimension(420,280));

//		panel_25.setBounds(0, 0, 2000, 84);
		panel_25.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_25);
		panel_25.setLayout(new BoxLayout(panel_25, BoxLayout.Y_AXIS));
		
		
		JPanel panel_11 = new JPanel();
		panel_11.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_25.add(panel_11);
		panel_11.setBackground(new Color(245, 245, 245));
		panel_11.setLayout(null);
		
		JLabel lblAutomobiles = new JLabel("Automobiles");
		lblAutomobiles.setBounds(196, 5, 226, 48);
		lblAutomobiles.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblAutomobiles.setFont(new Font("SansSerif", Font.BOLD, 37));
		lblAutomobiles.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblAutomobiles);
		
		JLabel lblNewLabel_2 = new JLabel("B-106, Bhabha Bhavan, Svnit, Ichchanath Circle, Pipload road, Surat");
		lblNewLabel_2.setBounds(131, 58, 504, 23);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_11.add(lblNewLabel_2);
		
		JPanel panel_12 = new JPanel();
		panel_12.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_25.add(panel_12);
		
		JLabel label_3 = new JLabel("Bill Number");
		label_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("SansSerif", Font.BOLD, 13));
		textField.setColumns(10);
		
		JLabel label_5 = new JLabel("Vehicle No.");
		label_5.setFont(new Font("SansSerif", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		
		JLabel label_6 = new JLabel("Vehicle Type");
		label_6.setFont(new Font("SansSerif", Font.BOLD, 13));
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		
		JLabel label_7 = new JLabel("Date");
		label_7.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("SansSerif", Font.BOLD, 13));
		dateChooser.setBorder(null);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		
		label_8 = new JLabel("KM");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("SansSerif", Font.BOLD, 13));
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		
		label_9 = new JLabel("Mobile No.");
		label_9.setFont(new Font("SansSerif", Font.BOLD, 13));
		
		label_10 = new JLabel("Mr.");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("SansSerif", Font.BOLD, 13));
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setColumns(10);
		panel_12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_12.add(label_3);
		panel_12.add(textField);
		panel_12.add(label_5);
		panel_12.add(textField_1);
		panel_12.add(label_6);
		panel_12.add(textField_2);
		panel_12.add(label_7);
		panel_12.add(dateChooser);
		panel_12.add(textField_3);
		panel_12.add(label_8);
		panel_12.add(textField_4);
		panel_12.add(label_9);
		panel_12.add(label_10);
		panel_12.add(textField_5);
		
		JPanel panel_14 = new JPanel();
		panel_25.add(panel_14);
		
		panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_25.add(panel_15);
		panel_15.setLayout(new MigLayout("", "[]", "[]"));
		
		JPanel panel_13 = new JPanel();
		panel_25.add(panel_13);
		
		JButton button_4 = new JButton("Print");
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("SansSerif", Font.PLAIN, 17));
		button_4.setFocusPainted(false);
		button_4.setBorder(new LineBorder(Color.WHITE, 0));
		button_4.setBackground(Color.BLACK);
		panel_13.add(button_4);
		
		JButton button_5 = new JButton("Save");
		button_5.setOpaque(true);
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("SansSerif", Font.PLAIN, 17));
		button_5.setFocusPainted(false);
		button_5.setBorder(new LineBorder(Color.WHITE, 0));
		button_5.setBackground(Color.BLACK);
		panel_13.add(button_5);
		
		JButton button_6 = new JButton("Cancel");
		button_6.setOpaque(true);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("SansSerif", Font.PLAIN, 17));
		button_6.setFocusPainted(false);
		button_6.setBorder(new LineBorder(Color.WHITE, 0));
		button_6.setBackground(Color.BLACK);
		panel_13.add(button_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		layeredPane.add(panel_4, "name_617652316245243");
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_4.add(scrollPane_2);
		
		JPanel panel_17 = new JPanel();
		scrollPane_2.setViewportView(panel_17);
		panel_17.setLayout(new BoxLayout(panel_17, BoxLayout.X_AXIS));
		
		JPanel panel_18 = new JPanel();
		panel_17.add(panel_18);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(236, 57, 85, 21);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_18.setLayout(null);
		panel_18.add(btnNewButton_2);
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(7, 1225, 85, 21);
		panel_18.add(btnNewButton_1);
		
		panel_5 = new JPanel();
		panel_5.setBounds(0, 330, 370, 74);
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_5.setBackground(new Color(45, 0, 85));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(panel_3);
				panel_5.setBackground(new Color(45, 0, 85));
				check1= false;
				check2= true;
				check3= true;
				check4= true;
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check1) {
				panel_5.setBackground(new Color(95, 0, 160));
				}
			}
			
		});
		panel_5.setBackground(new Color(95, 0, 160));

		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(54, 0, 76, 74);
		lblNewLabel.setBackground(new Color(72, 61, 139));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(bnm.class.getResource("/images/icons8_Bill_30px.png")));
		
		lblNewLabel.setForeground(new Color(139, 69, 19));
		panel_5.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		
		JLabel lblBill = new JLabel("Bill");
		lblBill.setBounds(135, 0, 46, 74);
		lblBill.setForeground(new Color(245, 245, 245));
		lblBill.setFont(new Font("SansSerif", Font.BOLD, 21));
		panel_5.add(lblBill);
		
		panel_6 = new JPanel();
		panel_6.setBounds(0, 258, 370, 74);
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_6.setBackground(new Color(45, 0, 85));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(panel_2);
				panel_6.setBackground(new Color(45, 0, 85));
				check1= true;
				check2= false;
				check3= true;
				check4= true;
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check2) {
				panel_6.setBackground(new Color(95, 0, 160));
				}
			}
			
		});
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(95, 0, 160));
		contentPane.add(panel_6);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(bnm.class.getResource("/images/icons8_User_Groups_30px_2.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(139, 69, 19));
		label.setFont(new Font("Tahoma", Font.PLAIN, 27));
		label.setBounds(54, 0, 76, 74);
		panel_6.add(label);
		
		JLabel lblCustomer = new JLabel("Customers");
		lblCustomer.setForeground(new Color(245, 245, 245));
		lblCustomer.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblCustomer.setBounds(135, 0, 227, 74);
		panel_6.add(lblCustomer);
		
		panel_7 = new JPanel();
		panel_7.setBounds(0, 404, 370, 74);
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_7.setBackground(new Color(45, 0, 85));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(panel_4);
				panel_7.setBackground(new Color(45, 0, 85));
				check1= true;
				check2= true;
				check3= false;
				check4= true;
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check3) {
				panel_7.setBackground(new Color(95, 0, 160));
				}
			}
			
			
		});
		panel_7.setBackground(new Color(95, 0, 160));
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(54, 0, 76, 74);
		label_2.setIcon(new ImageIcon(bnm.class.getResource("/images/icons8_Business_Building_30px.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(139, 69, 19));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panel_7.add(label_2);
		
		JLabel lblEmployees = new JLabel("Employees");
		lblEmployees.setBounds(133, 0, 227, 74);
		lblEmployees.setForeground(new Color(245, 245, 245));
		lblEmployees.setFont(new Font("SansSerif", Font.BOLD, 21));
		panel_7.add(lblEmployees);
		
		panel_8 = new JPanel();
		panel_8.setBounds(0, 186, 370, 74);
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_8.setBackground(new Color(45, 0, 85));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(panel_1);
				panel_8.setBackground(new Color(45, 0, 85));
				check1= true;
				check2= true;
				check3= true;
				check4= false;
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check4) {
				panel_8.setBackground(new Color(95, 0, 160));
				}
			}
			
		});
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(45, 0, 85));
		contentPane.add(panel_8);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(bnm.class.getResource("/images/icons8_Home_30px.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(139, 69, 19));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		label_4.setBounds(54, 0, 76, 74);
		panel_8.add(label_4);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(new Color(245, 245, 245));
		lblHome.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblHome.setBounds(135, 0, 227, 74);
		panel_8.add(lblHome);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(36, 87, 119, 39);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.BLACK);
				btnNewButton.setForeground(Color.WHITE);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(new LineBorder(Color.WHITE, 0));

		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setOpaque(true);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setIcon(new ImageIcon(bnm.class.getResource("/images/icons8_Logout_Rounded_Left_30px.png")));
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 17));
		contentPane.add(btnNewButton);
		
		JButton btnChangePassword = new JButton("Password");
		btnChangePassword.setBounds(187, 87, 146, 39);
		btnChangePassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnChangePassword.setBackground(Color.WHITE);
				btnChangePassword.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnChangePassword.setBackground(Color.BLACK);
				btnChangePassword.setForeground(Color.WHITE);
			}
		});
		btnChangePassword.setBackground(new Color(0, 0, 0));
		btnChangePassword.setOpaque(true);
		btnChangePassword.setBorder(new LineBorder(Color.WHITE, 0));

		btnChangePassword.setFocusPainted(false);
		btnChangePassword.setIcon(new ImageIcon(bnm.class.getResource("/images/icons8_Forgot_Password_30px_1.png")));
		btnChangePassword.setForeground(new Color(255, 255, 255));
		btnChangePassword.setFont(new Font("SansSerif", Font.PLAIN, 17));
		contentPane.add(btnChangePassword);
		
		JLabel lblNewLabel_1 = new JLabel("2019 Bill-Auto");
		lblNewLabel_1.setBounds(64, 545, 216, 30);
		lblNewLabel_1.setIcon(new ImageIcon(bnm.class.getResource("/images/icons8_Copyright_30px.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(220, 220, 220));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_1);
		
	}
}
