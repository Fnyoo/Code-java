import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TICKET_PRICE = 50000;

        int ticketQuantity;
        int totalTickets = 0;
        int totalCustomers = 0;
        double totalRevenue = 0;

        while (true) {
            System.out.print("Enter ticket quantity :");
            ticketQuantity = input.nextInt();

            // 0 = end of the day
            if (ticketQuantity == 0) {
                break;
            }

            // Negative quantity is invalid, ask again
            if (ticketQuantity < 0) {
                System.out.println("Invalid input! Please try again.");
                continue;
            }

            double totalPrice = ticketQuantity * TICKET_PRICE;
            double discount = 0;

            if (ticketQuantity > 10) {
                discount = 0.15;
            } else if (ticketQuantity > 4) {
                discount = 0.10;
            }

            double finalPrice = totalPrice - (totalPrice * discount);

            totalTickets += ticketQuantity;
            totalRevenue += finalPrice;
            totalCustomers++;

            System.out.println("Discount: " + (discount * 100) + "%");
            System.out.println("Total payment: Rp " + finalPrice);
        }

        System.out.println("Total customers : " + totalCustomers);
        System.out.println("Total tickets   : " + totalTickets);
        System.out.println("Total revenue   : Rp " + totalRevenue);

        input.close();
    }
}
