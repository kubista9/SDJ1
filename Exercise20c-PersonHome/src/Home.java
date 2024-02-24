public abstract class Home {
	private String address;

	public Home(String address){
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public abstract String getInfo();
}
