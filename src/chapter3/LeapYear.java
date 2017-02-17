package chapter3;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args){
		// call for the year
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		
		//conditional statements (boolean)
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println("Its a Leap year");
		else
			System.out.println("Its a normal Year");
		input.close();
	}
}
