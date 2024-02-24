public class Residence {
	private int number;
	private double size;
	private String type;
	private Tenant rentedTo;

	public Residence(int number, double size, String type) {
		this.number = number;
		this.size = size;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public double getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public Tenant getTenant(){
		return rentedTo;
	}
	public boolean isAvailable(){
		if (this.rentedTo == null){
			return true;
		}
		else return false;
	}

	public abstract int getNumberOfRooms();





}
