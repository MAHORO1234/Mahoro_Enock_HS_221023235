package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HOMEPAGEOFHOUSEMAID extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOMEPAGEOFHOUSEMAID frame = new HOMEPAGEOFHOUSEMAID();
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
	public HOMEPAGEOFHOUSEMAID() {
		setBackground(new Color(0, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOUSE MAID HOME PAGE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(96, 11, 590, 64);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("MANAGERS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Managers ma=new Managers();
				ma.setVisible(true);
				dispose();
			}
		});
			
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(22, 121, 333, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CUSTOMERS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customers ma=new customers();
				ma.setVisible(true);
				dispose();
			}
		});
			
		btnNewButton_2.setForeground(new Color(255, 0, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(473, 110, 332, 52);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("WORKERS");
		btnNewButton_3.setForeground(new Color(255, 128, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				workers ma=new workers();
				ma.setVisible(true);
				dispose();
			
			}
		});
		btnNewButton_3.setBackground(new Color(128, 128, 64));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBounds(22, 276, 333, 51);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("GOVERNMENTS");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Governments ma=new Governments();
				ma.setVisible(true);
				dispose();
			}
		});
			
		btnNewButton_4.setForeground(new Color(0, 128, 0));
		btnNewButton_4.setBackground(new Color(0, 0, 64));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_4.setBounds(472, 257, 333, 48);
		contentPane.add(btnNewButton_4);
	}
}
