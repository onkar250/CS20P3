package Mastery;

import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of hamburgers: ");
		int hamburgers = input.nextInt();
		System.out.println("hamburger: 9g fat, 33g carb, 1g fiber. ");

		System.out.println("Enter number of salads: ");
		int salads= input.nextInt();
		System.out.println("salad: 1g fat, 11g carb, 5g fiber ");

		System.out.println("Enter number of fries: ");
		int fries = input.nextInt();
		System.out.println("fries: 11g fat, 36g carb, 4g fiber ");

		System.out.println("Enter number of sodas: ");
		int sodas = input.nextInt();
		System.out.println("soda: 0g fat, 38g carb, 0g fiber ");
		
		double cost = ((hamburgers * 1.85) + (salads * 2.00) + (fries * 1.30) + (sodas * 0.95));
		System.out.printf("Total cost: $%.2f%n", cost);




	}



}
