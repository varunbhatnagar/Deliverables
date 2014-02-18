package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Employee;
							//DB class for inserting a new tupple in employee_login table in DB
public class AddEmpDB{
	private String userIdDB;
	private String passwordDB;
	private int status;
	public AddEmpDB(Employee employee){
		userIdDB=employee.getUserId();
		passwordDB=employee.getPassword();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String addEmpQuery= "INSERT INTO Employee_login VALUES(seq_emp_id.nextval,?,?)";//insertion of a new tupple in employee_login table in DB
			PreparedStatement preparedStatement= connection.prepareStatement(addEmpQuery);
			preparedStatement.setString(1, userIdDB.toString());
			preparedStatement.setString(2, passwordDB.toString());
			status= preparedStatement.executeUpdate();
			connection.close();
		}
		catch(Exception exception){
			System.out.println(exception);
		}
	}
	public int statusQuery(){
		return status;
	}

}
