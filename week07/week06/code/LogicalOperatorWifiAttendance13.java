import java.util.Scanner;

public class LogicalOperatorWifiAttendance13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the user a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Is the user a lecturer? (true/false): ");
        boolean isLecturer = sc.nextBoolean();

        System.out.print("Is the account currently blocked? (true/false): ");
        boolean isBlocked = sc.nextBoolean();

        if ((isStudent || isLecturer) && !isBlocked) {
            System.out.println("WiFi access granted");
        } else {
            System.out.println("WiFi access denied");
        }
        sc.close();
    }
}
