public class OrderLine {
	private int amount;
	private Product product;

	public OrderLine(int amount, Product product){
		this.product = product;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public Product getProduct() {
		return product;
	}

	public double getPrice(){
		return getProduct().getPrice();
	}

	public boolean equals(Object obj){
		if (obj == null && getClass() != obj.getClass()){
			return false;
		}
		OrderLine other = (OrderLine) obj;
		return amount == other.amount && product.equals(other.product);
	}
}
