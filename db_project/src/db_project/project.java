package db_project;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
public class project
{   
	project(){}
	public static void main(String args[])
	{
		new window1();
	}
}
//===============================================first-window=====================================================
class window1
{   static JFrame jf=new JFrame("H=S=M");
    static JButton btn1=new JButton("Admin");
	static JButton btn2=new JButton("Receptionist");
	static JButton btn3=new JButton("Doctor");
	static JLabel lb1=new JLabel("    Hospital Managment System ");
	static JLabel lb2=new JLabel("  LOGIN AS");
	static ImageIcon img;
	static JLabel im;
	
	window1(){
	jf.setVisible(true);
    jf.setLayout(null);
    jf.setSize(700,500);
	jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
    //*====================== set bounds ======================================
	lb1.setBounds(0,100,700,50); lb2.setBounds(240,170,135,30);
	btn1.setBounds(50,350,150,50);
	btn2.setBounds(230,350,170,50);
	btn3.setBounds(430,350,150,50);
	
	//====================== design background ================================
	
	//*********for background image************
	img= new ImageIcon("hospital-management1.jpg");
    im=new JLabel("",img,JLabel.CENTER);
	im.setBounds(0,0,690,500);
	//*********for label designs***************
	lb1.setFont(new Font("Serif", Font.ITALIC,45));
	lb1.setOpaque(true);
	lb1.setBackground(new Color(51,153,255));
	lb1.setForeground(Color.WHITE);
	
	lb2.setFont(new Font("Serif", Font.ITALIC,25));
	lb2.setOpaque(true);
	lb2.setBackground(Color.WHITE);
	lb2.setForeground(new Color(51,153,255));
	//*********for buttons design*************
	btn1.setFont(new Font("Serif", Font.BOLD,25));
	btn1.setContentAreaFilled(false);
	btn1.setBackground(Color.WHITE);
	btn1.setForeground(new Color(51,153,255));
	
	btn2.setFont(new Font("Serif", Font.BOLD,25));
	btn2.setContentAreaFilled(false);
	btn2.setBackground(Color.WHITE);
	btn2.setForeground(new Color(51,153,255)); 
	
	btn3.setFont(new Font("Serif", Font.BOLD,25));
	btn3.setContentAreaFilled(false);
	btn3.setBackground(Color.WHITE);
	btn3.setForeground(new Color(51,153,255));
	//add components
	    jf.add(btn1);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new admin();
			}
		});
		jf.add(btn2);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new receptionist();
			}
		});
		jf.add(btn3);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				new doctor();
			}
		});
		jf.add(lb1);
		jf.add(lb2);
		jf.add(im);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);		
	}
}

//*****************************************login receptionist_window********************************************


class receptionist
{   private static JFrame frame;
    private static JTextField textField;
    private static  JTextField textField_1;
	receptionist(){
	
		frame = new JFrame("LOGIN WINDOW");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		JLabel lb1 = new JLabel("     LOGIN HERE");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb1.setBounds(0, 0, 269, 23);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Receptionist login panel");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb2.setForeground(new Color(0, 0, 128));
		lb2.setBounds(113, 23, 233, 23);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("Enter ID");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb3.setForeground(new Color(0, 0, 0));
		lb3.setBounds(26, 80, 120, 23);
		frame.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("Enter Password");
		lb4.setForeground(Color.BLACK);
		lb4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb4.setBounds(26, 121, 120, 23);
		frame.getContentPane().add(lb4);
		
		textField = new JTextField();
		textField.setBounds(128, 80, 233, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 121, 233, 23);
		frame.getContentPane().add(textField_1);
		
	   
	   
		JButton loginBTN = new JButton("Login");
		loginBTN.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginBTN.setForeground(new Color(0, 0, 0));
		loginBTN.setBounds(164, 171, 89, 23);
		frame.getContentPane().add(loginBTN);
		ProjectDatabase obj =new ProjectDatabase(); 
		loginBTN.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{  
				obj.show_profile1(textField.getText(),textField_1.getText());
				frame.dispose();
			}
		});
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(276, 171, 89, 23);
		frame.getContentPane().add(btnCancel);
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
			}
		});
		
		
		
	}
}

//****************************************login admin_window***************************************************

class admin
{
	private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
	admin(){
	
		frame = new JFrame("LOGIN WINDOW");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		JLabel lb1 = new JLabel("     LOGIN HERE");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb1.setBounds(0, 0, 269, 23);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Admin login panel");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb2.setForeground(new Color(0, 0, 128));
		lb2.setBounds(113, 23, 233, 23);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("Enter ID");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb3.setForeground(new Color(0, 0, 0));
		lb3.setBounds(26, 80, 120, 23);
		frame.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("Enter Password");
		lb4.setForeground(Color.BLACK);
		lb4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb4.setBounds(26, 121, 120, 23);
		frame.getContentPane().add(lb4);
		
		textField = new JTextField();
		textField.setBounds(128, 80, 233, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(8);
		textField_1.setColumns(10);
		textField_1.setBounds(152, 121, 233, 23);
		frame.getContentPane().add(textField_1);
		
		
		JButton loginBTN = new JButton("Login");
		loginBTN.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginBTN.setForeground(new Color(0, 0, 0));
		loginBTN.setBounds(164, 171, 89, 23);
		frame.getContentPane().add(loginBTN);
		loginBTN.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{   if((textField.getText().equals("alpha"))&&(textField_1.getText().equals("11099")))
				{
				new admin_account();
				frame.dispose();
				}
				else{
					JOptionPane.showMessageDialog(null,"incorrect id and pass","login error",JOptionPane.ERROR_MESSAGE);
				}
			
			}
		});
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(276, 171, 89, 23);
		frame.getContentPane().add(btnCancel);
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
			}
		});
		
		

	}
}
//****************************************login doctor_window***************************************************

class doctor
{
	private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
	doctor(){
	
		frame = new JFrame("LOGIN WINDOW");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		JLabel lb1 = new JLabel("     LOGIN HERE");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb1.setBounds(0, 0, 269, 23);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Doctor login panel");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb2.setForeground(new Color(0, 0, 128));
		lb2.setBounds(113, 23, 233, 23);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("Enter ID");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb3.setForeground(new Color(0, 0, 0));
		lb3.setBounds(26, 80, 120, 23);
		frame.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("Enter Password");
		lb4.setForeground(Color.BLACK);
		lb4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb4.setBounds(26, 121, 120, 23);
		frame.getContentPane().add(lb4);
		
		textField = new JTextField();
		textField.setBounds(128, 80, 233, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 121, 233, 23);
		frame.getContentPane().add(textField_1);
		
		
		ProjectDatabase obj =new ProjectDatabase();
		
		
		
		JButton loginBTN = new JButton("Login");
		loginBTN.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginBTN.setForeground(new Color(0, 0, 0));
		loginBTN.setBounds(164, 171, 89, 23);
		frame.getContentPane().add(loginBTN);
		loginBTN.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{  
				obj.show_profile2(textField.getText(),textField_1.getText());
				frame.dispose();
			}
		});
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(276, 171, 89, 23);
		frame.getContentPane().add(btnCancel);
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
			}
		});
		
		
	}

}