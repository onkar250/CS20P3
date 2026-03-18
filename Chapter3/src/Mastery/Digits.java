/*

Program: Digits.java          Last Date of this Revision: March 17, 2026

Purpose: Make a program that makes the user enter a 3 digit number, so the machine can extract its place values

Author: Onkar Dhillon, 
School: CHHS
Course: Computer Science 20
 

*/


package Mastery;
import java.util.Scanner;  // Imports the Scanner class to allow user input.


		public class Digits {   // Declares the class
		    public static void main(String[] args) {  // Main method, program starts here
		        
		        Scanner input = new Scanner(System.in);  // Creates a Scanner object for user input
		        
		        System.out.print("Enter a 3 digit number ");  // Prompts the user to enter a number
		        
		        int num = input.nextInt();  // Stores the user’s number as an integer in variable 'num'
		        
		        int hundreds = num / 100;  // Divides the number by 100 to get the hundreds digit
		        
		        int tens = (num / 10) % 10;  // First removes the ones place, then uses % 10 to get the tens digit
		          
		        int ones = num % 10;  // Finds the remainder when divided by 10 → gives the ones digit  
		        
		        // Display results to the user
		        System.out.println("The hundreds place of your number is " + hundreds);
		        System.out.println("The tens place of your number is " + tens);
		        System.out.println("The ones place of your number is " + ones);
		        
		    }
		

	}
		
		
		
		
		
/*

		Enter a 3 digit number 100
		The hundreds place of your number is 1
		The tens place of your number is 0
		The ones place of your number is 0
*/