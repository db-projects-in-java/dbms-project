package db_project;
import static db_project.RepformDlt.M_status;
import static db_project.RepformDlt.Rep_fname;
import static db_project.RepformDlt.Rep_lname;
import static db_project.RepformDlt.age_txt;
import static db_project.RepformDlt.cnic_txt;
import static db_project.RepformDlt.gender_box;
import static db_project.RepformDlt.ph_no;
import static db_project.RepformDlt.qualiBox;
import static db_project.RepformDlt.shiftBox;
import static db_project.RepformDlt.textField_address;
import static db_project.RepformDlt.textField_admit;
import static db_project.RepformDlt.textField_city;

import java.sql.*;

import javax.swing.JOptionPane;
public class ProjectDatabase {
	static Connection con=null;
	static PreparedStatement ps=null;
	static Statement st=null;
	static ResultSet rs=null;
	static boolean isTrue=false;
	static String p1,p2;
    static String ap1,ap2;
	
	ProjectDatabase(){}

	public void show_profile1(String id,String pass)
	{   try{
		System.out.println(id);System.out.println(pass);
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM reception");
		
		
		while(rs.next()) {
			
			if((rs.getString(1).equals(id))&&(rs.getString(14).equals(pass)))
			{ 
			p1=rs.getString(1);
			new receptionist_account();
			JOptionPane.showMessageDialog(null,"Succesfully opened");
			isTrue=true;
			break;}
			
		}
		if(!isTrue)
		{
			JOptionPane.showMessageDialog(null,"incorrect id and pass","login error",JOptionPane.ERROR_MESSAGE);
		}
		
		}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
		
	}
	}
	
	public void show_profile2(String id,String pass)
	{   try{
		System.out.println(id);System.out.println(pass);
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Doctors");
		
		
        while(rs.next()) {
			
			if((rs.getString(1).equals(id))&&(rs.getString(13).equals(pass)))
			{
			p2=rs.getString(1);	
			new doctor_account();
			JOptionPane.showMessageDialog(null,"Succesfully opened");
			isTrue=true;
			break;}
			
		}
		if(!isTrue)
		{
			JOptionPane.showMessageDialog(null,"incorrect id and pass","login error",JOptionPane.ERROR_MESSAGE);
		}
		}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
		
	}
	}
	
