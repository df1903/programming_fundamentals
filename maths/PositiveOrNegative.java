// number sign in java

// imports
import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        
        // variables
        Scanner in = new Scanner (System.in);
        int number = 0;
        
        // data entry
        System.out.print("Enter a number: ");
        number = in.nextInt();

        // show results
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");  
        } else {
            System.out.println("The number is zero");
        }

        System.out.println();
    }   
}