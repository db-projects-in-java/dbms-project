package db_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class changePass {

	private static JFrame jf;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new changePass();
	}

	/**
	 * Create the application.
	 */
	public changePass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jf = new JFrame();
		jf.setTitle("CHANGE PASSWORD");
		jf.setBounds(100, 100, 656, 336);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		JLabel LB1 = new JLabel("SET NEW PASSWORD");
		LB1.setForeground(new Color(0, 0, 128));
		LB1.setFont(new Font("Tahoma", Font.BOLD, 17));
		LB1.setBounds(30, 11, 283, 27);
		jf.getContentPane().add(LB1);
		
		JLabel oldpassLB = new JLabel("Enter Old password");
		oldpassLB.setFont(new Font("Tahoma", Font.BOLD, 15));
		oldpassLB.setBounds(10, 49, 155, 21);
		jf.getContentPane().add(oldpassLB);
		
		JLabel lblEnterNewPassword = new JLabel("Enter New Password");
		lblEnterNewPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterNewPassword.setBounds(10, 100, 155, 21);
		jf.getContentPane().add(lblEnterNewPassword);
		
		JLabel lblConfirmPass = new JLabel("Confirm  New Password");
		lblConfirmPass.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConfirmPass.setBounds(10, 152, 183, 21);
		jf.getContentPane().add(lblConfirmPass);
		
		textField = new JTextField();
		textField.setBounds(175, 45, 256, 32);
		jf.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(185, 96, 256, 32);
		jf.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(216, 148, 256, 32);
		jf.getContentPane().add(textField_2);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		Cancel.setBounds(126, 231, 126, 27);
		jf.getContentPane().add(Cancel);
		Cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 jf.dispose();
				 
			}
		});
		ProjectDatabase obj=new ProjectDatabase();
		
		JButton btnSet = new JButton("Set");
		btnSet.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSet.setBounds(287, 231, 126, 27);
		jf.getContentPane().add(btnSet);
		btnSet.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				  if(textField.getText().equals(""))
					 {
					  JOptionPane.showMessageDialog(null,"plz enter value first");
					 } 
				else {
					obj.RepChangePass(textField.getText(),textField_1.getText(),textField_2.getText());

				}
				 
			}
		});
		
	}

}
