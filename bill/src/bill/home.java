package bill;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable.PrintMode;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.border.LineBorder;


import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.google.protobuf.Field;
import com.toedter.calendar.JCalendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;

import java.awt.Canvas;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.border.MatteBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.net.URI;
import java.net.URL;
import java.beans.PropertyChangeEvent;

public class home extends JFrame {

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

	private JTextField em_search;
	private JTextField cus_search;
	private JTable table;
	private JTable table_1;
	private JTextField billone1;
	private JTextField billone3;
	private JTextField billone4;
	public JTextArea area;
	boolean billone8a= false;
	JButton billsave;
	JTextField remain= new JTextField();
	float totalbill_am= 0;
	boolean abilltwo0;
	int abilltwo3a;
	float abilltwo4a,abilltwo5a,abilltwo6a,billone9a;
	
	JLabel label_17;
	JLabel label_3;
	JLabel label_13;
	JLabel label_11;
	JLabel label_15;
	JLabel label_6;
	JLabel label_8;
	JLabel label_19;
	JLabel label_7;
	
	JLabel label_35;
	JLabel label_33;
	JLabel label_31;
	JLabel label_29;
	JLabel label_27;
	JLabel label_25;
	JLabel label_23;
	JLabel label_21;
	JLabel label_18;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					home frame = new home();
//					frame.setUndecorated(true);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		panel_5.setBackground(Color.WHITE);
		panel_6.setBackground(Color.WHITE);
		panel_7.setBackground(Color.WHITE);
		panel_8.setBackground(Color.WHITE);
		
	}
	
	public static boolean openWebpage(String urlString) {
		Desktop desktop= Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
		if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
			try {
				desktop.browse(new URL(urlString).toURI());
				return true;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public void calTotal() {
		System.out.println("hello");
	}

	

	/**
	 * Create the frame.
	 */
	
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		//setBounds(100, 50, 1228, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		area= new JTextArea();

		
		JPanel panel = new JPanel();
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
				home.this.setLocation(x - xx, y - yy);
			}
		});
		contentPane.setLayout(new MigLayout("", "[242px][100px][][242px][77%,grow]", "[50px][37px][39px][60px][70px][70px][70px][70px][30px][76px][70px][154px,grow]"));
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, "cell 0 0 5 1,grow");
		
		JButton btnX = new JButton("X");
		btnX.setBackground(Color.WHITE);
		btnX.setBorder(new LineBorder(Color.WHITE, 0));

		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		panel.setLayout(new MigLayout("", "[70px][100px][grow][47px][47px]", "[39px]"));
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(home.class.getResource("/images/icons8_online_payment_with_a_credit_card_30px.png")));
		panel.add(label_1, "cell 0 0,growx,aligny center");
		btnX.setFocusPainted(false);
		panel.add(btnX, "cell 4 0,grow");
		
		JButton button = new JButton("-");
		button.setBorder(new LineBorder(Color.WHITE, 0));

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(Frame.ICONIFIED);
			}
		});
		button.setFocusPainted(false);

		button.setBackground(Color.WHITE);
		panel.add(button, "cell 3 0,grow");
		
		JLabel lblAutobill = new JLabel("Auto-Bill");
		lblAutobill.setHorizontalAlignment(SwingConstants.LEFT);
		lblAutobill.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblAutobill.setForeground(new Color(255, 255, 255));
		panel.add(lblAutobill, "cell 1 0,growx,aligny center");
		
		
	
		layeredPane= new JLayeredPane();
		contentPane.add(layeredPane, "cell 4 1 1 11,grow");
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel_1, "name_617631664933073");
		panel_1.setLayout(null);
		
		
		
		JScrollPane scrollPane3= new JScrollPane();
		scrollPane3.setBounds(0, 0, 1085, 800);
		panel_1.add(scrollPane3);
		
		JPanel panelhai2 = new JPanel();
		scrollPane3.setViewportView(panelhai2);
		panelhai2.setLayout(new BoxLayout(panelhai2, BoxLayout.X_AXIS));
		
		JPanel panelhaina2= new JPanel();
		panelhai2.add(panelhaina2);
		panelhaina2.setBackground(new Color(250,250,250));
		panelhaina2.setLayout(new MigLayout("", "[825px,grow]", "[130px][grow,fill]"));
		
		JPanel panelhorow1= new JPanel();
		panelhorow1.setBackground(new Color(250,250,250));
		panelhaina2.add(panelhorow1, "cell 0 0, grow");
		panelhorow1.setLayout(new MigLayout("", "[grow][][grow]", "[][40px][17px][]"));
		
		JLabel shop_title = new JLabel("K.S. Automoblies");
		shop_title.setFont(new Font("SansSerif", Font.BOLD, 43));
		panelhorow1.add(shop_title, "cell 1 1,alignx center,aligny center");
		
		JLabel shop_add = new JLabel("Plot No. 7, Pravasi Nagar, Opp.Murlipura Thana, Road No. 1,Murlipura, Jaipur-302039 (RAJ.)");
		shop_add.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panelhorow1.add(shop_add, "cell 1 2,alignx center,aligny center");
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panelhaina2.add(panel_12, "cell 0 1,grow");
		panel_12.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_13.setBackground(new Color(250,250,250));
		panel_13.setBounds(112, 55, 251, 37);
		panel_12.add(panel_13);
		
		JLabel lblTotalCustomers = new JLabel("Total Customers : ");
		panel_13.add(lblTotalCustomers);
		lblTotalCustomers.setFont(new Font("SansSerif", Font.PLAIN, 17));
		
		label_3 = new JLabel("10000");
		panel_13.add(label_3);
		label_3.setFont(new Font("SansSerif", Font.PLAIN, 17));
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_14.setBackground(new Color(250,250,250));
		panel_14.setBounds(112, 128, 251, 37);
		panel_12.add(panel_14);
		
		JLabel label_10 = new JLabel("Total Visits : ");
		label_10.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_14.add(label_10);
		
		label_11 = new JLabel("10000");
		label_11.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_14.add(label_11);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_15.setBackground(new Color(250,250,250));
		panel_15.setBounds(412, 128, 251, 37);
		panel_12.add(panel_15);
		
		JLabel label_12 = new JLabel("Borrowed Amount : ");
		label_12.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_15.add(label_12);
		
		label_13 = new JLabel("10000");
		label_13.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_15.add(label_13);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_16.setBackground(new Color(250,250,250));
		panel_16.setBounds(412, 55, 251, 37);
		panel_12.add(panel_16);
		
		JLabel label_14 = new JLabel("Total Borrowers : ");
		label_14.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_16.add(label_14);
		
		label_15 = new JLabel("10000");
		label_15.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_16.add(label_15);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_17.setBackground(new Color(250,250,250));
		panel_17.setBounds(705, 55, 251, 37);
		panel_12.add(panel_17);
		
		JLabel label_16 = new JLabel("Total Revenue : ");
		label_16.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_17.add(label_16);
		
		label_17 = new JLabel("10000");
		label_17.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_17.add(label_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_18.setBackground(new Color(250, 250, 250));
		panel_18.setBounds(704, 128, 251, 37);
		panel_12.add(panel_18);
		
		JLabel lblTotalWashing = new JLabel("Total Washing : ");
		lblTotalWashing.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_18.add(lblTotalWashing);
		
		label_6 = new JLabel("10000");
		label_6.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_18.add(label_6);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_19.setBackground(new Color(250, 250, 250));
		panel_19.setBounds(112, 201, 251, 37);
		panel_12.add(panel_19);
		
		JLabel lblTotalAlignment = new JLabel("Total Alignment : ");
		lblTotalAlignment.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_19.add(lblTotalAlignment);
		
		label_8 = new JLabel("10000");
		label_8.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_19.add(label_8);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_20.setBackground(new Color(250, 250, 250));
		panel_20.setBounds(412, 202, 251, 37);
		panel_12.add(panel_20);
		
		JLabel lblTotalAc = new JLabel("Total A.C : ");
		lblTotalAc.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_20.add(lblTotalAc);
		
		label_19 = new JLabel("10000");
		label_19.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_20.add(label_19);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_21.setBackground(new Color(250, 250, 250));
		panel_21.setBounds(705, 201, 251, 37);
		panel_12.add(panel_21);
		
		JLabel lblTotalEngine = new JLabel("Total Labour : ");
		lblTotalEngine.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_21.add(lblTotalEngine);
		
		label_7 = new JLabel("10000");
		label_7.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_21.add(label_7);
		
		fillhomeone();
		
		JLabel lblSelectDateTo = new JLabel("Select Date to show detail of the day :  ");
		lblSelectDateTo.setFont(new Font("SansSerif", Font.BOLD, 19));
		lblSelectDateTo.setBounds(112, 274, 387, 37);
		panel_12.add(lblSelectDateTo);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				JDateChooser aDateChooser= (JDateChooser)evt.getSource();
				boolean isDateSelectedbyUser= false;
				try {
					java.lang.reflect.Field dateSelectedField= JDateChooser.class.getDeclaredField("dateSelected");
					dateSelectedField.setAccessible(true);
					isDateSelectedbyUser= dateSelectedField.getBoolean(aDateChooser);
				}catch(Exception ignoreOrNot) {
			}
				if(isDateSelectedbyUser) {
					java.sql.Date sqldate= new java.sql.Date(dateChooser.getDate().getTime());
					//JOptionPane.showMessageDialog(null, sqldate);
					fillhometwo(sqldate);
				}
				
			}
				
		});
		
		dateChooser.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
		dateChooser.setBounds(488, 278, 118, 28);
		dateChooser.setFont(new Font("SansSerif", Font.BOLD, 13));
		panel_12.add(dateChooser);
		
		
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_22.setBackground(new Color(250, 250, 250));
		panel_22.setBounds(112, 343, 251, 37);
		panel_12.add(panel_22);
		
		JLabel label_5 = new JLabel("Total Customers : ");
		label_5.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_22.add(label_5);
		
		label_18 = new JLabel("10000");
		label_18.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_22.add(label_18);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_23.setBackground(new Color(250, 250, 250));
		panel_23.setBounds(412, 342, 251, 37);
		panel_12.add(panel_23);
		
		JLabel label_20 = new JLabel("Total Borrowers : ");
		label_20.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_23.add(label_20);
		
		label_21 = new JLabel("10000");
		label_21.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_23.add(label_21);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_24.setBackground(new Color(250, 250, 250));
		panel_24.setBounds(705, 345, 251, 37);
		panel_12.add(panel_24);
		
		JLabel label_22 = new JLabel("Total Revenue : ");
		label_22.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_24.add(label_22);
		
		label_23 = new JLabel("10000");
		label_23.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_24.add(label_23);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_25.setBackground(new Color(250, 250, 250));
		panel_25.setBounds(113, 419, 251, 37);
		panel_12.add(panel_25);
		
		JLabel label_24 = new JLabel("Total Visits : ");
		label_24.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_25.add(label_24);
		
		label_25 = new JLabel("10000");
		label_25.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_25.add(label_25);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_27.setBackground(new Color(250, 250, 250));
		panel_27.setBounds(112, 495, 251, 37);
		panel_12.add(panel_27);
		
		JLabel label_26 = new JLabel("Total Alignment : ");
		label_26.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_27.add(label_26);
		
		label_27 = new JLabel("10000");
		label_27.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_27.add(label_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_28.setBackground(new Color(250, 250, 250));
		panel_28.setBounds(413, 418, 251, 37);
		panel_12.add(panel_28);
		
		JLabel label_28 = new JLabel("Borrowed Amount : ");
		label_28.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_28.add(label_28);
		
		label_29 = new JLabel("10000");
		label_29.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_28.add(label_29);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_29.setBackground(new Color(250, 250, 250));
		panel_29.setBounds(412, 494, 251, 37);
		panel_12.add(panel_29);
		
		JLabel label_30 = new JLabel("Total A.C : ");
		label_30.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_29.add(label_30);
		
		label_31 = new JLabel("10000");
		label_31.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_29.add(label_31);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_30.setBackground(new Color(250, 250, 250));
		panel_30.setBounds(704, 415, 251, 37);
		panel_12.add(panel_30);
		
		JLabel label_32 = new JLabel("Total Washing : ");
		label_32.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_30.add(label_32);
		
		label_33 = new JLabel("10000");
		label_33.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_30.add(label_33);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBorder(new MatteBorder(0, 5, 0, 0, (Color) new Color(0, 0, 0)));
		panel_31.setBackground(new Color(250, 250, 250));
		panel_31.setBounds(705, 491, 251, 37);
		panel_12.add(panel_31);
		
		JLabel label_34 = new JLabel("Total Labour : ");
		label_34.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_31.add(label_34);
		
		label_35 = new JLabel("10000");
		label_35.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_31.add(label_35);
		
		fillhometwo(java.sql.Date.valueOf(java.time.LocalDate.now()));
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		layeredPane.add(panel_2, "name_617652316245243");
		panel_2.setLayout(null);
		
		Border noneBorder= BorderFactory.createMatteBorder(0,0,0,0, Color.BLACK);
		Border redBorder= BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
		
		JScrollPane scrollPane4= new JScrollPane();
		scrollPane4.setBounds(0, 0, 1085, 800);
		panel_2.add(scrollPane4);
		
		JPanel panelhai4 = new JPanel();
		scrollPane4.setViewportView(panelhai4);
		panelhai4.setLayout(new BoxLayout(panelhai4, BoxLayout.X_AXIS));
		
		JPanel panelhaina4= new JPanel();
		panelhaina4.setBackground(new Color(250,250,250));
		panelhai4.add(panelhaina4);
		panelhaina4.setLayout(new MigLayout("", "[840px,grow]", "[100px][grow,fill]"));
		
		JPanel panelcorow1= new JPanel();
		panelcorow1.setBackground(new Color(250,250,250));
		panelhaina4.add(panelcorow1, "cell 0 0, grow");
		panelcorow1.setLayout(new MigLayout("", "[grow][][grow]", "[][70px][]"));
		
		JLabel lblCustomerDetail_1 = new JLabel("Costumers Detail");
		lblCustomerDetail_1.setFont(new Font("SansSerif", Font.BOLD, 27));
		panelcorow1.add(lblCustomerDetail_1, "cell 1 1,alignx center,aligny center");
		
		JPanel panelcorow2= new JPanel();
		panelcorow2.setBackground(Color.WHITE);
		panelhaina4.add(panelcorow2, "cell 0 1, grow");
		panelcorow2.setLayout(new MigLayout("", "[70px][300px,grow][70px]", "[100px][grow]"));
		
		JPanel panelco_26 = new JPanel();
		panelco_26.setBackground(Color.WHITE);
		panelcorow2.add(panelco_26, "cell 1 0,grow");
		panelco_26.setLayout(new MigLayout("", "[300px,grow]27px[170px]", "[grow][37px][grow]"));
		
		cus_search = new JTextField();
		cus_search.setHorizontalAlignment(SwingConstants.CENTER);
		cus_search.setFont(new Font("SansSerif", Font.BOLD, 17));
		panelco_26.add(cus_search, "cell 0 1,grow");
		cus_search.setBorder(redBorder);
		cus_search.setColumns(10);
		
		JButton cus_searchbtn = new JButton("Search");
		cus_searchbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cusno= cus_search.getText();
				DB db= new DB();
				
				try {
					String sql= "select * from cusbillone where vehicleno='"+cusno+"'";
					ResultSet rst1= db.executeQuery(sql);
					if(rst1.next()) {
						int cus_check= JOptionPane.showConfirmDialog(null, "Customer with vehicle no. "+cusno+" exist, and click yes to open detail.", "Customer Check", JOptionPane.YES_NO_OPTION);
						if(cus_check== 0) {
							indicus_detail onecus_detail= new indicus_detail(cusno);
							onecus_detail.setUndecorated(true);
							onecus_detail.setVisible(true);
						}else {
							return;
						}
						db.close();
						
					}else {
						db.close();
						JOptionPane.showMessageDialog(null, "No customer with vehicle no. "+cusno+" not exist.");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		panelco_26.add(cus_searchbtn, "cell 1 1,grow");
		cus_searchbtn.setOpaque(true);
		cus_searchbtn.setForeground(Color.WHITE);
		cus_searchbtn.setFont(new Font("SansSerif", Font.PLAIN, 17));
		cus_searchbtn.setFocusPainted(false);
		cus_searchbtn.setBackground(Color.BLACK);
		
		

		
		
		
		
		JPanel panelcorow2btns= new JPanel();
		panelcorow2btns.setBackground(Color.WHITE);
		panelcorow2.add(panelcorow2btns, "cell 1 1, grow");
		panelcorow2btns.setLayout(new MigLayout("", "[][200px,grow]17px[200px]17px[200px]17px[200px][]", "[37px]0px[0px]17px[37px]17px[37px]17px[37px]17px[37px]17px[37px]17px[37px]"));
		
		JLabel colblClickToOpen = new JLabel("Click to open:");
		colblClickToOpen.setFont(new Font("SansSerif", Font.BOLD, 21));
		panelcorow2btns.add(colblClickToOpen, "cell 1 0");
		
		

		
/*getting employee names*/
		
		try
		{ 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
		String sql = "select distinct vehicleno from cusbillone";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int emprow_i =0;
//		if(rs.next())
//		{
//		String name = rs.getString("name");
//		JButton btnNewButton_1 = new JButton(name);
//		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_1.setOpaque(true);
//		btnNewButton_1.setForeground(Color.WHITE);
//		btnNewButton_1.setFocusPainted(false);
//		btnNewButton_1.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_1, "flowx,cell 1 2,grow");
//		i++; 
//		}
		
		if (rs.last()) {
			  emprow_i = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		JButton cusbuttons[] = new JButton[emprow_i];
		int emp_btn_i= 0;
		int setcolbtn=1;
		int setrowbtn= 2;
			while (rs.next()) {
			String cusvehicle= rs.getString("vehicleno");
//				String emp_Aadhar= rs.getString("aadhar_no");
//				int emp_Id= rs.getInt("id");
//				String emp_Mobile= rs.getString("mobile_no");
//				int emp_Presents= rs.getInt("presents");
//				Date emp_Join= rs.getDate("join_date");
			 JButton emp_d_btn= new JButton(rs.getString("vehicleno"));
			DB db= new DB();
			 try {
					String sqlc= "select payment from cusbillone where vehicleno='"+rs.getString("vehicleno")+"'";
					ResultSet rst1= db.executeQuery(sqlc);
					if(rst1.next()) {
						if(rst1.getBoolean("payment")!= true) {
							emp_d_btn.setBackground(Color.RED);
						}else {
							emp_d_btn.setBackground(new Color(250,250,250));
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				emp_d_btn.setFont(new Font("SansSerif", Font.BOLD, 17));
				emp_d_btn.setOpaque(true);
				emp_d_btn.setForeground(Color.BLACK);
				emp_d_btn.setFocusPainted(false);
				emp_d_btn.setBorder(new LineBorder(Color.WHITE, 0));
				emp_d_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						indicus_detail onecus_detail= new indicus_detail(cusvehicle);
						onecus_detail.setUndecorated(true);
						onecus_detail.setVisible(true);
						
					}
				});
				
				if(setcolbtn>4) {
					setrowbtn++;
					setcolbtn=1;
				}
				panelcorow2btns.add(emp_d_btn, "flowx,cell "+setcolbtn+" "+setrowbtn+",grow");
				setcolbtn++;
			
			 cusbuttons[emp_btn_i]= emp_d_btn;
			 emp_btn_i++;
			}

		
		
		if(emprow_i <1)
		{
		JOptionPane.showMessageDialog(null, "No Record Found","Error",
		JOptionPane.ERROR_MESSAGE);
		}
		if(emprow_i ==1)
		{
		System.out.println(emprow_i+" Record Found");
		}
		else
		{
		System.out.println(emprow_i+" Records Found");
		}
		}
		catch(Exception ex)
		{
		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
		JOptionPane.ERROR_MESSAGE);
		}
		

		
		
		
		
		
		
		

		
//		JButton btncoNewButton_1 = new JButton("HR 26 CA 420");
//		btncoNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btncoNewButton_1.setBackground(Color.LIGHT_GRAY);
//		btncoNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btncoNewButton_1.setOpaque(true);
//		btncoNewButton_1.setForeground(Color.WHITE);
//		btncoNewButton_1.setFocusPainted(false);
//		btncoNewButton_1.setBorder(new LineBorder(Color.WHITE, 0));
//		panelcorow2btns.add(btncoNewButton_1, "flowx,cell 1 2,grow");
//		
//		JButton btncoNewButton_2 = new JButton("HR 26 CA 420");
//		btncoNewButton_2.setBackground(Color.LIGHT_GRAY);
//		btncoNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btncoNewButton_2.setOpaque(true);
//		btncoNewButton_2.setForeground(Color.WHITE);
//		btncoNewButton_2.setFocusPainted(false);
//		btncoNewButton_2.setBorder(new LineBorder(Color.WHITE, 0));
//		panelcorow2btns.add(btncoNewButton_2, "cell 2 2,grow");
//		
//		JButton btncoNewButton_3 = new JButton("HR 26 CA 420");
//		btncoNewButton_3.setBackground(Color.LIGHT_GRAY);
//		btncoNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btncoNewButton_3.setOpaque(true);
//		btncoNewButton_3.setForeground(Color.WHITE);
//		btncoNewButton_3.setFocusPainted(false);
//		btncoNewButton_3.setBorder(new LineBorder(Color.WHITE, 0));
//		panelcorow2btns.add(btncoNewButton_3, "cell 3 2, grow");

		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBackground(Color.WHITE);
		layeredPane.add(panel_3, "name_617637852305677");
		panel_3.setLayout(null);
		
		JScrollPane scrollPane2= new JScrollPane();
		scrollPane2.setBounds(0, 0, 1080, 800);
		panel_3.add(scrollPane2);
		
		JPanel panelhai1 = new JPanel();
		panelhai1.setBackground(Color.WHITE);
		scrollPane2.setViewportView(panelhai1);
		panelhai1.setLayout(new BoxLayout(panelhai1, BoxLayout.X_AXIS));
		
		JPanel panelhaina1= new JPanel();
		panelhai1.add(panelhaina1);
		panelhaina1.setBackground(new Color(250,250,250));
		panelhaina1.setLayout(new MigLayout("", "[827px,grow]", "[grow,fill][100px]"));
		
		JPanel panelbillrow1= new JPanel();
		panelbillrow1.setBackground(new Color(250,250,250));
		panelhaina1.add(panelbillrow1, "cell 0 0,grow");
		panelbillrow1.setLayout(new MigLayout("", "[827px,grow]", "[100px][grow]"));
		
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(0, 0, 857, 87);
		panel_11.setBackground(new Color(250,250,250));
		panelbillrow1.add(panel_11, "cell 0 0,grow");
		panel_11.setLayout(null);
		
		JLabel lblAutomobiles = new JLabel("K.S. Automobiles");
		lblAutomobiles.setFont(new Font("SansSerif", Font.BOLD, 37));
		lblAutomobiles.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutomobiles.setBounds(230, 10, 600, 39);
		panel_11.add(lblAutomobiles);
		
		JLabel lblNewLabel_2 = new JLabel("Plot No. 7, Pravasi Nagar, Opp.Murlipura Thana, Road No. 1,Murlipura, Jaipur-302039 (RAJ.)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(167, 48, 730, 23);
		panel_11.add(lblNewLabel_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panelbillrow1.add(panel_10, "cell 0 1,grow");
		panel_10.setLayout(new MigLayout("", "[20px][grow][20px]", "[170px][660px,grow][150px]"));
		
		JPanel panel_010 = new JPanel();
		panel_010.setBackground(Color.WHITE);
		panel_10.add(panel_010, "cell 1 0,grow");
		panel_010.setLayout(new MigLayout("", "[5px]13px[]13px[grow]13px[200px]13px[5px]", "[25px]17px[25px]17px[25px]"));
		
		JLabel lblBillNo = new JLabel("Bill No. ");
		lblBillNo.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(lblBillNo, "cell 1 0");
		
		billone1 = new JTextField();
		billone1.setHorizontalAlignment(SwingConstants.CENTER);
		billone1.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(billone1, "cell 1 0,aligny bottom");
		billone1.setBorder(redBorder);
		billone1.setColumns(10);
		
		JCheckBox billone8 = new JCheckBox("Payment Status");
		billone8.setHorizontalAlignment(SwingConstants.CENTER);
		billone8.setFocusPainted(false);
		billone8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(billone8a) {
					billone8a= false;
				}else {
					billone8a= true;
				}
				if(billone8a) {
					billone8.setForeground(Color.GREEN);
					billsave.setBackground(Color.BLACK);
					remain.setText("0.00");

				}else {
					billone8.setForeground(Color.RED);
					billsave.setBackground(Color.RED);
				}
//				if(billone8.isSelected()) {
//					billone8a= true;
//					billone8.setForeground(Color.GREEN);
//				}
			}
		});
		billone8.setBackground(Color.WHITE);
		billone8.setFont(new Font("SansSerif", Font.BOLD, 17));
		billone8.setBorder(noneBorder);
		panel_010.add(billone8, "cell 2 0,alignx center,growy");
		billone8.setForeground(Color.RED);
		
		
		
		JLabel lablDate= new JLabel("Date : ");
		lablDate.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(lablDate, "flowx,cell 3 0");
		
		JDateChooser billone2 = new JDateChooser();
		billone2.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
		billone2.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(billone2, "cell 3 0,grow");
		
		JLabel lblMs = new JLabel("M/s.");
		lblMs.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(lblMs, "flowx,cell 1 1");
		
		billone3 = new JTextField();
		billone3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_010.add(billone3, "cell 1 1,grow");
		billone3.setFont(new Font("SansSerif", Font.BOLD, 17));
		billone3.setBorder(redBorder);
		billone3.setColumns(10);
		
		
		JLabel lblMoblieNo = new JLabel("Moblie No.");
		lblMoblieNo.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(lblMoblieNo, "cell 2 1,alignx right");
		
		billone4= new JTextField();
		billone4.setHorizontalAlignment(SwingConstants.CENTER);
		billone4.setFont(new Font("SansSerif", Font.BOLD, 17));
		billone4.setBorder(redBorder);
		panel_010.add(billone4,"cell 3 1,grow");
		
		JLabel lblvehicleNo= new JLabel("Vehicle No. ");
		lblvehicleNo.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(lblvehicleNo,"cell 1 2");
		
		JTextField billone5= new JTextField();
		billone5.setHorizontalAlignment(SwingConstants.CENTER);
		billone5.setFont(new Font("SansSerif", Font.BOLD, 17));
		billone5.setBorder(redBorder);
		panel_010.add(billone5,"cell 1 2,grow");
		
		JLabel lblvehicletype= new JLabel("Vehicle Type: ");
		lblvehicletype.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(lblvehicletype,"cell 2 2");
		
		JTextField billone6= new JTextField();
		billone6.setHorizontalAlignment(SwingConstants.CENTER);
		billone6.setFont(new Font("SansSerif", Font.BOLD, 17));
		billone6.setBorder(redBorder);
		panel_010.add(billone6,"cell 2 2,grow");
		
		JLabel lblpresentkm= new JLabel("Present K.M.: ");
		lblpresentkm.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(lblpresentkm,"cell 3 2");
		
		JTextField billone7= new JTextField();
		billone7.setHorizontalAlignment(SwingConstants.CENTER);
		billone7.setFont(new Font("SansSerif", Font.BOLD, 17));
		panel_010.add(billone7,"cell 3 2,growx,aligny bottom");
		billone7.setBorder(redBorder);
		
			
			JPanel panel_9;
	        JScrollPane ScrollPane9;
	        JTable table;
	        
	        
	        
	        panel_9 = new JPanel(new BorderLayout());
	                
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
//	        {1,"avija","sivja", "FN1","LN1",10},
	        };
	    

	        //table = new JTable(data, new Object[]{"S No.","Particulars",",Quantity","Rate","GST %","Amount"});
	        table = new JTable() {
	        	@Override
	        	    public Printable getPrintable(PrintMode printMode, MessageFormat headerFormat, MessageFormat footerFormat) {
	        	       return new TablePrintable(this, printMode, headerFormat, footerFormat);
	        	    }
	        	};

	        table.setShowHorizontalLines(false);
	        table.setModel(new DefaultTableModel(
	        	new Object[][] {
	        		{null, "1", "Wheel Alignment Front/Rear/Both", "", "", "", "00"},
	        		{null, "2", "Wheel Balanceing ", "", "", "", "00"},
	        		{null, "3", "Wheel Alloy/Ordinary", "", "", "", "00"},
	        		{null, "4", "Tyre Changes/Side Change", "", "", "", "00"},
	        		{null, "5", "Chamber Bolt/Sim", "", "", "", "00"},
	        		{null, "6", "Rim Straight", "", "", "", "00"},
	        		{null, "7", "Washing And Dry Cleaners", "", "", "", "00"},
	        		{null, "8", "A. C. Gas", "", "", "", "00"},
	        		{null, "9", "Solding", "", "", "", "00"},
	        		{null, "10", "Cooling Coli Serves", "", "", "", "00"},
	        		{null, "11", "Ring", "", "", "", "00"},
	        		{null, "12", "Wall", "", "", "", "00"},
	        		{null, "13", "R. 134 Oil", "", "", "", "00"},
	        		{null, "14", "Labour", "", "", "", "00"},
	        		{null, "", "", "", "", "", ""},
	        		{null, "", "", "", "", "", ""},
//	        		{null, "", "", "", "", "", ""},
	        	},
	        	new String[] {
	        		"Check", "S No.", "Particulars", "Quantity", "Rate", "GST %", "Amount"
	        	}
	        ) {
	        	Class[] columnTypes = new Class[] {
	        		Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
	        	};
	        	public Class getColumnClass(int columnIndex) {
	        		return columnTypes[columnIndex];
	        	}
	        });
	        table.getColumnModel().getColumn(0).setPreferredWidth(37);
	        table.getColumnModel().getColumn(1).setPreferredWidth(35);
	        table.getColumnModel().getColumn(2).setPreferredWidth(350);
	        table.getColumnModel().getColumn(3).setPreferredWidth(55);
	        table.getColumnModel().getColumn(4).setPreferredWidth(60);
	        table.getColumnModel().getColumn(5).setPreferredWidth(50);
	         



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
	        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

	        
	        table.setRowHeight(37);
	        ScrollPane9 = new JScrollPane(table);
	        ScrollPane9.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
	        panel_9.add(ScrollPane9, BorderLayout.CENTER);
//	        panel_9.add(table, BorderLayout.CENTER);
			panel_10.add(panel_9, "cell 1 1,grow");

			JPanel panel_011 = new JPanel();
			panel_011.setBackground(Color.WHITE);
			panel_10.add(panel_011, "cell 1 2,grow");
			panel_011.setLayout(new MigLayout("", "[5px]13px[grow]13px[200px]13px[5px]", "[25px]7px[20px]3px[20px]3px[20px]3px[20px]3px[20px]3px[20px]"));  
			
			JLabel total_amount= new JLabel("Total: ");
			total_amount.setFont(new Font("SansSerif", Font.BOLD, 17));
			panel_011.add(total_amount,"cell 1 0,alignx right");
			
			JTextField total= new JTextField();
			total.setFont(new Font("SansSerif", Font.BOLD, 17));
			panel_011.add(total,"cell 2 0,grow");
			total.setBorder(redBorder);
			
			JLabel remain_amount= new JLabel("Remaining Amount : ");
			remain_amount.setFont(new Font("SansSerif", Font.BOLD, 17));
			panel_011.add(remain_amount,"cell 1 1,alignx right");
			
//			JTextField remain= new JTextField();
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
			
		
			JPanel panelbillrow2= new JPanel();
			panelbillrow2.setBackground(new Color(250,250,250));
			panelhaina1.add(panelbillrow2, "cell 0 1,grow");
			panelbillrow2.setLayout(new MigLayout("", "[grow][130px]17px[130px]17px[130px][grow]", "[grow][37px][grow]"));
			
			JButton clear = new JButton("Clear");
			clear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					showbill showingbill= new showbill(billone1.getText());
//					showingbill.setUndecorated(true);
//					showingbill.setVisible(true);
					total.setText("0.00");
					remain.setText("0.00");
					billone1.setText("");
					billone3.setText("");
					billone4.setText("");
					billone5.setText("");
					billone6.setText("");
					billone7.setText("");
					
					int rowsa= table.getRowCount();
	        		for(int rowa= 0; rowa< rowsa; rowa++) {
	        			
//	        			try {
//	        				abilltwo0= (boolean)table.getValueAt(rowa, 0);
//	        			}catch(NullPointerException e1) {
//	        				abilltwo0= false;
//	        			}
	        			table.setValueAt(null, rowa, 0);
	        			table.setValueAt("", rowa, 3);
	        			table.setValueAt("", rowa, 4);
	        			table.setValueAt("", rowa, 5);
	        			table.setValueAt("", rowa, 6);

	        			
	        		}
				}
			});
			panelbillrow2.add(clear, "cell 1 1,grow");
			clear.setOpaque(true);
			clear.setForeground(Color.WHITE);
			clear.setFont(new Font("SansSerif", Font.PLAIN, 17));
			clear.setFocusPainted(false);
			clear.setBackground(Color.BLACK);
			
			table.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyPressed(KeyEvent e) {
//	        		if(e.getKeyChar() == KeyEvent.VK_ENTER) {
//	        		dealValue();
	        		int rowsa= table.getRowCount();
	        		for(int rowa= 0; rowa< rowsa; rowa++) {
	        			
//	        			try {
//	        				abilltwo0= (boolean)table.getValueAt(rowa, 0);
//	        			}catch(NullPointerException e1) {
//	        				abilltwo0= false;
//	        			}
	        			String abilltwo3= (String)table.getValueAt(rowa, 3);
	        			String abilltwo4= (String)table.getValueAt(rowa, 4);
	        			String abilltwo5= (String)table.getValueAt(rowa, 5);
	        			String abilltwo6= (String)table.getValueAt(rowa, 6);
	        			
	        			try {
	        				   abilltwo3a = Integer.parseInt(abilltwo3);
	        			}
	        			catch (NumberFormatException e1)
	        			{
	        			   abilltwo3a = 0;
	        			}
	        			
	        			try {
	        			   abilltwo4a = Float.parseFloat(abilltwo4);
	        			}
	        			catch (NumberFormatException e1)
	        			{
	        			   abilltwo4a = 0;
	        			}
	        			
	        			try {
	        			   abilltwo5a = Float.parseFloat(abilltwo5);
	        			}
	        			catch (NumberFormatException e1)
	        			{
	        			   abilltwo5a = 0;
	        			}

	        			try {
	        			   abilltwo6a = Float.parseFloat(abilltwo6);
	        			}
	        			catch (NumberFormatException e1)
	        			{
	        			   abilltwo6a = 0;
	        			}

	        			abilltwo6a= abilltwo3a*abilltwo4a*(1 + abilltwo5a/100);
	        			table.setValueAt(String.valueOf(abilltwo6a), rowa, 6);

	        			
	        		}

	        			        	}
	        	//}
	        });
			table.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		
	        			int rowsa= table.getRowCount();
	        			float abilltwo6aa;
	        			totalbill_am= 0;
		        		for(int rowa= 0; rowa< rowsa; rowa++) {
		        			try {
		        				abilltwo0= (boolean)table.getValueAt(rowa, 0);
		        			}catch(NullPointerException e1) {
		        				abilltwo0= false;
		        			}
		        			String abilltwo6= (String)table.getValueAt(rowa, 6);
		        			try {
			        			   abilltwo6aa = Float.parseFloat(abilltwo6);
			        			}
			        			catch (NumberFormatException e1)
			        			{
			        			   abilltwo6aa = 1000;
			        			}
			        		if(abilltwo0==true) {
		        			totalbill_am= totalbill_am + abilltwo6aa;
			        		}
	        		}
        				total.setText(String.valueOf(totalbill_am));
	        	}
	        });
		
						
