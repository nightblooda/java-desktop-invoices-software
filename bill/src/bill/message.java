package bill;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class message extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					message frame = new message();
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
	public message() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1175, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245,245,245));
		panel_1.setBounds(5, 37, 1165, 86);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Messages");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 27));
		lblNewLabel.setBounds(533, 10, 236, 66);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245,245,245));
		panel_2.setBounds(210, 203, 779, 368);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSendTo = new JLabel("Send To :");
		lblSendTo.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblSendTo.setBounds(49, 29, 80, 28);
		panel_2.add(lblSendTo);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("SansSerif", Font.PLAIN, 17));
		textArea.setBounds(49, 77, 679, 190);
		panel_2.add(textArea);
		
		JButton send = new JButton("Send");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		send.setFont(new Font("SansSerif", Font.PLAIN, 17));
		send.setOpaque(true);
		send.setFont(new Font("SansSerif", Font.BOLD, 17));
		send.setFocusPainted(false);
		send.setBorderPainted(false);
		send.setBackground(Color.WHITE);
		send.setBounds(643, 302, 85, 31);
		panel_2.add(send);
		
		JCheckBox cuscheck = new JCheckBox("Customers");
		cuscheck.setBackground(new Color(245,245,245));
		cuscheck.setFont(new Font("SansSerif", Font.PLAIN, 17));
		cuscheck.setBounds(200, 33, 109, 21);
		panel_2.add(cuscheck);
		
		JCheckBox empcheck = new JCheckBox("Employees");
		empcheck.setBackground(new Color(245,245,245));
		empcheck.setFont(new Font("SansSerif", Font.PLAIN, 17));
		empcheck.setBounds(349, 33, 125, 21);
		panel_2.add(empcheck);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(5, 0, 1165, 36);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(1105, 4, 47, 27);
		btnNewButton_1.setBackground(Color.WHITE);
		panel_3.add(btnNewButton_1);
	}
}
