package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.PizzaItem;
							//DB class for updation of pizza info into the Pizza_item table in DB when editing is done by admin

public class EditPizzaDB {
	private String pizzaNameDB;
	private String pizzaTypeDB;
	private String pizzaToppingDB;
	private int pizzaRateDB;
	private String imgPathDB;
	private int status;
	String size[]={"large", "medium", "small"};
	public EditPizzaDB(PizzaItem pizzaItem){
		pizzaNameDB= pizzaItem.getPizzaName();
		pizzaTypeDB= pizzaItem.getPizzaType();
		pizzaToppingDB= pizzaItem.getPizzaTopping();
		pizzaRateDB= pizzaItem.getPizzaRate();
		imgPathDB=pizzaItem.getImgPath();
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			for(int i=0;i<3;i++){
				String pizzaItemUpdateQuery= "UPDATE Pizza_item SET pizza_type=?, pizza_size=?," +
						" pizza_toppings=?, pizza_rate=?, img_path=? WHERE pizza_name=? AND pizza_size=?";//updation of pizza info tupples (3)into the Pizza_item table in DB when editing is done by admin
				PreparedStatement preparedStatement= connection.prepareStatement(pizzaItemUpdateQuery);
				pizzaRateDB= pizzaItem.getPizzaRate();
				preparedStatement.setString(1,pizzaTypeDB.toString());
				preparedStatement.setString(2,size[i].toString());
				preparedStatement.setString(3,pizzaToppingDB.toString());
				preparedStatement.setInt(4,(pizzaRateDB-i*50));
				preparedStatement.setString(5,imgPathDB.toString());
				preparedStatement.setString(6,pizzaNameDB.toString());
				preparedStatement.setString(7,size[i].toString());
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
