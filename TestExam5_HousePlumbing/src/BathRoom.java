public class BathRoom extends RoomWithPlumbing {
	private boolean hasShower;

	public BathRoom(String name, double size, boolean hasFloorDrain, boolean hasShower) {
		super(name, size, hasFloorDrain);
		this.hasShower = hasShower;
	}

	public boolean hasShower(){
		return hasShower;
	}

	public BathRoom copy(){
		BathRoom copy = new BathRoom(getName(), getSize(), hasFloorDrain(), hasShower);
		return copy;
	}

	@Override
	public String toString() {
		return "BathRoom{" + "hasShower=" + hasShower + '}';
	}
}