//==============================================================REcePTIONIST PROFILE ==============================================================================
	public void RepUpdateSearchProfile()
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Reception");  updateREPprofile obj=new updateREPprofile();
        while(rs.next())
        {
        	if((rs.getString(1).equals(p1)))
    		{
        	obj.ID_txt.setText(rs.getString(1));
        	obj.Rep_fname.setText(rs.getString(2));
    		obj.Rep_lname.setText(rs.getString(3));
    		obj.age_txt.setText(rs.getString(4));
    		obj.textField_city.setText(rs.getString(8));
    		obj.textField_address.setText(rs.getString(7));
    		obj.ph_no.setText(rs.getString(9));
    		obj.cnic_txt.setText(rs.getString(11));
    		obj.textField_admit.setText(rs.getString(12));
    		obj.qualiBox.setSelectedItem(rs.getString(5));
    		obj.M_status.setSelectedItem(rs.getString(10));
    		obj.gender_box.setSelectedItem(rs.getString(8));
    		obj.shiftBox.setSelectedItem(rs.getString(13));
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
	
	//======================================================Doctors profile ================================================================================
	public void DocUpdateSearchProfile()
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Doctors");  updateDOCprofile obj=new updateDOCprofile();
        while(rs.next())
        {
        	if((rs.getString(1).equals(p2)))
    		{   
        		obj.ID_txt.setText(rs.getString(1));
        		obj.Doc_fname.setText(rs.getString(2));
        		obj.Doc_lname.setText(rs.getString(3));
        		obj.age_txt.setText(rs.getString(4));
        		obj.textField_city.setText(rs.getString(5));
        		obj.textField_address.setText(rs.getString(6));
        		obj.ph_no.setText(rs.getString(9));
        		obj.cnic_txt.setText(rs.getString(11));
        		obj.textField_admit.setText(rs.getString(12));
        		obj.typebox.setSelectedItem(rs.getString(5));
        		obj.M_status.setSelectedItem(rs.getString(10));
        		obj.gender_box.setSelectedItem(rs.getString(6));
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
// ================================================change REceptionist pass ===============================================================================================
	public void RepChangePass(String Oldpass,String newPass,String checkPass ) {
		String id = null,fname = null,lname = null,quali = null,gender = null,address = null,city=null,ph_no=null,M_status=null,cnic=null,joining_date=null,status=null;
	    int age = 0;
		try {Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM reception");
          while(rs.next()) {
			
			if((rs.getString(14).equals(Oldpass))&&(rs.getString(1).equals(p1)))
			{ 
				isTrue=true;
				id=rs.getString(1);
				fname=rs.getString(2);
	    		lname=rs.getString(3);
	    		age=rs.getInt(4);
	    		quali=rs.getString(5);
	    		gender=rs.getString(6);
	    		address=rs.getString(7);
	    	    city=rs.getString(8);
	    		ph_no=rs.getString(9);
	    		M_status=rs.getString(10);
	    		cnic=rs.getString(11);
	    		joining_date=rs.getString(12);
	    		status=rs.getString(13);
			
			break;}
			
		}
         if(rs.getString(14).equals(Oldpass)&&(isTrue)) {
        	if(newPass.equals(checkPass))
        	{
        		 ps=con.prepareStatement("Update Reception set REP_FIRST_NAME=?, REP_LAST_NAME=?,REP_AGE=?,REP_QUALIFICATION=?,REP_GENDER=?,REP_ADDRESS=?,REP_CITY=?,REP_NUM=?,REP_CNIC=?,REP_M_STATUS=?,REP_JOINING_DATE=?,REP_SHIFT=?,REP_PASS=? where REP_ID=?");

        	ps.setString(1,id);
     		ps.setString(2,fname);
     		ps.setString(3,lname);
     		ps.setInt(4,age);
     		ps.setString(5,quali);
     		ps.setString(6,gender);
     		ps.setString(7,address);
     		ps.setString(8,city);
     		ps.setString(9,ph_no);
     		ps.setString(10,M_status);
     		ps.setString(11,cnic);
     		ps.setString(12,joining_date);
     		ps.setString(13,status);
     		ps.setString(14,newPass);
     		ps.executeUpdate();
     		JOptionPane.showMessageDialog(null,"Succesfully change");
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null,"incorrect Confirm Pass");
        	}
         }
         else {
        	 JOptionPane.showMessageDialog(null,"Incorrect Pass");
         }
        
		
		
		}catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());}
	}
//---------------------------------------------------------Doc pass change ---------------------------------------------------------------------------------------
	
	
	public void DocChangePass(String Oldpass,String newPass,String checkPass ) {
		String id = null,fname = null,lname = null,Specialization = null,gender = null,address = null,city=null,ph_no=null,M_status=null,cnic=null,joining_date=null;
	    int age = 0;
		try {Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM doctors");
          while(rs.next()) {
			
			if((rs.getString(13).equals(Oldpass))&&(rs.getString(1).equals(p2)))
			{ 
				isTrue=true;
				id=rs.getString(1);
				fname=rs.getString(2);
	    		lname=rs.getString(3);
	    		age=rs.getInt(4);
	    		Specialization=rs.getString(5);
	    		gender=rs.getString(6);
	    		address=rs.getString(7);
	    	    city=rs.getString(8);
	    		ph_no=rs.getString(9);
	    		M_status=rs.getString(10);
	    		cnic=rs.getString(11);
	    		joining_date=rs.getString(12);
	    		
			
			break;}
			
		}
         if(rs.getString(13).equals(Oldpass)&&(isTrue)) {
        	if(newPass.equals(checkPass))
        	{
        		 ps=con.prepareStatement("Update Doctors set DOC_FIRST_NAME=?,DOC_LAST_NAME=?,DOC_AGE=?,DOC_SPECIALIZATION=?,DOC_GENDER=?,DOC_ADDRESS=?,DOC_CITY=?,DOC_NUM=?,DOC_M_STATUS=?,DOC_CNIC=?,DOC_JOINING_DATE=?,DOC_PASS=? where DOC_ID=?");

        	ps.setString(1,id);
     		ps.setString(2,fname);
     		ps.setString(3,lname);
     		ps.setInt(4,age);
     		ps.setString(5,Specialization);
     		ps.setString(6,gender);
     		ps.setString(7,address);
     		ps.setString(8,city);
     		ps.setString(9,ph_no);
     		ps.setString(10,M_status);
     		ps.setString(11,cnic);
     		ps.setString(12,joining_date);
     		
     		ps.setString(13,newPass);
     		ps.executeUpdate();
     		JOptionPane.showMessageDialog(null,"Succesfully change");
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null,"incorrect Confirm Pass");
        	}
         }
         else {
        	 JOptionPane.showMessageDialog(null,"Incorrect Pass");
         }
        
		
		
		}catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());}
	}

	

	

	// ================================RECEPTionist INSERT===========================================================================================================================
	
	
	public void RepInsert(String id,String pass,String fname,String lname,int age,String quali,String gender,String address,String city,String ph_no, String M_status,String cnic,String joining_date,String status)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Reception");
        while(rs.next())
        {
        	if((rs.getString(9).equals(ph_no)))
    		{
        		JOptionPane.showMessageDialog(null,"you entered duplicate Phone_num","Error",JOptionPane.INFORMATION_MESSAGE);
        		isTrue=true;
        		break;}
        	if((rs.getString(11).equals(cnic)))
    		{
        		JOptionPane.showMessageDialog(null,"you entered duplicate Cnic","Error",JOptionPane.INFORMATION_MESSAGE);
        		isTrue=true;
        		break;}
        	
        }
        if(!isTrue) {
        String sql="INSERT INTO reception"
    			+"(REP_ID, REP_FIRST_NAME, REP_LAST_NAME,REP_AGE,REP_QUALIFICATION,REP_GENDER,REP_ADDRESS,REP_CITY,REP_NUM,REP_CNIC,REP_M_STATUS,REP_JOINING_DATE,REP_SHIFT,REP_PASS)"
    			+" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    			ps=con.prepareStatement(sql);
    			
   
    			ps.setString(1,id);
    			ps.setString(2,fname);
    			ps.setString(3,lname);
    			ps.setInt(4,age);
    			ps.setString(5,quali);
    			ps.setString(6,gender);
    			ps.setString(7,address);
    			ps.setString(8,city);
    			ps.setString(9,ph_no);
    			ps.setString(10,M_status);
    			ps.setString(11,cnic);
    			ps.setString(12,joining_date);
    			ps.setString(13,status);
    			ps.setString(14,pass);
    			ps.executeUpdate();
    			
    		
    			JOptionPane.showMessageDialog(null,"Succesfully inserted");}
		
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
//==============================SEARCH dlt RECEPTIONIST ========================================================================================================
	
	public void RepDLTSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Reception"); 
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        	Rep_fname.setText(rs.getString(2));
    		Rep_lname.setText(rs.getString(3));
    		age_txt.setText(rs.getString(4));
    		textField_city.setText(rs.getString(8));
    		textField_address.setText(rs.getString(7));
    		ph_no.setText(rs.getString(9));
    		cnic_txt.setText(rs.getString(11));
    		textField_admit.setText(rs.getString(12));
    		qualiBox.setSelectedItem(rs.getString(5));
    		M_status.setSelectedItem(rs.getString(10));
    		gender_box.setSelectedItem(rs.getString(6));
    		shiftBox.setSelectedItem(rs.getString(13));
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
//========================================================================dlt receptionist===================================================	
	public void RepRemove(String id) {
		try {Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        ps=con.prepareStatement("DELETE FROM Reception where REP_ID=?");
		ps.setString(1,id);
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null,"Succesfully Removed");
		}catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());}
	}
	
	

