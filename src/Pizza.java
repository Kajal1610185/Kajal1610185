
public class Pizza {
	private String size;
	private int amount;
	public Pizza() {
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int order(String size, int toppings) throws OrderException {
		if ((size=="S") &&(toppings<2||toppings>5)) {
			throw new OrderException("Order could not be completed");
		}
		if ((size=="M") &&(toppings<2||toppings>5)) {
			throw new OrderException("Order could not be completed");
		}
		else
			throw new OrderException("Order could not be completed");
	}
	
}
