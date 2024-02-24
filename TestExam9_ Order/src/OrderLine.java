public class OrderLine {
	private int amount;
	private Item item;

	public OrderLine(Item item, int amount){
		this.item = item;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public Item getItem() {
		return item;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		OrderLine other = (OrderLine) obj;
		return this.amount == other.amount && this.item.equals(other.item);
	}

	@Override
	public String toString() {
		return "OrderLine{" + "amount=" + amount + ", item=" + item + '}';
	}
}
