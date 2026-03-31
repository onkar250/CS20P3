package Mastery;
import java.util.Random;
import java.util.Scanner;

public class mathtutor {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		  int num1 = rand.nextInt(10) + 1;
	        int num2 = rand.nextInt(10) + 1;

	        int op = rand.nextInt(4);

	        
	        double correctAnswer = 0;
	        String symbol = "";

	        if (op == 0) {
	            symbol = "+";
	            correctAnswer = num1 + num2;
	        } else if (op == 1) {
	            symbol = "-";
	            correctAnswer = num1 - num2;
	        } else if (op == 2) {
	            symbol = "*";
	            correctAnswer = num1 * num2;
	        } else {
	            symbol = "/";
	            num1 = num1 * num2;
	            correctAnswer = num1 / (double) num2;
	        }

	        System.out.println("What is " + num1 + " " + symbol + " " + num2 + "?");
	        double userAnswer = input.nextDouble();
	        if (Math.abs(userAnswer - correctAnswer) < 0.001) {
	            System.out.println("Correct");
	        } else {
	            System.out.println("Wrong! The answer is " + correctAnswer);
	        }

	        input.close();

	}

}
