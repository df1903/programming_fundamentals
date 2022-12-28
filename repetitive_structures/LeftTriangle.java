/**
    3) Right triangle with side N. Vertical left side.
    if N = 3
    *
    * *
    * * *
*/

// imports
import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int N = 0;
        int M = 0;
    
        // data entry
        System.out.print("Enter the size of the N side of the triangle: ");
        N = in.nextInt();

        // show triangle
        for (int i = 0; i < N; i++) {
            M++;
            for (int j = 0; j < M; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        
    }
}
