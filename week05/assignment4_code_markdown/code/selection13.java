import java.util.Scanner;

public class selection13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print SIAKAD Study Plan (KRS)---");
        System.out.print("Has the tuition fee (UKT) been paid in full? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("Tuition payment verified");
            System.out.println("Please print the Study Plan (KRS) and obtain the Academic Advisor's signature");
        }
        else {
            System.out.println("Registration rejected. Please pay your UKT first");
        }
        sc.close();
    }
}
       
