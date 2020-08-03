package db_project;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class patientformUpdate {

	public static JFrame jf;
	public static  JTextField PT_fname;
	public static JTextField PT_lname;
	public static JTextField pID_txt;
	public static JTextField age_txt;
	public static JTextField textField_city;
	public static JTextField textField_address;
	public static JTextField ph_no;
	public static JTextField cnic_txt;
	public static JTextField textField_admit;
	public static JTextField textField_discharge;
	public static JComboBox<String> gender_box= new JComboBox<String>();
	public static JComboBox<String> M_status= new JComboBox<String>();
	public static JComboBox<String> pt_typebox= new JComboBox<String>();
	public static JComboBox<String>statusBox= new JComboBox<String>();
	public static String gender,Mstatus,type,status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	public patientformUpdate() {
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		jf = new JFrame();
		jf.setTitle("Update Patients data");
		jf.setBounds(100, 100, 782, 489);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		JLabel Fname_lb = new JLabel("First name");
		Fname_lb.setBounds(10, 93, 85, 15);
		Fname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(Fname_lb);
		
		JLabel heading_lb = new JLabel("   UPDATE PATIENTS DATA");
		heading_lb.setBounds(0, 0, 429, 24);
		heading_lb.setForeground(new Color(0, 0, 128));
		heading_lb.setBackground(new Color(30, 144, 255));
		heading_lb.setFont(new Font("Tahoma", Font.BOLD, 17));
		jf.getContentPane().add(heading_lb);
		
		PT_fname = new JTextField();
		PT_fname.setBounds(84, 91, 170, 20);
		jf.getContentPane().add(PT_fname);
		PT_fname.setColumns(10);
		
		JLabel lname_lb = new JLabel("Last name");
		lname_lb.setBounds(267, 93, 85, 15);
		lname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lname_lb);
		
		PT_lname = new JTextField();
		PT_lname.setBounds(344, 91, 170, 20);
		PT_lname.setColumns(10);
		jf.getContentPane().add(PT_lname);
		
		pID_txt = new JTextField();
		pID_txt.setBounds(127, 35, 85, 20);
		pID_txt.setColumns(10);
		jf.getContentPane().add(pID_txt);
		
		JLabel pID_lb = new JLabel("patient id");
		pID_lb.setBounds(48, 37, 85, 15);
		pID_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(pID_lb);
		
		age_txt = new JTextField();
		age_txt.setBounds(48, 131, 85, 20);
		age_txt.setColumns(10);
		jf.getContentPane().add(age_txt);
		
		JLabel age_lb = new JLabel("age");
		age_lb.setBounds(10, 133, 60, 15);
		age_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(age_lb);
		
		JLabel gender_lb = new JLabel("gender");
		gender_lb.setBounds(160, 133, 60, 15);
		gender_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(gender_lb);
		
		
		gender_box.setBounds(216, 130, 98, 22);
		gender_box.setModel(new DefaultComboBoxModel<String>(new String[] {"male", "female"}));
		gender_box.setEditable(true);
		gender_box.setToolTipText("");
		gender_box.setMaximumRowCount(2);
		jf.getContentPane().add(gender_box);
		gender= gender_box.getSelectedItem().toString();
		
		JLabel lblCity = new JLabel("city");
		lblCity.setBounds(10, 176, 60, 15);
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblCity);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setBounds(160, 176, 60, 15);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblAddress);
		
		textField_city = new JTextField();
		textField_city.setBounds(48, 174, 85, 20);
		textField_city.setColumns(10);
		jf.getContentPane().add(textField_city);
		
		textField_address = new JTextField();
		textField_address.setBounds(216, 174, 226, 20);
		textField_address.setColumns(10);
		jf.getContentPane().add(textField_address);
		
		
		M_status.setBounds(449, 130, 98, 22);
		M_status.setModel(new DefaultComboBoxModel<String>(new String[] {"maried", "single"}));
		M_status.setToolTipText("");
		M_status.setMaximumRowCount(2);
		M_status.setEditable(true);
		jf.getContentPane().add(M_status);
		Mstatus= M_status.getSelectedItem().toString();
		
		JLabel lblMartialStatus = new JLabel("martial status");
		lblMartialStatus.setBounds(355, 133, 98, 15);
		lblMartialStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblMartialStatus);
		
		JLabel lblPhoneno = new JLabel("phoneNO");
		lblPhoneno.setBounds(233, 218, 60, 15);
		lblPhoneno.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblPhoneno);
		
		JLabel cnic_lb = new JLabel("cnic");
		cnic_lb.setBounds(10, 218, 49, 15);
		cnic_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(cnic_lb);
		
		ph_no = new JTextField();
		ph_no.setBounds(303, 216, 154, 20);
		ph_no.setColumns(10);
		jf.getContentPane().add(ph_no);
		
		cnic_txt = new JTextField();
		cnic_txt.setBounds(67, 216, 123, 20);
		cnic_txt.setColumns(10);
		jf.getContentPane().add(cnic_txt);
		
		JLabel lblPatientType = new JLabel("patient type");
		lblPatientType.setBounds(10, 259, 106, 15);
		lblPatientType.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblPatientType);
		pt_typebox.setModel(new DefaultComboBoxModel(new String[] {"cardiovascular", "psoriasis", "neuro", "gyne", "psychic"}));
		
		
		pt_typebox.setBounds(107, 256, 98, 22);
		pt_typebox.setToolTipText("");
		pt_typebox.setMaximumRowCount(5);
		pt_typebox.setEditable(true);
		jf.getContentPane().add(pt_typebox);
		type= pt_typebox.getSelectedItem().toString();
		
		JLabel lblAdmitDate = new JLabel("admit date");
		lblAdmitDate.setBounds(10, 303, 106, 15);
		lblAdmitDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblAdmitDate);
		
		textField_admit = new JTextField();
		textField_admit.setBounds(107, 301, 123, 20);
		textField_admit.setColumns(10);
		jf.getContentPane().add(textField_admit);
		
		textField_discharge = new JTextField();
		textField_discharge.setBounds(355, 301, 123, 20);
		textField_discharge.setColumns(10);
		jf.getContentPane().add(textField_discharge);
		
		JLabel lblDischargeDate = new JLabel("discharge date");
		lblDischargeDate.setBounds(246, 303, 106, 15);
		lblDischargeDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lblDischargeDate);
		
		JLabel lbStatus = new JLabel("status");
		lbStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbStatus.setBounds(10, 352, 106, 15);
		jf.getContentPane().add(lbStatus);
		
		
		statusBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Indoor", "Outdoor"}));
		statusBox.setToolTipText("");
		statusBox.setMaximumRowCount(2);
		statusBox.setEditable(true);
		statusBox.setBounds(66, 349, 98, 22);
		jf.getContentPane().add(statusBox);
		status= statusBox.getSelectedItem().toString();
		
		JButton searchbtn = new JButton("search");
		searchbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		searchbtn.setBounds(233, 32, 98, 23);
		jf.getContentPane().add(searchbtn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(477, 74, -461, -5);
		jf.getContentPane().add(separator);
		
		JButton Updatebtn = new JButton("UPDATE");
		Updatebtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		Updatebtn.setBounds(577, 359, 140, 39);
		jf.getContentPane().add(Updatebtn);
		ProjectDatabase obj=new ProjectDatabase();
		Updatebtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				  if(pID_txt.getText().equals(""))
					 {
					  JOptionPane.showMessageDialog(null,"plz enter value first");
					 } 
				else {
					
					obj.PatientUpdate(pID_txt.getText(),PT_fname.getText(),PT_lname.getText(),Integer.parseInt(age_txt.getText()),gender,textField_address.getText(),textField_city.getText(),ph_no.getText(),Mstatus,type,status,cnic_txt.getText(),textField_admit.getText(),textField_discharge.getText());

				}
				 
			}
		});
		
		JButton closebtn = new JButton("close");
		closebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		closebtn.setBounds(127, 405, 98, 23);
		jf.getContentPane().add(closebtn);
		closebtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 jf.dispose();
			}
		});
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setForeground(new Color(0, 0, 128));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogout.setBounds(668, 0, 98, 23);
		jf.getContentPane().add(btnLogout);
		searchbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{     if(pID_txt.getText().equals(""))
			 {
				  JOptionPane.showMessageDialog(null,"plz enter value first");
				 }
			else {
				
				PT_fname.setText(null);
				PT_lname.setText(null);
				age_txt.setText(null);
				gender_box.setSelectedItem(false);
				textField_address.setText(null);
				textField_city.setText(null);
				ph_no.setText(null);
				M_status.setSelectedItem(false);
				pt_typebox.setSelectedItem(false);
				statusBox.setSelectedItem(false);
				cnic_txt.setText(null);	
				textField_admit.setText(null);
				textField_discharge.setText(null);
				
		         obj.PatientUpdateSearch(pID_txt.getText());
			}
			 
			}
		});
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 66, 756, 2);
		jf.getContentPane().add(separator_1);
	}
}
