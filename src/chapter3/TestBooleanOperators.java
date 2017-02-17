package chapter3;
import java.util.Scanner;
public class TestBooleanOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		double number = input.nextInt();
		
		if (number % 2 == 0 && number % 3 == 0)
			System.out.println("The number is divisible by both 2 and 3");
		
		if (number % 2 ==0 || number % 3 == 0)
			System.out.println("Divisible by either 2 or 3");
		
		if (number % 2 == 0 ^ number % 3 == 0)
			System.out.println("Divisible by 2 or 3 but not both");
		input.close();
	}

}
