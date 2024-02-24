import java.util.InputMismatchException;
import java.util.Scanner;

public class TestGrade
{
	public static void main(String[] args)
	{
		GradeList list = new GradeList();

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++){
			while(true){

				System.out.println("Enter course");
				String course = input.nextLine();
				int grade;

				while(true){
					try {
						System.out.println("Enter grade: ");
						grade = input.nextInt();
						break;
					}

					catch (InputMismatchException e){
						System.out.println("Wrong input " + e.getMessage());
						input.nextLine();

					}
				}

				try {
					Grade grade1 = new Grade(grade, course);
					list.addGrade(grade1);
					break;
				}

				catch(IllegalArgumentException e){
					input.nextLine();
					System.out.println("Wrong grade" + e.getMessage());
				}

			}
			input.nextLine();
		}

		System.out.println(list);
	}
}
