/*
 *  A program that prompts the user to enter a number repeatedly until the number 
 *  matches a target number. The target number is a randomly generated integer 
 *  between 0 and 100, inclusive. 
 *  
 *  For each user input, the program tells the user whether the guess is too low 
 *  or too high, so the user can choose the next guess intelligently. 
 */

package chapter5_examples;

import java.util.Scanner; 

public class GuessNumber {
	public static void main(String[] args) {
		// Generate a random number to be guessed between 0 to 100, inclusive
		int target = (int)(Math.random() * 101); 

		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (guess != target) {
			// Prompt the user to guess the number
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
		
			// Compare guess to number
			if (guess == target)
				System.out.println("Yes, the number is " + target);
			else if (guess > target)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		} // End of loop
	}
}
