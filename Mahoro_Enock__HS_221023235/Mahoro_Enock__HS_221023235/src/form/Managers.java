package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Managers {

	 JFrame frmManagers;
	private JTextField idtxt;
	private JTextField fntxf;
	private JTextField lntxf;
	private JTextField emailtxf;
	private JTextField telephonetxf;
	private JTextField gendertxf;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Managers window = new Managers();
					window.frmManagers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Managers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManagers = new JFrame();
		frmManagers.setTitle("MANAGERS");
		frmManagers.getContentPane().setBackground(new Color(128, 128, 128));
		frmManagers.setBackground(new Color(128, 128, 255));
		frmManagers.setBounds(100, 100, 639, 504);
		frmManagers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManagers.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(17, 91, 76, 14);
		frmManagers.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("first name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(17, 134, 104, 29);
		frmManagers.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(20, 254, 84, 14);
		frmManagers.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("telephone");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(27, 310, 94, 29);
		frmManagers.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(27, 350, 94, 29);
		frmManagers.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Managers details");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_5.setBounds(223, 25, 247, 29);
		frmManagers.getContentPane().add(lblNewLabel_5);
		
		idtxt = new JTextField();
		idtxt.setBounds(165, 78, 204, 27);
		frmManagers.getContentPane().add(idtxt);
		idtxt.setColumns(10);
		
		fntxf = new JTextField();
		fntxf.setBounds(165, 133, 204, 35);
		frmManagers.getContentPane().add(fntxf);
		fntxf.setColumns(10);
		
		lntxf = new JTextField();
		lntxf.setBounds(165, 190, 204, 35);
		frmManagers.getContentPane().add(lntxf);
		lntxf.setColumns(10);
		
		emailtxf = new JTextField();
		emailtxf.setBounds(165, 250, 204, 27);
		frmManagers.getContentPane().add(emailtxf);
		emailtxf.setColumns(10);
		
		telephonetxf = new JTextField();
		telephonetxf.setBounds(165, 302, 204, 36);
		frmManagers.getContentPane().add(telephonetxf);
		telephonetxf.setColumns(10);
		
		gendertxf = new JTextField();
		gendertxf.setBounds(165, 349, 204, 35);
		frmManagers.getContentPane().add(gendertxf);
		gendertxf.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("last name");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(24, 203, 104, 29);
		frmManagers.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");
				String sql="INSERT INTO manager VALUES(?,?,?,?,?,?)";
				
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(idtxt.getText()));
			st.setString(2, fntxf.getText());
			st.setString(3,lntxf.getText());
			st.setString(4, emailtxf.getText());
			st.setString(5, telephonetxf.getText());
			st.setString(6, gendertxf.getText());
			st.executeUpdate();
			JOptionPane.showMessageDialog(btnNewButton, "saved data!!");
			st.close();
			con.close();
			
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}	
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(17, 403, 104, 53);
		frmManagers.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ABORT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			idtxt.setText(null);
			fntxf.setText(null);
			lntxf.setText(null);
			emailtxf.setText(null);
			telephonetxf.setText(null);
			gendertxf.setText(null);
				
				
			}
		});
		btnNewButton_1.setBounds(521, 405, 94, 48);
		frmManagers.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("update");
		btnNewButton_2.setBackground(new Color(64, 0, 64));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");
				String sql="UPDATE managers SET managers_name=?,instructor=?,description_text=?,credit=?,gender=? WHERE managers_id=?";	
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1, Integer.parseInt(idtxt.getText()));
				st.setString(2,fntxf.getText());
				st.setString(3, lntxf.getText());
				st.setString(4, emailtxf.getText());
				st.setString(5, telephonetxf.getText());
				st.setString(6, gendertxf.getText());
				JOptionPane.showMessageDialog(btnNewButton_2, "Data changed!!");
				st.executeUpdate();
				con.close();
				st.close();
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}{
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(146, 403, 104, 53);
		frmManagers.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("VIEW");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");
					java.sql.Statement st=con.createStatement();
					String query="SELECT * FROM manager";
					
					ResultSet rs=st.executeQuery(query);
					java.sql.ResultSetMetaData rsdm=rs.getMetaData();
					
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int cols=rsdm.getColumnCount();
				String[]colName=new String[cols];
				for(int i=0;i<cols;i++)
					colName[i]=rsdm.getColumnName(i+1);
					
				model.setColumnIdentifiers(colName);
				String id,managersName,instructor,description_text,credit,gender;
				while(rs.next()) 
				{
				id=rs.getString(1);
				managersName=rs.getString(2);
				instructor=rs.getString(3);
				description_text=rs.getString(4);
				credit=rs.getString(5);
				gender=rs.getString(6);
				String[]row= {id,managersName,instructor,description_text,credit,gender};
				model.addRow(row);
					
					
					
				}	
					
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(260, 401, 94, 53);
		frmManagers.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/housemaid","root","");	
				String sql="DELETE FROM manager WHERE id=?";
				PreparedStatement st=con.prepareStatement(sql);
				int idtxt=Integer.parseInt(JOptionPane.showInputDialog("enter manager_id rodelete"));
				st.setInt(1, idtxt);
				JOptionPane.showMessageDialog(btnNewButton_1, "Recorded out!!");
				st.executeUpdate();
				st.close();
				con.close();
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			
			}
			});
				
			
		btnNewButton_4.setBackground(new Color(128, 128, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(387, 408, 104, 48);
		frmManagers.getContentPane().add(btnNewButton_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(387, 78, 228, 295);
		frmManagers.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_1_1.setBounds(521, 6, 94, 48);
		frmManagers.getContentPane().add(btnNewButton_1_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
