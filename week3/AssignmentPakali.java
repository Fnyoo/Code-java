import java.util.Scanner;

public class AssignmentPakali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double motorkredit;
        int month;
        double deposit;
        double interest_rate=0.01;
        
        System.out.print("Motorcycle prices: ");
        motorkredit = input.nextDouble();

        System.out.print("Monthly installment: ");
        month = input.nextInt();

        System.out.print("Down payment: ");
        deposit = input.nextDouble();

        double remaining_price = motorkredit - deposit;
        double totalinterest = remaining_price * interest_rate;
        double  monthly_payment= (remaining_price / month) + totalinterest;

        System.out.println("monthly interest: " + totalinterest);
        System.out.println("total monthly payment: " + monthly_payment);
        
    }
}
