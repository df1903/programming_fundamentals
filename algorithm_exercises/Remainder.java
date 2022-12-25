/**1) Given an integer, display the remainder of division by 2.*/

// imports
import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {
        
        // variables
        Scanner in = new Scanner (System.in);
        int number = 0;

        // data entry
        System.out.print("Enter a whole number: ");
        number = in.nextInt();
        
        // show the remainder
        System.out.println("The remainder is: " + number % 2);


    }
}