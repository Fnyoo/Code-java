import java.util.Scanner;

public class CafeDoWhileAttendance13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, tea, bread;
        int coffeeprice = 12000,
            teaprice = 7000,
            breadprice = 20000;
        int totalprice;
        String customername;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customername = sc.nextLine();
            if (customername.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }
            System.out.print("Coffee quantity: ");
            coffee = sc.nextInt();
            System.out.print("Tea quantity: ");
            tea = sc.nextInt();
            System.out.print("Bread quantity: ");
            bread = sc.nextInt();
            totalprice = (coffee * coffeeprice) + (tea * teaprice) + (bread * breadprice);
            System.out.println("Total amount to pay: Rp" + totalprice);
            sc.nextLine();
        } while (true);

        System.out.println("All transactions completed.");
        sc.close();
    }
}
