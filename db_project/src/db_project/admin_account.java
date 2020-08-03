package db_project;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import java.awt.Color;
public class admin_account
{   static JFrame jf=new JFrame("ADMIN_account");
    static JButton btn1=new JButton("patient details");
	static JButton btn2=new JButton("doctor details");
	static JButton btn3=new JButton("receptionist details");
	static JButton btn4=new JButton("appoinments");
	static JButton btn5=new JButton("Logout");
	static JLabel lb1=new JLabel("    Admin Portal");
	static ImageIcon img;
	static JLabel im;
	admin_account(){
	jf.setVisible(true);
    jf.setLayout(null);
    jf.setSize(700,400);
	jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
    //====================== set bounds ======================================
	lb1.setBounds(0,0,700,40); 
	btn1.setBounds(100,100,200,35);btn2.setBounds(330,100,200,35);
	btn3.setBounds(180,150,280,35);
	btn4.setBounds(200,200,230,35);
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
				new PT_details();
			}
		});
		jf.add(btn2);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new DOC_details();
			}
		});
		jf.add(btn3);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new REP_details();
			}
		});
		jf.add(btn4);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{   
             new appoinment1();
				
			}
		});
		jf.add(btn5);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				jf.dispose();
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




//===============================RECEPTIONISTS DETAILS SECTION ==========================================


class REP_details{
    
    static JFrame jf;
    static JButton btn1,btn2,btn3,btn4,btn5,close;
	static JLabel lb1;
	REP_details(){
	jf=new JFrame("RECEPTIONISTS_DETAILS");
	lb1 = new JLabel(" ABOUT RECEPTIONISTS");
	btn1=new JButton("INSERT");
	btn2=new JButton("DELETE");
	btn3=new JButton("UPDATE");
	btn4=new JButton("SEARCH");
	btn5=new JButton("SHOW");
	close=new JButton("CLOSE");
	jf.setVisible(true);
    jf.setLayout(null);
    jf.setSize(400,350);
	jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
    lb1.setBounds(0,0,500,40); 
	btn1.setBounds(120,60,150,30);btn2.setBounds(120,110,150,30);btn3.setBounds(120,160,150,30);btn4.setBounds(120,210,150,30);
	close.setBounds(200,260,100,25);btn5.setBounds(80,260,100,25);
	//designing
	
	lb1.setFont(new Font("Serif", Font.ITALIC,35));
	lb1.setOpaque(true);
	lb1.setBackground(new Color(51,153,255));
	lb1.setForeground(Color.WHITE);
	
	btn1.setFont(new Font("Serif", Font.ITALIC,20));
	btn1.setBackground(Color.WHITE);
	btn1.setForeground(new Color(51,153,255));
	
	btn2.setFont(new Font("Serif", Font.ITALIC,20));
	btn2.setBackground(Color.WHITE);
	btn2.setForeground(new Color(51,153,255)); 
	
	btn3.setFont(new Font("Serif", Font.ITALIC,20));
	btn3.setBackground(Color.WHITE);
	btn3.setForeground(new Color(51,153,255)); 
	
	btn4.setFont(new Font("Serif", Font.ITALIC,20));
	btn4.setBackground(Color.WHITE);
	btn4.setForeground(new Color(51,153,255)); 
     
	btn5.setFont(new Font("Serif", Font.ITALIC,20));
	btn5.setBackground(Color.WHITE);
	btn5.setForeground(new Color(51,153,255)); 
	 
	close.setFont(new Font("Serif", Font.ITALIC,20));
	close.setBackground(Color.WHITE);
	close.setForeground(new Color(51,153,255)); 

	jf.add(lb1);
	jf.add(btn1);
	btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new RepformInsert();
			}
		});
		jf.add(btn2);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				RepformDlt obj=new RepformDlt();
				obj.initialize();
			}
		});
		
		jf.add(btn3);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				RepformUpdate obj=new RepformUpdate();
				obj.initialize();
			}
		});
		jf.add(btn4);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				RepformSearch obj=	new RepformSearch();
				obj.initialize();
			}
		});
		jf.add(close);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				jf.dispose();
			}
		});
		jf.add(btn5);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new showRepdetails();
			}
		});
	jf.setLocationRelativeTo(null);
	jf.setResizable(false);
		
	}
}


//===========================================PATIENTS DETAILS SECTION==============================================

class PT_details{
    
