public class Education {
	private String code;
	private String title;

	public Education(String code, String title) {
		this.code = code;
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public boolean Equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Education other = (Education) obj;
		return this.code.equals(other.code) && this.title.equals(other.title);
	}
	public String toString(){
		return "Code: " + code + "title: " + title;
	}
}
