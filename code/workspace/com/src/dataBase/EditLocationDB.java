package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.Location;
							//DB class for updation of location info into the Location table in DB when editing is done by admin

public class EditLocationDB {
	private String locationNameDB;
	private String locationAddLine1DB;
	private String locationAddLine2DB;
	private String locationCityDB;
	private String locationStateDB;
	private String locationPinCodeDB;
	private String locationMobileNoDB;
	private int status;
	public EditLocationDB(Location location){
		locationNameDB= location.getLocationName();
		locationAddLine1DB= location.getLocationAddLine1();
		locationAddLine2DB= location.getLocationAddLine2();
		locationCityDB= location.getLocationCity();
		locationStateDB= location.getLocationState();
		locationPinCodeDB= location.getLocationPinCode();
		locationMobileNoDB= location.getLocationMobileNo();
		try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
				String editLocationQuery= "UPDATE Location SET outlet_name=?, " +
											"outlet_address_line1=?, outlet_address_line2=?, " +	//updation of location info into the Location table in DB when editing is done by admin
											"city=?, state=?, pincode=?, loc_contact_no=? WHERE outlet_name=?";
				PreparedStatement preparedStatement= connection.prepareStatement(editLocationQuery);
				preparedStatement.setString(1, locationNameDB.toString());
				preparedStatement.setString(2, locationAddLine1DB.toString());
				preparedStatement.setString(3, locationAddLine2DB.toString());
				preparedStatement.setString(4, locationCityDB.toString());
				preparedStatement.setString(5, locationStateDB.toString());
				preparedStatement.setString(6, locationPinCodeDB.toString());
				preparedStatement.setString(7, locationMobileNoDB.toString());
				preparedStatement.setString(8, locationNameDB.toString());
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