//			Runnable calTota = new Runnable() {
//				public void run() {
//					if(abilltwo0==true) {
//        				totalbill_am= totalbill_am + abilltwo6a;
//        				total.setText(String.valueOf(totalbill_am));
//        			}
//				}
//			};
//			ScheduledExecutorService executor= Executors.newScheduledThreadPool(1);
//			executor.scheduleAtFixedRate(calTota,0,100,TimeUnit.MILLISECONDS);
			
			billsave= new JButton("Save");
			billsave.setBackground(Color.RED);
			billsave.setForeground(Color.WHITE);
			billsave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String billone1a= billone1.getText();
					java.util.Date billone2at= billone2.getDate();
					java.sql.Date billone2a= new java.sql.Date(billone2at.getTime());
					String billone3a= billone3.getText();
					String billone4a= billone4.getText();
					
					
					String billone5a= billone5.getText();
					String billone6a= billone6.getText();
					String billone7a= billone7.getText();
					
					int rows= table.getRowCount();
					float total_am= 0;
					boolean billtwo0a;
					int billtwo1a;
					float billtwo6a;
					float billtwo5a;
					float billtwo4a;
					int billtwo3a;
											//System.out.println(billtwo1a+" "+billtwo2+" "+billtwo3+" "+billtwo4+" "+billtwo5+" "+billtwo6a);
					if(!billone8a && remain.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Enter the remaining amount.");
						return;
					}
					
					if(billone1a==null || billone1a.isEmpty() || billone5a==null || billone5a.isEmpty() || billone3a== null || billone3a.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Enter Bill no., Name and Vehicle no. are required.");
//						dispose();
						return;
					}else {
						int anybill=0;
						if(billone4a.length()< 10 && billone4a.length()>0 || billone4a.length()> 10) {
							JOptionPane.showMessageDialog(null,"Invalid mobile number");
							return;
						}
						DB db= new DB();
						
						try {
							String sql= "select billno from cusbillone where billno="+billone1a;
							ResultSet rst1= db.executeQuery(sql);
							if(rst1.next()) {
								db.close();
								int bill_warning= JOptionPane.showConfirmDialog(null, "Bill with this bill no. is already exist. Do you want to replace previous.", "Bill", JOptionPane.YES_NO_OPTION);
								if(bill_warning== 0) {
									String del_sql= "delete s,t from cusbillone s inner join cusbilltwo t on s.billno= t.billno where (s.billno="+billone1a+")";
									db.executeOther(del_sql);
								}else {
									return;
								}
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
//						Connection conc= null;
//						try {
//							Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//							
//							conc= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
//							if(!conc.isClosed()) {
//								
//							
//										    String sql_query1="select billno from cusbillone where billno=?";
//										    PreparedStatement prepare= conc.prepareStatement(sql_query1);
//										    prepare.setString(1, billone1a);
//											ResultSet rst = prepare.executeQuery();
////										    if(result!= 0) {
////										    	JOptionPane.showMessageDialog(null, "Employee details added successfully.");
////												dispose();
////
////										    }
//											if (rst.next()) {
////												  anybill = rst.getRow();
//												JOptionPane.showMessageDialog(null, "Bill with this bill no. already exists.");
//												return;
////												  rst.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
//												}
//										    
//										}
//									
////									System.out.println(username_field + password_field);
//									
//							
//							
//							//System.out.println(emp_aadhar_no +" " +emp_mobile_no);
//							}catch(Exception ex) {
//								System.err.println("Exception: "+ ex.getMessage());
//								//JOptionPane.showMessageDialog(null, "Enter full employee detail.");
//
//							}finally {
//								try {
//									if(conc != null)
//										conc.close();
//								}catch(SQLException ex) {}
//							}
						
						if(false) {
							JOptionPane.showMessageDialog(null, "Entry with this bill no. is already exist.");
						}else {
					
					

						
						
						int indx=0;
						int billtwo1=0;

						for(int row= 0; row< rows; row++) {
//							String billtwo1= (String)table.getValueAt(row, 0);
							boolean billtwo0;
							try {
		        				billtwo0= (boolean)table.getValueAt(row, 0);
		        			}catch(NullPointerException e1) {
		        				billtwo0= false;
		        			}
							String billtwo2= (String)table.getValueAt(row, 2);
							String billtwo3= (String)table.getValueAt(row, 3);
							String billtwo4= (String)table.getValueAt(row, 4);
							String billtwo5= (String)table.getValueAt(row, 5);
							String billtwo6= (String)table.getValueAt(row, 6);
							
							
							
							try {
								   billtwo3a = Integer.parseInt(billtwo3);
							}
							catch (NumberFormatException e1)
							{
							   billtwo3a = 0;
							}
							
							try {
							   billtwo4a = Float.parseFloat(billtwo4);
							}
							catch (NumberFormatException e1)
							{
							   billtwo4a = 0;
							}
							
							try {
							   billtwo5a = Float.parseFloat(billtwo5);
							}
							catch (NumberFormatException e1)
							{
							   billtwo5a = 0;
							}

							try {
							   billtwo6a = Float.parseFloat(billtwo6);
							}
							catch (NumberFormatException e1)
							{
							   billtwo6a = 0;
							}
							
							if(billtwo0) {
							total_am= total_am + billtwo6a;
							//
							billtwo1= billtwo1 + 1;

							String sql= "INSERT INTO cusbilltwo(billno,itemno,particulars,quantity,rate,gst,amount) values('"+billone1a+"',"+billtwo1+",'"+billtwo2+"',"+billtwo3a+","+billtwo4a+","+billtwo5a+","+billtwo6a+")";
							int rst1= db.executeOther(sql);
							
//							Connection con= null;
//							try {
//								Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//								
//								con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
//								if(!con.isClosed()) {
//									if(billtwo2=="") {
//										continue;
//									}
//									billtwo1= billtwo1 + 1;
//
//											    String sql_query1="INSERT INTO cusbilltwo(billno,itemno,particulars,quantity,rate,gst,amount) values(?,?,?,?,?,?,?)";
//											    PreparedStatement preparedstmt= con.prepareStatement(sql_query1);
//											    preparedstmt.setString(1, billone1a);
//											    preparedstmt.setInt(2, billtwo1);
//											    preparedstmt.setString(3, billtwo2);
//											    preparedstmt.setInt(4, billtwo3a);
//											    preparedstmt.setFloat(5,billtwo4a);
//											    preparedstmt.setFloat(6, billtwo5a);
//											    preparedstmt.setFloat(7, billtwo6a);
//											    int result= preparedstmt.executeUpdate();
////											    if(result!= 0) {
////											    	JOptionPane.showMessageDialog(null, "Employee details added successfully.");
////													dispose();
////
////											    }
//											    
//											}
//										
////										System.out.println(username_field + password_field);
//										
//								
//								
//								//System.out.println(emp_aadhar_no +" " +emp_mobile_no);
//								}catch(Exception ex) {
//									System.err.println("Exception: "+ ex.getMessage());
//									//JOptionPane.showMessageDialog(null, "Enter full employee detail.");
//
//								}finally {
//									try {
//										if(con != null)
//											con.close();
//									}catch(SQLException ex) {}
//								}
							indx= row;
							}
					}
						
//						if(indx<17) {
//					        while(indx<=17) {
//					        	data[indx-1][0]= "";
//					        	data[indx-1][1]= "";
//					        	data[indx-1][2]= "";
//					        	data[indx-1][3]= "";
//					        	data[indx-1][4]= "";
//					        	data[indx-1][5]= "";
//					        	indx++;
//					        }
//					        }
//						table.setModel(new DefaultTableModel(
//					        	new Object[][]{
//					        		{data[0][0], data[0][1], data[0][2], data[0][3], data[0][4], data[0][5]},
//					        		{data[1][0], data[1][1], data[1][2], data[1][3], data[1][4], data[1][5]},
//					        		{data[2][0], data[2][1], data[2][2], data[2][3], data[2][4], data[2][5]},
//					        		{data[3][0], data[3][1], data[3][2], data[3][3], data[3][4], data[3][5]},
//					        		{data[4][0], data[4][1], data[4][2], data[4][3], data[4][4], data[4][5]},
//					        		{data[5][0], data[5][1], data[5][2], data[5][3], data[5][4], data[5][5]},
//					        		{data[6][0], data[6][1], data[6][2], data[6][3], data[6][4], data[6][5]},
//					        		{data[7][0], data[7][1], data[7][2], data[7][3], data[7][4], data[7][5]},
//					        		{data[8][0], data[8][1], data[8][2], data[8][3], data[8][4], data[8][5]},
//					        		{data[9][0], data[9][1], data[9][2], data[9][3], data[9][4], data[9][5]},
//					        		{data[10][0], data[10][1], data[10][2], data[10][3], data[10][4], data[10][5]},
//					        		{data[11][0], data[11][1], data[11][2], data[11][3], data[11][4], data[11][5]},
//					        		{data[12][0], data[12][1], data[12][2], data[12][3], data[12][4], data[12][5]},
//					        		{data[13][0], data[13][1], data[13][2], data[13][3], data[13][4], data[13][5]},
//					        		{data[14][0], data[14][1], data[14][2], data[14][3], data[14][4], data[14][5]},
//					        		{data[15][0], data[15][1], data[15][2], data[15][3], data[15][4], data[15][5]},
//					        		{data[16][0], data[16][1], data[16][2], data[16][3], data[16][4], data[16][5]},
//					        	},
//					        	new String[] {
//					        		"S No.", "Particulars", ",Quantity", "Rate", "GST %", "Amount"
//					        	}
//					        ));
						
						try {
							   billone9a = Float.parseFloat(remain.getText());
							}
							catch (NumberFormatException e1)
							{
							   billone9a = 0;
							}
						
						String sql= "INSERT INTO cusbillone(billno,date,name,mobileno,vehicleno,vehicletype,presentkm,total,payment,remain) values('"+billone1a+"','"+billone2a+"','"+billone3a+"','"+billone4a+"','"+billone5a+"','"+billone6a+"','"+billone7a+"',"+total_am+","+billone8a+","+billone9a+")";
						int rst1= db.executeOther(sql);
						if(rst1 != 0) {
							db.close();
							JOptionPane.showMessageDialog(null, "Employee details added successfully.");
						}else {
							db.close();
							JOptionPane.showMessageDialog(null, "Error occured, try again.");
						}
//						Connection con= null;
//						try {
//							Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//							
//							con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
//							if(!con.isClosed()) {
//							
//										    String sql_query1="INSERT INTO cusbillone(billno,date,name,mobileno,vehicleno,vehicletype,presentkm,total,payment) values(?,?,?,?,?,?,?,?,?)";
//										    PreparedStatement preparedstmt= con.prepareStatement(sql_query1);
//										    preparedstmt.setString(1, billone1a);
//										    preparedstmt.setDate(2,billone2a);
//										    preparedstmt.setString(3, billone3a);
//										    preparedstmt.setString(4, billone4a);
//										    preparedstmt.setString(5, billone5a);
//										    preparedstmt.setString(6, billone6a);
//										    preparedstmt.setString(7, billone7a);
//										    preparedstmt.setFloat(8, total_am);
//										    preparedstmt.setBoolean(9, billone8a);
//										    int result= preparedstmt.executeUpdate();
//										    if(result!= 0) {
//										    	JOptionPane.showMessageDialog(null, "Employee details added successfully.");
//												//dispose();
//
//										    }
//										    
//										}
//									
////									System.out.println(username_field + password_field);
//									
//							
//							
//							//System.out.println(emp_aadhar_no +" " +emp_mobile_no);
//							}catch(Exception ex) {
//								System.err.println("Exception: "+ ex.getMessage());
//								//JOptionPane.showMessageDialog(null, "Enter full employee detail.");
//
//							}finally {
//								try {
//									if(con != null)
//										con.close();
//								}catch(SQLException ex) {}
//							}
					}
				}
				}
			});
			panelbillrow2.add(billsave, "cell 2 1,grow");
			billsave.setOpaque(true);
			billsave.setFont(new Font("SansSerif", Font.PLAIN, 17));
			billsave.setFocusPainted(false);
			billsave.setForeground(Color.WHITE);
			
			JPanel panel_99;
	        JScrollPane ScrollPane99;
	        JTable table1;
	        Object[][] data1 = {
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
//			        {1,"avija","sivja", "FN1","LN1",10},
			        };
	        
	        
	        //System.out.println(rs1.getInt("itemno")[0]);
	        panel_99 = new JPanel();
	                
	       

