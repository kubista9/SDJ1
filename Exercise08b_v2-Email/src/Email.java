import java.util.Objects;
public class Email {
	private String user, host, domain;

	Email(String user, String host, String domain) {
		this.user = user;
		this.host = host;
		this.domain = domain;
	}

	public String getUser() {return user;}

	public String getHost() {
		return host;
	}

	public String getDomain() {return domain;}

	public String toString() {
		return user + "@" + host + "." + domain;
	}

	@Override public boolean equals(Object other)
	{
		if (this == other)
			return true;
		if (other == null || getClass() != other.getClass())
			return false;
		Email email = (Email) other;
		return user == email.user && host == email.host && domain == email.domain;
	}
}
