public abstract class Lego extends Toy{
	private int numberOfBricks;

	public Lego(int suitableAge, int numberOfBricks){
		super(suitableAge);
		this.numberOfBricks = numberOfBricks;
	}

	public String toString(){
		return super.toString() + "Number of bricks: " + numberOfBricks;
	}

	public String play(){
		return "Build";
	}
}