//	        table = new JTable(data, new Object[]{"S No.","Particulars",",Quantity","Rate","GST %","Amount"});
	        table1 = new JTable() {
	        	@Override
	        	    public Printable getPrintable(PrintMode printMode, MessageFormat headerFormat, MessageFormat footerFormat) {
	        	       return new TablePrintable(this, printMode, headerFormat, footerFormat);
	        	    }
	        	};
	        table1.setFillsViewportHeight(true);
	        table1.setShowHorizontalLines(false);
	        Object[][] hello = new Object[][]{
        		{data1[0][0], data1[0][1], data1[0][2], data1[0][3], data1[0][4], data1[0][5]},
        		{data1[1][0], data1[1][1], data1[1][2], data1[1][3], data1[1][4], data1[1][5]},
        		{data1[2][0], data1[2][1], data1[2][2], data1[2][3], data1[2][4], data1[2][5]},
        		{data1[3][0], data1[3][1], data1[3][2], data1[3][3], data1[3][4], data1[3][5]},
        		{data1[4][0], data1[4][1], data1[4][2], data1[4][3], data1[4][4], data1[4][5]},
        		{data1[5][0], data1[5][1], data1[5][2], data1[5][3], data1[5][4], data1[5][5]},
        		{data1[6][0], data1[6][1], data1[6][2], data1[6][3], data1[6][4], data1[6][5]},
        		{data1[7][0], data1[7][1], data1[7][2], data1[7][3], data1[7][4], data1[7][5]},
        		{data1[8][0], data1[8][1], data1[8][2], data1[8][3], data1[8][4], data1[8][5]},
        		{data1[9][0], data1[9][1], data1[9][2], data1[9][3], data1[9][4], data1[9][5]},
        		{data1[10][0], data1[10][1], data1[10][2], data1[10][3], data1[10][4], data1[10][5]},
        		{data1[11][0], data1[11][1], data1[11][2], data1[11][3], data1[11][4], data1[11][5]},
        		{data1[12][0], data1[12][1], data1[12][2], data1[12][3], data1[12][4], data1[12][5]},
        		{data1[13][0], data1[13][1], data1[13][2], data1[13][3], data1[13][4], data1[13][5]},
        		{data1[14][0], data1[14][1], data1[14][2], data1[14][3], data1[14][4], data1[14][5]},
        		{data1[15][0], data1[15][1], data1[15][2], data1[15][3], data1[15][4], data1[15][5]},
//        		{data[16][0], data[16][1], data[16][2], data[16][3], data[16][4], data[16][5]},
        	};
