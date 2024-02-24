public class Image {
	private String description;

	public Image(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString(){
		return "Description:" + description;
	}
}
