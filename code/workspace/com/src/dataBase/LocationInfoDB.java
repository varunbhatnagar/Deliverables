package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import bean.Location;
						//DB class for passing the location info to the facade for fetching the location info onto the front end
						//that will be done by the admin

public class LocationInfoDB {
	ResultSet resultSet;
	Connection connection;
	Location location= new Location();
	public LocationInfoDB(String enteredLocationName){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
		String locationInfoQuery= "SELECT * FROM Location WHERE outlet_name=?";	//fetching the location info from the Location table
		PreparedStatement preparedStatement= connection.prepareStatement(locationInfoQuery);
		preparedStatement.setString(1, enteredLocationName.toString());
		resultSet= preparedStatement.executeQuery();
		while(resultSet.next()){
			location.setLocationName(resultSet.getString(2));
			location.setLocationAddLine1(resultSet.getString(3));
			location.setLocationAddLine2(resultSet.getString(4));
			location.setLocationCity(resultSet.getString(5));
			location.setLocationState(resultSet.getString(6));
			location.setLocationPinCode(resultSet.getString(7));
			location.setLocationMobileNo(resultSet.getString(8));
		}
		connection.close();

	}
	catch(Exception exception){
		System.out.println(exception);
		}

	}
	public Location locationInfo(){
		return location;
	}

}
