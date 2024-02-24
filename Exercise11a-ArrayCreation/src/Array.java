import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] array;
		String a;

		int n = 0, p;
		array = new String[8];

		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Enter string " + i + " here: ");
			array[i] = input.nextLine();
		}

		p = 0;
		while (p == 0)
		{
			System.out.println("Input index of the next string you want to enter: ");
			n = input.nextInt();
			if(n < 0 || n > 7)
				System.out.println("Wrong input!!!");
			else
				p++;
		}
		input.nextLine();
		System.out.println("Input string that you want to enter here: ");
		a = input.nextLine();

		for(int i = 7;i > n;i--)
		{
			array[i] = array[i-1];
		}

		array[n] = a;

		for (int i = 0;i < 8;i++)
		{
			System.out.println(array[i] + "\n");
		}



	}
}
