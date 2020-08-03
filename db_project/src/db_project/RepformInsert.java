package db_project;


//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class RepformInsert {

	public JFrame jf;
	public JTextField Rep_fname;
	public JTextField Rep_lname;
	public JTextField id_txt;
	public JTextField age_txt;
	public JTextField textField_city;
	public JTextField textField_address;
	public JTextField ph_no;
	public JTextField cnic_txt;
	public JTextField joining_date;
	private JTextField pass_txt;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new RepformInsert();
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public RepformInsert()  {
		
			try {
				initialize();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	public void initialize() throws Exception{
		jf = new JFrame();
		jf.setTitle("add Receptionist data");
		jf.setBounds(100, 100, 782, 489);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		JLabel Fname_lb = new JLabel("First name");
		Fname_lb.setBounds(10, 101, 85, 15);
		Fname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(Fname_lb);
		
		JLabel heading_lb = new JLabel("    ADD RECEPTIONIST");
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
		
		id_txt = new JTextField();
		id_txt.setToolTipText("REP----");
		id_txt.setBounds(124, 58, 85, 20);
		id_txt.setColumns(10);
		jf.getContentPane().add(id_txt);
		
		JLabel ID_lb = new JLabel("Receptionist id");
		ID_lb.setBounds(10, 60, 142, 15);
		ID_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(ID_lb);
		
		age_txt = new JTextField();
		age_txt.setToolTipText("Number only");
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
		
		JComboBox<String> gender_box = new JComboBox<String>();
		gender_box.setBounds(224, 139, 98, 22);
		gender_box.setModel(new DefaultComboBoxModel<String>(new String[] {"male", "female"}));
		gender_box.setEditable(true);
		gender_box.setToolTipText("");
		gender_box.setMaximumRowCount(2);
		jf.getContentPane().add(gender_box);
		String value0= gender_box.getSelectedItem().toString();
		
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
		
		JComboBox<String> M_status = new JComboBox<String>();
		M_status.setBounds(473, 139, 98, 22);
		M_status.setModel(new DefaultComboBoxModel<String>(new String[] {"maried", "single"}));
		M_status.setToolTipText("");
		M_status.setMaximumRowCount(2);
		M_status.setEditable(true);
		jf.getContentPane().add(M_status);
		String value1= M_status.getSelectedItem().toString();
		
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
		ph_no.setToolTipText("0300-1234556");
		ph_no.setBounds(286, 225, 154, 20);
		ph_no.setColumns(10);
		jf.getContentPane().add(ph_no);
		
		cnic_txt = new JTextField();
		cnic_txt.setToolTipText("1234-1234512-0");
		cnic_txt.setBounds(55, 225, 123, 20);
		cnic_txt.setColumns(10);
		jf.getContentPane().add(cnic_txt);
		
		JLabel lb_repQualifiction = new JLabel("Qualification");
		lb_repQualifiction.setBounds(10, 269, 106, 15);
		lb_repQualifiction.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lb_repQualifiction);
		
		JComboBox<String> qualiBox = new JComboBox<String>();
		qualiBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Inter", "Graduate", "master"}));
		qualiBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		qualiBox.setBounds(108, 266, 112, 22);
		qualiBox.setToolTipText("");
		qualiBox.setMaximumRowCount(3);
		qualiBox.setEditable(true);
		jf.getContentPane().add(qualiBox);
		String value2= qualiBox.getSelectedItem().toString();
		
		JLabel lbJoiningDate = new JLabel("joining date");
		lbJoiningDate.setBounds(10, 312, 106, 15);
		lbJoiningDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lbJoiningDate);
		
		joining_date = new JTextField();
		joining_date.setToolTipText("YYYY-MM-DD");
		joining_date.setBounds(97, 310, 123, 20);
		joining_date.setColumns(10);
		jf.getContentPane().add(joining_date);
		
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
		
		
		JButton addBTN = new JButton("ADD");
		addBTN.setForeground(Color.BLACK);
		addBTN.setFont(new Font("Tahoma", Font.BOLD, 17));
		addBTN.setBounds(540, 335, 179, 43);
		jf.getContentPane().add(addBTN);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBackground(new Color(240, 240, 240));
		btnLogout.setForeground(new Color(0, 0, 128));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBounds(630, 0, 136, 30);
		jf.getContentPane().add(btnLogout);
		
		JComboBox<String> shiftBox = new JComboBox<String>();
		shiftBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Morning", "Shift", "Night"}));
		shiftBox.setToolTipText("");
		shiftBox.setMaximumRowCount(2);
		shiftBox.setEditable(true);
		shiftBox.setBounds(308, 309, 73, 22);
		String value3= shiftBox.getSelectedItem().toString();
		jf.getContentPane().add(shiftBox);
		
		JLabel pass_lb = new JLabel("password");
		pass_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		pass_lb.setBounds(550, 102, 85, 15);
		jf.getContentPane().add(pass_lb);
		
		pass_txt = new JTextField();
		pass_txt.setColumns(10);
		pass_txt.setBounds(622, 99, 85, 20);
		jf.getContentPane().add(pass_txt);
		
		ProjectDatabase obj =new ProjectDatabase();
			    addBTN.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				obj.RepInsert(id_txt.getText(),pass_txt.getText(),Rep_fname.getText(),Rep_lname.getText(),Integer.parseInt(age_txt.getText()),value2,value0,textField_address.getText(),textField_city.getText(),ph_no.getText(),value1,cnic_txt.getText(),joining_date.getText(),value3);

			}
		});
	   
	}
}
