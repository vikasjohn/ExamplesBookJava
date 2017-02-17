package chapter3;
import java.util.Scanner;
public class Scores {
	public static void main(String[] args){
		
		// enter the score
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score! ");
		double score = input.nextDouble();
		
		//conditional statements
				
		if(score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else if (score >= 50)
			System.out.println("E");
		else 
			System.out.println("F");
	input.close();	
	}
}
