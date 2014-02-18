package dataBase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.PizzaItem;
						//DB class for deleting the pizza info from the Pizza_item in database

public class DeletePizzaDB {
	private String pizzaNameDB;
	private int status;
	public DeletePizzaDB(PizzaItem pizzaItem){
		pizzaNameDB= pizzaItem.getPizzaName();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String deletePizzaQuery= "DELETE FROM Pizza_item WHERE pizza_name=?";	//deletion of pizza info from the  Pizza_item database
			PreparedStatement preparedStatement= connection.prepareStatement(deletePizzaQuery);
			preparedStatement.setString(1, pizzaNameDB.toString());
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
