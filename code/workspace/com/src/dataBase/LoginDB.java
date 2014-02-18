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
	private String status;
	private StringBuffer statusBuffer=new StringBuffer();//private StringBuffer statusBuffer;
	Connection con;
	public LoginDB(LoginBean lb){
		userName=lb.getUserName();
		password=lb.getPassword();
		type=lb.getType();
		
		try{ 
			
			CreateConnection cc= new CreateConnection();
			 con=cc.returnCon();
			 
			 if(type.equals("Employee")){
				
				 sql="SELECT * FROM Employee_login WHERE LOGIN_ID=?";
				 PreparedStatement preparedStatement = con.prepareStatement(sql); 
				 preparedStatement.setString(1,userName.toString());
				 ResultSet resultset = preparedStatement.executeQuery();
				 resultset.next(); 
				 System.out.println(resultset.getRow());
				 	if(resultset.getRow()==0){
				 			// Invalid user Id
				 		status=4+",";
		 			}
			 		else if(!(resultset.getString(3).equals(password))){
			 				// Invalid Password
			 				status=5+",";
		 			}
			 		else{	
			 			if(userName.equals("superadmin")){
				 			status=7+",";
			 			}
			 			else
			 				status=6+",";
			 			}
			 		}
			 		else{
			 			sql="SELECT * FROM Customer_login WHERE LOGIN_ID=?";	
			 			PreparedStatement preparedStatement = con.prepareStatement(sql); 
			 			preparedStatement.setString(1,userName.toString());
			 			ResultSet resultset = preparedStatement.executeQuery();
			 			resultset.next();
			 			if(resultset.getRow()==0){
			 				// Invalid user Id
			 				statusBuffer.append("1"+","+",");  
			 				status =statusBuffer.toString();   
			 			}	
		 				else if(!(resultset.getString(2).equals(password))){
		 					// Invalid Password
		 					statusBuffer.append("2"+","+resultset.getString(3)+","+resultset.getString(4));
		 					status =statusBuffer.toString();
		 				}
		 				else{
		 					statusBuffer.append("3"+","+resultset.getString(3)+","+resultset.getString(4));
		 					status =statusBuffer.toString();
		 				}
			 		}
			 con.close();   
		}
		catch(Exception exception){ 
	      System.out.println(exception); 
	    } 

	}
	public String statusQuery(){
		return status;
	}
}