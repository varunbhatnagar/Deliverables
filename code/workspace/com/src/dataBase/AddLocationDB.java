package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Location;
						//DB class for inserting a new tupple in location (new location info) table in DB

public class AddLocationDB{
	private String addLocationNameDB;
	private String addLocationAddLine1DB;
	private String addLocationAddLine2DB;
	private String addLocationCityDB;
	private String addLocationStateDB;
	private String addLocationPinCodeDB;
	private String addLocationMobileNoDB;
	private int status1;
	public AddLocationDB(Location location){
		addLocationNameDB= location.getLocationName();
		addLocationAddLine1DB= location.getLocationAddLine1();
		addLocationAddLine2DB= location.getLocationAddLine2();
		addLocationCityDB= location.getLocationCity();
		addLocationStateDB= location.getLocationState();
		addLocationPinCodeDB= location.getLocationPinCode();
		addLocationMobileNoDB= location.getLocationMobileNo();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String addLocationQuery= "INSERT INTO Location VALUES(seq_location_id.nextval,?,?,?,?,?,?,?)";//insertion of a new tupple in location (new location info) table in DB
			PreparedStatement preparedStatement= connection.prepareStatement(addLocationQuery);
			preparedStatement.setString(1, addLocationNameDB.toString());
			preparedStatement.setString(2, addLocationAddLine1DB.toString());
			preparedStatement.setString(3, addLocationAddLine2DB.toString());
			preparedStatement.setString(4, addLocationCityDB.toString());
			preparedStatement.setString(5, addLocationStateDB.toString());
			preparedStatement.setString(6, addLocationPinCodeDB.toString());
			preparedStatement.setString(7, addLocationMobileNoDB.toString());
			status1= preparedStatement.executeUpdate();
			connection.close();

		}
		catch(Exception exception){
			System.out.println(exception);
		}
	}
	public int statusQuery(){
		return status1;
	}

}
