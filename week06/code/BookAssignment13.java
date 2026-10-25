import java.util.Scanner;

public class BookAssignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookType;
        int quantity;
        double discount;

        System.out.print("Book type (Dictionary/Novel/Other): ");
        bookType = sc.nextLine();

        System.out.print("Number of books: ");
        quantity = sc.nextInt();

        if (bookType.equalsIgnoreCase("Dictionary")) {
            discount = 10;

            if (quantity > 2) {
                discount = discount + 2;
            }

        } else if (bookType.equalsIgnoreCase("Novel")) {
            discount = 7;

            if (quantity > 3) {
                discount = discount + 2;
            } else {
                discount = discount + 1;
            }

        } else {
            discount = 0;

            if (quantity > 3) {
                discount = 5;
            }
        }

        System.out.println("Discount received: " + discount + "%");

        sc.close();
    }
}