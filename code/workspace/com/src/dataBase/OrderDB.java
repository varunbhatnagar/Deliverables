package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

import catchBean.OrderPizza;

public class OrderDB {
	private String transactionId;
	private String customerId;
	private String outletId;
	private String locationId;
	private String order;
	private Integer payMode;
	private String outletName;
	private Float totalAmount;
	private Integer totalQuantity;
	private boolean status=false;
	private  Connection con;
	private int result;
	private int result1;
	private int result2,result3;
	private Integer quant[]=new Integer[15];
											//SECOND DATABASE CLASS FOR ORDER
	public OrderDB(OrderPizza op,String sales)
	{
		
		customerId = op.getCustomerId();
		order=op.getOrder();
		totalAmount=new Float(op.getTotalAmount());
		totalQuantity=new Integer(op.getTotalQuantity());
		payMode=op.getPaymode();
		outletName = op.getOutletName();
		
		try{ 
				// generating the connection from a common class CreateConnection
				CreateConnection cc= new CreateConnection();
				con=cc.returnCon();
				//Query for Entering the data in Pizza_ORDER table for maintaing order
				String sql="INSERT INTO  Pizza_order VALUES(seq_trans_id.nextval,?,?,?,?,?,SYSDATE,?)";
				PreparedStatement preparedStatement = con.prepareStatement(sql); 
				preparedStatement.setString(1,customerId.toString());
				preparedStatement.setString(2,order.toString());
				preparedStatement.setString(3,outletName.toString());
				preparedStatement.setInt(4,totalQuantity.intValue());
				preparedStatement.setFloat(5,totalAmount.floatValue());
				preparedStatement.setInt(6,payMode.intValue());						
				result = preparedStatement.executeUpdate();
				//			 catching the transaction_id from Pizza_Order table;
					if(result>0){
					String getTransIdSQL = "SELECT trans_id from Pizza_Order where customer_id=? AND TOTAL_AMOUNT=?";
					PreparedStatement preparedStatement1 = con.prepareStatement(getTransIdSQL); 
					preparedStatement1.setString(1,customerId.toString());
					preparedStatement1.setFloat(2,totalAmount.floatValue());
					ResultSet rs = preparedStatement1.executeQuery();
					rs.next();
					transactionId = rs.getString(1);
					String fillTransSQL = "insert into Trans_Status (trans_id,outlet_name) values(?,?)";
					PreparedStatement preparedStatement2 = con.prepareStatement(fillTransSQL); 
					preparedStatement2.setString(1,transactionId.toString());
					preparedStatement2.setString(2,outletName.toString());
					result1 = preparedStatement2.executeUpdate();
				}
			//				 Query for Updating the no of pizza sold in sales table
				if(result1>0){
					
					String fillSalesSQL = "update Sales set sale_pizza01=sale_pizza01+?, sale_pizza02=sale_pizza02+?, sale_pizza03=sale_pizza03+?, " +
							"sale_pizza04=sale_pizza04+?, sale_pizza05=sale_pizza05+?, sale_pizza06=sale_pizza06+?, sale_pizza07=sale_pizza07+?,"+
							"sale_pizza08=sale_pizza08+?, sale_pizza09=sale_pizza09+?, sale_pizza10=sale_pizza10+?, sale_pizza11=sale_pizza11+?," +
							"sale_pizza12=sale_pizza12+?, sale_pizza13=sale_pizza13+?, sale_pizza14=sale_pizza14+?, sale_pizza15=sale_pizza15+?"+
							"where outlet_name=?";
					PreparedStatement preparedStatement3 = con.prepareStatement(fillSalesSQL); 
					StringTokenizer orderToken=new StringTokenizer(sales,"@");
					
					for( int i=0;i<15;i++){
						quant[i]=Integer.parseInt(orderToken.nextToken());
						
					}
					preparedStatement3.setInt(1,quant[0].intValue());
					preparedStatement3.setInt(2,quant[1].intValue());
					preparedStatement3.setInt(3,quant[2].intValue());
					preparedStatement3.setInt(4,quant[3].intValue());
					preparedStatement3.setInt(5,quant[4].intValue());
					preparedStatement3.setInt(6,quant[5].intValue());
					preparedStatement3.setInt(7,quant[6].intValue());
					preparedStatement3.setInt(8,quant[7].intValue());
					preparedStatement3.setInt(9,quant[8].intValue());
					preparedStatement3.setInt(10,quant[9].intValue());
					preparedStatement3.setInt(11,quant[10].intValue());
					preparedStatement3.setInt(12,quant[11].intValue()); 
					preparedStatement3.setInt(13,quant[12].intValue());
					preparedStatement3.setInt(14,quant[13].intValue());
					preparedStatement3.setInt(15,quant[14].intValue());
					preparedStatement3.setString(16,outletName.toString());
					result2 = preparedStatement3.executeUpdate();
				}
				// Query for Updating the no of transaction in CUSTOMER_LOGIN
				if(result2>0){

					String updatetrans="update Customer_Login set NO_OF_TRANS=NO_OF_TRANS+1 where customer_id=?";
					PreparedStatement preparedStatement4 = con.prepareStatement(updatetrans); 
					preparedStatement4.setString(1,customerId.toString());
					result3 = preparedStatement4.executeUpdate();
					
				}
				con.close();
		}
				
		
	catch(SQLException exception){ 
	      System.out.println(exception); 
	    } 
	catch(Exception exception){ 
	      System.out.println(exception); 
	    } 

}
	public boolean statusQuery(){
		if(result>0&& result1>0&& result2>0&&result3>0)
		{
			status=true;
		}
		return status;
	}
}
