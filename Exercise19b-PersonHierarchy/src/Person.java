public class Person {
	private String name;
	private int SSN;

	public Person(String name, int SSN){
		this.name = name;
		this.SSN = SSN;
	}

	public String getName() {
		return name;
	}

	public int getSSN() {
		return SSN;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", SSN=" + SSN + '}';
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Person other = (Person) obj;
		return super.equals(obj) &&  name.equals(other.name) && SSN == other.SSN;
	}
}
