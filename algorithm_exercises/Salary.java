/**3) An employee works n hours per week at a cost per hour. 
 * The withholding percentage is x% of gross salary. 
 * You want to know the gross salary, the withholding tax and the net salary of the worker. */

// imports
import java.util.Scanner;;

public class Salary {
    public static void main(String[] args) {

        // variables
        Scanner in = new Scanner (System.in);
        double payHour = 0;
        int hoursWorked = 0;
        double retention = 0;
        double sourceWithholding = 0;
        double grossSalary = 0;

        // data entry
        System.out.print("Enter the paid value of de hour: ");
        payHour = in.nextDouble();
        System.out.print("Enter the number of hours worked: ");
        hoursWorked = in.nextInt();
        System.out.print("Enter the percentage withheld at source: %");
        retention = in.nextDouble();

        // operations
        grossSalary = (payHour * hoursWorked);
        sourceWithholding = ( grossSalary * retention) / 100 ;

        // show results
        System.out.println("Gross salary is :" + grossSalary);
        System.out.println("The value retained at the source is: " + sourceWithholding);
        System.out.println("Net salary is: " + (grossSalary - sourceWithholding));


    }
}
