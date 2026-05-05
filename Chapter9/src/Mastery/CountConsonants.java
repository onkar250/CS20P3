package Mastery;
import java.util.Scanner;

public class CountConsonants {

	

		

		    public static int countConsonants(String text) {
		        int count = 0;
		        String vowels = "aeiouAEIOU";

		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);

		            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
		                count++;
		            }
		        }

		        return count;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        int result = countConsonants(input);

		        System.out.println("Number of consonants: " + result);

		        scanner.close();
		    }
		

	

}
