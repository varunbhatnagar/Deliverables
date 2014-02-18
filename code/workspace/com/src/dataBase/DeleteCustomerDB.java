package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Customer;
							//DB class for deleting the customer info from the Customer table in database

public class DeleteCustomerDB {
	private String loginIdDB;
	private int status;
	public DeleteCustomerDB(Customer customer){
		loginIdDB=customer.getLoginId();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String deleteCustomerQuery= "DELETE FROM Customer WHERE customer_id=(SELECT customer_id FROM Customer_login WHERE login_id=?)";//deleting the customer info from the Customer table in database
			PreparedStatement preparedStatement= connection.prepareStatement(deleteCustomerQuery);
			preparedStatement.setString(1, loginIdDB.toString());
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
