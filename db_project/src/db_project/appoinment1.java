package db_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class appoinment1 {

	private JFrame jf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new appoinment1();
	}

	/**
	 * Create the application.
	 */
	public appoinment1() {
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
		btnSet.setForeground(Color.BLUE);
		btnSet.setFont(new Font("Sylfaen", Font.BOLD, 14));
		btnSet.setBounds(87, 88, 204, 32);
		jf.getContentPane().add(btnSet); 
		
		JButton btnCheck = new JButton("show appoinments");
		btnCheck.setForeground(Color.BLUE);
		btnCheck.setFont(new Font("Sylfaen", Font.BOLD, 15));
		btnCheck.setBounds(114, 131, 157, 32);
		jf.getContentPane().add(btnCheck);
		
		JButton btnclose = new JButton("CLOSE");
		btnclose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnclose.setForeground(new Color(0, 0, 128));
		btnclose.setBounds(39, 208, 89, 23);
		jf.getContentPane().add(btnclose);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.setForeground(new Color(0, 0, 128));
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
				admin_DocAp obj= new admin_DocAp();
				obj.initialize();
			}
		});
	}
}
