package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	
	private  Connection con;
	public CreateConnection(){
	try{ 
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
	}
	catch(Exception exception){ 
	      System.out.println(exception); 
	    } 
	}
public Connection returnCon(){
		return con;
}

}
