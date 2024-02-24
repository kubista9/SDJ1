public class RoomWithPlumbing extends Room {
	private boolean floorDrain;
	public RoomWithPlumbing(String name, double size, boolean hasFloorDrain){
		super(name, size);
		this.floorDrain = hasFloorDrain;
	}

	public boolean hasFloorDrain(){
		return floorDrain;
	}

	public RoomWithPlumbing copy() {
		return new RoomWithPlumbing(getName(), getSize(), hasFloorDrain());
	}

	@Override
	public String toString() {
		return "RoomWithPlumbing{" + "floorDrain=" + floorDrain + '}';
	}

}
