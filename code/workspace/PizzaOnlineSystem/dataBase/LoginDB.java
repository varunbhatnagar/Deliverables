package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import catchBean.LoginBean;

public class LoginDB {
	private String userName;
	private String password;
	private String type;
	private String sql;
	private int status;
	private  Connection con;
	public LoginDB(LoginBean lb){
		userName=lb.getUserName();
		password=lb.getPassword();
		type=lb.getType();
		try{ 
			
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		
        
     con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
      if(!type.equals("Employee")){
        sql="SELECT * FROM Customer_login WHERE LOGIN_ID=?";
        }
        else{
        	sql="SELECT * FROM Employee_login WHERE LOGIN_ID=?";
        }
		      
      
        PreparedStatement preparedStatement = 
            con.prepareStatement(sql); 
        preparedStatement.setString(1,userName.toString());
        ResultSet resultset = preparedStatement.executeQuery();
        resultset.next();
        if(resultset.getRow()==0){
        	
        	status=1;
        	System.out.println(status);
        }
        else{
        	
        	if(resultset.getString(2).equals(password)){
        		//System.out.println("hi this is prob");
        		status=2;
        		System.out.println(status);
        	}
        	else{
        	
        		status=3;
        		System.out.println(status);
        	}
       	}
		}
	catch(Exception exception){ 
	      System.out.println(exception); 
	    } 

}
	public int statusQuery(){
		return status;
	}
}
