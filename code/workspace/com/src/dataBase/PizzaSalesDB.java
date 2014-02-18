package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
							//DB class for retrieving data from Sales table for generation of Pizza sales report

public class PizzaSalesDB {
	private int totalAmountNo[]=new int[100];
	Connection connection;
	public PizzaSalesDB(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String salesPizzaReportQuery= "SELECT * FROM Sales";	//retrieval of data from Sales table for generation of Pizza sales report
			Statement statement= connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY );
			ResultSet resultSet= statement.executeQuery(salesPizzaReportQuery);
			while(resultSet.next()){
				for(int i=0; i<15; i++){
					totalAmountNo[i]+=resultSet.getInt(i+2);
				}

			}
			connection.close();
		}
		catch(Exception exception){
		      System.out.println(exception);
		}
	}

	public int[] returnPizzaReport(){
		return totalAmountNo;
	}
}