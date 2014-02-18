package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.PizzaItem;

public class PizzaItemDB {
	private String pizzaNameDB;
	private String pizzaTypeDB;
	private String pizzaSizeDB;
	private String pizzaToppingDB;
	private int pizzaRateDB;
	private int status;
	public PizzaItemDB(PizzaItem pizzaItem){
		pizzaNameDB= pizzaItem.getPizzaName();
		pizzaTypeDB= pizzaItem.getPizzaType();
		pizzaSizeDB= pizzaItem.getPizzaSize();
		pizzaToppingDB= pizzaItem.getPizzaTopping();
		pizzaRateDB= pizzaItem.getPizzaRate();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String pizzaItemInsertQuery= "INSERT INTO Pizza_item VALUES ( seq_pizza_code.nextval,?,?,?,?,?)";
			PreparedStatement preparedStatement1= con.prepareStatement(pizzaItemInsertQuery);
			preparedStatement1.setString(1,pizzaNameDB.toString());
			preparedStatement1.setString(2,pizzaTypeDB.toString());
			preparedStatement1.setString(3,pizzaSizeDB.toString());
			preparedStatement1.setString(4,pizzaToppingDB.toString());
			preparedStatement1.setInt(5,pizzaRateDB);
			int result =preparedStatement1.executeUpdate();
			System.out.println("Result= "+result);
			status= result;
	        con.close();
		}
		catch(Exception exception){ 
		      System.out.println(exception); 
		    } 
	}
	public int statusQuery(){
		return status;
	}
}
