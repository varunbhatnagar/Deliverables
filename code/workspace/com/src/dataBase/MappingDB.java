package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import catchBean.OrderPizza;

public class MappingDB {
	private  Connection con;
	private String addLine2;
	private String outletName;

	public MappingDB(int custId)
	{
		Integer cust=custId;
		try{
			// Creating connection
			CreateConnection cc= new CreateConnection();
			con=cc.returnCon();
			// getting user location 
			String getAddLineSQL = "select address_line2 from customer where customer_id = ?";
			PreparedStatement preparedStatementAdd = con.prepareStatement(getAddLineSQL);
			preparedStatementAdd.setInt(1,cust.intValue());
			ResultSet rsAdd = preparedStatementAdd.executeQuery();
			rsAdd.next();
			addLine2=rsAdd.getString(1);
			System.out.println("1---"+addLine2);
			if(rsAdd.getRow()>0){
			// finding the nearest outlet for the corresponding user
			String getOutletSQL = "select outlet_name from Mapping where outlet_name=? OR sub_location1=? OR sub_location2=? OR sub_location3=? OR sub_location4=? OR sub_location5=?"; 
			PreparedStatement preparedStatementOutlet = con.prepareStatement(getOutletSQL);
			preparedStatementOutlet.setString(1,addLine2.toString());
			preparedStatementOutlet.setString(2,addLine2.toString());
			preparedStatementOutlet.setString(3,addLine2.toString());
			preparedStatementOutlet.setString(4,addLine2.toString());
			preparedStatementOutlet.setString(5,addLine2.toString());
			preparedStatementOutlet.setString(6,addLine2.toString());
			ResultSet rsOutlet = preparedStatementOutlet.executeQuery();
			
			rsOutlet.next();
			if(rsOutlet.getRow()>0){
				
				outletName = rsOutlet.getString(1);

			}
			
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
	public String getOutletName(){
		return outletName;
	}
}
