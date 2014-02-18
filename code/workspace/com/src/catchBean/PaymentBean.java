/**
 * @author LAKHAA.J
 * @version 1.0
 * This Payment Bean has the setter and getter methods for Payment table
 * 
 **/

package catchBean;

public class PaymentBean {
	private String payCardType;
	private String payCardNumber;
	private String payCardHolderName;
	private String payCardCvv;
	private String payCardBankName;
	private String payCardExpiry;
	
	public String getPayCardBankName() {
		return payCardBankName;
	}
	public void setPayCardBankName(String payCardBankName) {
		this.payCardBankName = payCardBankName;
	}
	public String getPayCardCvv() {
		return payCardCvv;
	}
	public void setPayCardCvv(String payCardCvv) {
		this.payCardCvv = payCardCvv;
	}
	public String getPayCardExpiry() {
		return payCardExpiry;
	}
	public void setPayCardExpiry(String payCardExpiry) {
		this.payCardExpiry = payCardExpiry;
	}
	public String getPayCardHolderName() {
		return payCardHolderName;
	}
	public void setPayCardHolderName(String payCardHolderName) {
		this.payCardHolderName = payCardHolderName;
	}
	public String getPayCardNumber() {
		return payCardNumber;
	}
	public void setPayCardNumber(String payCardNumber) {
		this.payCardNumber = payCardNumber;
	}
	public String getPayCardType() {
		return payCardType;
	}
	public void setPayCardType(String payCardType) {
		this.payCardType = payCardType;
	}


}
