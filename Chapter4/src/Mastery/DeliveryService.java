package Mastery;
import java.util.Scanner;

public class DeliveryService {
	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);   // Create a Scanner to read user input
		
		 System.out.println("Enter package length in centimeters: ");  
	        int length = input.nextInt(); 

        System.out.println("Enter package weight in kilograms: ");  
        int weight = input.nextInt();   

         

        System.out.println("Enter package width in centimeters: ");  
        int width = input.nextInt();   

        System.out.println("Enter package height in centimeters: ");  
        int height = input.nextInt(); 

        // If the weight is over 27 kg and the size is under 100,000 cubic cm
        if (weight > 27) 
        if (length * width * height < 100000)
            System.out.println("Package is too heavy"); 

        // If the weight is 27 kg or less but the size is over 100,000 cubic cm
        if (weight < 27)
        if (length * width * height > 100000)
            System.out.println("Package is too big");

        // If the package is both over 27 kg and over 100,000 cubic cm
        if (weight > 27)
        if (length * width * height > 100000)
            System.out.println("Package is too big and too heavy");  

        // If the package is 27 kg or less and under 100,000 cubic cm
        if (weight < 27)
        if (length * width * height < 100000)
            System.out.println("Your package fits the requirements and is ready to be sent to ship");  // Print that the package is okay to ship
    }
}

		
