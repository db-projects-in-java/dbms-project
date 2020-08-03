package db_project;


import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class showPatientDetail {

	private JFrame jf;
	static Connection con=null;
	static PreparedStatement ps=null;
	static Statement st=null;
	static ResultSet rs=null;
	private JTable table;
	private JLabel lb1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new showPatientDetail();
	}

	/**
	 * Create the application.
	 */
	public showPatientDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jf = new JFrame();
		jf.setTitle("PATIENTS SHOW WINDOW");
		jf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				PatientShow();
			}
		});
		jf.setBounds(100, 100, 824, 380);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 788, 201);
		jf.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton BTN_logout = new JButton("LogOut");
		BTN_logout.setFont(new Font("Tahoma", Font.BOLD, 15));
		BTN_logout.setForeground(new Color(0, 0, 128));
		BTN_logout.setBounds(682, 11, 89, 23);
		jf.getContentPane().add(BTN_logout);
		
		JButton btnClose = new JButton("close");
		btnClose.setForeground(new Color(0, 0, 128));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClose.setBounds(289, 269, 89, 23);
		jf.getContentPane().add(btnClose);
		btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 jf.dispose();
			}
		});
		
		lb1 = new JLabel();
		lb1.setForeground(new Color(0, 0, 128));
		lb1.setFont(new Font("Bell MT", Font.BOLD, 18));
		lb1.setText("          SHOW DOCTORS DATA");
		lb1.setBounds(10, 0, 350, 29);
		jf.getContentPane().add(lb1);
	
	}
	public void PatientShow()
	{   
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	    DefaultTableModel model=new DefaultTableModel();
	    model.addColumn("Id");
	    model.addColumn("Fname");
	    model.addColumn("Lname");
	    model.addColumn("age");
	    model.addColumn("gender");
	    model.addColumn("address");
	    model.addColumn("city");
	    model.addColumn("number");
	    model.addColumn("M_status");
	    model.addColumn("Type");
	    model.addColumn("status");
	    model.addColumn("cnic");
	    model.addColumn("admit date");
	    model.addColumn("Discharge date");
	    
	    
	    st=con.createStatement();
	    rs=st.executeQuery("SELECT * FROM Patient"); 
	    while(rs.next())
	    {
	    	 model.addRow(new Object[] {
	    			 rs.getString(1),
	    			 rs.getString(2),
	    			 rs.getString(3),
	    			 rs.getInt(4),
	    			 rs.getString(5),
	    			 rs.getString(6),
	    			 rs.getString(7),
	    			 rs.getString(8),
	    			 rs.getString(9),
	    			 rs.getString(10),
	    			 rs.getString(11),
	    			 rs.getString(12),
	    			 rs.getString(13),
	    			 rs.getString(14)
	    			 
	    			
	    	 });
	    		
	    }
	    
	    table.setModel(model);
	    table.setAutoResizeMode(0);
	    table.getColumnModel().getColumn(0).setPreferredWidth(100);
	    table.getColumnModel().getColumn(1).setPreferredWidth(100);
	    table.getColumnModel().getColumn(2).setPreferredWidth(100);
	    table.getColumnModel().getColumn(3).setPreferredWidth(100);
	    table.getColumnModel().getColumn(4).setPreferredWidth(100);
	    table.getColumnModel().getColumn(5).setPreferredWidth(100);
	    table.getColumnModel().getColumn(6).setPreferredWidth(100);
	    table.getColumnModel().getColumn(7).setPreferredWidth(100);
	    table.getColumnModel().getColumn(8).setPreferredWidth(100);
	    table.getColumnModel().getColumn(9).setPreferredWidth(100);
	    table.getColumnModel().getColumn(10).setPreferredWidth(100);
	    table.getColumnModel().getColumn(11).setPreferredWidth(100);
	    table.getColumnModel().getColumn(12).setPreferredWidth(100);
	    table.getColumnModel().getColumn(13).setPreferredWidth(100);
	   
	    
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
}