//	        Object[][] hello= new Object[emppayc][6];
//	        for(int l= 0; l<emppayc; l++) {
//	        	hello[l][0]= data[l][0];
//	        	hello[l][1]= data[l][1];
//	        	hello[l][2]= data[l][2];
//	        	hello[l][3]= data[l][3];
//	        	hello[l][4]= data[l][4];
//	        	hello[l][5]= data[l][5];
//	        }
	        table1.setModel(new DefaultTableModel(hello,new String[] {
	        		"S No.", "Particulars", "Quantity", "Rate", "GST %", "Amount"
	        	}
	        ));

	        table1.getColumnModel().getColumn(0).setPreferredWidth(35);
	        table1.getColumnModel().getColumn(1).setPreferredWidth(350);
	        table1.getColumnModel().getColumn(2).setPreferredWidth(55);
	        table1.getColumnModel().getColumn(3).setPreferredWidth(60);
	        table1.getColumnModel().getColumn(4).setPreferredWidth(50);
	         



	        JTableHeader Theader1 = table1.getTableHeader();
	        
	        Theader1.setBackground(new Color(240, 240, 240)); // change the Background color
	        Theader1.setForeground(Color.BLACK); // change the Foreground
	        
	        Theader1.setFont(new Font("Tahome", Font.BOLD, 17)); // font name style size
	        ((DefaultTableCellRenderer)Theader1.getDefaultRenderer())
	                .setHorizontalAlignment(JLabel.CENTER); // center header text
	        
	        table1.setFont(new Font("Tahome", Font.BOLD, 15));
	        
	        DefaultTableCellRenderer rightRenderer1 = new DefaultTableCellRenderer();
	        rightRenderer1.setHorizontalAlignment(JLabel.CENTER);

	        TableModel tableModel1 = table1.getModel();

	        for (int columnIndex = 0; columnIndex < tableModel1.getColumnCount(); columnIndex++)
	        {
	            table1.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer1);
	        }
	        
	        DefaultTableCellRenderer centerRenderer1= new DefaultTableCellRenderer();
	        centerRenderer1.setHorizontalAlignment(JLabel.LEFT);
	        table1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer1);
	        panel_99.setLayout(new BorderLayout(0, 0));
			
	        table.setRowHeight(37);
	        ScrollPane99 = new JScrollPane(table1);
	        ScrollPane99.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
	        panel_99.add(ScrollPane99, BorderLayout.CENTER);
			
			JButton billprint = new JButton("Print");
			billprint.addActionListener(new ActionListener() {
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
					
					try {
						table1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
						
					}catch(PrinterException pe) {
						pe.printStackTrace();
					}
				}
			});
			panelbillrow2.add(billprint, "cell 3 1,grow");
			billprint.setOpaque(true);
			billprint.setForeground(Color.WHITE);
			billprint.setFont(new Font("SansSerif", Font.PLAIN, 17));
			billprint.setFocusPainted(false);
			billprint.setBackground(Color.BLACK);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.YELLOW);
		layeredPane.add(panel_4, "name_617652316245243");
		panel_4.setLayout(null);
		
		JScrollPane scrollPane1= new JScrollPane();
		scrollPane1.setBounds(0, 0, 1085, 800);
		panel_4.add(scrollPane1);
		
		JPanel panelhai = new JPanel();
		scrollPane1.setViewportView(panelhai);
		panelhai.setLayout(new BoxLayout(panelhai, BoxLayout.X_AXIS));
		
		JPanel panelhaina= new JPanel();
		panelhaina.setBackground(new Color(250,250,250));
		panelhai.add(panelhaina);
		panelhaina.setLayout(new MigLayout("", "[840px,grow]", "[100px][grow,fill][100px]"));
		
		JPanel panelemrow1= new JPanel();
		panelemrow1.setBackground(new Color(250,250,250));
		panelhaina.add(panelemrow1, "cell 0 0, grow");
		panelemrow1.setLayout(new MigLayout("", "[grow][][grow]", "[][70px][]"));
		
		JLabel lblCustomersDetail_1 = new JLabel("Employee Detail");
		lblCustomersDetail_1.setFont(new Font("SansSerif", Font.BOLD, 27));
		panelemrow1.add(lblCustomersDetail_1, "cell 1 1,alignx center,aligny center");
		
		JPanel panelemrow2= new JPanel();
		panelemrow2.setBackground(Color.WHITE);
		panelhaina.add(panelemrow2, "cell 0 1, grow");
		panelemrow2.setLayout(new MigLayout("", "[70px][300px,grow][70px]", "[10px][grow]"));
		
