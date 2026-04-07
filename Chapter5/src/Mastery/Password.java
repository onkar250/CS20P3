package Mastery;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password = ("test");
		for (int i = 1; i < 4; i++) {
			System.out.println("Enter the password:");
			String test = input.nextLine();
			if (password.equals(test)) 
			{System.out.println("Welcome"); break; }
			else {System.out.println("The password you typed is incorrect."); }
			if (i == 3) {System.out.println("Access denied."); }
			
		}
		

	}

}