//==========================================================update dlt receptionist========================================================================================================================	

	public void RepUpdateSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Reception");  RepformUpdate obj=new RepformUpdate();
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        	obj.Rep_fname.setText(rs.getString(2));
    		obj.Rep_lname.setText(rs.getString(3));
    		obj.age_txt.setText(rs.getString(4));
    		obj.textField_city.setText(rs.getString(8));
    		obj.textField_address.setText(rs.getString(7));
    		obj.ph_no.setText(rs.getString(9));
    		obj.cnic_txt.setText(rs.getString(11));
    		obj.textField_admit.setText(rs.getString(12));
    		obj.qualiBox.setSelectedItem(rs.getString(5));
    		obj.M_status.setSelectedItem(rs.getString(10));
    		obj.gender_box.setSelectedItem(rs.getString(8));
    		obj.shiftBox.setSelectedItem(rs.getString(13));
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
	public void RepUpdate(String id,String fname,String lname,int age,String quali,String gender,String address,String city,String ph_no, String M_status,String cnic,String joining_date,String status) {
		try {Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        
       
        ps=con.prepareStatement("Update Reception set REP_FIRST_NAME=?, REP_LAST_NAME=?,REP_AGE=?,REP_QUALIFICATION=?,REP_GENDER=?,REP_ADDRESS=?,REP_CITY=?,REP_NUM=?,REP_CNIC=?,REP_M_STATUS=?,REP_JOINING_DATE=?,REP_SHIFT=? where REP_ID=?");

		
        ps.setString(1,id);
		ps.setString(2,fname);
		ps.setString(3,lname);
		ps.setInt(4,age);
		ps.setString(5,quali);
		ps.setString(6,gender);
		ps.setString(7,address);
		ps.setString(8,city);
		ps.setString(9,ph_no);
		ps.setString(10,M_status);
		ps.setString(11,cnic);
		ps.setString(12,joining_date);
		ps.setString(13,status);
		
		 ps.executeUpdate();
		
		JOptionPane.showMessageDialog(null,"Succesfully Update");
		}catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());}
	}