    static JFrame jf;
    static JButton btn1,btn2,btn3,btn4,btn5,close;
	static JLabel lb1;
	PT_details(){
	jf=new JFrame("PATIENTS_DETAILS");
	lb1 = new JLabel(" ABOUT PATIENTS");
	btn1=new JButton("INSERT");
	btn2=new JButton("DELETE");
	btn3=new JButton("UPDATE");
	btn4=new JButton("SEARCH");
	btn5=new JButton("SHOW");
	close=new JButton("CLOSE");
	jf.setVisible(true);
    jf.setLayout(null);
    jf.setSize(400,350);
	jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
    lb1.setBounds(0,0,500,40); 
	btn1.setBounds(120,60,150,30);btn2.setBounds(120,110,150,30);btn3.setBounds(120,160,150,30);btn4.setBounds(120,210,150,30);
	close.setBounds(200,260,100,25);btn5.setBounds(80,260,100,25);
	//designing
	
	lb1.setFont(new Font("Serif", Font.ITALIC,35));
	lb1.setOpaque(true);
	lb1.setBackground(new Color(51,153,255));
	lb1.setForeground(Color.WHITE);
	
	btn1.setFont(new Font("Serif", Font.ITALIC,20));
	btn1.setBackground(Color.WHITE);
	btn1.setForeground(new Color(51,153,255));
	
	btn2.setFont(new Font("Serif", Font.ITALIC,20));
	btn2.setBackground(Color.WHITE);
	btn2.setForeground(new Color(51,153,255)); 
	
	btn3.setFont(new Font("Serif", Font.ITALIC,20));
	btn3.setBackground(Color.WHITE);
	btn3.setForeground(new Color(51,153,255)); 
	
	btn4.setFont(new Font("Serif", Font.ITALIC,20));
	btn4.setBackground(Color.WHITE);
	btn4.setForeground(new Color(51,153,255)); 
     
	btn5.setFont(new Font("Serif", Font.ITALIC,20));
	btn5.setBackground(Color.WHITE);
	btn5.setForeground(new Color(51,153,255));
	
	close.setFont(new Font("Serif", Font.ITALIC,20));
	close.setBackground(Color.WHITE);
	close.setForeground(new Color(51,153,255)); 

	jf.add(lb1);
	jf.add(btn1);
	btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new patientformInsert();
			
				
			}
		});
		jf.add(btn2);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				patientformDlt obj=new patientformDlt();
				obj.initialize();
			}
		});
		
		jf.add(btn3);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				patientformUpdate obj=new patientformUpdate();
				obj.initialize();
			}
		});
		jf.add(btn4);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{   
				Serach_patient obj=new Serach_patient();
				obj.initialize();
				
			}
		});
		jf.add(close);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				jf.dispose();
			}
		});
		jf.add(btn5);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new showPatientDetail();
			}
		});
	jf.setLocationRelativeTo(null);
	jf.setResizable(false);
		
	}
}








//===========================================DOCTORS DETAILS SECTION==============================================

class DOC_details{
    
    static JFrame jf;
    static JButton btn1,btn2,btn3,btn4,btn5,close;
	static JLabel lb1;
	DOC_details(){
	jf=new JFrame("DOCTORS_DETAILS");
	lb1 = new JLabel(" ABOUT DOCTORS");
	btn1=new JButton("INSERT");
	btn2=new JButton("DELETE");
	btn3=new JButton("UPDATE");
	btn4=new JButton("SEARCH");
	btn5=new JButton("SHOW");
	close=new JButton("CLOSE");
	jf.setVisible(true);
    jf.setLayout(null);
    jf.setSize(400,350);
	jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
    lb1.setBounds(0,0,500,40); 
	btn1.setBounds(120,60,150,30);btn2.setBounds(120,110,150,30);btn3.setBounds(120,160,150,30);btn4.setBounds(120,210,150,30);
	btn5.setBounds(80,260,100,25);close.setBounds(200,260,100,25);
	//designing
	
	lb1.setFont(new Font("Serif", Font.ITALIC,35));
	lb1.setOpaque(true);
	lb1.setBackground(new Color(51,153,255));
	lb1.setForeground(Color.WHITE);
	
	btn1.setFont(new Font("Serif", Font.ITALIC,20));
	btn1.setBackground(Color.WHITE);
	btn1.setForeground(new Color(51,153,255));
	
	btn2.setFont(new Font("Serif", Font.ITALIC,20));
	btn2.setBackground(Color.WHITE);
	btn2.setForeground(new Color(51,153,255)); 
	
	btn3.setFont(new Font("Serif", Font.ITALIC,20));
	btn3.setBackground(Color.WHITE);
	btn3.setForeground(new Color(51,153,255)); 
	
	btn4.setFont(new Font("Serif", Font.ITALIC,20));
	btn4.setBackground(Color.WHITE);
	btn4.setForeground(new Color(51,153,255)); 
     
	btn5.setFont(new Font("Serif", Font.ITALIC,20));
	btn5.setBackground(Color.WHITE);
	btn5.setForeground(new Color(51,153,255)); 
      
	close.setFont(new Font("Serif", Font.ITALIC,20));
	close.setBackground(Color.WHITE);
	close.setForeground(new Color(51,153,255)); 

	jf.add(lb1);
	jf.add(btn1);
	btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new doctorformInsert();
			}
		});
		jf.add(btn2);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				doctorformDlt obj=new doctorformDlt();
				obj.initialize();
			}
		});
		
		jf.add(btn3);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				doctorformUpdate obj=new doctorformUpdate();
				obj.initialize();
			}
		});
		jf.add(btn4);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				SearchDoctorDetails obj = new SearchDoctorDetails();
				obj.initialize();
			}
		});
		jf.add(close);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				jf.dispose();
			}
		});
		jf.add(btn5);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new showDocDetails();
			}
		});
	jf.setLocationRelativeTo(null);
	jf.setResizable(false);
		
	}
}