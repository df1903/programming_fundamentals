/**
 * 2) Given a find the operator prefix
 */

// imports
import java.util.Scanner;

public class TelephoneOperator {
    public static void main(String[] args) {

        // variables
        Scanner in = new Scanner (System.in);
        int cellLine = 0;

        // data entry
        System.out.print("Enter the first 2 numbers of your cell line: ");
        cellLine = in.nextInt();

        // show cell operator
        if (cellLine < 30 || cellLine > 39) {
            System.out.println("Number out of range.");
        } else if (cellLine < 34)  {
            System.out.println("Your cell operator is claro.");
        } else if (cellLine < 37) {
            System.out.println("Your cell operator is tigo.");            
        } else {
            System.out.println("Your cell operator in movistar.");
        }

    }

    
}