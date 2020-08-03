package db_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class appoinment2 {

	private JFrame jf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new appoinment2();
	}

	/**
	 * Create the application.
	 */
	public appoinment2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jf = new JFrame();
		jf.setTitle("APPOINMENT WINDOW");
		jf.setBounds(100, 100, 450, 300);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("         APPOINMENTS");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 324, 32);
		jf.getContentPane().add(lblNewLabel);
		
		JButton btnSet = new JButton("   SET APPOINMENT");
		btnSet.setForeground(new Color(0, 0, 205));
		btnSet.setFont(new Font("Sylfaen", Font.BOLD, 15));
		btnSet.setBounds(101, 64, 203, 32);
		jf.getContentPane().add(btnSet); 
		
		JButton btnCheck = new JButton("show appoinments");
		btnCheck.setForeground(new Color(0, 0, 205));
		btnCheck.setFont(new Font("Sylfaen", Font.BOLD, 15));
		btnCheck.setBounds(125, 107, 157, 42);
		jf.getContentPane().add(btnCheck);
		
		JButton btnclose = new JButton("CLOSE");
		btnclose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnclose.setForeground(new Color(0, 0, 128));
		btnclose.setBounds(39, 208, 89, 23);
		jf.getContentPane().add(btnclose);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.setBounds(324, 0, 110, 23);
		jf.getContentPane().add(btnLogout);
		
		
		btnclose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				jf.dispose();
			}
		});

		btnCheck.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new showApp();
			}
		});
		btnSet.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				rep_DocApp obj= new rep_DocApp();
				obj.initialize();
			}
		});
	}
}
