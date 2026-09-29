import java.util.Scanner;

public class Assignmentloket13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int serviceCode;
        System.out.println("--- Academic Queue Machine ---");
        System.out.print("Enter service code: ");
        serviceCode = sc.nextInt();
        switch (serviceCode) {
            case 1:
                System.out.println("Service: Degree Legalization");
                System.out.println("Counter: Counter A");
                break;
            case 2:
                System.out.println("Service: Active Student Certificate");
                System.out.println("Counter: Counter B");
                break;
            case 3:
                System.out.println("Service: Tuition Fee Payment");
                System.out.println("Counter: Counter C");
                break;
            case 4:
                System.out.println("Service: Academic Leave Application");
                System.out.println("Counter: Counter D");
                break;
            default:
                System.out.println("Service code is not available");
        }
        sc.close();
    }
}
