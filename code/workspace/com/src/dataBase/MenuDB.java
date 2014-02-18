package dataBase;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

import catchBean.PizzaCatlogue;

public class MenuDB {
	
		private String sql;
		private  Connection con;
		private ArrayList menu=new ArrayList();
	
		public MenuDB(){
			CreateConnection cc= new CreateConnection();
			 con=cc.returnCon();
			 sql="SELECT * FROM Pizza_item";
			 try{
				 Statement statement = con.createStatement(); 
				 ResultSet resultset = statement.executeQuery(sql);
				 while(resultset.next()){
					PizzaCatlogue pizzaItem=new PizzaCatlogue();
					pizzaItem.setPizzaCode(resultset.getInt(1));
					pizzaItem.setName(resultset.getString(2));
					pizzaItem.setType(resultset.getString(3));
					pizzaItem.setSize(resultset.getString(4));
					pizzaItem.setToppings(resultset.getString(5));
					pizzaItem.setRate(resultset.getFloat(6));
					pizzaItem.setPath(resultset.getString(7));
					
					menu.add(pizzaItem);
				 }
			 }
			 catch(Exception e){
			 System.out.println(e.getMessage());}
			 }
		public ArrayList returnMenu(){
			System.out.println("menu:"+menu.size());
			return menu;
		}
		}

