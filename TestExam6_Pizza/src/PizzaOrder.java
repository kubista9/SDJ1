import java.util.ArrayList;

public class PizzaOrder {

	private ArrayList<Pizza> pizzas;
	private Customer customer;

	public PizzaOrder(Customer customer) {
		this.customer = customer;
		this.pizzas = new ArrayList<>();
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getNumberOfPizzas(){
		return pizzas.size();
	}

	public void addPizza(Pizza pizza){
		pizzas.add(pizza);
	}

	public Pizza getPizza(int index){
		return pizzas.get(index);
	}

	public Pizza getPizza(String name){
		for (int i = 0; i < getNumberOfPizzas(); i++){
			if (pizzas.get(i).getName().equals(name)){
				return pizzas.get(i);
			}
		}
		return null;
	}

	public double getTotalPrice(){
		double totalPrice = 0.0;
		for (int i = 0; i < getNumberOfPizzas(); i++){
			totalPrice += pizzas.get(i).getTotalPrice();
		}
		return totalPrice;
	}
}
