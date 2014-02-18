package catchBean;

public class PizzaCatlogue {
private int pizzaCode;
private String name;
private String type;
private String size;
private String toppings;
private float rate;
private String path;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public int getPizzaCode() {
	return pizzaCode;
}
public void setPizzaCode(int pizzaCode) {
	this.pizzaCode = pizzaCode;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getToppings() {
	return toppings;
}
public void setToppings(String toppings) {
	this.toppings = toppings;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
