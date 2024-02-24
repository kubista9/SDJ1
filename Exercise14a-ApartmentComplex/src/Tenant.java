public class Tenant
{
	private String name;
	private MyDate rentedFrom;

	public Tenant(String name) {
		this.name = name;
		this.rentedFrom = new MyDate();
	}

	public String getName() {
		return name;
	}

	public MyDate getRentedFrom()
	{
		return rentedFrom.copy();
	}

	public void setRentedFrom(MyDate rentedFrom) {
		this.rentedFrom = rentedFrom.copy();
	}

	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Tenant other = (Tenant) obj;

		return name.equals(other.name) && rentedFrom.equals(other.rentedFrom);
	}

	public String toString() {
		return "Tenant: " + name + " and date: " + rentedFrom;
	}
}
