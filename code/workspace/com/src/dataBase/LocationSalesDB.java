package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Sales;
						//DB class for retrieving data from Sales table for generation of Location sales report

public class LocationSalesDB {
	ArrayList salesLocationReport= new ArrayList();
	Connection connection;
	public LocationSalesDB(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String salesLocationReportQuery= "SELECT * FROM Sales";		//retrieval of data from Sales table for generation of Location sales report
			Statement statement= connection.createStatement();
			ResultSet resultSet= statement.executeQuery(salesLocationReportQuery);
			while(resultSet.next()){
				Sales sales=new Sales();
				sales.setLocationName(resultSet.getString(1));
				sales.setPizzaType1(resultSet.getInt(2));
				sales.setPizzaType2(resultSet.getInt(3));
				sales.setPizzaType3(resultSet.getInt(4));
				sales.setPizzaType4(resultSet.getInt(5));
				sales.setPizzaType5(resultSet.getInt(6));
				sales.setPizzaType6(resultSet.getInt(7));
				sales.setPizzaType7(resultSet.getInt(8));
				sales.setPizzaType8(resultSet.getInt(9));
				sales.setPizzaType9(resultSet.getInt(10));
				sales.setPizzaType10(resultSet.getInt(11));
				sales.setPizzaType11(resultSet.getInt(12));
				sales.setPizzaType12(resultSet.getInt(13));
				sales.setPizzaType13(resultSet.getInt(14));
				sales.setPizzaType14(resultSet.getInt(15));
				sales.setPizzaType15(resultSet.getInt(16));
				salesLocationReport.add(sales);

			}
			connection.close();

		}
		catch(Exception exception){
		      System.out.println(exception);
		}

		}

	public ArrayList returnLocationReport(){
		return salesLocationReport;
	}
}