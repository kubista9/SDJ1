public abstract class Item {
	private String name;
	private double price;

	public Item (String name, double price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Item other = (Item) obj;
		return this.name.equals(other.name) && this.price == other.price;
	}

	public abstract String getInfo();

}
