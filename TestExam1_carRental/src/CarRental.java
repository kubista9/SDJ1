import java.util.ArrayList;

public class CarRental {
	private String companyName;
	private String address;
	private ArrayList<Car> cars;

	public CarRental(String companyName, String address){
		this.companyName = companyName;
		this.address = address;
		this.cars = new ArrayList<>();
	}

	public String getCompanyName(){
		return companyName;
	}

	public String address(){
		return address;
	}

	public int getNumberOfCars(){
		return cars.size();
	}

	public Car getCar(int index){
		return cars.get(index);
	}

	public void addCar(Car car){
		cars.add(car);
	}

	public Car getCarByLicense(String licenseNo){
		for (int i = 0; i < getNumberOfCars(); i++ ){
			if (cars.get(i).getLicenseNo().equals(licenseNo)){
				return cars.get(i);
			}
		}
		return null;
	}

	public SportsCar getAvailableSportsCar(){
		for (int i = 0; i < getNumberOfCars(); i++ ) {
			if (cars.get(i).getType().equals("Sports car")) {
				return (SportsCar) cars.get(i);
			}
		}
		return null;
	}

	public Van getAvailableVan(int minCapacity){
		for (int i = 0; i < getNumberOfCars(); i++ ) {
			if (cars.get(i) instanceof Van && ((Van) cars.get(i)).getCapacity() >= minCapacity ) {
				return (Van) cars.get(i);
			}
		}
		return null;
	}




}
