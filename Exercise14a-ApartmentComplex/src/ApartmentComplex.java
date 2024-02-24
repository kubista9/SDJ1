import java.util.ArrayList;

public class ApartmentComplex {
	private String address;
	private ArrayList<Apartment> apartments;

	public ApartmentComplex(String address) {
		this.address = address;
		this.apartments = new ArrayList<Apartment>();
	}

	public int getNumberOfApartments()
	{
		return apartments.size();
	}

	public void add(Apartment apartment) {
		apartments.add(apartment);
	}

	public Apartment getApartment(int index) {
		return apartments.get(index);
	}

	public Apartment getApartmentByNumber(int number) {
		for (int i = 0; i < apartments.size(); i++) {
			if (number == apartments.get(i).getNumber()) {
				return apartments.get(i);
			}
		}
		return null;

	}

	public Apartment getApartmentByTenant(Tenant tenant) {
		if (tenant != null) {
			for (int i = 0; i < apartments.size(); i++) {
				if (tenant.equals(apartments.get(i).getTenant())) {
					return apartments.get(i);
				}
			}
			return null;
		}
		else
		{
			for (int i = 0; i < apartments.size(); i++) {
				if ((apartments.get(i).getTenant() == null)) {
					return apartments.get(i);
				}
			}
			return null;
		}
	}

	public Apartment getFirstAvailableApartment()
	{
		for (int i = 0; i < apartments.size(); i++)
		{
			if (apartments.get(i).isAvailable())
			{

				return apartments.get(i);
			}
		}
		return null;
	}

	@Override public String toString()
	{
		return "ApartmentComplex{" + "address='" + address + '\'' + ", apartments=" + apartments + '}';
	}
}
