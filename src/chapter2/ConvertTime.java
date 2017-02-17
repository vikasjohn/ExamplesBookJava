package chapter2;
import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter the time in Seconds to convert:  ");
		
		int seconds = input.nextInt();
		
		int hours = seconds / (60 * 60);
		int remainingMinutes = (seconds % (60 * 60)) / 60;
		int remainingSeconds = seconds % 60;
		
		System.out.println("Total Hours: " + hours);
		System.out.println("Total Minutes:  " + remainingMinutes);
		System.out.println("Total Seconds:  " + remainingSeconds);
		
		input.close();
	}
	
}
