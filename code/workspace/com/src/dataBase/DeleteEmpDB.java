package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Employee;
						//DB class for deleting the Employee login info from the Employee_login table in database

public class DeleteEmpDB {
	private String userIdDB;
	private int status;
	public DeleteEmpDB(Employee employee){
		userIdDB= employee.getUserId();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String deleteEmpQuery= "DELETE FROM Employee_login WHERE login_id=?";//deleting the Employee login info from the Employee_login table in database
			PreparedStatement preparedStatement= connection.prepareStatement(deleteEmpQuery);
			preparedStatement.setString(1, userIdDB.toString());
			status= preparedStatement.executeUpdate();
		}
		catch(Exception exception){
			System.out.println(exception);
		}
	}
	public int statusQuery(){
		return status;
	}
}
