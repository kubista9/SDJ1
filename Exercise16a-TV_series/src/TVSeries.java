import java.util.ArrayList;

public class TVSeries {
	private String title;
	private int numberOfEpisodes;
	private ArrayList<Actor> actors;

	public TVSeries(String title){
		this.title = title;
		this.numberOfEpisodes = 0;
		this.actors = new ArrayList<>();
	}

	public void hireActor(Actor actor) {
		actors.add(actor);
	}

	public int getNumberOfActors() {
		return actors.size();
	}

	public Actor getActor(int index) {
		if (index<0 || index>getNumberOfActors()) return null;
		else return actors.get(index);
	}

	public void awardEmmy(String name) {
		for (int i = 0; i < getNumberOfActors(); i++)
			if(actors.get(i).getName().equals(name))
				actors.get(i).awardEmmy();
	}

	public void makeNextEpisode() {
		numberOfEpisodes++;
		for (int i = 0; i < getNumberOfActors(); i++)
			actors.get(i).participateInEpisode();
	}

	public ArrayList<Actor> getEmmyWinners(){
		ArrayList<Actor> emmyWinners = new ArrayList<>();
		for (int i = 0; i < getNumberOfActors(); i++) {
			if (actors.get(i).getNumberOfEmmys() > 0) {
				emmyWinners.add(actors.get(i));
			}
		}
		return emmyWinners;
	}

	@Override
	public String toString() {
		return "TVSeries{" + "title='" + title + '\'' + ", numberOfEpisodes=" + numberOfEpisodes + ", actors=" + actors + '}';
	}
}
