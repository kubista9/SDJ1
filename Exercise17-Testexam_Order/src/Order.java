import java.util.ArrayList;

public class Order {
	private ArrayList<OrderLine> orderLines;

	public Order(){
		this.orderLines = new ArrayList<>();
	}

	public void addProduct(int amount, Product product){
		OrderLine o1 = new OrderLine(amount, product);
		orderLines.add(o1);
	}

	public int getNumberOfOrderLines(){
		return orderLines.size();
	}

	public OrderLine getOrderLine(int index){
		return orderLines.get(index);
	}

	public double getTotalPrice(){
		double price = 0;
		for (int i = 0; i < getNumberOfOrderLines(); i++){
			price += orderLines.get(i).getPrice();
		}
		return price;
	}

}
