import java.util.ArrayList;

public class MP3player {
	private ArrayList<Song> songs;

	public MP3player() {
		this.songs = new ArrayList<>();
	}

	public Time getLength() {
		return getLength();
	}

	public Song getSong(int index){
		return songs.get(index);
	}

	public void addSong(Song song){
		songs.remove(song);
	}

	public int getNumberOfSongs(){
		int counter = 0;
		for (int i = 0; i < songs.size(); i++ ){
			counter++;
		}
		return counter;
	}

	public int getNumberOfSongsLongerThan(Time length){
		int counter = 0;
		for (int i = 0; i < songs.size(); i++ ){
			if (songs.get(i).getSong().getLength() > length){
				counter++;
			}
		}
		return counter;
	}

	public Song[] getSongsLongerThan(Time length){
		Song[] songsLongerThan = new Song[getNumberOfSongsLongerThan(length)];
		for (int i = 0; i < songsLongerThan.length(); i++ ){

		}
	}

	@Override
	public String toString() {
		return "MP3player{" + "songs=" + songs + '}';
	}
}
