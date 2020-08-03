package db_project;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import java.awt.Color;
public class receptionist_account
{   static JFrame jf=new JFrame("receptionist_account");
    static JButton btn1=new JButton("Profile");
	static JButton btn2=new JButton("Patient details");
	static JButton btn3=new JButton("appoinments");
	static JButton btn4=new JButton("change pass");
	static JButton btn5=new JButton("Logout");
	static JLabel lb1=new JLabel("    Receptionist Portal");
	static ImageIcon img;
	static JLabel im;
	receptionist_account(){
	jf.setVisible(true);
    jf.setLayout(null);
    jf.setSize(700,500);
	jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
    //====================== set bounds ======================================
	lb1.setBounds(0,0,700,40); 
	btn1.setBounds(330,100,200,35);
	btn2.setBounds(330,200,200,35);
	btn3.setBounds(330,300,200,35);
	btn4.setBounds(320,400,230,35);
	btn5.setBounds(450,15,130,25);
	//====================== design background ================================
	
	//*********for background image************
	ImageIcon img= new ImageIcon("102400355-health-care-system-diagram-with-health-check-and-symptom-on-vr-dashboard-healthcare-costs-and-fees-c.jpg");
    im=new JLabel("",img,JLabel.CENTER);
	im.setBounds(0,0,690,500);
	//*********for label designs***************
	lb1.setFont(new Font("Serif", Font.ITALIC,45));
	lb1.setOpaque(true);
	lb1.setBackground(new Color(51,153,255));
	lb1.setForeground(Color.WHITE);

	//*********for buttons design*************
	btn1.setFont(new Font("Serif", Font.ITALIC,25));
	btn1.setBackground(Color.WHITE);
	btn1.setForeground(new Color(51,153,255));
	
	btn2.setFont(new Font("Serif", Font.ITALIC,25));
	btn2.setBackground(Color.WHITE);
	btn2.setForeground(new Color(51,153,255)); 
	
	btn3.setFont(new Font("Serif",Font.ITALIC,25));
	btn3.setBackground(Color.WHITE);
	btn3.setForeground(new Color(51,153,255));
	
	btn4.setFont(new Font("Serif",Font.ITALIC,25));
	btn4.setBackground(Color.WHITE);
	btn4.setForeground(new Color(51,153,255));
	
	btn5.setFont(new Font("Serif", Font.ITALIC,20));
	btn5.setBackground(Color.WHITE);
	btn5.setForeground(new Color(51,153,255));
	//add components
	    jf.add(btn1);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				updateREPprofile obj=new updateREPprofile();
				obj.initialize();
			}
		});
		jf.add(btn2);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new PT_details();
			}
		});
		jf.add(btn3);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 new appoinment2();
			}
		});
		jf.add(btn4);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new changePass();
			}
		});
		jf.add(btn5);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				
			}
		});
		jf.add(lb1);
		jf.add(im);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);	
	}
	public static void main(String args[])
	{
		
	}
}
