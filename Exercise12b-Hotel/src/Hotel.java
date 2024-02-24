public class Hotel {
	private String name;
	private HotelRoom[] rooms;

	public Hotel(String name, HotelRoom[] rooms) {
		this.name = name;
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfRooms() {
		return rooms.length;
	}

	public int getNumberOfAvailableRooms() {
		int count = 0;
		for (int i = 0; i < getNumberOfRooms(); i++) {
			if (!rooms[i].isOccupied() && rooms[i].getType().equals(name)) {
				count++;
			}
		}
		return count;
	}

	public int getNumberOfAvailableRooms(String roomType) {
		int count = 0;
		for (int i = 0; i < getNumberOfRooms(); i++) {
			if (!rooms[i].isOccupied()) {
				count++;
			}
		}
		return count;
	}

	public HotelRoom getFirstAvailableRoom() {
		int availableRoom = 0;
		for (int i = 0; i < getNumberOfRooms(); i++) {
			if (!rooms[i].isOccupied()){
				return rooms[i];
			}
		}
		return null;
	}

	public HotelRoom getFirstAvailableRoom(double maxPrice){
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (!rooms[i].isOccupied() && maxPrice<= rooms[i].getPrice()){
				return rooms[i];
			}
		}
		return null;
	}

	public HotelRoom[] getAllAvailableRooms(String roomType){
		HotelRoom[] allAvailableRooms = new HotelRoom[getNumberOfAvailableRooms(roomType)];
		int count = 0;
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (rooms[i].equals(roomType)){
				rooms[i] = rooms[count];
				count++;
			}
		}
		return allAvailableRooms;
	}

	public boolean hasGuest(Guest guest) {
		int index = 0;
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (rooms[i].getGuest().equals(guest)) {
				return true;
			}
		}
		return false;
	}

	public HotelRoom[] getRoom(Guest guest) {
		for (int i = 1; i < getNumberOfRooms(); i++) {
			if (rooms[i].getGuest().equals(guest)) {
				return null;
			}
		}
		return null;
	}





}
