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

public class showApp {

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
		new showApp();
	}

	/**
	 * Create the application.
	 */
	public showApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jf = new JFrame();
		jf.setTitle("APPOINMENTS SHOW WINDOW");
		jf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				DOCShow();
			}
		});
		jf.setBounds(100, 100, 514, 380);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 484, 201);
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
		lb1.setText("         SHOW APPOINMENTS");
		lb1.setBounds(10, 0, 350, 29);
		jf.getContentPane().add(lb1);
	
	}
	public void DOCShow()
	{   
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	    DefaultTableModel model=new DefaultTableModel();
	    model.addColumn("appoinment no");
	    model.addColumn("patient_id");
	    model.addColumn("doctor id");
	    model.addColumn("category");
	   
	   
	    st=con.createStatement();
	    rs=st.executeQuery("SELECT * FROM appoinment"); 
	    while(rs.next())
	    {
	    	 model.addRow(new Object[] {
	    			 rs.getInt(1),
	    			 rs.getString(2),
	    			 rs.getString(3),
	    			 rs.getString(4),
	    			 
	    			
	    	 });
	    		
	    }
	    
	    table.setModel(model);
	    table.setAutoResizeMode(0);
	    table.getColumnModel().getColumn(0).setPreferredWidth(140);
	    table.getColumnModel().getColumn(1).setPreferredWidth(120);
	    table.getColumnModel().getColumn(2).setPreferredWidth(120);
	    table.getColumnModel().getColumn(3).setPreferredWidth(100);
	   
	    
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
}
