package db_project;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class patientformInsert {

	public static JFrame jf=new JFrame();
	public static JTextField PT_fname= new JTextField();
	public static JTextField PT_lname= new JTextField();
	public static JTextField pID_txt= new JTextField();
	public static JTextField age_txt= new JTextField();
	public static JTextField textField_city= new JTextField();
	public static JTextField textField_address= new JTextField();
	public static JTextField ph_no= new JTextField();
	public static JTextField cnic_txt= new JTextField();
	public static JTextField textField_admit= new JTextField();
	public static JTextField textField_discharge= new JTextField();
	public  String gender,Mstatus,type,status;
	public static JComboBox<String> gender_box= new JComboBox<String>();
	public static JComboBox<String> M_status= new JComboBox<String>();
	public static JComboBox<String> pt_typebox= new JComboBox<String>();
	public static JComboBox<String>statusBox= new JComboBox<String>();
	
	/**
	 * @wbp.nonvisual location=171,-31
	 */
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new patientformInsert();
	}

	/**
	 * Create the application.
	 */
	public patientformInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unused")
	public void initialize() {
		
		jf.setTitle("add patients data");
		jf.setBounds(100, 100, 782, 489);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		JLabel Fname_lb = new JLabel("First name");
		Fname_lb.setBounds(10, 101, 85, 15);
		Fname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(Fname_lb);
		
		JLabel heading_lb = new JLabel("    ADD PATIENT");
		heading_lb.setBounds(0, 0, 429, 24);
		heading_lb.setForeground(new Color(0, 0, 128));
		heading_lb.setBackground(new Color(30, 144, 255));
		heading_lb.setFont(new Font("Tahoma", Font.BOLD, 17));
		jf.getContentPane().add(heading_lb);
		
		
		PT_fname.setBounds(80, 99, 170, 20);
		jf.getContentPane().add(PT_fname);
		PT_fname.setColumns(10);
		
		JLabel lname_lb = new JLabel("Last name");
		lname_lb.setBounds(284, 101, 85, 15);
		lname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lname_lb);
		
		PT_lname = new JTextField();
		PT_lname.setBounds(362, 99, 170, 20);
		PT_lname.setColumns(10);
		jf.getContentPane().add(PT_lname);
		
		
		pID_txt.setBounds(97, 58, 85, 20);
		pID_txt.setColumns(10);
		jf.getContentPane().add(pID_txt);
		
		JLabel pID_lb = new JLabel("patient id");
		pID_lb.setBounds(10, 60, 85, 15);
		pID_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(pID_lb);
		
		
		age_txt.setBounds(67, 140, 85, 20);
		age_txt.setColumns(10);
		jf.getContentPane().add(age_txt);
		
		JLabel age_lb = new JLabel("age");
		age_lb.setBounds(10, 142, 60, 15);
		age_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(age_lb);
		
		JLabel gender_lb = new JLabel("gender");
		gender_lb.setBounds(174, 142, 60, 15);
		gender_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(gender_lb);
		
		
		gender_box.setBounds(224, 139, 98, 22);
		gender_box.setModel(new DefaultComboBoxModel<String>(new String[] {"male", "female"}));
		gender_box.setEditable(true);
		gender_box.setToolTipText("");
		gender_box.setMaximumRowCount(2);
		jf.getContentPane().add(gender_box);
		gender= gender_box.getSelectedItem().toString();
		
		JLabel lblCity = new JLabel("city");
		lblCity.setBounds(10, 184, 60, 15);
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblCity);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setBounds(160, 184, 60, 15);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblAddress);
		
		textField_city = new JTextField();
		textField_city.setBounds(55, 182, 85, 20);
		textField_city.setColumns(10);
		jf.getContentPane().add(textField_city);
		
		textField_address = new JTextField();
		textField_address.setBounds(216, 182, 226, 20);
		textField_address.setColumns(10);
		jf.getContentPane().add(textField_address);
		
		 M_status = new JComboBox<String>();
		M_status.setBounds(473, 139, 98, 22);
		M_status.setModel(new DefaultComboBoxModel<String>(new String[] {"maried", "single"}));
		M_status.setToolTipText("");
		M_status.setMaximumRowCount(2);
		M_status.setEditable(true);
		jf.getContentPane().add(M_status);
	    Mstatus= M_status.getSelectedItem().toString();
		
		JLabel lblMartialStatus = new JLabel("martial status");
		lblMartialStatus.setBounds(365, 145, 98, 15);
		lblMartialStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblMartialStatus);
		
		JLabel lblPhoneno = new JLabel("phoneNO");
		lblPhoneno.setBounds(216, 230, 60, 15);
		lblPhoneno.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblPhoneno);
		
		JLabel cnic_lb = new JLabel("cnic");
		cnic_lb.setBounds(10, 230, 49, 15);
		cnic_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(cnic_lb);
		
		ph_no = new JTextField();
		ph_no.setBounds(286, 225, 154, 20);
		ph_no.setColumns(10);
		jf.getContentPane().add(ph_no);
		
		cnic_txt = new JTextField();
		cnic_txt.setBounds(55, 225, 123, 20);
		cnic_txt.setColumns(10);
		jf.getContentPane().add(cnic_txt);
		
		JLabel lblPatientType = new JLabel("patient type");
		lblPatientType.setBounds(10, 269, 106, 15);
		lblPatientType.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblPatientType);
		
		pt_typebox = new JComboBox<String>();
		pt_typebox.setMaximumRowCount(5);
		pt_typebox.setModel(new DefaultComboBoxModel<String>(new String[] {"cardiovascular", "psoriasis", "neuro", "gyne", "psychic"}));
		pt_typebox.setBounds(122, 266, 106, 22);
		pt_typebox.setToolTipText("");
		pt_typebox.setEditable(true);
		jf.getContentPane().add(pt_typebox);
		type= pt_typebox.getSelectedItem().toString();
		
		JLabel lblAdmitDate = new JLabel("admit date");
		lblAdmitDate.setBounds(10, 312, 106, 15);
		lblAdmitDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblAdmitDate);
		
		textField_admit = new JTextField();
		textField_admit.setBounds(97, 310, 123, 20);
		textField_admit.setColumns(10);
		jf.getContentPane().add(textField_admit);
		
		textField_discharge = new JTextField();
		textField_discharge.setBounds(365, 310, 123, 20);
		textField_discharge.setColumns(10);
		jf.getContentPane().add(textField_discharge);
		
		JLabel lblDischargeDate = new JLabel("discharge date");
		lblDischargeDate.setBounds(263, 312, 106, 15);
		lblDischargeDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblDischargeDate);
		
		JLabel lbStatus = new JLabel("status");
		lbStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbStatus.setBounds(10, 352, 106, 15);
		jf.getContentPane().add(lbStatus);
		
		statusBox = new JComboBox<String>();
		statusBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Indoor", "Outdoor"}));
		statusBox.setToolTipText("");
		statusBox.setMaximumRowCount(2);
		statusBox.setEditable(true);
		statusBox.setBounds(80, 349, 98, 22);
		jf.getContentPane().add(statusBox);
		
		
		status= statusBox.getSelectedItem().toString();
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBackground(new Color(240, 240, 240));
		btnLogout.setForeground(new Color(0, 0, 128));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBounds(630, 0, 136, 30);
		jf.getContentPane().add(btnLogout);
		
		
		JButton btnclose = new JButton("close");
		btnclose.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnclose.setForeground(new Color(0, 0, 0));
		btnclose.setBounds(48, 389, 89, 23);
		jf.getContentPane().add(btnclose);
		btnclose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 jf.dispose();
			}
		});
		
		
		JButton addBTN = new JButton("ADD");
		addBTN.setForeground(Color.BLACK);
		addBTN.setFont(new Font("Tahoma", Font.BOLD, 17));
		addBTN.setBounds(540, 335, 179, 43);
		jf.getContentPane().add(addBTN);
		ProjectDatabase obj=new ProjectDatabase();
				
	    addBTN.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent ae)
	  {
		obj.PatientInsert(pID_txt.getText(),PT_fname.getText(),PT_lname.getText(),Integer.parseInt(age_txt.getText()),gender,textField_address.getText(),textField_city.getText(),ph_no.getText(),Mstatus,type,status,cnic_txt.getText(),textField_admit.getText(),textField_discharge.getText());

}
	    });
	}
}
