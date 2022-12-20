// even or odd in java

// imports
import java.util.Scanner;

public class EverOrOdd {

    public static void main(String[] args) {
        
        System.out.println();

        // variables
        Scanner in= new Scanner (System.in);
        int number = 0;

        // data entry
        System.out.print("Enter a whole number: ");
        number = in.nextInt();

        // show results
        if (number % 2 == 0) {
            System.out.println("Is an ever number");
        } else {
            System.out.println("Is an odd number");
        }
    }
}



