/**
 * @author LAKHAA.J
 * @version 1.0
 * This Transaction Status Bean has the setter and getter methods for Transaction Status table
 * 
 **/
package catchBean;

public class TransactionStatusBean {
	private String tansactionId;
	private String transactionDateTime;
	private String transStatus;
	private String transOutletName;
	
	public String getTransOutletName() {
		return transOutletName;
	}

	public void setTransOutletName(String transOutletName) {
		this.transOutletName = transOutletName;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public String getTansactionId() {
		return tansactionId;
	}	

	public void setTansactionId(String tansactionId) {
		this.tansactionId = tansactionId;
	}
	
	
	
	public String getTransactionDateTime() {
		return transactionDateTime;
	}
	
	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	
}
