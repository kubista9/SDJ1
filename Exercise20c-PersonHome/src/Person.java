public abstract class Person {
	private String name;
	private Home home;

	public Person (String address, String name, Home home){
		this.name = name;
		this.home = home;
	}

	public String getHomeInfo(){
		return home.getInfo();
	}
}
