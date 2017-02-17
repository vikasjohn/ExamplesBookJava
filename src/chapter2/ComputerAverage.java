package chapter2;
import java.util.Scanner;

public class ComputerAverage {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the First Number:  ");
		double numberOne = input.nextDouble();
		
		System.out.println("Enter the Second Number:  ");
		double numberTwo = input.nextDouble();
		
		System.out.println("Enter the Third number:  ");
		double numberThree = input.nextDouble();
		
		double average = (numberOne + numberTwo + numberThree) / 3;
		
		System.out.println("The average of three numbers is:  " + average);
		input.close();
	}
}
