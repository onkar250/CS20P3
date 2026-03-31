/*

Program: changeCounter.java          Last Date of this Revision: March 17, 2026

Purpose: Prompt the user to enter the amount of change they have so the machine can sort it out in quarters dimes nickles and pennies

Author: Onkar Dhillon, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class Sleep {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your date of birth: ");
		System.out.print("Year: ");
		int birthyear = input.nextInt();
		System.out.print("Month: ");
		int birthmonth = input.nextInt();
		System.out.print("Day: ");
		int birthday = input.nextInt();
		System.out.println("Enter today's date: ");
		System.out.print("Year: ");
		int todaysyear = input.nextInt();
		System.out.print("Month: ");
		int todaysmonth = input.nextInt();
		System.out.print("Day: ");
		int todaysday = input.nextInt();
		int years = (todaysyear - birthyear) * 365;
		int months = (todaysmonth - birthmonth) * 30;
		int days = todaysday - birthday;
		System.out.println("You have been alive for: " + (days + months + years) + " days");
		System.out.print("You have slept for: " + ((days + months + years ) * 8 ) + "hours");



	}

}
