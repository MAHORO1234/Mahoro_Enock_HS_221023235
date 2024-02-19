package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class workers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtextf;
	private JTextField fnametextf;
	private JTextField lnametextf;
	private JTextField contacttextf;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					workers frame = new workers();
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
	public workers() {
		setTitle("workers");
		setBackground(new Color(128, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 101, 100, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("fname");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 165, 100, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("lname");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 224, 100, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("contact");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 303, 100, 23);
		contentPane.add(lblNewLabel_3);
		
		idtextf = new JTextField();
		idtextf.setBounds(120, 92, 215, 45);
		contentPane.add(idtextf);
		idtextf.setColumns(10);
		
		fnametextf = new JTextField();
		fnametextf.setBounds(122, 148, 215, 45);
		contentPane.add(fnametextf);
		fnametextf.setColumns(10);
		
		lnametextf = new JTextField();
		lnametextf.setBounds(120, 227, 215, 37);
		contentPane.add(lnametextf);
		lnametextf.setColumns(10);
		
		contacttextf = new JTextField();
		contacttextf.setBounds(120, 303, 215, 37);
		contentPane.add(contacttextf);
		contacttextf.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("workers details");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4.setBounds(124, 11, 270, 45);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try { 
				 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");
	            String sql="INSERT INTO workers VALUES(?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(idtextf.getText()));
		st.setString(2, fnametextf.getText());
		st.setString(3,lnametextf.getText());
		st.setString(4, contacttextf.getText());

        st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved");
		
		st.close();
		con.close();
		
		
		
		
		
		
		
		
			} catch (Exception e2) {		
			}
			}
		});
		
		btnNewButton.setBackground(new Color(128, 64, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(35, 428, 137, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {idtextf.setText(null);
			fnametextf.setText(null);
			lnametextf.setText(null);
			contacttextf.setText(null);
			}{
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnNewButton_1.setBounds(469, 428, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("VIEW");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");
					java.sql.Statement st=con.createStatement();
					String query="SELECT * FROM customers";
					
					ResultSet rs=st.executeQuery(query);
					java.sql.ResultSetMetaData rsdm=rs.getMetaData();
					
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int cols=rsdm.getColumnCount();
				String[]colName=new String[cols];
				for(int i=0;i<cols;i++)
					colName[i]=rsdm.getColumnName(i+1);
					
				model.setColumnIdentifiers(colName);
				String id,fname,lname,contact;
				while(rs.next()) 
				{
				id=rs.getString(1);
				fname=rs.getString(2);
				lname=rs.getString(3);
				contact=rs.getString(4);
			
				String[]row= {id,fname,lname,contact};
				model.addRow(row);
					
					
					
				}	
					
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton_2.setBackground(new Color(128, 128, 64));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(266, 428, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(345, 11, 296, 399);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
