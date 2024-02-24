public class Email {
	private String user, host, domain;

	Email(String user, String host, String domain) {
		this.user = user;
		this.host = host;
		this.domain = domain;
	}

	public String getUser() {
		return user;
	}

	public String getHost() {
		return host;
	}

	public String getDomain() {
		return domain;
	}

//	C
	public String toString() {
		return user + "@" + host + "." + domain;
	}
}
