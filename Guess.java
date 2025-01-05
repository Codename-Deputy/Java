import java.util.Scanner;

public class Guess{

	
	public static void main(String... sad) {

	int num1,num2;	
	Scanner rat = new Scanner(System.in);
	
	System.out.println("Enter first number:");

	num1 = rat.nextInt();
	
	System.out.println("Enter second number:");

	num2 = rat.nextInt();

	System.out.println("sum of these numbers is:"	+ (num1 + num2));

	}



}