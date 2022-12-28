/** 2) Rectangle of side N x M.
    If N = 8 and M = 4
    * * * * * * * *
    * * * * * * * *
    * * * * * * * *
    * * * * * * * * 
*/

// imports
import java.util.Scanner;

public class Rectangle {
    
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int N = 0;
        int M = 0;

        // data entry
        System.out.print("Enter the size of the N side of the rectangle: ");
        N = in.nextInt();

        System.out.print("Enter the size of the M side of the rectangle: ");
        M = in.nextInt();

        // show rectangle
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