//		JPanel panel_26 = new JPanel();
//		panel_26.setBackground(Color.WHITE);
//		panelemrow2.add(panel_26, "cell 1 0,grow");
//		panel_26.setLayout(new MigLayout("", "[300px,grow]27px[170px]", "[grow][37px][grow]"));
//		
//		em_search = new JTextField();
//		em_search.setHorizontalAlignment(SwingConstants.CENTER);
//		em_search.setFont(new Font("SansSerif", Font.BOLD, 17));
//		panel_26.add(em_search, "cell 0 1,grow");
//		em_search.setBorder(redBorder);
//		em_search.setColumns(10);
//		
//		JButton em_searchbtn = new JButton("Search");
//		em_searchbtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String emno= em_search.getText();
//				DB db= new DB();
//				
//				try {
//					String sql= "select * from employee where name='"+emno+"'";
//					ResultSet rst1= db.executeQuery(sql);
//					if(rst1.next()) {
//						int cus_check= JOptionPane.showConfirmDialog(null, "Customer with vehicle no. "+cusno+" exist, and click yes to open detail.", "Customer Check", JOptionPane.YES_NO_OPTION);
//						if(cus_check== 0) {
//							indiemp_detail oneemp_detail= new indiemp_detail(emp_Id,emp_Name,emp_Mobile,emp_Aadhar,emp_Join,emp_Presents);
//							oneemp_detail.setUndecorated(true);
//							oneemp_detail.setVisible(true);
//						}else {
//							return;
//						}
//						db.close();
//						
//					}else {
//						db.close();
//						JOptionPane.showMessageDialog(null, "No customer with vehicle no. "+cusno+" not exist.");
//					}
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//			}
//		});
//		panel_26.add(em_searchbtn, "cell 1 1,grow");
//		em_searchbtn.setOpaque(true);
//		em_searchbtn.setForeground(Color.WHITE);
//		em_searchbtn.setFont(new Font("SansSerif", Font.PLAIN, 17));
//		em_searchbtn.setFocusPainted(false);
//		em_searchbtn.setBackground(Color.BLACK);
		
		

		
		
		
		
		JPanel panelemrow2btns= new JPanel();
		panelemrow2btns.setBackground(Color.WHITE);
		panelemrow2.add(panelemrow2btns, "cell 1 1, grow");
		panelemrow2btns.setLayout(new MigLayout("", "[][200px,grow]17px[200px]17px[200px]17px[200px][]", "[37px]0px[0px]17px[37px]17px[37px]17px[37px]17px[37px]17px[37px]17px[37px]"));
		
		JLabel lblClickToOpen = new JLabel("Click to open:");
		lblClickToOpen.setFont(new Font("SansSerif", Font.BOLD, 21));
		panelemrow2btns.add(lblClickToOpen, "cell 1 0");
		
