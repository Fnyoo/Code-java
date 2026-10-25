import java.util.Scanner;
public class Experiment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price;
        double discount;
        double discountCode = 0.15;
        double totalPayment;

        System.out.print("Enter the price of the clothes Rp : ");
        price = input.nextInt();
        discount = price * discountCode;
        totalPayment = price - discount;

        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Total Payment: " + totalPayment);

    }
}
