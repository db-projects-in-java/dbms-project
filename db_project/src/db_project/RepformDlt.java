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

public class RepformDlt {

	public static JFrame jf;
	public static JTextField Rep_fname;
	public static JTextField Rep_lname;
	public static JTextField ID_txt;
	public static JTextField age_txt;
	public static JTextField textField_city;
	public static JTextField textField_address;
	public static JTextField ph_no;
	public static JTextField cnic_txt;
	public static JTextField textField_admit;
	public static JComboBox<String> qualiBox,M_status,shiftBox,gender_box;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	public RepformDlt() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		jf = new JFrame();
		jf.setTitle("Remove Receptionist data");
		jf.setBounds(100, 100, 782, 489);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		JLabel Fname_lb = new JLabel("First name");
		Fname_lb.setBounds(10, 101, 85, 15);
		Fname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(Fname_lb);
		
		JLabel heading_lb = new JLabel("    REMOVE RECEPTIONIST");
		heading_lb.setBounds(0, 0, 429, 24);
		heading_lb.setForeground(new Color(0, 0, 128));
		heading_lb.setBackground(new Color(30, 144, 255));
		heading_lb.setFont(new Font("Tahoma", Font.BOLD, 17));
		jf.getContentPane().add(heading_lb);
		
		Rep_fname = new JTextField();
		Rep_fname.setBounds(80, 99, 170, 20);
		jf.getContentPane().add(Rep_fname);
		Rep_fname.setColumns(10);
		
		JLabel lname_lb = new JLabel("Last name");
		lname_lb.setBounds(284, 101, 85, 15);
		lname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lname_lb);
		
		Rep_lname = new JTextField();
		Rep_lname.setBounds(362, 99, 170, 20);
		Rep_lname.setColumns(10);
		jf.getContentPane().add(Rep_lname);
		
		ID_txt = new JTextField();
		ID_txt.setBounds(149, 33, 85, 20);
		ID_txt.setColumns(10);
		jf.getContentPane().add(ID_txt);
		
		JLabel ID_lb = new JLabel("Receptionist id");
		ID_lb.setBounds(36, 35, 142, 15);
		ID_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(ID_lb);
		
		age_txt = new JTextField();
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
		
		gender_box = new JComboBox<String>();
		gender_box.setBounds(224, 139, 98, 22);
		gender_box.setModel(new DefaultComboBoxModel<String>(new String[] {"male", "female"}));
		gender_box.setEditable(true);
		gender_box.setToolTipText("");
		gender_box.setMaximumRowCount(2);
		jf.getContentPane().add(gender_box);
		
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
		
		JLabel lb_repQualifiction = new JLabel("Qualification");
		lb_repQualifiction.setBounds(10, 269, 106, 15);
		lb_repQualifiction.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lb_repQualifiction);
		
		qualiBox = new JComboBox<String>();
		qualiBox.setBounds(108, 266, 112, 22);
		qualiBox.setModel(new DefaultComboBoxModel<String>(new String[] {"inter", "Graduation", "master"}));
		qualiBox.setToolTipText("");
		qualiBox.setMaximumRowCount(2);
		qualiBox.setEditable(true);
		jf.getContentPane().add(qualiBox);
		
		JLabel lbJoiningDate = new JLabel("joining date");
		lbJoiningDate.setBounds(10, 312, 106, 15);
		lbJoiningDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lbJoiningDate);
		
		textField_admit = new JTextField();
		textField_admit.setBounds(97, 310, 123, 20);
		textField_admit.setColumns(10);
		jf.getContentPane().add(textField_admit);
		
		JLabel lb_shift = new JLabel("Shift");
		lb_shift.setBounds(263, 312, 30, 15);
		lb_shift.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lb_shift);
		
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
		
		
		
		               //  ================================== project database called ================================
		ProjectDatabase obj =new ProjectDatabase();
		JButton RemoveBTN = new JButton("REMOVE");
		RemoveBTN.setForeground(Color.BLACK);
		RemoveBTN.setFont(new Font("Tahoma", Font.BOLD, 17));
		RemoveBTN.setBounds(540, 335, 179, 43);
		jf.getContentPane().add(RemoveBTN);
		
		RemoveBTN.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				  if(ID_txt.getText().equals(""))
					 {
					  JOptionPane.showMessageDialog(null,"plz enter value first");
					 }
				else {
					obj.RepRemove(ID_txt.getText());
				}
				 
			}
		});
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBackground(new Color(240, 240, 240));
		btnLogout.setForeground(new Color(0, 0, 128));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBounds(630, 0, 136, 30);
		jf.getContentPane().add(btnLogout);
		
		shiftBox = new JComboBox<String>();
		shiftBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Morning", "Shift", "Night"}));
		shiftBox.setToolTipText("");
		shiftBox.setMaximumRowCount(2);
		shiftBox.setEditable(true);
		shiftBox.setBounds(308, 309, 73, 22);
		jf.getContentPane().add(shiftBox);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBounds(263, 26, 118, 30);
		jf.getContentPane().add(btnSearch);
		
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{     if(ID_txt.getText().equals(""))
			 {
				  JOptionPane.showMessageDialog(null,"plz enter value first");
				 }
			else {
				
				Rep_fname.setText(null);
				Rep_lname.setText(null);
				age_txt.setText(null);
				textField_city.setText(null);
				textField_address.setText(null);
			    ph_no.setText(null);
				cnic_txt.setText(null);
			    textField_admit.setText(null);
				qualiBox.setSelectedItem(false);
				M_status.setSelectedItem(false);
				gender_box.setSelectedItem(false);
				shiftBox.setSelectedItem(false);
				obj.RepDLTSearch(ID_txt.getText());
			}
			 
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 64, 756, 2);
		jf.getContentPane().add(separator);
	}
	}