//=================================Search receptionists data==============================================================================================
	public void RepSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Reception");  RepformSearch obj=new RepformSearch();
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        	obj.Rep_fname.setText(rs.getString(2));
    		obj.Rep_lname.setText(rs.getString(3));
    		obj.age_txt.setText(rs.getString(4));
    		obj.textField_city.setText(rs.getString(8));
    		obj.textField_address.setText(rs.getString(7));
    		obj.ph_no.setText(rs.getString(9));
    		obj.cnic_txt.setText(rs.getString(11));
    		obj.textField_admit.setText(rs.getString(12));
    		obj.qualiBox.setSelectedItem(rs.getString(5));
    		obj.M_status.setSelectedItem(rs.getString(10));
    		obj.gender_box.setSelectedItem(rs.getString(6));
    		obj.shiftBox.setSelectedItem(rs.getString(13));
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        	}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
	//====================================== insert Doctors ==================================================================================================
	
	
	public void DocInsert(String id,String pass,String fname,String lname,int age,String specilization,String gender,String address,String city,String ph_no, String M_status,String cnic,String joining_date)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Doctors");
        
        while(rs.next())
        {
        	if((rs.getString(9).equals(ph_no)))
    		{
        		JOptionPane.showMessageDialog(null,"you entered duplicate Phone_num","Error",JOptionPane.INFORMATION_MESSAGE);
        		isTrue=true;
        		break;}
        	if((rs.getString(11).equals(cnic)))
    		{
        		JOptionPane.showMessageDialog(null,"you entered duplicate Cnic","Error",JOptionPane.INFORMATION_MESSAGE);
        		isTrue=true;
        		break;}
        	
        }
        if(!isTrue)
        {
        	 String sql="INSERT INTO Doctors"
         			+"(DOC_ID,DOC_FIRST_NAME,DOC_LAST_NAME,DOC_AGE,DOC_SPECIALIZATION,DOC_GENDER,DOC_ADDRESS,DOC_CITY,DOC_NUM,DOC_M_STATUS,DOC_CNIC,DOC_JOINING_DATE,DOC_PASS)"
         			+" VALUES ('"+id+"','"+fname+"','"+lname+"','"+age+"','"+specilization +"','"+gender+"','"+address+"','"+city+"','"+ph_no+"','"+M_status+"','"+cnic+"','"+joining_date+"','"+pass+"')";
         			ps=con.prepareStatement(sql);
         			
         			ps.executeUpdate();
        			
            		
        			JOptionPane.showMessageDialog(null,"Succesfully inserted");
                      }
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
//============================================================== DLT doctors ==========================================================================
	
	
	public void DocDLTSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Doctors");  doctorformDlt obj=new doctorformDlt();
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        	obj.Doc_fname.setText(rs.getString(2));
    		obj.Doc_lname.setText(rs.getString(3));
    		obj.age_txt.setText(rs.getString(4));
    		obj.textField_city.setText(rs.getString(5));
    		obj.textField_address.setText(rs.getString(6));
    		obj.ph_no.setText(rs.getString(9));
    		obj.cnic_txt.setText(rs.getString(11));
    		obj.textField_admit.setText(rs.getString(12));
    		obj.typebox.setSelectedItem(rs.getString(5));
    		obj.M_status.setSelectedItem(rs.getString(10));
    		obj.gender_box.setSelectedItem(rs.getString(6));
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
	public void DocRemove(String id) {
		try {Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        ps=con.prepareStatement("DELETE FROM Doctors where DOC_ID=?");
		ps.setString(1,id);
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null,"Succesfully Removed");
		}catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());}
	}
	
