package servlets;

import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String name,String password) {
      try{
    	  	//loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

         //creating connection with the database 
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/uyelik","root","Bihter1814.");
         PreparedStatement ps =con.prepareStatement("select count(1) as result from kayit where name=? and password=?");
         ps.setString(1, name);
         ps.setString(2, password);
         ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
        	if(rs.getString("result").equals("1")) {

        		return true;
        	}
        }
        return false;
        	
      }
      catch(Exception e)
      {
    	  return false; // bad code.
      }
      }  
  }   
