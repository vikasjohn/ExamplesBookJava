package chapter3;
import java.util.Scanner;
public class ComputerArea {
	public static void main(String[] args){
		// Initialization and input of value
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius:  ");
		double radius = input.nextDouble();
		
		//if statement and display
		if (radius >= 0){
			double area = Math.PI * radius * radius;
			System.out.println("The area for Radius " + radius + "is : " + area);
		}
		else {
			System.out.println("Radius is negative");
		}
		input.close();
	}
}
