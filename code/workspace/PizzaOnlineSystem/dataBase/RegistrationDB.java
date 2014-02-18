package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import catchBean.Customer;

public class RegistrationDB {
		private String name;
		private String password;
		private String userId;
		private String phNo;
		private String addLine1;
		private String addLine2;
		private String city;
		private String state;
		private String pinCode;
		private String type;
		private int status;
		private  Connection con;
		private String customer_ID;
		
		public RegistrationDB(Customer customer){
			name=customer.getName();
			password=customer.getPassword();
			userId=customer.getUserId();
			phNo=customer.getPhNo();
			addLine1=customer.getAddLine1();
			addLine2=customer.getAddLine2();
			city=customer.getCity();
			state=customer.getState();
			pinCode=customer.getPinCode();
			type=customer.getType();
				
			try{ 
				
				Class.forName("oracle.jdbc.driver.OracleDriver"); 
				con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","team1","team1123");
	    
	        String sql1="insert into Customer values(seq_customer_id.nextval,?,?,?,?,?,?,?,?)";
	        String sql2="insert into Customer_login values (?,?,?,?)"; 
	        String sql3="SELECT * FROM Customer WHERE MOBILE_NO=?"; 
	        PreparedStatement preparedStatement = 
	        con.prepareStatement(sql1); 
	        preparedStatement.setString(1,name.toString());
	        preparedStatement.setString(2,type.toString());
	        preparedStatement.setString(3,addLine1.toString());
	        preparedStatement.setString(4,addLine2.toString());
	        preparedStatement.setString(5,phNo.toString());
	        preparedStatement.setString(6,city.toString());
	        preparedStatement.setString(7,state.toString());
	        preparedStatement.setString(8,pinCode.toString());
	        
	        int result = preparedStatement.executeUpdate();
	       
	        if(result!=0){
	        	System.out.println(result);
	        PreparedStatement preparedStatement3 = con.prepareStatement(sql3); 
	        preparedStatement3.setString(1,phNo.toString());
	        ResultSet resultset = preparedStatement3.executeQuery();
	        resultset.next();
	       customer_ID=resultset.getString(1);
	    
	       }
	        if(result!=0){
	      
	        PreparedStatement preparedStatement2 = con.prepareStatement(sql2); 
	        preparedStatement2.setString(1,userId.toString());
	        preparedStatement2.setString(2,password.toString());
	        preparedStatement2.setString(3,"5");
	        preparedStatement2.setString(4,customer_ID.toString());
	        int result1 = preparedStatement2.executeUpdate();
	        con.close();
	        }
			}
		catch(Exception exception){ 
		      System.out.println(exception); 
		    } 

	}
		public int statusQuery(){
			return status;
		}
	}


