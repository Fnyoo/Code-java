import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int type, duration, total = 0;

        do {
            System.out.println("1 = Car");
            System.out.println("2 = Motorcycle");
            System.out.println("0 = Exit");
            System.out.print("Enter vehicle type: ");
            type = input.nextInt();

            if (type == 1 || type == 2) {
                System.out.print("Enter parking duration (hours): ");
                duration = input.nextInt();

                if (type == 1) {
                    total += duration * 3000;
                } else {
                    total += duration * 2000;
                }
            }

        } while (type != 0);

        System.out.println("Total parking fee: Rp " + total);

        input.close();
    }
}
