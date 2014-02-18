package catchBean;

public class OrderPizza {
private String transactionId;
private String customerId;
private String outletId;
private String order;
private String paymode;
private float totalAmount;
private int totalQuantity;
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getOutletId() {
	return outletId;
}
public void setOutletId(String outletId) {
	this.outletId = outletId;
}
public String getOrder() {
	return order;
}
public void setOrder(String order) {
	this.order = order;
}
public String getPaymode() {
	return paymode;
}
public void setPaymode(String paymode) {
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

}
