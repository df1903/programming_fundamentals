/**4) Given an integer that represents a certain amount of money,
 *write an algorithm that reads that number from the keyboard and breaks 
 it down to find out how many coins of $1000, $500, $200, $100, $50, and $1 are required. */

// imports
import java.util.Scanner;   

public class Coins {
    
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner (System.in);
        int money = 0;
        int thousand = 0;
        int fiveHundred = 0;
        int twoHundred = 0;
        int oneHundred = 0;
        int fifty = 0;
        int one = 0;

        // data entry
        System.out.print("Enter the amount of money: ");
        money = in.nextInt();

        // calculate coins of thousand
        while (money - 1000 >= 0) {
            money -= 1000;
            thousand += 1;
        }

        // calculate coins of five hundred
        while (money - 500 >= 0) {
            money -= 500;
            fiveHundred += 1;
        }

        // calculate coins of two hundred
        while (money - 200 >= 0) {
            money -= 200;
            twoHundred += 1;
        }

        // calculate coins of one hundred
        while (money - 100 >= 0) {
            money -= 100;
            oneHundred += 1;
        }

        // calculate coins of fifty
        while (money - 50 >= 0) {
            money -= 50;
            fifty += 1;
        }

        // calculate coins of one
        while (money - 1 >= 0) {
            money -= 1;
            one += 1;
        }

        // show results
        System.out.println("You required:");
        System.out.println(thousand + " - Coins of thousand");
        System.out.println(fiveHundred + " - Coins of five hundred");
        System.out.println(twoHundred + " - Coins of two hundred");
        System.out.println(oneHundred + " - Coins of one hundred");
        System.out.println(fifty + " - Coins of fifty");
        System.out.println(one + " - Coins of one");

    }
}
