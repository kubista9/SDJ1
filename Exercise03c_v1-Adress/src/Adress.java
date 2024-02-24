public class Adress {
	private String town, street, door;
	private int number, floor;
	private char letter;

	Adress (String town, String street, int number, char letter, int floor, String door ) {
		this.town = town;
		this.street = street;
		this.door = door;
		this.number = number;
		this.floor = floor;
		this.letter = letter;
	}

	public String getTown() {
		return town;
	}

	public String getStreet() {
		return street;
	}

	public String getDoor() {
		return door;
	}

	public int getNumber() {
		return number;
	}

	public int getFloor() {
		return floor;
	}

	public char getletter() {
		return letter;
	}

	public String getFullNumber() {
		return number + " " + letter + " " + floor + " "  + door;
	}

	public String toString() {
		return town + " " + street + " " + getFullNumber();
	}

}
