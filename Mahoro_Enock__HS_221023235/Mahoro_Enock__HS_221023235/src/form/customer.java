package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class customer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField custtxf;
	private JTextField fntxf;
	private JTextField lntxf;
	private JTextField ematxf;
	private JTextField phonetxf;
	private JTextField addresstxf;
	private JTextField patxf;
	private final JButton btnNewButton = new JButton("Enter");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer frame = new customer();
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
	public customer() {
		setTitle("CUSTOMER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("payment-method");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 355, 142, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("customer-id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(20, 49, 96, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("first-name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(20, 89, 103, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("last-name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(20, 145, 123, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("phone");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(20, 255, 72, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(20, 306, 96, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("email");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(22, 202, 57, 20);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("customer details");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(269, 0, 201, 40);
		contentPane.add(lblNewLabel_7);
		
		custtxf = new JTextField();
		custtxf.setBounds(269, 51, 215, 29);
		contentPane.add(custtxf);
		custtxf.setColumns(10);
		
		fntxf = new JTextField();
		fntxf.setBounds(269, 91, 215, 34);
		contentPane.add(fntxf);
		fntxf.setColumns(10);
		
		lntxf = new JTextField();
		lntxf.setBounds(269, 145, 222, 34);
		contentPane.add(lntxf);
		lntxf.setColumns(10);
		
		ematxf = new JTextField();
		ematxf.setBounds(269, 198, 222, 32);
		contentPane.add(ematxf);
		ematxf.setColumns(10);
		
		phonetxf = new JTextField();
		phonetxf.setBounds(269, 253, 222, 29);
		contentPane.add(phonetxf);
		phonetxf.setColumns(10);
		
		addresstxf = new JTextField();
		addresstxf.setBounds(269, 304, 222, 29);
		contentPane.add(addresstxf);
		addresstxf.setColumns(10);
		
		patxf = new JTextField();
		patxf.setBounds(269, 355, 222, 29);
		contentPane.add(patxf);
		patxf.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/house_maid","root","");
		String sql="INSERT INTO customer VALUES(?,?,?,?,?,?,?)";
PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(custtxf.getText()));
			st.setString(2, lntxf.getText());
			st.setString(3,fntxf.getText());
			st.setString(4, ematxf.getText());
			st.setString(5, phonetxf.getText());
			st.setString(6, addresstxf.getText());
			st.setString(7, patxf.getText());
			
			JOptionPane.showMessageDialog(lblNewLabel_7, "data saved");
			st.executeUpdate();
			con.close();
			st.close();
			
				
				
				
				
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}	
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(10, 406, 179, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.setBounds(279, 406, 103, 41);
		contentPane.add(btnNewButton_1);
	}
}
