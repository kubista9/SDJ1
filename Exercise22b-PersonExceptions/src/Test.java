import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        Person person1 = null;
        Name name1 = null;
        MyDate birthday1 = null;
        char gender;

        do
        {
            System.out.println("Enter first name: ");
            String firstName = input.nextLine();
            System.out.println("Enter last name: ");
            String lastName = input.nextLine();
            try
            {
                name1 = new Name(firstName, lastName);
                check = false;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

        } while(check);

        do
        {
            System.out.println("Type in your birthday.");
            System.out.println("Day: ");
            int day = input.nextInt();
            input.nextLine();
            System.out.println("Month: ");
            int month = input.nextInt();
            input.nextLine();
            System.out.println("Year: ");
            int year = input.nextInt();

            try
            {
                birthday1 = new MyDate(day, month, year);
                check = false;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        } while (check);

        input.nextLine();
        
        do
        {
            System.out.println("Enter your gender (F/M): ");
            gender = input.nextLine().charAt(0);

            try
            {
                person1 = new Person(name1, birthday1, gender);
                check = false;
            }

            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

        } while (check);

        System.out.println(person1);
    }
}
