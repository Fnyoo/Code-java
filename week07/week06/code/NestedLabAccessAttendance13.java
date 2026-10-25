import java.util.Scanner;

public class NestedLabAccessAttendance13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the student active? (true/false): ");
        boolean isActiveStudent = sc.nextBoolean();
        System.out.print("Is the student sanctioned? (true/false): ");
        boolean isSanctioned = sc.nextBoolean();
        System.out.print("Does the student have a lecturer permit? (true/false): ");
        boolean hasLecturerPermit = sc.nextBoolean();
        System.out.print("Is the student a lab assistant? (true/false): ");
        boolean isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        } else {
            System.out.println("Access denied: student status does not meet the requirement");
        }
        sc.close();
    }
}
