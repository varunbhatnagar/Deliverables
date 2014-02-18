package facade;

import java.util.ArrayList;

import bean.Customer;
import bean.Employee;
import bean.Location;
import bean.OrderPizza;
import bean.PizzaItem;
import bean.Mapping;
import dataBase.AddEmpDB;
import dataBase.AddMappingDB;
import dataBase.DeleteEmpDB;
import dataBase.AddLocationDB;
import dataBase.AddPizzaDB;
import dataBase.PizzaSalesDB;
import dataBase.DeletePizzaDB;
import dataBase.DeleteLocationDB;
import dataBase.LocationSalesDB;
import dataBase.DeleteCustomerDB;
import dataBase.OutletSalesDB;
import dataBase.CustomerSalesDB;
import dataBase.PizzaInfoDB;
import dataBase.EditPizzaDB;
import dataBase.LocationInfoDB;
import dataBase.EditLocationDB;
								//Class with methods defined only for catching objects from front end or
								//retrieving it back from the database
public class JSPFacade {
	public int catchPizzaAdd(PizzaItem pizzaItem){	//passing PizzaItem object to DB class for adding
		AddPizzaDB addPizzaDB=new AddPizzaDB(pizzaItem);	//data into Pizza_item table in DB
		return(addPizzaDB.statusQuery());
		}
	public int catchPizzaDelete(PizzaItem pizzaItem){//passing PizzaItem object to DB class for deleting
		DeletePizzaDB deletePizzaDB= new DeletePizzaDB(pizzaItem);//a customer info from the Pizza_item table in DB
		return(deletePizzaDB.statusQuery());
		}
	public int catchLocationAdd(Location location){		//passing Location object to DB class
		AddLocationDB locationDB= new AddLocationDB(location);//for adding data into Location table in DB
		return(locationDB.statusQuery());
		}
	public ArrayList catchLocationSalesReport(){	//return arraylist of objects of the type Sales for generation of reports
		LocationSalesDB locationSalesDB= new LocationSalesDB();//on the front end dynamically
		return (locationSalesDB.returnLocationReport());
		}
	public int[] catchPizzaSalesReport(){	//return arraylist of objects of the type Sales for generation of reports
		PizzaSalesDB pizzaSalesDB= new PizzaSalesDB();//on the front end dynamically
	return(pizzaSalesDB.returnPizzaReport());
		}
	public int catchLocationDelete(Location location){//passing Location object to DB class for deleting
		DeleteLocationDB deleteLocationDB= new DeleteLocationDB(location);//a customer info from the Location table in DB
		return(deleteLocationDB.statusQuery());
		}
	public int catchCustomerDelete(Customer customer){//passing Customer object to DB class for deleting
		DeleteCustomerDB deleteCustomerDB= new DeleteCustomerDB(customer);//a customer info from the Customer table, Customer_login, Pizza_order table in DB
		return(deleteCustomerDB.statusQuery());
		}
	public int[] catchOutletSalesReport(){		//return array containing the total sale of each pizza type to front end
		OutletSalesDB outletSalesDB= new OutletSalesDB();//for the generation of reports
		return(outletSalesDB.returnOutletReport());
		}
	public ArrayList catchCustomerSalesReport(){	//return arraylist of objects of the type OrderPizza for generation of reports
		CustomerSalesDB customerSalesDB= new CustomerSalesDB();//on the front end dynamically
		return (customerSalesDB.customerReport());
		}
	public PizzaItem catchPizzaInfo(String enteredPizzaName){	//returns object of the type PizzaItem to front end for editing
		PizzaInfoDB pizzaInfoDB= new PizzaInfoDB(enteredPizzaName);//to be done by the user
		return (pizzaInfoDB.pizzaInfo());
		}
	public int catchPizzaEdit(PizzaItem pizzaItem){	//passes updated PizzaItem object from the user to DB class for updation of existing data
		EditPizzaDB editPizzaDB=new EditPizzaDB(pizzaItem);//into the Pizza_item table into the database
		return(editPizzaDB.statusQuery());
		}
	public Location catchLocationInfo(String enteredLocationName){	//returns object of the type Location to front end for editing
		LocationInfoDB locationInfoDB= new LocationInfoDB(enteredLocationName);//to be done by the user
		return (locationInfoDB.locationInfo());
		}
	public int catchLocationEdit(Location location){	//passes updated PizzaItem object from the user to DB class for updation of existing data
		EditLocationDB editLocationDB=new EditLocationDB(location);//into the Pizza_item table into the database
		return(editLocationDB.statusQuery());
		}
	public int catchEmpAdd(Employee employee){		//passing Employee object to DB class for
		AddEmpDB addEmpDB= new AddEmpDB(employee);//adding data into Employee_login table in DB
		return(addEmpDB.statusQuery());
		}
	public int catchEmpDelete(Employee employee){	//passing Employee object to DB class for deleting
		DeleteEmpDB deleteEmpDB= new DeleteEmpDB(employee);//for deleting info from Employee_login table in DB
		return(deleteEmpDB.statusQuery());
		}
	public int catchMappingAdd(Mapping mapping){	//passing  Mapping object to DB class
		AddMappingDB mappingDB= new AddMappingDB(mapping);	//for adding data into Mapping table
		return(mappingDB.statusQuery());//(used for mapping outlet address to customer delivery address) in DB
		}
}
