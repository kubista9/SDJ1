import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {

//		1
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the lenght of a triangle: ");
		double lenght = scanner.nextDouble();

//		2
		System.out.println("Enter the width of a triangle");
		double width = scanner.nextDouble();

//		3
		Rectangle rectangle = new Rectangle(lenght, width);

//		4
		System.out.println(rectangle.getLenght());

//		5
		System.out.println(rectangle.getWidth());

//		6
		System.out.println(rectangle.getArea());
	}
}
