import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a username");
		String username = input.nextLine();

		System.out.println("Enter password");
		String password1 = input.nextLine();

		System.out.println("Confirm password");
		String password2 = input.nextLine();


		while (!password1.equals(password2))  {
			System.out.println("Password and confirmation password don't match");
			System.out.println("Password and confirmation password again");
			password2 = input.nextLine();
		}
		System.out.println("Username: " + username + "\n" + "Password: " + password1);

	}
}
