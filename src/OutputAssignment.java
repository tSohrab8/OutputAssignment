import java.util.Scanner;

public class OutputAssignment { 
	
	public static void main( String[] args ) { 
		Scanner sc = new Scanner(System.in);

		String firstName;
		int age;
		String height;
		double gpa;

		System.out.print( "What is your first name? " );
		firstName = sc.next();

		System.out.print( "How old are you? " );
		age = sc.nextInt();

		System.out.print( "How tall are you? " );
		height = sc.next();

		System.out.print( "What is your GPA? " );
		gpa = sc.nextDouble();
		
		System.out.println("First Name is " + firstName + "\nAge is " + age + 
				           "\nHeight is " + height + "\nGPA is " + gpa);

    }
}