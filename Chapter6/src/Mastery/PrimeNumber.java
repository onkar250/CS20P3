package Mastery;

public class PrimeNumber {

	public static void main(String[] args) {
		import java.util.Scanner;

		public class PrimeNumbersApp {

		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }

		        for (int i = 2; i <= number / 2; i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int num1 = input.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = input.nextInt();

		        int start = Math.min(num1, num2);
		        int end = Math.max(num1, num2);

		        System.out.println("Prime numbers between " + start + " and " + end + ":");

		        for (int i = start; i <= end; i++) {
		            if (isPrime(i)) {
		                System.out.print(i + " ");
		            }
		        }

		        input.close();
		    }
		}
	}

}
