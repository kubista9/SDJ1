public abstract class WeightedItem extends Item{
	private double weight;
	public WeightedItem(String name, double price, double weight){
		super(name, price);
		this.weight = weight;
	}

	public double getWeight(){
		return weight;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		WeightedItem other = (WeightedItem) obj;
		return super.toString().equals(obj) && this.weight == other.weight;
	}

	public String getInfo(){
		return "name: " + getName() + "price: " + getPrice() + "weight: " + getWeight();
	}
}
