package Mastery;
import java.util.Scanner;  // Imports the Scanner class to allow user input.

public class TimeConversion {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		System.out.print("Enter minutes: ");
		int number = input.nextInt();
		int hours = number / 60;
		int remainder = number % 60;

		System.out.println("The time is: " + hours + ":" + remainder);

	}

}