/*getting employee names*/
		
		try
		{ 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
		String sql = "select * from employee";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int emprow_i =0;
//		if(rs.next())
//		{
//		String name = rs.getString("name");
//		JButton btnNewButton_1 = new JButton(name);
//		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_1.setOpaque(true);
//		btnNewButton_1.setForeground(Color.WHITE);
//		btnNewButton_1.setFocusPainted(false);
//		btnNewButton_1.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_1, "flowx,cell 1 2,grow");
//		i++; 
//		}
		
		if (rs.last()) {
			  emprow_i = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		JButton empbuttons[] = new JButton[emprow_i];
		int emp_btn_i= 0;
		int setcolbtn=1;
		int setrowbtn= 2;
			while (rs.next()) {
				String emp_Name= rs.getString("name");
				String emp_Aadhar= rs.getString("aadhar_no");
				int emp_Id= rs.getInt("id");
				String emp_Mobile= rs.getString("mobile_no");
				int emp_Presents= rs.getInt("presents");
				Date emp_Join= rs.getDate("join_date");
			 JButton emp_d_btn= new JButton(rs.getString("name"));
			 emp_d_btn.setBackground(new Color(250,250,250));
				emp_d_btn.setFont(new Font("SansSerif", Font.BOLD, 17));
				emp_d_btn.setOpaque(true);
				emp_d_btn.setForeground(Color.BLACK);
				emp_d_btn.setFocusPainted(false);
				emp_d_btn.setBorder(new LineBorder(Color.WHITE, 0));
				emp_d_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						indiemp_detail oneemp_detail= new indiemp_detail(emp_Id,emp_Name,emp_Mobile,emp_Aadhar,emp_Join,emp_Presents);
						oneemp_detail.setUndecorated(true);
						oneemp_detail.setVisible(true);
						
					}
				});
				
				if(setcolbtn>4) {
					setrowbtn++;
					setcolbtn=1;
				}
				panelemrow2btns.add(emp_d_btn, "flowx,cell "+setcolbtn+" "+setrowbtn+",grow");
				setcolbtn++;
			
			 empbuttons[emp_btn_i]= emp_d_btn;
			 emp_btn_i++;
			}

		
		
		if(emprow_i <1)
		{
		JOptionPane.showMessageDialog(null, "No Record Found","Error",
		JOptionPane.ERROR_MESSAGE);
		}
		if(emprow_i ==1)
		{
		System.out.println(emprow_i+" Record Found");
		}
		else
		{
		System.out.println(emprow_i+" Records Found");
		}
		}
		catch(Exception ex)
		{
		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
		JOptionPane.ERROR_MESSAGE);
		}
		
		/*end*/
		
//		JButton btnNewButton_1 = new JButton("HR 26 CA 420");
//		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_1.setOpaque(true);
//		btnNewButton_1.setForeground(Color.WHITE);
//		btnNewButton_1.setFocusPainted(false);
//		btnNewButton_1.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_1, "flowx,cell 1 2,grow");
//		
//		JButton btnNewButton_2 = new JButton("HR 26 CA 420");
//		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_2.setOpaque(true);
//		btnNewButton_2.setForeground(Color.WHITE);
//		btnNewButton_2.setFocusPainted(false);
//		btnNewButton_2.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_2, "cell 2 2,grow");
//		
//		JButton btnNewButton_3 = new JButton("HR 26 CA 420");
//		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_3.setOpaque(true);
//		btnNewButton_3.setForeground(Color.WHITE);
//		btnNewButton_3.setFocusPainted(false);
//		btnNewButton_3.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_3, "cell 3 2, grow");
//		
//		JButton btnNewButton_4 = new JButton("HR 26 CA 420");
//		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_4.setOpaque(true);
//		btnNewButton_4.setForeground(Color.WHITE);
//		btnNewButton_4.setFocusPainted(false);
//		btnNewButton_4.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_4, "cell 4 2, grow");
//		
//		JButton btnNewButton_6 = new JButton("HR 26 CA 420");
//		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_6.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_6.setOpaque(true);
//		btnNewButton_6.setForeground(Color.WHITE);
//		btnNewButton_6.setFocusPainted(false);
//		btnNewButton_6.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_6, "cell 1 3,grow");
//		
//		JButton btnNewButton_7 = new JButton("HR 26 CA 420");
//		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_7.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_7.setOpaque(true);
//		btnNewButton_7.setForeground(Color.WHITE);
//		btnNewButton_7.setFocusPainted(false);
//		btnNewButton_7.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_7, "cell 1 4,grow");
//		
//		JButton btnNewButton_8 = new JButton("HR 26 CA 420");
//		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
//		btnNewButton_8.setFont(new Font("SansSerif", Font.BOLD, 17));
//		btnNewButton_8.setOpaque(true);
//		btnNewButton_8.setForeground(Color.WHITE);
//		btnNewButton_8.setFocusPainted(false);
//		btnNewButton_8.setBorder(new LineBorder(Color.WHITE, 0));
//		panelemrow2btns.add(btnNewButton_8, "cell 1 5,grow");
//		
		
		
		
		
		JPanel panelemrow3= new JPanel();
		panelemrow3.setBorder(null);
		panelemrow3.setBackground(new Color(250,250,250));
		panelhaina.add(panelemrow3, "cell 0 2, grow");
		panelemrow3.setLayout(new MigLayout("", "[grow][170px][grow]", "[grow][37px][grow]"));
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addemployee add_employee= new addemployee();
				add_employee.setUndecorated(true);
				add_employee.setVisible(true);
			}
		});
		
		panelemrow3.add(btnAddEmployee, "cell 1 1,grow");
		btnAddEmployee.setOpaque(true);
		btnAddEmployee.setForeground(Color.BLACK);
		btnAddEmployee.setFont(new Font("SansSerif", Font.PLAIN, 17));
		btnAddEmployee.setFocusPainted(false);
		btnAddEmployee.setBackground(Color.WHITE);
		
		

		

		
		
		
		panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				panel_5.setBackground(new Color(45, 0, 85));
