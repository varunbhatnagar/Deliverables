/**
 * @author AMIT SAXENA
 * @author LAKHAA.J
 * @author PRAVEEN K
 * @author RAHUL JAIN
 * @version 1.0
 * This Facade class contains methods which contain the bean class object as argument
 * and calls the DB class method
 * 
 **/
package facade;
//import statements for standard API's
import java.sql.ResultSet;
import java.util.ArrayList;

//import statements for Bean and Database classes
import catchBean.Customer;
import catchBean.LoginBean;
import catchBean.OrderPizza;
import catchBean.PaymentBean;
import catchBean.TransactionStatusBean;
import dataBase.LocationDB;
import dataBase.LoginDB;
import dataBase.MappingDB;
import dataBase.MenuDB;
import dataBase.OrderDB;
import dataBase.PaymentDB;
import dataBase.RegistrationDB;
import dataBase.TransactionDB;

public class Facade {
	/**
	* Calls the LoginDB method passing the bean object
	* @param LoginBean object
	* @return String 
	**/	
	public String catchLogin(LoginBean lb){
		LoginDB ldb =new LoginDB(lb);
		return(ldb.statusQuery());
		
	}
	
	/**
	* Calls the CustomerDB method passing the bean object
	* @param CustomerBean object
	* @return int 
	**/	
	public int catchCustomer(Customer customer){
		RegistrationDB rdb=new RegistrationDB(customer);
		return (rdb.statusQuery());
	}
	
	/**
	* Calls the OrderDB method passing the bean object and string
	* @param OrderBean object 
	* @param String sales details
	* @return boolean
	**/	
	public boolean catchOrder(OrderPizza order,String sales){
		System.out.println("order");
		OrderDB odb= new OrderDB(order,sales);
		return(odb.statusQuery());
	}
	
	/**
	* Calls the MenuDB method 
	* @param 
	* @param 
	* @return ArrayList containing menu bean object
	**/	
	public ArrayList catchCatalogue(){
		MenuDB pizzaMenu=new MenuDB();
		return pizzaMenu.returnMenu();
	}
	
	/**
	* Calls the LocationDB method 
	* @param String Location
	* @param 
	* @return ArrayList containing location bean object
	**/	
	public ArrayList  catchLocation(String location) {
		System.out.println("in facade");
		LocationDB ldb=new LocationDB(location);
		ArrayList i=ldb.returnLocation();
		
		return(i);		
	}
	
	/**
	* Calls the TransactionDB method 
	* @param TransactionStatusBean object
	* @param 
	* @return ResultSet containing transaction details
	**/	
	public ResultSet catchTransactionStatus(TransactionStatusBean transStatusObject){
		TransactionDB transdb= new TransactionDB();
		ResultSet rs = transdb.gettransResultSet(transStatusObject);
		return rs;
	}
	
	/**
	* Calls the TransactionDB method 
	* @param TransactionStatusBean object
	* @param 
	* @return int containing the database query update status
	**/	
	public int setTransactionStatus(TransactionStatusBean objectTransStatusBean ){
		TransactionDB transdb= new TransactionDB(objectTransStatusBean);
		return (transdb. setTransStatus(objectTransStatusBean));		
	}
	
	/**
	* Calls the PayDB method 
	* @param PaymentBean object
	* @param 
	* @return int containing the validation status
	**/	
	public int catchPayment(PaymentBean objectPayBean ){
		PaymentDB paydb= new PaymentDB(objectPayBean);
		System.out.println("Fac"+paydb.validationStatus());
		return (paydb.validationStatus());
	}
	
	/**
	* Calls the MappingDB method 
	* @param int customer id is passes
	* @param 
	* @return String containing the outlet name
	**/	
	public String getOutlet(int custId){
		System.out.println("in facade");
		MappingDB mdb= new MappingDB(custId);
		return(mdb.getOutletName());
	}

}
