package bean;

public class Employee {
	private String userId;
	private String employeeId;
	private String password;
								//Bean class for filling and throwing data info for an object
							//of the type Employee (mostly corresponding to Employee_login table attributes)

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
