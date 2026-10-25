import java.util.Scanner;

public class inputdinamis {
     public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        int basic_salary, childallowance, numberofchildren;
        double pensiondeduction = 0.05, totalchildallowance, totalpensionfund, netsalary;

        System.out.print("Input your basic salary: ");
        basic_salary = scanner.nextInt();
        System.out.print("Input your child allowance: ");
        childallowance = scanner.nextInt();
        System.out.print("Input your number of children: ");
        numberofchildren = scanner.nextInt();

        totalchildallowance = childallowance * numberofchildren;
        totalpensionfund = basic_salary * pensiondeduction;
        netsalary = basic_salary + totalchildallowance - totalpensionfund;

        System.out.println("Basic salary: Rp " + basic_salary);
        System.out.println("Total Child Allowance: Rp " + totalchildallowance);
        System.out.println("Total Pension Fund: Rp " + totalpensionfund);
        System.out.println("Net Salary: Rp " + netsalary);
    }
}