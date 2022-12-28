/** 1) square of side N.
    If N = 3
    * * * 
    * * * 
    * * * 
*/

// imports
import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int N = 0;
        
        // data entry
        System.out.print("Enter the size of the N side of the square:");
        N = in.nextInt();

        // show square
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}