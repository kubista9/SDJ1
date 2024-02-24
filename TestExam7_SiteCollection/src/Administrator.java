public class Administrator extends User{
	public Administrator(String name){
		super(name);
	}

	public void setUserAccessForSite(Website site){
		site.setAccess(true);
	}

	public Administrator createAdministrator(User user){
		return new Administrator(user.getName());
	}


}
