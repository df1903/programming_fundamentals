// operators in java

// imports
import java.util.Scanner;

public class Operators {
    
    public static void main(String[] args) {        
        
        System.out.println();

        // variables
        Scanner in = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        double addition = 0;
        double addition2 = 0;
        double subtraction = 0;
        double multiplication = 0; 
        double division = 0;
        double remainder = 0;
        
        // constants
        final int increase = 10;

        // data entry        
        System.out.print("Enter the first number: ");
        number1 = in.nextInt();

        System.out.print("Enter the second number: ");
        number2 = in.nextInt();

        // operations
        addition = number1 + number2;
        addition2 = addition + increase;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        
        // show results
        System.out.println("\nResults");
        System.out.println("addition: " + addition);
        System.out.println("addition + increase: " + addition2 );
        System.out.println("subtraction: " + subtraction);
        System.out.println("Multiplicación: " + multiplication);

        if (number2 != 0) {
            division = (number1 / number2);
            remainder = (number1 % number2);
            System.out.println("Division: " + division);
            System.out.println("Residuo de la división: " + remainder); 
        } else {
            System.out.println("La división no se puede hacer");
        }

        if (addition * increase > multiplication) {
            addition = addition * increase;
        }

        if (number1 % number2==0) {
            System.out.println("The first number is a multiple of the second number");
        } else {
            System.out.println("The first number is not a multiple of the second number");
        }            
    }
}
