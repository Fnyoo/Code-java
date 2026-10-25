import java.util.Scanner;

public class CaseStudy1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int PRICE_PER_CUP = 18000;

        System.out.print("Enter the number of cups: ");
        int quantity = input.nextInt();

        int totalPrice = quantity * PRICE_PER_CUP;
        double discount = 0;
        if (totalPrice >= 100000) {
            discount = totalPrice * 0.10;
        }

        double finalPayment = totalPrice - discount;
        System.out.println("Total price: Rp" + totalPrice);
        System.out.println("Discount: Rp" + discount);
        System.out.println("Total payment: Rp" + finalPayment);

        System.out.print("Enter the amount paid: Rp");
        double payment = input.nextDouble();
        System.out.println("Change: Rp" + (payment - finalPayment));
        input.close();
    }
}
