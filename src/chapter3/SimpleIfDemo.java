package chapter3;
import java.util.Scanner;
//program to say HIFIVE if number divisible by 5 and HIEVEN if divided by 2
public class SimpleIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get the input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		// perform the calculation
		if (number % 5 == 0 ){
			System.out.println("Hi Five");
		}
		if (number % 2 == 0){
			System.out.println("Hi Even" );
		input.close();
		}
		
	}

}
