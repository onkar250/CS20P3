package Mastery;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		  int num1 = rand.nextInt(20) + 1;
		  System.out.println("Guess a number 1 - 20");
		  int Guess = input.nextInt(); 
		  if (Guess == num1) {
	            System.out.println("You won!");  }
		  else {
	            System.out.println("The answer is " + num1 + ", Better luck next time. ");
	        }





	}

}
