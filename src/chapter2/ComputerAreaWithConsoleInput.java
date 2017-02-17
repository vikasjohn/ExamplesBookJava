package chapter2;
import java.util.Scanner;

public class ComputerAreaWithConsoleInput {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * 3.14;
		
		System.out.println("The area of Circle is : " + area);
		input.close();
		
		
	}
}
