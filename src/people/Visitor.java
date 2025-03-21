package people;

public class Visitor {
	private String name;
	private int totalPrice = 0;
	
	public Visitor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showTotalPrice() {
		System.out.println( "Customer (" + this.name + ") total price is " + totalPrice);
	}
	
	public void addTotalPrice(int price){
		totalPrice += price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}
