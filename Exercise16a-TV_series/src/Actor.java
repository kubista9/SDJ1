public class Actor {
	private String name;
	private int numberOfEmmys, numberOfEpisodes;

	public Actor (String name) {
		this.name = name;
		this.numberOfEmmys = 0;
		this.numberOfEpisodes = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmmys() {
		return numberOfEmmys;
	}

	public void awardEmmy() {
		numberOfEmmys++;
	}

	public int getNumberOfEpisodes() {
		return numberOfEpisodes;
	}

	public void participateInEpisode() {
		numberOfEpisodes++;
	}
}
