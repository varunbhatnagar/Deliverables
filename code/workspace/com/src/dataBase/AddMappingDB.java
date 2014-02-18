package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Mapping;
								//DB class for inserting a new tupple in mapping table(for outlet and delivery address mapping) in DB
public class AddMappingDB {
	private String outletNameDB;
	private String subLocation1DB;
	private String subLocation2DB;
	private String subLocation3DB;
	private String subLocation4DB;
	private String subLocation5DB;
	private int status2;

	public AddMappingDB(Mapping mapping){
		outletNameDB= mapping.getOutletName();
		subLocation1DB= mapping.getSubLocation1();
		subLocation2DB= mapping.getSubLocation2();
		subLocation3DB= mapping.getSubLocation3();
		subLocation4DB= mapping.getSubLocation4();
		subLocation5DB= mapping.getSubLocation5();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String addMappingQuery= "INSERT INTO Mapping VALUES(?,?,?,?,?,?)";//insertion of a new tupple in mapping table(for outlet and delivery address mapping) in DB
			PreparedStatement preparedStatement= connection.prepareStatement(addMappingQuery);
			preparedStatement.setString(1, outletNameDB.toString());
			preparedStatement.setString(2, subLocation1DB.toString());
			preparedStatement.setString(3, subLocation2DB.toString());
			preparedStatement.setString(4, subLocation3DB.toString());
			preparedStatement.setString(5, subLocation4DB.toString());
			preparedStatement.setString(6, subLocation5DB.toString());
			status2= preparedStatement.executeUpdate();
			connection.close();

		}
		catch(Exception exception){
			System.out.println(exception);
		}
	}
	public int statusQuery(){
		return status2;
	}

}