//			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(panel_3);
				panel_5.setBackground(new Color(245,245,245));
				check1= false;
				check2= true;
				check3= true;
				check4= true;
			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				if(check1) {
//				panel_5.setBackground(new Color(95, 0, 160));
//				}
//			}
			
		});
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(new LineBorder(Color.WHITE, 0));
		btnNewButton_1.setFocusPainted(false);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SwingUtilities.updateComponentTreeUI(panel_4);
				//panel_4.invalidate();
//				panel_4.revalidate();
//				panel_4.repaint();
				fillhomeone();
				dateChooser.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
				fillhometwo(java.sql.Date.valueOf(java.time.LocalDate.now()));
				panelemrow2btns.removeAll();
				panelemrow2btns.revalidate();
				panelemrow2btns.repaint();
				panelemrow2btns.add(lblClickToOpen, "cell 1 0");
				
				try
				{ 
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
				String sql = "select * from employee";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				int emprow_i =0;
//				if(rs.next())
//				{
//				String name = rs.getString("name");
//				JButton btnNewButton_1 = new JButton(name);
//				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
//				btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
//				btnNewButton_1.setOpaque(true);
//				btnNewButton_1.setForeground(Color.WHITE);
//				btnNewButton_1.setFocusPainted(false);
//				btnNewButton_1.setBorder(new LineBorder(Color.WHITE, 0));
//				panelemrow2btns.add(btnNewButton_1, "flowx,cell 1 2,grow");
//				i++; 
//				}
				
				if (rs.last()) {
					  emprow_i = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				JButton empbuttons[] = new JButton[emprow_i];
				int emp_btn_i= 0;
				int setcolbtn=1;
				int setrowbtn= 2;
					while (rs.next()) {
						String emp_Name= rs.getString("name");
						String emp_Aadhar= rs.getString("aadhar_no");
						int emp_Id= rs.getInt("id");
						String emp_Mobile= rs.getString("mobile_no");
						int emp_Presents= rs.getInt("presents");
						Date emp_Join= rs.getDate("join_date");
					 JButton emp_d_btn= new JButton(rs.getString("name"));
					 emp_d_btn.setBackground(new Color(250,250,250));
						emp_d_btn.setFont(new Font("SansSerif", Font.BOLD, 17));
						emp_d_btn.setOpaque(true);
						emp_d_btn.setForeground(Color.BLACK);
						emp_d_btn.setFocusPainted(false);
						emp_d_btn.setBorder(new LineBorder(Color.WHITE, 0));
						emp_d_btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								indiemp_detail oneemp_detail= new indiemp_detail(emp_Id,emp_Name,emp_Mobile,emp_Aadhar,emp_Join,emp_Presents);
								oneemp_detail.setUndecorated(true);
								oneemp_detail.setVisible(true);
								
							}
						});
						
						if(setcolbtn>4) {
							setrowbtn++;
							setcolbtn=1;
						}
						panelemrow2btns.add(emp_d_btn, "flowx,cell "+setcolbtn+" "+setrowbtn+",grow");
						setcolbtn++;
					
					 empbuttons[emp_btn_i]= emp_d_btn;
					 emp_btn_i++;
					}

				
				
				if(emprow_i <1)
				{
				JOptionPane.showMessageDialog(null, "No Record Found","Error",
				JOptionPane.ERROR_MESSAGE);
				}
				if(emprow_i ==1)
				{
				System.out.println(emprow_i+" Record Found");
				}
				else
				{
				System.out.println(emprow_i+" Records Found");
				}
				}
				catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				
				
				
				panelcorow2btns.removeAll();
				panelcorow2btns.revalidate();
				panelcorow2btns.repaint();

				panelcorow2btns.add(colblClickToOpen, "cell 1 0");

				/*getting employee names*/
						
						try
						{ 
						Class.forName("com.mysql.cj.jdbc.Driver"); 
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
						String sql = "select distinct vehicleno from cusbillone";
						PreparedStatement ps = con.prepareStatement(sql);
						ResultSet rs = ps.executeQuery();
						int emprow_i =0;
//						if(rs.next())
//						{
//						String name = rs.getString("name");
//						JButton btnNewButton_1 = new JButton(name);
//						btnNewButton_1.setBackground(Color.LIGHT_GRAY);
//						btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
//						btnNewButton_1.setOpaque(true);
//						btnNewButton_1.setForeground(Color.WHITE);
//						btnNewButton_1.setFocusPainted(false);
//						btnNewButton_1.setBorder(new LineBorder(Color.WHITE, 0));
//						panelemrow2btns.add(btnNewButton_1, "flowx,cell 1 2,grow");
//						i++; 
//						}
						
						if (rs.last()) {
							  emprow_i = rs.getRow();
							  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
							}
						JButton cusbuttons[] = new JButton[emprow_i];
						int emp_btn_i= 0;
						int setcolbtn=1;
						int setrowbtn= 2;
							while (rs.next()) {
							String cusvehicle= rs.getString("vehicleno");
//								String emp_Aadhar= rs.getString("aadhar_no");
//								int emp_Id= rs.getInt("id");
//								String emp_Mobile= rs.getString("mobile_no");
//								int emp_Presents= rs.getInt("presents");
//								Date emp_Join= rs.getDate("join_date");
							 JButton emp_d_btn= new JButton(rs.getString("vehicleno"));
							 DB db= new DB();
							 try {
									String sqlc= "select payment from cusbillone where vehicleno='"+rs.getString("vehicleno")+"'";
									ResultSet rst1= db.executeQuery(sqlc);
									if(rst1.next()) {
										if(rst1.getBoolean("payment")!= true) {
											emp_d_btn.setBackground(Color.RED);
										}else {
											emp_d_btn.setBackground(new Color(250,250,250));
										}
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
								emp_d_btn.setFont(new Font("SansSerif", Font.BOLD, 17));
								emp_d_btn.setOpaque(true);
								emp_d_btn.setForeground(Color.BLACK);
								emp_d_btn.setFocusPainted(false);
								emp_d_btn.setBorder(new LineBorder(Color.WHITE, 0));
								emp_d_btn.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										indicus_detail onecus_detail= new indicus_detail(cusvehicle);
										onecus_detail.setUndecorated(true);
										onecus_detail.setVisible(true);
										
									}
								});
								
								if(setcolbtn>4) {
									setrowbtn++;
									setcolbtn=1;
								}
								panelcorow2btns.add(emp_d_btn, "flowx,cell "+setcolbtn+" "+setrowbtn+",grow");
								setcolbtn++;
							
							 cusbuttons[emp_btn_i]= emp_d_btn;
							 emp_btn_i++;
							}

						
						
						if(emprow_i <1)
						{
						JOptionPane.showMessageDialog(null, "No Record Found","Error",
						JOptionPane.ERROR_MESSAGE);
						}
						if(emprow_i ==1)
						{
						System.out.println(emprow_i+" Record Found");
						}
						else
						{
						System.out.println(emprow_i+" Records Found");
						}
						}
						catch(Exception ex)
						{
						JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
						JOptionPane.ERROR_MESSAGE);
						}


			}
		});
		contentPane.add(btnNewButton_1, "cell 0 2,alignx center,grow");
		panel_5.setBackground(Color.WHITE);

		contentPane.add(panel_5, "cell 0 6 4 1,grow");
		panel_5.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(54, 0, 76, 74);
		lblNewLabel.setBackground(new Color(72, 61, 139));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(home.class.getResource("/images/icons8_Bill_30px.png")));
		
		lblNewLabel.setForeground(new Color(139, 69, 19));
		panel_5.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		
		JLabel lblBill = new JLabel("Bill");
		lblBill.setBounds(135, 0, 46, 74);
		lblBill.setForeground(Color.BLACK);
		lblBill.setFont(new Font("SansSerif", Font.BOLD, 21));
		panel_5.add(lblBill);
		
		panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				panel_6.setBackground(new Color(45, 0, 85));
//			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(panel_2);
				panel_6.setBackground(new Color(245,245,245));
				check1= true;
				check2= false;
				check3= true;
				check4= true;
			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				if(check2) {
//				panel_6.setBackground(new Color(95, 0, 160));
//				}
//			}
			
		});
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		contentPane.add(panel_6, "flowx,cell 0 5 4 1,grow");
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(home.class.getResource("/images/icons8_User_Groups_30px.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(139, 69, 19));
		label.setFont(new Font("Tahoma", Font.PLAIN, 27));
		label.setBounds(54, 0, 76, 74);
		panel_6.add(label);
		
		JLabel lblCustomer = new JLabel("Customers");
		lblCustomer.setForeground(Color.BLACK);
		lblCustomer.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblCustomer.setBounds(135, 0, 250, 74);
		panel_6.add(lblCustomer);
		
		panel_8 = new JPanel();
		panel_8.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				panel_8.setBackground(new Color(45, 0, 85));
//			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(panel_1);
				panel_8.setBackground(new Color(245,245,245));
				check1= true;
				check2= true;
				check3= true;
				check4= false;
			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				if(check4) {
//				panel_8.setBackground(new Color(95, 0, 160));
//				}
//			}
			
		});
		
		panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				panel_5.setBackground(new Color(45, 0, 85));
//			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(panel_4);
				panel_7.setBackground(new Color(245,245,245));
				check1= false;
				check2= true;
				check3= true;
				check4= true;
			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				if(check1) {
//				panel_5.setBackground(new Color(95, 0, 160));
//				}
//			}
			
		});
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		contentPane.add(panel_7, "flowx,cell 0 7 4 1,grow");
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(home.class.getResource("/images/icons8_Worker_30px.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(139, 69, 19));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		label_2.setBounds(54, 0, 76, 74);
		panel_7.add(label_2);
		
		JLabel label_9 = new JLabel("Employees");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("SansSerif", Font.BOLD, 21));
		label_9.setBounds(133, 0, 252, 74);
		panel_7.add(label_9);
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(245,245,245));
		contentPane.add(panel_8, "cell 0 4 4 1,grow");
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(home.class.getResource("/images/icons8_Home_30px_1.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(139, 69, 19));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		label_4.setBounds(54, 0, 76, 74);
		panel_8.add(label_4);
		
		
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(Color.BLACK);
		lblHome.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblHome.setBounds(135, 0, 250, 74);
		panel_8.add(lblHome);
		
		
		JButton btnChangePassword = new JButton("Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetlogin resetme= new resetlogin();
				resetme.setUndecorated(true);
//				resetme.setLocationRelativeTo(null);
				resetme.setVisible(true);
				
			}
		});
