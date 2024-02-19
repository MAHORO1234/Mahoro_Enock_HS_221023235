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
import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Governments extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtex;
	private JTextField nametextf;
	private JTextField emailtextf;
	private JTextField contacttextf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Governments frame = new Governments();
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
	public Governments() {
		setBackground(new Color(192, 192, 192));
		setTitle("Governments");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(23, 103, 144, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(23, 173, 144, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(23, 250, 136, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("contact");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(23, 320, 136, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Governments details");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4.setBounds(103, 25, 305, 34);
		contentPane.add(lblNewLabel_4);
		
		idtex = new JTextField();
		idtex.setBounds(393, 113, 208, 46);
		contentPane.add(idtex);
		idtex.setColumns(10);
		
		nametextf = new JTextField();
		nametextf.setBounds(393, 173, 208, 45);
		contentPane.add(nametextf);
		nametextf.setColumns(10);
		
		emailtextf = new JTextField();
		emailtextf.setBounds(393, 232, 208, 39);
		contentPane.add(emailtextf);
		emailtextf.setColumns(10);
		
		contacttextf = new JTextField();
		contacttextf.setBounds(393, 317, 208, 45);
		contentPane.add(contacttextf);
		contacttextf.setColumns(10);
		
		JButton btnNewButton = new JButton("insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");
					String sql="INSERT INTO Governments VALUES(?,?,?,?)";
					
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1, Integer.parseInt(idtex.getText()));
				st.setString(2, nametextf.getText());
				st.setString(3,emailtextf.getText());
				st.setString(4, contacttextf.getText());
				st.executeUpdate();
				JOptionPane.showMessageDialog(btnNewButton, "saved data!!");
				st.close();
				con.close();
				
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}	
				
				
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(128, 64, 64));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(84, 421, 102, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");	
				String sql="DELETE FROM Governments WHERE id=?";
				PreparedStatement st=con.prepareStatement(sql);
				int idtex=Integer.parseInt(JOptionPane.showInputDialog("enter government_id rodelete"));
				st.setInt(1, idtex);
				JOptionPane.showMessageDialog(btnNewButton_1, "Recorded out!!");
				st.executeUpdate();
				st.close();
				con.close();
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			
			}
			});
		btnNewButton_1.setBackground(new Color(64, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(464, 411, 125, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");
					String sql="UPDATE Governments SET Governments_name=?,instructor=?,description_text=?,credit=? WHERE Governments_id=?";	
					PreparedStatement st=con.prepareStatement(sql);
					st.setInt(1, Integer.parseInt(idtex.getText()));
					st.setString(2,nametextf.getText());
					st.setString(3, emailtextf.getText());
					st.setString(4, contacttextf.getText());
					JOptionPane.showMessageDialog(btnNewButton_2, "Data changed!!");
					st.executeUpdate();
					con.close();
					st.close();
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
			
			
			
			{
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(266, 411, 109, 44);
		contentPane.add(btnNewButton_2);
	}

}
