/**
    5) Inverted right triangle with side N.
    if N = 5
      * * * * *
      * * * *
      * * *
      * *
      *
*/

// imports
import java.util.Scanner;


public class InvertedTriangle {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int N = 0;

        // data entry
        System.out.print("Enter the size of the N side of the triangle: ");
        N = in.nextInt();

        // show triangle
        for (int i = N; i > 0; i--) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            N--;
            System.out.println();
        }
    }
}
