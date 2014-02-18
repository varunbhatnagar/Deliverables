package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.OrderPizza;
								//DB class for retrieving data from Pizza_order table for generation of Customer sales report

public class CustomerSalesDB {
	ArrayList salesCustomerReport= new ArrayList();
	Connection connection;
	public CustomerSalesDB(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String salesCustomerReportQuery= "SELECT Pizza_order.customer_id, sum(Pizza_order.total_amount) FROM " +
											"Pizza_order GROUP BY Pizza_order.customer_id";			//retrieval of data from Pizza_order table for generation of Customer sales report
			Statement statement= connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY );
			ResultSet resultSet= statement.executeQuery(salesCustomerReportQuery);
			while(resultSet.next()){
				OrderPizza orderPizza=new OrderPizza();
				orderPizza.setCustomerId(resultSet.getInt(1));
				orderPizza.setTotalAmount((int)(resultSet.getFloat(2)));
				salesCustomerReport.add(orderPizza);

			}
			resultSet.close();
			connection.close();

		}
		catch(Exception exception){
		      System.out.println(exception);
		}

	}

	public ArrayList customerReport(){
		return salesCustomerReport;
	}
}