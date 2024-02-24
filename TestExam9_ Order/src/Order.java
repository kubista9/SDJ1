import java.util.Arrays;

public class Order {
	private int numberOfOrderLines;
	private OrderLine[] orderLines;

	public Order(int maxNumberOfOrderLines){
		this.numberOfOrderLines = 0;
		this.orderLines = new OrderLine[maxNumberOfOrderLines];
	}

	public void addOrderLine(Item item, int amount){
		OrderLine newOrderLine = new OrderLine(item, amount);
		orderLines[numberOfOrderLines] = newOrderLine;
		numberOfOrderLines++;
	}

	public int getNumberOfOrderLines(){
		return numberOfOrderLines;
	}

	public double getTotalPrice(){
		double totalPrice = 0.0;
		for (int i = 0; i < getNumberOfOrderLines(); i++){
			double price = orderLines[i].getItem().getPrice();
			totalPrice += orderLines[i].getAmount() * price;
		}
		return totalPrice;
	}

	public Item getOrderItem(int orderLineIndex){
		return orderLines[orderLineIndex].getItem();
	}

	public int getAmountOfOrderItem(int orderLineIndex){
		return orderLines[orderLineIndex].getAmount();
	}

	public double getTotalWeightForWeightedItems(){
		double totalWeight = 0.0;
		for (int i = 0; i < getNumberOfOrderLines(); i++){
			if (orderLines[i].getItem() instanceof WeightedItem){
				totalWeight += ((WeightedItem) orderLines[i].getItem()).getWeight();
			}
		}
		return totalWeight;
	}

	@Override
	public String toString() {
		return "Order{" + "numberOfOrderLines=" + numberOfOrderLines + ", orderLines=" + Arrays.toString(orderLines) + '}';
	}
}
