package facade;
import catchBean.Customer;
import catchBean.LoginBean;
import catchBean.OrderPizza;
import dataBase.LoginDB;
import dataBase.OrderDB;
import dataBase.RegistrationDB;
public class SwingFacade {
	
	public int catchLogin(LoginBean lb){
		LoginDB ldb =new LoginDB(lb);
		return(ldb.statusQuery());
		
	}
	public int catchCustomer(Customer customer){
		RegistrationDB rdb=new RegistrationDB(customer);
		return 1;
	}
	public int catchOrder(OrderPizza order){
		OrderDB odb= new OrderDB(order);
		return(odb.statusQuery());
	}

}
