public abstract class Education {
	private String code, title;

	public Education(String code, String title){
		this.code = code;
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public boolean equals(Object obj){
		if (obj == null & getClass() == obj.getClass()){
			return false;
		}

		Education other = (Education) obj;
		return code.equals(other.title) && title.equals(other.title);
	}

	@Override
	public String toString() {
		return "Education{" + "code='" + code + '\'' + ", title='" + title + '\'' + '}';
	}
}
