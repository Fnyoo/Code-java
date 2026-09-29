import java.util.Scanner;

public class selectionif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCredits;
        System.out.print("Enter the number of credits: ");
        numberOfCredits = sc.nextInt();
        if (numberOfCredits > 24) {
            System.out.println("KRS is valid");
        } else {
            System.out.println("KRS is not valid");
        }
        sc.close();
    }
}
