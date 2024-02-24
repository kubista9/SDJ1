public class Website {
	private String url;
	private boolean userAccess;

	public Website(String url, boolean userAccess) {
		this.url = url;
		this.userAccess = userAccess;
	}

	public String getUrl() {
		return url;
	}

	public void setAccess(boolean access){
		this.userAccess = access;
	}

	public boolean hasAccess(){
		return userAccess;
	}

	public boolean Equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Website other = (Website) obj;
		return this.url.equals(other.url) && this.userAccess == other.userAccess;
	}
}
