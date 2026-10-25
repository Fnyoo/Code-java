import java.util.Scanner;

public class BookAssignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Book type (Dictionary/Novel/Other): ");
        String bookType = sc.nextLine().trim();
        System.out.print("Number of books: ");
        int quantity = sc.nextInt();

        double discount = 0;
        if (quantity < 0) {
            System.out.println("Invalid quantity. Please enter a non-negative number.");
            sc.close();
            return;
        }

        if (bookType.equalsIgnoreCase("Dictionary")) {
            discount = 10;
            if (quantity > 2) discount += 2;
        } else if (bookType.equalsIgnoreCase("Novel")) {
            discount = 7;
            if (quantity > 3) discount += 2;
            else discount += 1;
        } else if (quantity > 3) {
            discount = 5;
        }

        System.out.println("Discount received: " + discount + "%");
        sc.close();
    }
}
