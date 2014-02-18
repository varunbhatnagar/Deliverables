package bean;


public class PizzaItem {
	private int pizzaCode;
	private String pizzaName;
	private String pizzaType;
	private String pizzaSize;
	private String pizzaTopping;
	private int pizzaRate;
	private String imgPath;
								//Bean class for filling and throwing data info for an object
							//of the type PizzaItem (mostly corresponding to Pizza_item table attributes)

	public int getPizzaCode() {
		return pizzaCode;
	}
	public void setPizzaCode(int pizzaCode) {
		this.pizzaCode = pizzaCode;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public String getPizzaTopping() {
		return pizzaTopping;
	}
	public int getPizzaRate() {
		return pizzaRate;
	}
	public void setPizzaRate(int pizzaRate) {
		this.pizzaRate = pizzaRate;
	}
	public void setPizzaTopping(String pizzaTopping) {
		this.pizzaTopping = pizzaTopping;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}