// ====================================================== UPDATE DOCTOCS DATA =======================================================================
	
	public void DocUpdateSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Doctors");  doctorformUpdate obj=new doctorformUpdate();
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        		obj.Doc_fname.setText(rs.getString(2));
        		obj.Doc_lname.setText(rs.getString(3));
        		obj.age_txt.setText(rs.getString(4));
        		obj.textField_city.setText(rs.getString(5));
        		obj.textField_address.setText(rs.getString(6));
        		obj.ph_no.setText(rs.getString(9));
        		obj.cnic_txt.setText(rs.getString(11));
        		obj.textField_admit.setText(rs.getString(12));
        		obj.typebox.setSelectedItem(rs.getString(5));
        		obj.M_status.setSelectedItem(rs.getString(10));
        		obj.gender_box.setSelectedItem(rs.getString(6));
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
	public void DocUpdate(String id,String fname,String lname,int age,String specilization,String gender,String address,String city,String ph_no, String M_status,String cnic,String joining_date) {
		try {Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
       ps=con.prepareStatement("Update Doctors set DOC_FIRST_NAME=?,DOC_LAST_NAME=?,DOC_AGE=?,DOC_SPECIALIZATION=?,DOC_GENDER=?,DOC_ADDRESS=?,DOC_CITY=?,DOC_NUM=?,DOC_M_STATUS=?,DOC_CNIC=?,DOC_JOINING_DATE=? where DOC_ID=?");

		
        ps.setString(1,id);
		ps.setString(2,fname);
		ps.setString(3,lname);
		ps.setInt(4,age);
		ps.setString(5,specilization);
		ps.setString(6,gender);
		ps.setString(7,address);
		ps.setString(8,city);
		ps.setString(9,ph_no);
		ps.setString(10,M_status);
		ps.setString(11,cnic);
		ps.setString(12,joining_date);
		
		
		ps.executeUpdate();
		
		JOptionPane.showMessageDialog(null,"Succesfully Update");
		}catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		
	}
	
	
