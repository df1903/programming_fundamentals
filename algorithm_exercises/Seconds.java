/**
 * 6) Write an algorithm that for a total number of seconds 
 * calculates its equivalent in days, hours, minutes and seconds.
 */

// imports
import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner (System.in);
        float seconds = 0;

        // data entry
        System.out.print("Enter the number of seconds: ");
        seconds = in.nextFloat();

        // show results
        System.out.println(seconds + " second equals");
        System.out.println("Days: " + (seconds / 86400 ));
        System.out.println("Hours: " + (seconds / 3600 ));
        System.out.println("minutes: " + (seconds / 60 ));
        
    }
}
