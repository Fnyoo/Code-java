import java.util.Scanner;

public class Experiment4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int basicSalary;
        double transportAllowance = 600000, mealAllowance = 400000;
        double bonus, totalSalary;

        System.out.print("Enter the basic salary: Rp ");
        basicSalary = input.nextInt();
        bonus = 0.5 * basicSalary ;

        totalSalary = basicSalary + transportAllowance + mealAllowance + bonus -(0.1 *basicSalary);

        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Salary: Rp " + basicSalary);
        System.out.println("Transport Allowance: Rp " + transportAllowance);
        System.out.println("Meal Allowance: Rp " + mealAllowance);
        System.out.println("Performance Bonus: Rp " + bonus);
        System.out.println("Total Salary: Rp " + totalSalary);


    }
}
