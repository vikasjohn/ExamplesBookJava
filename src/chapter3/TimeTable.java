package chapter3;
import java.util.Scanner;
public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Days of the Week : ");
		String day = input.nextLine();

		switch (day){
		case "mon": System.out.println("Monday Blues!! Week Started");break;
		case "tue": System.out.println("Tuesday is great");break;
		case "wed": System.out.println("Wednesday is ....");break;
		case "thu": System.out.println("Tea");break;
		case "fri": System.out.println("Coffee");break;
		case "sat": System.out.println("Party");break;
		case "sun": System.out.println("Sleep");break;
		default:  System.out.println("Hangover");break;
		
		}
		input.close();
	}

}
