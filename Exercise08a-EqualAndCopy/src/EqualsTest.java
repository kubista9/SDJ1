public class EqualsTest {
	public static void main(String[] args)
	{
		Address a1= new Address("Zvolen","Stefanika",6);
		Address a2= new Address("Bratislava","Stafanikova",3);
		System.out.println( a1.equals(a2));

		MyDate d1= new MyDate(12,12,2012);
		MyDate d2= new MyDate(30,10,2022);
		System.out.println( d1.equals(d2));

		Clock c1= new Clock(123123123);
		Clock c2= new Clock(123129123);
		System.out.println( c1.equals(c2));

		Name n1= new Name("Jakub","Kuka");
		Name n2= new Name("Roger","Federer");
		System.out.println(n1.equals(n2));
	}
}
