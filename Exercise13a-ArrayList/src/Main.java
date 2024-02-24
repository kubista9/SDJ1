import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<String> strings = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i<8; i++){
			System.out.println("Enter string: ");
			strings.add(input.nextLine());
		}

		System.out.println("Enter index: ");
		int index = input.nextInt();
		input.nextLine();

		System.out.println("Enter string");
		String s = input.nextLine();

		if (index <= 0 && index > 7){
			strings.add(index, s);
		}

		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
	}
}
