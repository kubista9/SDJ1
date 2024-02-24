import java.util.ArrayList;

public class Hotel {
	private String name;
	private ArrayList<HotelRoom> rooms;

	public Hotel(String name, HotelRoom[] rooms){
		this.name = name;
		this.rooms = new ArrayList<>();
		for (int i = 0; i < rooms.length; i++){
			this.rooms.add(rooms[i]);
		}
	}

	public String getName(){
		return name;
	}

	public int getNumberOfRooms(){
		return rooms.size();
	}

	public int getNumberOfAvailableRooms(){
		int count = 0;
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (rooms.get(i).isOccupied()) {
				count++;
			}
		}
		return count;
	}

	public int getNumberOfAvailableRooms(String roomType){
		int count = 0;
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (rooms.get(i).getType().equals(roomType) && !rooms.get(i).isOccupied()){
				count++;
			}
		}
		return count;
	}

	public HotelRoom getFirstAvailableRoom(){
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (!rooms.get(i).isOccupied()){
				return rooms.get(i);
			}
		}
		return null;
	}

	public HotelRoom getFirstAvailableRoom(double maxPrice){
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (!rooms.get(i).isOccupied() && rooms.get(i).getPrice() <= maxPrice){
				return rooms.get(i);
			}
		}
		return null;
	}

	public HotelRoom[] getAllAvailableRooms(String roomType){
		HotelRoom[] availableRooms = new HotelRoom[getNumberOfAvailableRooms(roomType)];
		int index = 0;
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (!rooms.get(i).isOccupied() && rooms.get(i).getType().equals(roomType)){
				availableRooms[index] = rooms.get(i);
				index++;
			}
		}
		return availableRooms;
	}

	public boolean hasGuest(Guest guest) {
		for (int i = 0; i < getNumberOfRooms(); i++) {
			if (rooms.get(i).isOccupied() && rooms.get(i).getGuest().equals(guest)) {
				return true;
			}
		}
		return false;
	}

	public HotelRoom getRoom(Guest guest) {
		for (int i = 0; i < getNumberOfRooms(); i++) {
			if (hasGuest(guest)) {
				return rooms.get(i);
			}
		}
		return null;
	}
}
