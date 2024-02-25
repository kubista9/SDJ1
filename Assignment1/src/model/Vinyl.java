package model;

public class Vinyl {
	private String title;
	private String artist;
	private int year;
	private VinylState state;

	public Vinyl(String title, String artist, int year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.state = new Free(null, false, this);
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getYear() {
		return year;
	}

	public VinylState getState() {
		return state;
	}
	public String getStatus() {
		return state.status();
	}

	protected void setState(VinylState state){
		this.state = state;
	}

	public void borrow(String borrower){
		state.borrow(borrower,this);
	}

	public void reserve(String reservee){
		state.reserve(reservee, this);
	}

	public void returnVinyl()
	{
		state.returnVinyl(this);
	}
}
