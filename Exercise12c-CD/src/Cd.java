import java.util.Arrays;

public class Cd {
	private String title;
	private String artist;
	private Song[] songs;

	public Cd(String title, String artist, Song[] songs) {
		this.title = title;
		this.artist = artist;
		this.songs = songs;
	}

	public Cd(String title, Song[] songs) {
		this.title = title;
		this.songs = songs;
		this.artist = null;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public Song[] getSong(int index) {
		return songs;
	}

	public int getNumberOfSongs() {
		return songs.length;
	}

	public Time getTotalLength() {
		int count = 0;
		for (int i = 0; i < getNumberOfSongs(); i++) {
			count += songs[i].getLength().getTimeInSeconds();
		}
		Time totalLength = new Time(count);
		return totalLength;
	}

	public int getNumberOfSongsByArtist(String artist) {
		int count = 0;
		for (int i = 0; i < getNumberOfSongs(); i++) {
			if (songs[i].getArtist().equals(artist))
				count++;
		}
		return count;
	}

	public Song[] getSongsByArtist(String artist) {
		Song[] songsByArtist = new Song[getNumberOfSongsByArtist(artist)];
		for (int i = 0; i < getNumberOfSongsByArtist(artist); i++) {
			songs[i].getTitle();
		}
		return songsByArtist;
	}

	public int getLengthInSecondsOfTheLongestSong() {
		if (songs.length<1){
			return -1;
		}

		Time max = songs[0].getLength();
		for (int i =0; i<songs.length;i++){
			if (songs[i].getLength().getTimeInSeconds() > max.getTimeInSeconds()){
				max = songs[i].getLength();
			}
		}
		return max.getTimeInSeconds();
	}

	public int getNumberOfSongsLongerThan(int lengthInSeconds) {
		int count = 0;
		for (int i = 0; i < getNumberOfSongs(); i++) {
			if (songs[i].getLength().getTimeInSeconds() > lengthInSeconds) {
				count ++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return "Cd{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + ", songs=" + Arrays.toString(songs) + '}';
	}
}


