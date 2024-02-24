import java.sql.SQLOutput;
import java.util.Scanner;

public class EmailTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user: ");
		String user = input.nextLine();

		System.out.println("Enter host: ");
		String host = input.nextLine();

		System.out.println("Enter domain: ");
		String domain = input.nextLine();

		System.out.println(user);
		System.out.println(host);
		System.out.println(domain);

		Email email1 = new Email (user, host, domain );

		System.out.println(email1.toString());
	}

}
