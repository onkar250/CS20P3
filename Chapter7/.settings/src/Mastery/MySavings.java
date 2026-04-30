package Mastery;

	import java.util.Scanner;

	public class MySavings {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        PiggyBank bank = new PiggyBank();
	        int choice;

	        do {
	            System.out.println("1. Show total in bank");
	            System.out.println("2. Add penny");
	            System.out.println("3. Add nickel");
	            System.out.println("4. Add dime");
	            System.out.println("5. Add quarter");
	            System.out.println("6. Take money out of bank");
	            System.out.print("Enter 0 to quit\nEnter your choice: ");
	            choice = input.nextInt();

	            if (choice == 1) {
	                System.out.printf("Total in bank: $%.2f%n", bank.getTotalAmount());
	            } else if (choice == 2) {
	                System.out.print("How many pennies? ");
	                bank.addPennies(input.nextInt());
	            } else if (choice == 3) {
	                System.out.print("How many nickels? ");
	                bank.addNickels(input.nextInt());
	            } else if (choice == 4) {
	                System.out.print("How many dimes? ");
	                bank.addDimes(input.nextInt());
	            } else if (choice == 5) {
	                System.out.print("How many quarters? ");
	                bank.addQuarters(input.nextInt());
	            } else if (choice == 6) {
	                System.out.println("1. Remove penny");
	                System.out.println("2. Remove nickel");
	                System.out.println("3. Remove dime");
	                System.out.println("4. Remove quarter");
	                System.out.print("Enter your choice: ");
	                int removeChoice = input.nextInt();

	                System.out.print("How many? ");
	                int amount = input.nextInt();

	                if (removeChoice == 1) {
	                    bank.removePennies(amount);
	                } else if (removeChoice == 2) {
	                    bank.removeNickels(amount);
	                } else if (removeChoice == 3) {
	                    bank.removeDimes(amount);
	                } else if (removeChoice == 4) {
	                    bank.removeQuarters(amount);
	                } else {
	                    System.out.println("Invalid choice.");
	                }
	            } else if (choice != 0) {
	                System.out.println("Invalid choice.");
	            }
	        } while (choice != 0);

	        input.close();
	    }
	}

	