//=============================================Doctor Search =======================================================================================================

	public void DocSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Doctors");  SearchDoctorDetails obj=new SearchDoctorDetails();
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        	obj.Doc_fname.setText(rs.getString(2));
    		obj.Doc_lname.setText(rs.getString(3));
    		obj.age_txt.setText(rs.getString(4));
    		obj.textField_city.setText(rs.getString(5));
    		obj.textField_address.setText(rs.getString(6));
    		obj.ph_no.setText(rs.getString(9));
    		obj.cnic_txt.setText(rs.getString(11));
    		obj.textField_admit.setText(rs.getString(12));
    		obj.typebox.setSelectedItem(rs.getString(5));
    		obj.M_status.setSelectedItem(rs.getString(10));
    		obj.gender_box.setSelectedItem(rs.getString(6));
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
		
	
	
//================================================Pateint Insert ===================================================================================================
public void PatientInsert(String id,String fname,String lname,int age,String gender,String address,String city,String ph_no, String M_status,String type,String status,String cnic,String admit,String discharge)
{
	
	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Patient");
        while(rs.next())
        {
        	if((rs.getString(8).equals(ph_no)))
    		{
        		JOptionPane.showMessageDialog(null,"you entered duplicate Phone_num","Error",JOptionPane.INFORMATION_MESSAGE);
        		isTrue=true;
        		break;}
        	if((rs.getString(12).equals(cnic_txt)))
    		{
        		JOptionPane.showMessageDialog(null,"you entered duplicate Cnic","Error",JOptionPane.INFORMATION_MESSAGE);
        		isTrue=true;
        		break;}
        	
        }
        if(!isTrue) {
            String sql="INSERT INTO Patient"
        			+"( PT_ID, PT_FIRST_NAME, PT_LAST_NAME, PT_AGE, PT_GENDER, PT_ADDRESS, PT_CITY, PT_NUM, PT_M_STATUS, PT_TYPE, PT_STATUS,PT_CNIC, ADMIT_DATE,DISCHARGE_DATE)"
        			+" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        			ps=con.prepareStatement(sql);
        			
       
        			ps.setString(1,id);
        			ps.setString(2,fname);
        			ps.setString(3,lname);
        			ps.setInt(4,age);
        			ps.setString(5,gender);
        			ps.setString(6,address);
        			ps.setString(7,city);
        			ps.setString(8,ph_no);
        			ps.setString(9,M_status);
        			ps.setString(10,type);
        			ps.setString(11,status);
        			ps.setString(12,cnic);
        			ps.setString(13,admit);
        			ps.setString(14,discharge);
        			
        			
        			ps.executeUpdate();
        			
        		
        			JOptionPane.showMessageDialog(null,"Succesfully inserted");}
    	
		}
		catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());}


	}
	
	
	
	
//================================================Patient data Update ================================================================================================
	
	public void PatientUpdateSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Patient");  patientformUpdate obj=new patientformUpdate();
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        	obj.PT_fname.setText(rs.getString(2));
    		obj.PT_lname.setText(rs.getString(3));
    		obj.age_txt.setText(rs.getString(4));
    		obj.gender_box.setSelectedItem(rs.getString(5));
    		obj.textField_address.setText(rs.getString(6));
    		obj.textField_city.setText(rs.getString(7));
    		obj.ph_no.setText(rs.getString(8));
    		obj.statusBox.setSelectedItem(rs.getString(9));
    		obj.pt_typebox.setSelectedItem(rs.getString(10));
    		obj.M_status.setSelectedItem(rs.getString(11));
    		obj.cnic_txt.setText(rs.getString(12));
    		obj.textField_admit.setText(rs.getString(13));
    		obj.textField_discharge.setText(rs.getString(14));
    		
    		
    		
    		
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	public void  PatientUpdate(String id,String fname,String lname,int age,String gender,String address,String city,String ph_no, String M_status,String type,String status,String cnic,String admit,String discharge) {
		try {Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
       ps=con.prepareStatement("Update patient set PT_FIRST_NAME=?,PT_LAST_NAME=?,PT_AGE=?,PT_GENDER=?,PT_ADDRESS=?,PT_CITY=?,PT_NUM=?,PT_M_STATUS=?,PT_TYPE=?,PT_STATUS=?,PT_CNIC=?, ADMIT_DATE=?,DISCHARGE_DATE=? where PT_ID=?");

		
        
		ps.setString(2,fname);
		ps.setString(3,lname);
		ps.setInt(4,age);
		ps.setString(5,gender);
		ps.setString(6,address);
		ps.setString(7,city);
		ps.setString(8,ph_no);
		ps.setString(9,M_status);
		ps.setString(10,type);
		ps.setString(11,status);
		ps.setString(12,cnic);
		ps.setString(13,admit);
		ps.setString(14,discharge);
		ps.setString(1,id);
		
		ps.executeUpdate();
		
		JOptionPane.showMessageDialog(null,"Succesfully Update");
		}catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		
	}

