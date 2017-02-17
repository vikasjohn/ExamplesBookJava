package chapter3;
import java.util.Scanner;
public class SubstractionQuiz {
	public static void main(String[] args){
		
		//generate two random single digit
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		System.out.println(number1);
		System.out.println(number2);
		
		if (number1 > number2)
			System.out.println(number1 + " is greater than " + number2);
		else if (number1 == number2)
			System.out.println(number1 + " is equal than " + number2);
		else
			System.out.println(number2 + " is greater than " + number1);
		
		
		if (number1 < number2){
			int temp = number1;
			 number1 = number2;
			 number2 = temp;
			
		System.out.println(number1 + "and " + number2);
		}
		
		// get the number from the Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("what is number1 - number2 :  ");
		int number = input.nextInt();
		
		int subtraction = number1 - number2;
		
		if(number == subtraction){
			System.out.println("you got the correct answer");
	}
		else{
			System.out.println("Try once again");
		}
	input.close();
}
}
