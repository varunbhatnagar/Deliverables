/**
 * @author LAKHAA.J
 * @version 1.0
 * This Transaction DB establishes connection with the database and queries to get the 
 * transaction details and sets the update status
 * 
 **/
package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import catchBean.TransactionStatusBean;


public class TransactionDB {
	
	private ResultSet rs;
	private int status;
	private String transId;
	private String transStatus;
	
	public TransactionDB(){
		
	}
	/**
	* Calls the setTransStatus method by passing the TransactionStatusBean object
	* @param TransactionStatusBean object
	* @return
	**/	
	public TransactionDB(TransactionStatusBean objectTransStatusBean){
		setTransStatus(objectTransStatusBean);
	
	}
	
	/**
	* This method establishes connection with the database and queries the trans_status table
	* @param TransactionStatusBean object
	* @return ResultSet
	* 
	**/		
	public ResultSet gettransResultSet(TransactionStatusBean objectTransStatusBean){
		// Getting outlet_name attribute from bean object using getter method of TransactionStatusBean class
		String outletName = objectTransStatusBean.getTransOutletName();
		
		try{
			//Server-side validation to ensure string is not null
			if(outletName !=null){
				// Establishes connection using DB Connection class
				CreateConnection connclassObject = new CreateConnection();
				Connection connect = connclassObject.returnCon();
				//Query to get the transaction details from the trans_status table
				String transGetTransSQL = "select po.trans_id, TO_CHAR(po.time,'DD.MM.YYYY:HH24:MI:SS') " +
					"AS TRANS_TIME,ts.trans_status,ts.outlet_name from Pizza_order po,Trans_status ts " +
					"where po.trans_id=ts.trans_id And ts.outlet_name=?";			
				
				PreparedStatement preparedStatement = connect.prepareStatement(transGetTransSQL);
			
				preparedStatement.setString(1,outletName.toString());
			
				rs = preparedStatement.executeQuery();
			}
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return rs;
	}
	
	/**
	* This method establishes connection with the database and queries the trans_status table
	* @param TransactionStatusBean object
	* @return int
	* 
	**/		
	public int setTransStatus(TransactionStatusBean objectTransStatusBean){
		// Getting id,status attribute from bean object using getter method of TransactionStatusBean class
		transId = objectTransStatusBean.getTansactionId();
		transStatus = objectTransStatusBean.getTransStatus();
		System.out.println(transId);
		System.out.println(transStatus);
		try{
			if(transId!=null && transStatus!=null){
			// Establishes connection using DB Connection class
			CreateConnection connclassObject = new CreateConnection();
			Connection connect = connclassObject.returnCon();
			//Query to set trans_status to the trans_status table
			String transSetStatusSQL = "UPDATE trans_Status SET trans_status=? where trans_id=?";
			PreparedStatement preparedStatement = connect.prepareStatement(transSetStatusSQL);
			preparedStatement.setString(1,transStatus.toString());
			preparedStatement.setString(2,transId.toString());
			//Query status is assigned
			status = preparedStatement.executeUpdate();
			}
		}
		catch(Exception exception){
			System.out.println(exception); 
		}
		//Query status is returned
		System.out.println("DB--"+status); 
		return status;
	}
}

