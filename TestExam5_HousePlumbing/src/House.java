public class House {
	private Room[] rooms;

	public House(Room[] rooms){
		this.rooms = rooms;
	}

	public int getNumberOfRooms(){
		return rooms.length;
	}

	public double getTotalSize(){
		double size = 0.0;
		for (int i = 0; i < getNumberOfRooms(); i++){
			size += rooms[i].getSize();
		}
	return size;
	}

	public int getNumberOfBathRooms(){
		int numberOfBathRooms = 0;
		for (int i = 0; i < getNumberOfRooms(); i++){
			if (rooms[i].getName().equals("bathroom"));
			numberOfBathRooms++;
		}
		return numberOfBathRooms;
	}

	public void rebuildRoom(int index, Room room){
		this.rooms[index] = room;
	}

	public void CombineTwoRoomsIntoOne(int index1, int index2, Room room){
		this.rooms[index1] = room;
		this.rooms[index2] = room;
	}

}
