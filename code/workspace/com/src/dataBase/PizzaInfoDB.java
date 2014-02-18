package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import bean.PizzaItem;
						//DB class for passing the pizza info to the facade for fetching it to the front end that is to be edited by admin

public class PizzaInfoDB {
	ResultSet resultSet;
	Connection connection;
	PizzaItem pizzaItem= new PizzaItem();
	public PizzaInfoDB(String enteredPizzaName){
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
		String pizzaInfoQuery= "SELECT * FROM Pizza_item WHERE pizza_name=? AND pizza_size='large'";//retrieval of pizza info from the Pizza_item table in DB
		PreparedStatement preparedStatement= connection.prepareStatement(pizzaInfoQuery);
		preparedStatement.setString(1,enteredPizzaName.toString());
		resultSet= preparedStatement.executeQuery();
		while(resultSet.next()){
			pizzaItem.setPizzaName(resultSet.getString(2));
			pizzaItem.setPizzaType(resultSet.getString(3));
			pizzaItem.setPizzaSize(resultSet.getString(4));
			pizzaItem.setPizzaTopping(resultSet.getString(5));
			pizzaItem.setPizzaRate(resultSet.getInt(6));
			pizzaItem.setImgPath(resultSet.getString(7));
		}
		resultSet.close();
		connection.close();

	}
	catch(Exception exception){
		System.out.println(exception);
		}
	}
	public PizzaItem pizzaInfo(){
		return pizzaItem;
	}

}
