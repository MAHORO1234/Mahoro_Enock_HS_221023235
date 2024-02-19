package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class customers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtextf;
	private JTextField firsttextf;
	private JTextField lasttextf;
	private JTextField emailtextf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customers frame = new customers();
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
	public customers() {
		setTitle("customers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 117, 224, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("first name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 185, 201, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("last name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 259, 178, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 338, 157, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Customer details");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4.setBounds(207, 11, 334, 61);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try { 
				 Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");
	
			String sql="INSERT INTO customers VALUES(?,?,?,?)";
			
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(idtextf.getText()));
		st.setString(2, firsttextf.getText());
		st.setString(3,lasttextf.getText());
		st.setString(4, emailtextf.getText());

         st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved");
		
		st.close();
		con.close();
		
		
		
		
		
		
			}catch  (Exception e2) {
			
			}
			
			
			}

			private Object Class() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(27, 429, 157, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {idtextf.setText(null);
			firsttextf.setText(null);
			lasttextf.setText(null);
			emailtextf.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(526, 432, 164, 30);
		contentPane.add(btnNewButton_1);
		
		idtextf = new JTextField();
		idtextf.setBounds(615, 116, 201, 37);
		contentPane.add(idtextf);
		idtextf.setColumns(10);
		
		firsttextf = new JTextField();
		firsttextf.setBounds(615, 190, 201, 37);
		contentPane.add(firsttextf);
		firsttextf.setColumns(10);
		
		lasttextf = new JTextField();
		lasttextf.setBounds(618, 269, 198, 37);
		contentPane.add(lasttextf);
		lasttextf.setColumns(10);
		
		emailtextf = new JTextField();
		emailtextf.setBounds(627, 355, 189, 37);
		contentPane.add(emailtextf);
		emailtextf.setColumns(10);
	}
}
