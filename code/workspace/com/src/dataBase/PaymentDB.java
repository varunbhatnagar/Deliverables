/**
 * @author LAKHAA.J
 * @version 1.0
 * This Payment DB establishes connection with the database and queries to get the 
 * card details
 * 
 **/
package dataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import catchBean.PaymentBean;

public class PaymentDB {

	private int status;
	private String payCardType;
	private String payCardNumber;
	private String payCardHolderName;
	private String payCardCvv;
	private String payCardBankName;
	private String payCardExpiry;

	public PaymentDB(){

	}
	/**
	* Establishes connection with the database and queries the card_details table
	* @param PaymentBean object
	* 
	**/	
	public PaymentDB(PaymentBean objectPayBean){
		// Getting attributes from bean object using getter method of PaymentBean class
		payCardType = objectPayBean.getPayCardType();
		payCardNumber = objectPayBean.getPayCardNumber();
		payCardHolderName = objectPayBean.getPayCardHolderName();
		payCardCvv = objectPayBean.getPayCardCvv();
		payCardBankName = objectPayBean.getPayCardBankName();
		payCardExpiry = objectPayBean.getPayCardExpiry();
		System.out.println("From bean");
		System.out.println(payCardType);
		System.out.println(payCardNumber);
		System.out.println(payCardHolderName);
		System.out.println(payCardCvv);
		System.out.println(payCardBankName);
		System.out.println(payCardExpiry );
			
		try{
			// Establishes connection using DB Connection class
			CreateConnection connclassObject = new CreateConnection();
			Connection connect = connclassObject.returnCon();
			//Query to get the card details from the card_details table
			String transGetSQL = "select CARD_TYPE,CARD_NO,CARD_HOLDER_NAME,CARD_CVV,BANK_NAME,TO_CHAR(EXPIRY_DATE,'MM-YY') AS EXPRY from Card_details";
			PreparedStatement preparedStatement = connect.prepareStatement(transGetSQL); 
			ResultSet resultset = preparedStatement.executeQuery();
			//Iterating result set and comparing
			while(resultset.next()){
				System.out.print("ffrom db"+resultset.getString(1));
				if(resultset.getString(1).equalsIgnoreCase(payCardType)){
					System.out.println("Details type matched");
					if( resultset.getString(2).equals(payCardNumber)){
						System.out.println("Details number matched");
						if( resultset.getString(3).equalsIgnoreCase(payCardHolderName)){
							System.out.println("Details name matched");
							if(resultset.getString(4).equals(payCardCvv)){ 
								System.out.println("Details cvv matched");
								if(resultset.getString(5).equalsIgnoreCase(payCardBankName)){
									System.out.println("Details bank matched");
									if(resultset.getString(6).equals(payCardExpiry)){
										status = 1;
										System.out.println("Details exp matched"); 
										break;
									}
									else{
										System.out.println("Details exp not matched6"); 
										status=0;
									}
								}
								else{
									System.out.println("Details bank not matched");
									status=0;
								}
							}	
							else{
								System.out.println("Details cvv not matched");
								status=0;	
							}
						}
						else{
							System.out.println("Details name not matched");
							status=0;
						}
					}
					else{
						System.out.println("Details number not matched");
						status=0;
					}
				}
				else
				{
					System.out.println("Details type not matched");
					status=0;
				}
			}
		}
		catch(Exception exception){
			exception.printStackTrace();
		}

	}
	
	/**
	* This method returns status of the card detail validation
	* @param 
	* @return int status 
	**/	
	public int validationStatus(){
		System.out.println(status); 
		return status;
	}

}
