public class Song {
	private String title, artist;
	private Time length;

	public Song(String title, String artist, Time length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}

	public String getTitle(){
		return title;
	}

	public String getArtist(){
		return artist;
	}

	public Time getLength() {
		return length;
	}

	public String toString(){
		return "Artist: " + artist + "title: " + title + "length: " + length;
	}
}
