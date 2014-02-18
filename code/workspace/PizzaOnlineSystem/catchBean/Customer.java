package catchBean;

public class Customer extends Person {
private String type;
private String userId;
private String customerId;
private String password;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
