package db_project;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class doctorformInsert {

	public JFrame jf;
	public JTextField DOC_fname;
	public JTextField DOC_lname;
	public JTextField ID_txt;
	public JTextField age_txt;
	public JTextField textField_city;
	public JTextField textField_address;
	public JTextField ph_no;
	public JTextField cnic_txt;
	public JTextField textField_joining;
	private JTextField pass_txt;
	/**
	 * @wbp.nonvisual location=171,-31
	 */
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new doctorformInsert();
	}

	/**
	 * Create the application.
	 */
	public doctorformInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		jf = new JFrame();
		jf.setTitle("add doctors data");
		jf.setBounds(100, 100, 782, 489);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		JLabel Fname_lb = new JLabel("First name");
		Fname_lb.setBounds(10, 101, 85, 15);
		Fname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(Fname_lb);
		
		JLabel heading_lb = new JLabel("    ADD DOCTOR");
		heading_lb.setBounds(0, 0, 429, 24);
		heading_lb.setForeground(new Color(0, 0, 128));
		heading_lb.setBackground(new Color(30, 144, 255));
		heading_lb.setFont(new Font("Tahoma", Font.BOLD, 17));
		jf.getContentPane().add(heading_lb);
		
		DOC_fname = new JTextField();
		DOC_fname.setBounds(80, 99, 170, 20);
		jf.getContentPane().add(DOC_fname);
		DOC_fname.setColumns(10);
		
		JLabel lname_lb = new JLabel("Last name");
		lname_lb.setBounds(284, 101, 85, 15);
		lname_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(lname_lb);
		
		DOC_lname = new JTextField();
		DOC_lname.setBounds(362, 99, 170, 20);
		DOC_lname.setColumns(10);
		jf.getContentPane().add(DOC_lname);
		
		ID_txt = new JTextField();
		ID_txt.setToolTipText("DOC----");
		ID_txt.setBounds(97, 58, 85, 20);
		ID_txt.setColumns(10);
		jf.getContentPane().add(ID_txt);
		
		JLabel pID_lb = new JLabel("Doctor id");
		pID_lb.setBounds(10, 60, 85, 15);
		pID_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(pID_lb);
		
		age_txt = new JTextField();
		age_txt.setToolTipText("in numbers only");
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
		ph_no.setToolTipText("0300-1234213");
		ph_no.setBounds(286, 225, 154, 20);
		ph_no.setColumns(10);
		jf.getContentPane().add(ph_no);
		
		cnic_txt = new JTextField();
		cnic_txt.setToolTipText("4523-1123456-0");
		cnic_txt.setBounds(55, 225, 123, 20);
		cnic_txt.setColumns(10);
		jf.getContentPane().add(cnic_txt);
		
		JLabel sepcialization_lb = new JLabel("Field of Specilization");
		sepcialization_lb.setBounds(10, 269, 142, 15);
		sepcialization_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(sepcialization_lb);
		
		JComboBox<String> DOC_sepcilization = new JComboBox<String>();
		DOC_sepcilization.setModel(new DefaultComboBoxModel<String>(new String[] {"cardiovascular", "psoriasis", "neuro", "gyne", "psychic"}));
		DOC_sepcilization.setBounds(178, 266, 144, 22);
		DOC_sepcilization.setToolTipText("");
		DOC_sepcilization.setMaximumRowCount(5);
		DOC_sepcilization.setEditable(true);
		jf.getContentPane().add(DOC_sepcilization);
		String value2=DOC_sepcilization.getSelectedItem().toString();
		
		JLabel joining_lb = new JLabel("Joining date");
		joining_lb.setBounds(10, 312, 106, 15);
		joining_lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		jf.getContentPane().add(joining_lb);
		
		textField_joining = new JTextField();
		textField_joining.setToolTipText("YYYY-MM-DD");
		textField_joining.setBounds(97, 310, 123, 20);
		textField_joining.setColumns(10);
		jf.getContentPane().add(textField_joining);
		
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
		addBTN.setBounds(375, 296, 179, 43);
		jf.getContentPane().add(addBTN);
		
		ProjectDatabase obj =new ProjectDatabase();
		
		addBTN.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				obj.DocInsert(ID_txt.getText(),pass_txt.getText(),DOC_fname.getText(),DOC_lname.getText(),Integer.parseInt(age_txt.getText()),value2,value0,textField_address.getText(),textField_city.getText(),ph_no.getText(),value1,cnic_txt.getText(),textField_joining.getText());

			}
		});
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBackground(new Color(240, 240, 240));
		btnLogout.setForeground(new Color(0, 0, 128));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBounds(630, 0, 136, 30);
		jf.getContentPane().add(btnLogout);
		
		btnLogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				
			}
		});
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(542, 102, 85, 15);
		jf.getContentPane().add(lblPassword);
		
		pass_txt = new JTextField();
		pass_txt.setColumns(10);
		pass_txt.setBounds(616, 99, 85, 20);
		jf.getContentPane().add(pass_txt);
	}
}