//===========================================Patient Remove===========================================================================================================
	public void PatientDLTSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Patient");  patientformDlt obj=new patientformDlt();
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        	obj.PT_fname.setText(rs.getString(2));
    		obj.PT_lname.setText(rs.getString(3));
    		obj.age_txt.setText(rs.getString(4));
    		obj.gender_box.setSelectedItem(rs.getString(5));
    		obj.textField_address.setText(rs.getString(6));
    		obj.textField_city.setText(rs.getString(7));
    		obj.ph_no.setText(rs.getString(8));
    		obj.statusBox.setSelectedItem(rs.getString(9));
    		obj.pt_typebox.setSelectedItem(rs.getString(10));
    		obj.M_status.setSelectedItem(rs.getString(11));
    		obj.cnic_txt.setText(rs.getString(12));
    		obj.textField_admit.setText(rs.getString(13));
    		obj.textField_discharge.setText(rs.getString(14));
    		
    		
    		
    		
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
	
	public void PatientRemove(String id) {
		try {Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        ps=con.prepareStatement("DELETE FROM Patient where PT_ID=?");
		ps.setString(1,id);
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null,"Succesfully Removed");
		}catch(Exception ex) {JOptionPane.showMessageDialog(null,ex.getMessage());}
	}
	
	
//=================================================================Patient Search==================================================================
	
	public void PatientSearch(String id)
	{   try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM Patient");  Serach_patient obj=new  Serach_patient();
        while(rs.next())
        {
        	if((rs.getString(1).equals(id)))
    		{  
        	obj.PT_fname.setText(rs.getString(2));
    		obj.PT_lname.setText(rs.getString(3));
    		obj.age_txt.setText(rs.getString(4));
    		obj.gender_box.setSelectedItem(rs.getString(5));
    		obj.textField_address.setText(rs.getString(6));
    		obj.textField_city.setText(rs.getString(7));
    		obj.ph_no.setText(rs.getString(8));
    		obj.statusBox.setSelectedItem(rs.getString(9));
    		obj.pt_typebox.setSelectedItem(rs.getString(10));
    		obj.M_status.setSelectedItem(rs.getString(11));
    		obj.cnic_txt.setText(rs.getString(12));
    		obj.textField_admit.setText(rs.getString(13));
    		obj.textField_discharge.setText(rs.getString(14));
    		
    		
    		
    		
    		
    		    JOptionPane.showMessageDialog(null,"Done Search");
        		}
        }
       
        
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	}
//=========================== appoinments set by admin ===============================================================================================	
	public void setAppoinment_admin1(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	        st=con.createStatement();
	        rs=st.executeQuery("SELECT * FROM Patient");   admin_DocAp obj=new admin_DocAp();
	        while(rs.next())
	        {
	        	if((rs.getString(1).equals(id)))
	    		{ 
	        		obj.result1.setText(rs.getString(10));
	        		ap1=rs.getString(10);
	    		}
	    		}
		}
		
	
		catch(Exception ex) {
			
		}
	}
	
	public void setAppoinment_admin2(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	        st=con.createStatement();
	        rs=st.executeQuery("SELECT * FROM Doctors");   admin_DocAp obj=new admin_DocAp();
	        while(rs.next())
	        {
	        	if((rs.getString(1).equals(id)))
	    		{ 
	        		obj.result2.setText(rs.getString(5));
	        		ap2=rs.getString(5);
	    		}
	    		}
		}
		
	
		catch(Exception ex) {
			
		}
	}
	
	public void setAppoinment1(String id1,String id2,int appnumber) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	        st=con.createStatement();
	        rs=st.executeQuery("SELECT * FROM appoinment");
			
			
			while(rs.next()) {
				
				if((rs.getString(2).equals(id1)))
				{ 
					JOptionPane.showMessageDialog(null,"already appoint");
				isTrue=true;
				break;}
				
			}
			if(!isTrue)
			{  
				if(ap1.equals(ap2))
	    		{    System.out.println("here2");
	        		String sql="INSERT INTO appoinment"
	            			+"( APP_ID,PT_ID,DOC_ID,CATEGORY)"
	            			+" VALUES (?,?,?,?)";
	        		ps=con.prepareStatement(sql);
	        		ps.setInt(1,appnumber);
	        		ps.setString(2,id1);
	        		ps.setString(3,id2);
	        		ps.setString(4,ap1);
	            			
	            			ps.executeUpdate();
	            			JOptionPane.showMessageDialog(null,"inserted successfully");
	    		}
				else
				{  
					JOptionPane.showMessageDialog(null,"category not matched");
				}
			}
	        
	        	
	    		
		}
		
	
		catch(Exception ex) {
			
			JOptionPane.showMessageDialog(null,ex.getMessage());	
		}
	}
	
