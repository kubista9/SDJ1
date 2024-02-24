public abstract class Ebook extends Book{
	private String url;

	public Ebook(String url, String title, String isbn){
		super(url, title);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public String getBookType(){
		return "E-book";
	}

	public String toString(){
		return super.toString() + "Url: " + url;
	}

	public boolean Equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}
		Ebook other = (Ebook) obj;
		return super.equals(obj) && this.url.equals(other.url);
	}
}
