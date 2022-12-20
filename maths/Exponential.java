// exponential in java

// imports
import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {
        
        // variables
        Scanner in =new Scanner(System.in);
        int base = 0;
        int exponent = 0;
        int result = 0;
        
        // data entry
        System.out.print("Enter base: ");
        base = in.nextInt();
        result = base;
        System.out.print("Enter exponent: ");
        exponent = in.nextInt();
        for (int i = 0; i < (exponent - 1); i++) {
            result *= base;
        }

        // show results
        System.out.println(result);
        System.out.println("Result = " + Math.pow(base, exponent)); 

        System.out.println();
    }
    
}
