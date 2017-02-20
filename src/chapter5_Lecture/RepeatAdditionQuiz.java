/*
 * A program that prompts the user to add two (randomly-generated) single digit 
 * integers. Using a loop, the user repeatedly enters an answer until it is correct.
 * 
 * Solution using a while loop.
 */

package chapter5_examples;

import java.util.Scanner;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		// Generate two random numbers 
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user for an answer
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();

		// Loop until the user enters the correct answer
		while (number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. ");
			
			// Prompt the user for an answer
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
		}

		System.out.println("You got it!");
	}
}
