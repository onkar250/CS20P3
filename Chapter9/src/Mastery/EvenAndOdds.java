package Mastery;
import java.util.Random;

public class EvenAndOdds {

		    public static void main(String[] args) {
		        Random rand = new Random();
		        int[] numbers = new int[25];

		        System.out.println("Generated numbers:");
		        for (int i = 0; i < numbers.length; i++) {
		            numbers[i] = rand.nextInt(100); // 0 to 99
		            System.out.print(numbers[i] + " ");
		        }

		        System.out.println("\nEvens:");
		        for (int n : numbers) {
		            if (n % 2 == 0) {
		                System.out.print(n + " ");
		            }
		        }

		        System.out.println("\nOdds:");
		        for (int n : numbers) {
		            if (n % 2 != 0) {
		                System.out.print(n + " ");
		            }
		        }
		    }
		

	}

