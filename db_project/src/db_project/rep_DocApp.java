package db_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rep_DocApp {

	public static JFrame jf;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField result1;
	public static JTextField result2;
	private JTextField appno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	public rep_DocApp() {
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		jf = new JFrame();
		jf.setTitle("set appoinments");
		jf.setBounds(100, 100, 597, 353);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		
		JLabel lb1 = new JLabel("SET APPOINMENTS ");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb1.setBounds(146, 11, 208, 25);
		jf.getContentPane().add(lb1);
		
		JLabel lblNewLabel = new JLabel("Enter Patient id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 132, 125, 19);
		jf.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 132, 144, 20);
		jf.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterDoctorId = new JLabel("Enter Doctor id");
		lblEnterDoctorId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDoctorId.setBounds(10, 166, 125, 19);
		jf.getContentPane().add(lblEnterDoctorId);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 166, 144, 20);
		jf.getContentPane().add(textField_2);
		
		JButton check1 = new JButton("check");
		check1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		check1.setBounds(293, 131, 89, 23);
		jf.getContentPane().add(check1);
		
		JButton check2 = new JButton("check");
		check2.setBounds(293, 165, 89, 23);
		jf.getContentPane().add(check2);
		
		JLabel lblNewLabel_1 = new JLabel("Disease/Specialization");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(394, 97, 166, 19);
		jf.getContentPane().add(lblNewLabel_1);
		
		result1 = new JTextField();
		result1.setColumns(10);
		result1.setBounds(393, 135, 167, 20);
		jf.getContentPane().add(result1);
		
		result2 = new JTextField();
		result2.setColumns(10);
		result2.setBounds(392, 166, 167, 20);
		jf.getContentPane().add(result2);
		
		JLabel lblNewLabel_2 = new JLabel("you can not set appoinments with different disease and  specialization");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(32, 212, 443, 14);
		jf.getContentPane().add(lblNewLabel_2);
		
		JButton setBtn = new JButton("SET");
		setBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		setBtn.setBounds(214, 252, 89, 23);
		jf.getContentPane().add(setBtn);
		
		
		JButton btnClose = new JButton("close");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClose.setBounds(44, 252, 89, 23);
		jf.getContentPane().add(btnClose);
		
		JLabel lblAppoinmentNumber = new JLabel("appoinment number");
		lblAppoinmentNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAppoinmentNumber.setBounds(21, 52, 166, 19);
		jf.getContentPane().add(lblAppoinmentNumber);
		
		appno = new JTextField();
		appno.setColumns(10);
		appno.setBounds(184, 53, 144, 20);
		jf.getContentPane().add(appno);
		
		ProjectDatabase obj=new ProjectDatabase();
		 
		btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				jf.dispose();
			}
		});
		
		
		check1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				obj.setAppoinment_rep1(textField_1.getText());
			}
		});
		
		check2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				obj.setAppoinment_rep2(textField_2.getText());
			}
		});
		setBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				obj.setAppoinment2(textField_1.getText(),textField_2.getText(),Integer.parseInt(appno.getText()));
			}
		});
	}
}
