/**5) Given an amount in pesos, obtain the equivalence in dollars and euros at the current time*/

// imports
import java.util.Scanner;   

public class Money {
    
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner (System.in);
        float pesos = 0;

        // data entry
        System.out.print("Enter amount of money in pesos: ");
        pesos = in.nextFloat();
        
        // show money
        System.out.println("Dollar equivalency: " +  pesos * 0.00027);
        System.out.println("Euros equivalency: " +  pesos * 0.00023);
        
    }
}
