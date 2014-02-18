package dataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import catchBean.Location;

public class LocationDB {
		private String city;
		private String sql;
		private  Connection con;
		private ArrayList locationList=new ArrayList();
	
		public LocationDB(String location1){
			city=location1;
			//System.out.println(city);
			
			CreateConnection cc= new CreateConnection();
			 con=cc.returnCon();
			 sql="SELECT * FROM location where city=?";
			 try{
				 
				 PreparedStatement preparedStatement = con.prepareStatement(sql);
				 preparedStatement.setString(1,city.toString());
				 
				 ResultSet resultset = preparedStatement.executeQuery();
				 
				 
				 while(resultset.next()){
					Location location =new Location();
					location.setOutletId(resultset.getString(1));
					location.setOutletName(resultset.getString(2));
					location.setAddLine1(resultset.getString(3));
					location.setAddLine2(resultset.getString(4));
					location.setCity(resultset.getString(5));
					location.setState(resultset.getString(6));
					location.setPinCode(resultset.getString(7));
					location.setPhoneNO(resultset.getString(8));
					locationList.add(location);
				 }
			 }
			 catch(Exception e){
				 System.out.println(e.getMessage());
				 System.out.println("error in db");
			 }
		 }
			public ArrayList returnLocation(){
				System.out.println("outlets present:"+locationList.size());
				return locationList;
			}
}

