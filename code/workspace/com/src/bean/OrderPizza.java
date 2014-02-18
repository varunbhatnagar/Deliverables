package bean;

public class OrderPizza {
	private int transactionId;
	private int customerId;
	private int outletId;
	private String order;
	private int totalAmount;
	private int totalQuantity;
									//Bean class for filling and throwing data info for an object
							//of the type OrderPizza (mostly corresponding to Pizza_order table attributes)

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public int getOutletId() {
		return outletId;
	}
	public void setOutletId(int outletId) {
		this.outletId = outletId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


}