//		btnChangePassword.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				btnChangePassword.setBackground(Color.WHITE);
//				btnChangePassword.setForeground(Color.BLACK);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				btnChangePassword.setBackground(Color.BLACK);
//				btnChangePassword.setForeground(Color.WHITE);
//			}
//		});
		btnChangePassword.setBackground(Color.WHITE);
		btnChangePassword.setOpaque(true);
		btnChangePassword.setBorder(new LineBorder(Color.WHITE, 0));

		btnChangePassword.setFocusPainted(false);
//		btnChangePassword.setIcon(new ImageIcon(home.class.getResource("/images/icons8_Forgot_Password_30px_1.png")));
		btnChangePassword.setForeground(new Color(0,0,0));
		btnChangePassword.setFont(new Font("SansSerif", Font.BOLD, 17));
		contentPane.add(btnChangePassword, "cell 3 2,alignx center,grow");
		
		JButton button_1 = new JButton("BackUp");
		button_1.setFocusPainted(false);
		button_1.setOpaque(true);
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebpage("https://drive.google.com/open?id=1Ru8hnCwr92kQCMRyJkrb5d3wqjcw0Hb7");
				//JOptionPane.showMessageDialog(null, "This ensure you about your database backup but you have not done any backups.");
			}
		});
		
		JButton btnMessage = new JButton("Message");
		btnMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message let_me = new message();
				let_me.setUndecorated(true);
				let_me.setVisible(true);
			}
		});
		btnMessage.setOpaque(true);
		btnMessage.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnMessage.setFocusPainted(false);
		btnMessage.setBorderPainted(false);
		btnMessage.setBackground(Color.WHITE);
		contentPane.add(btnMessage, "cell 0 9,alignx center,aligny bottom");
		button_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		button_1.setBackground(Color.WHITE);
		contentPane.add(button_1, "cell 3 9,alignx center,aligny bottom");
		
		JLabel lblNewLabel_1 = new JLabel("K.S. Automobiles");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon(home.class.getResource("/images/icons8_Copyright_30px.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(220, 220, 220));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_1, "cell 2 10,alignx center,aligny center");
		
		JLabel namelbl = new JLabel("Rajesh & Mukesh Choudhary");
		namelbl.setVerticalAlignment(SwingConstants.TOP);
		namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		namelbl.setForeground(new Color(220, 220, 220));
		namelbl.setFont(new Font("SansSerif", Font.PLAIN, 17));
		contentPane.add(namelbl, "cell 2 11,alignx center,aligny center");
		
		

		
		

	
		}
	
	public void dealValue() {
		int rowsa= 3;
		for(int rowa= 0; rowa< rowsa; rowa++) {
			
			try {
				abilltwo0= (boolean)table.getValueAt(rowa, 0);
			}catch(NullPointerException e1) {
				abilltwo0= false;
			}
			String abilltwo3;
			try {
			abilltwo3= (String)table.getValueAt(rowa, 3);
			}catch(NullPointerException e2) {
				abilltwo3= "";
			}
			String abilltwo4;
			try {
			abilltwo4= (String)table.getValueAt(rowa, 4);
			}catch(NullPointerException e2) {
				abilltwo4= "";
			}
			String abilltwo5;
			try {
			abilltwo5= (String)table.getValueAt(rowa, 5);
			}catch(NullPointerException e3) {
				abilltwo5= "";
			}
			String abilltwo6;
			try {
			abilltwo6= (String)table.getValueAt(rowa, 6);
			}catch(NullPointerException e2) {
				abilltwo6= "";
			}
			
			try {
				   abilltwo3a = Integer.parseInt(abilltwo3);
			}
			catch (NumberFormatException e1)
			{
			   abilltwo3a = 0;
			}
			
			try {
			   abilltwo4a = Float.parseFloat(abilltwo4);
			}
			catch (NumberFormatException e1)
			{
			   abilltwo4a = 0;
			}
			
			try {
			   abilltwo5a = Float.parseFloat(abilltwo5);
			}
			catch (NumberFormatException e1)
			{
			   abilltwo5a = 0;
			}

			try {
			   abilltwo6a = Float.parseFloat(abilltwo6);
			}
			catch (NumberFormatException e1)
			{
			   abilltwo6a = 0;
			}

			abilltwo6a= abilltwo3a*abilltwo4a*(1 + abilltwo5a/100);
			table.setValueAt(String.valueOf(abilltwo6a), rowa, 6);

			
		}

	}
	
	public void fillhomeone() {
DB db= new DB();
		
		try {
			String sql= "select count(vehicleno) as tcus, sum(total) as total, sum(remain) as tambo, count(billno) as tbill  from cusbillone";
			ResultSet rst1= db.executeQuery(sql);
			if(rst1.next()) {
				label_17.setText(rst1.getString("total"));
				label_3.setText(rst1.getString("tcus"));
				label_13.setText(rst1.getString("tambo"));
				label_11.setText(rst1.getString("tbill"));
				db.close();
				
			}else {
				db.close();
				JOptionPane.showMessageDialog(null, "Error is there");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			String sql= "select count(billno) as tboro from cusbillone where payment='0'";
			ResultSet rst1= db.executeQuery(sql);
			if(rst1.next()) {
				label_15.setText(rst1.getString("tboro"));
				db.close();
			}else {
				db.close();
				JOptionPane.showMessageDialog(null, "Error is there");
			}
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			String sql= "select count(billno) as twash from cusbilltwo where particulars like '%washing%'";
			ResultSet rst1= db.executeQuery(sql);
			if(rst1.next()) {
				label_6.setText(rst1.getString("twash"));
				db.close();
			}else {
				db.close();
				JOptionPane.showMessageDialog(null, "Error is there");
			}
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			String sql= "select count(billno) as talign from cusbilltwo where particulars like '%alignment%'";
			ResultSet rst1= db.executeQuery(sql);
			if(rst1.next()) {
				label_8.setText(rst1.getString("talign"));
				db.close();
			}else {
				db.close();
				JOptionPane.showMessageDialog(null, "Error is there");
			}
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			String sql= "select count(billno) as tac from cusbilltwo where particulars like '%A.C.%'";
			ResultSet rst1= db.executeQuery(sql);
			if(rst1.next()) {
				label_19.setText(rst1.getString("tac"));
				db.close();
			}else {
				db.close();
				JOptionPane.showMessageDialog(null, "Error is there");
			}
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			String sql= "select sum(amount) as tlabour from cusbilltwo where particulars like '%Labour%'";
			ResultSet rst1= db.executeQuery(sql);
			if(rst1.next()) {
				label_7.setText(rst1.getString("tlabour"));
				db.close();
			}else {
				db.close();
				JOptionPane.showMessageDialog(null, "Error is there");
			}
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public void fillhometwo(java.util.Date date) {
		DB db= new DB();
				
				try {
					String sql= "select count(vehicleno) as tcus, sum(total) as total, sum(remain) as tambo, count(billno) as tbill  from cusbillone where date='"+date+"'";
					ResultSet rst1= db.executeQuery(sql);
					if(rst1.next()) {
						label_23.setText(rst1.getString("total"));
						label_18.setText(rst1.getString("tcus"));
						label_29.setText(rst1.getString("tambo"));
						label_25.setText(rst1.getString("tbill"));
						db.close();
						
					}else {
						db.close();
						JOptionPane.showMessageDialog(null, "Error is there");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				try {
					String sql= "select count(billno) as tboro from cusbillone where payment='0' and date='"+date+"'";
					ResultSet rst1= db.executeQuery(sql);
					if(rst1.next()) {
						label_21.setText(rst1.getString("tboro"));
						db.close();
					}else {
						db.close();
						JOptionPane.showMessageDialog(null, "Error is there");
					}
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				try {
					String sql= "select count(cusbilltwo.billno) as twash from cusbilltwo inner join cusbillone on cusbilltwo.billno= cusbillone.billno where cusbilltwo.particulars like '%washing%' and cusbillone.date='"+date+"'";
					ResultSet rst1= db.executeQuery(sql);
					if(rst1.next()) {
						label_33.setText(rst1.getString("twash"));
						db.close();
					}else {
						db.close();
						JOptionPane.showMessageDialog(null, "Error is there");
					}
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				try {
					String sql= "select count(cusbilltwo.billno) as talign from cusbilltwo inner join cusbillone on cusbilltwo.billno= cusbillone.billno where cusbilltwo.particulars like '%alignment%' and cusbillone.date='"+date+"'";
					ResultSet rst1= db.executeQuery(sql);
					if(rst1.next()) {
						label_27.setText(rst1.getString("talign"));
						db.close();
					}else {
						db.close();
						JOptionPane.showMessageDialog(null, "Error is there");
					}
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				try {
					String sql= "select count(cusbilltwo.billno) as tac from cusbilltwo inner join cusbillone on cusbilltwo.billno= cusbillone.billno where cusbilltwo.particulars like '%A.C.%' and cusbillone.date='"+date+"'";
					ResultSet rst1= db.executeQuery(sql);
					if(rst1.next()) {
						label_31.setText(rst1.getString("tac"));
						db.close();
					}else {
						db.close();
						JOptionPane.showMessageDialog(null, "Error is there");
					}
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				try {
					String sql= "select sum(cusbilltwo.amount) as tlabour from cusbilltwo inner join cusbillone on cusbilltwo.billno= cusbillone.billno where cusbilltwo.particulars like '%Labour%' and cusbillone.date='"+date+"'";
					ResultSet rst1= db.executeQuery(sql);
					if(rst1.next()) {
						label_35.setText(rst1.getString("tlabour"));
						db.close();
					}else {
						db.close();
						JOptionPane.showMessageDialog(null, "Error is there");
					}
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
			}

}

