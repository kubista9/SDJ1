public class Car extends Vehicle {
	private String regNo;

	public Car(String theOwner, double thePrice, String regNo){
		super(theOwner, thePrice);
		this.regNo = regNo;
	}

	public String getRegistrationNumber(){
		return regNo;
	}

	public void SetRegistrationNumber(String registrationNumber){
		this.regNo = registrationNumber;
	}

	@Override
	public String toString() {
		return "Car" + super.toString() + "regNo='" + regNo;
	}

	public boolean equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Car other = (Car) obj;
		return super.equals(obj) && regNo.equals(other.regNo);
	}
}
