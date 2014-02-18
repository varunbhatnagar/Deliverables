package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Location;
						//DB class for deleting the location info from the Location table in database

public class DeleteLocationDB {
	private String locationNameDB;
	private int status1;
	private int status2;
	public DeleteLocationDB(Location location){
		locationNameDB= location.getLocationName();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String deleteLocationQuery= "DELETE FROM Location WHERE outlet_name=?";//deleting the location info from the Location table in database
			PreparedStatement preparedStatement1= connection.prepareStatement(deleteLocationQuery);
			preparedStatement1.setString(1, locationNameDB.toString());
			status1= preparedStatement1.executeUpdate();
			String deleteMappingQuery= "DELETE FROM Mapping WHERE outlet_name=?";//deleting the sublocation info from the Mapping table in database
			PreparedStatement preparedStatement2= connection.prepareStatement(deleteMappingQuery);
			preparedStatement2.setString(1, locationNameDB.toString());
			status2= preparedStatement2.executeUpdate();

		}
		catch(Exception exception){
			System.out.println(exception);
		}

	}
	public int statusQuery(){
		return status2;
	}

}
