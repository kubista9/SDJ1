package model;

public interface LoginModel {
	void login(String user, String password);

	void ValidateLogin(String user, String password);

	void Login(String user, String password);

	void validateLogin(String user, String password);

	boolean isLoggedIn();
}
