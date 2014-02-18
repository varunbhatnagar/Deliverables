package catchBean;

public class OrderPizza {
private String transactionId;
private String customerId;
private String order;
private String outletName;
private int totalQuantity;
private float totalAmount;
private int paymode;
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getOrder() {
	return order;
}
public void setOrder(String order) {
	this.order = order;
}
public String getOutletName() {
	return outletName;
}
public void setOutletName(String outletName) {
	this.outletName = outletName;
}
public int getPaymode() {
	return paymode;
}
public void setPaymode(int paymode) {
	this.paymode = paymode;
}
public float getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(float totalAmount) {
	this.totalAmount = totalAmount;
}
public int getTotalQuantity() {
	return totalQuantity;
}
public void setTotalQuantity(int totalQuantity) {
	this.totalQuantity = totalQuantity;
}
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}



}
