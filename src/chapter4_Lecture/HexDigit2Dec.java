/*
 * A program that converts a hexadecimal digit into a decimal value.
 */

package chapter4_Lecture;

import java.util.Scanner;

public class HexDigit2Dec {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a hex digit
		System.out.print("Enter a hex digit: ");
		String hexString = input.next();
		char ch = Character.toUpperCase(hexString.charAt(0)); // convert character to uppercase  
		
		// Obtain the decimal value for the hex digit
		int value = -1;
		if (ch >= 'A' && ch <= 'F')
			value = ch - 'A' + 10;
		else if (Character.isDigit(ch))
			value = ch - '0';
		
		// Display result
		if (value != -1)
			System.out.println("The decimal value for " + ch + " is " + value);
		else
			System.out.println(ch + " is not a valid hex digit");
		input.close();
	}
}
