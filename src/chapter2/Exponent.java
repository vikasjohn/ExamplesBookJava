package chapter2;

public class Exponent {
	public static void main(String[] args){
		System.out.println(Math.pow(20, 0.2));
		
		double d = Math.pow(2, 3);
		System.out.println(d);
		
		double d1 = (Math.pow(2, -3));
		System.out.println(d1);
		
		double radius = 100;
		System.out.println("The Area of Circle : " + radius * radius * Math.PI);
		
		System.out.println("New Way to calculate:  " + Math.pow(radius, 2) * Math.PI);
		
		System.out.println("The square root of the number:  " + Math.sqrt(1000));
	}
}
