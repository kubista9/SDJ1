import java.util.ArrayList;

public class Pizza {
	private String name;
	private double initialPrice;
	private int numberOfToppings;
	public static final int MAX_NUMBER_OF_TOPPINGS = 5;
	private ArrayList<Topping> toppings;

	public Pizza(String name, double initialPrice) {
		this.name = name;
		this.initialPrice = initialPrice;
		this.numberOfToppings = 0;
		this.toppings = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public int getNumberOfToppings() {
		return numberOfToppings;
	}

	public void addTopping(Topping topping){
		if (getNumberOfToppings() > MAX_NUMBER_OF_TOPPINGS){
			toppings.add(topping);
		}
	}

	public void removeTopping(String toppingName){
		toppings.remove(toppingName);
	}

	public double getTotalPrice(){
		double totalPrice = 0.0;
		for (int i = 0; i < getNumberOfToppings(); i++){
			totalPrice += toppings.get(i).getPrice();
		}
		return totalPrice;
	}
}
