import java.util.Scanner;

public class QuadraticFunctionTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter value for a");
		double a = input.nextDouble();

		System.out.println("Enter value for b");
		double b = input.nextDouble();

		System.out.println("Enter value for c");
		double c = input.nextDouble();

		QuadraticFunction quadraticFunction1 = new QuadraticFunction(a, b, c);

		System.out.println(quadraticFunction1.getRoots());
	}
}
