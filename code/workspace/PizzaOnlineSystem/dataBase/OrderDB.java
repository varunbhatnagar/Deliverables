package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import catchBean.OrderPizza;

public class OrderDB {
	private String transactionId;
	private String customerId;
	private String outletId;
	private String locationId;
	private String order;
	private String payMode;
	private Float totalAmount;
	private Integer totalQuantity;
	private int status;
	private  Connection con;
	private int result;
	
	public OrderDB(OrderPizza op){
		
		order=op.getOrder();
		totalAmount=new Float(op.getTotalAmount());
		totalQuantity=new Integer(op.getTotalQuantity());
		payMode=op.getPaymode();
		
		try{ 
		
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
			String sql="INSERT INTO  Pizza_order VALUES(seq_trans_id.nextval,?,?,?,?,?,SYSDATE,?)";
				PreparedStatement preparedStatement = con.prepareStatement(sql); 
				preparedStatement.setInt(1,36);
				preparedStatement.setString(2,order.toString());
				preparedStatement.setInt(3,1);
				preparedStatement.setInt(4,totalQuantity.intValue());
				preparedStatement.setFloat(5,totalAmount.floatValue());
				preparedStatement.setString(6,payMode.toString());
						
				result = preparedStatement.executeUpdate();
		}
				
		
	catch(SQLException exception){ 
	      System.out.println(exception); 
	    } 
	catch(Exception exception){ 
	      System.out.println(exception); 
	    } 

}
	public int statusQuery(){
		return result;
	}
}