//========================================= appoinments set by rep ========================================================================================
	public void setAppoinment_rep1(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	        st=con.createStatement();
	        rs=st.executeQuery("SELECT * FROM Patient");   rep_DocApp obj=new rep_DocApp();
	        while(rs.next())
	        {
	        	if((rs.getString(1).equals(id)))
	    		{ 
	        		obj.result1.setText(rs.getString(10));
	        		ap1=rs.getString(10);
	    		}
	    		}
		}
		
	
		catch(Exception ex) {
			
		}
	}
	
	public void setAppoinment_rep2(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	        st=con.createStatement();
	        rs=st.executeQuery("SELECT * FROM Doctors");    rep_DocApp obj=new rep_DocApp();
	        while(rs.next())
	        {
	        	if((rs.getString(1).equals(id)))
	    		{ 
	        		obj.result2.setText(rs.getString(5));
	        		ap2=rs.getString(5);
	    		}
	    		}
		}
		
	
		catch(Exception ex) {
			
		}
	}
	
	public void setAppoinment2(String id1,String id2,int appnumber) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"hsm_project"+"? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	        st=con.createStatement();
	        rs=st.executeQuery("SELECT * FROM appoinment");
			
			
			while(rs.next()) {
				
				if((rs.getString(2).equals(id1)))
				{ 
					JOptionPane.showMessageDialog(null,"already appoint");
				isTrue=true;
				break;}
				
			}
			if(!isTrue)
			{  
				if(ap1.equals(ap2))
	    		{   
	        		String sql="INSERT INTO appoinment"
	            			+"( APP_ID,PT_ID,DOC_ID,CATEGORY)"
	            			+" VALUES (?,?,?,?)";
	        		ps=con.prepareStatement(sql);
	        		ps.setInt(1,appnumber);
	        		ps.setString(2,id1);
	        		ps.setString(3,id2);
	        		ps.setString(4,ap1);
	            			
	            			ps.executeUpdate();
	            			JOptionPane.showMessageDialog(null,"inserted successfully");
	    		}
				else
				{  
					JOptionPane.showMessageDialog(null,"category not matched");
				}
			}
	        
	        	
	    		
		}
		
	
		catch(Exception ex) {
			
			JOptionPane.showMessageDialog(null,ex.getMessage());	
		}
	}
	
	
	public static void main(String[] args) {
		}

}
