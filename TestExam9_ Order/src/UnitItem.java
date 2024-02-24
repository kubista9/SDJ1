public abstract class UnitItem extends Item{
	public UnitItem(String name, double price){
		super(name, price);
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		UnitItem other = (UnitItem) obj;
		return super.equals(obj);
	}

	public String getInfo(){
		return "name: " + getName() + "price: " + getPrice();
	}
}
