package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.PizzaItem;
							//DB class for inserting a new tupple in pizza_item(new pizza info) table in DB

public class AddPizzaDB {
	private String pizzaNameDB;
	private String pizzaTypeDB;
	private String pizzaToppingDB;
	private int pizzaRateDB;
	private String imgPathDB;
	private int status;
	String size[]={"large", "medium", "small"};
	public AddPizzaDB(PizzaItem pizzaItem){
		pizzaNameDB= pizzaItem.getPizzaName();
		pizzaTypeDB= pizzaItem.getPizzaType();
		pizzaToppingDB= pizzaItem.getPizzaTopping();
		pizzaRateDB= pizzaItem.getPizzaRate();
		imgPathDB=pizzaItem.getImgPath();

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			for(int i=0;i<3;i++){
				String pizzaItemInsertQuery= "INSERT INTO Pizza_item VALUES ( seq_pizza_code.nextval,?,?,?,?,?,?)";//insertion a new tupple in pizza_item(new pizza info) table in DB
				PreparedStatement preparedStatement= connection.prepareStatement(pizzaItemInsertQuery);
				preparedStatement.setString(1,pizzaNameDB.toString());
				preparedStatement.setString(2,pizzaTypeDB.toString());
				preparedStatement.setString(3,size[i].toString());
				preparedStatement.setString(4,pizzaToppingDB.toString());
				preparedStatement.setInt(5,(pizzaRateDB-(i*50)));
				preparedStatement.setString(6,imgPathDB.toString());
				status =preparedStatement.executeUpdate();

			}
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
