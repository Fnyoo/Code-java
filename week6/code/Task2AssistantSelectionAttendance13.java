import java.util.Scanner;

public class Task2AssistantSelectionAttendance13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message;

        System.out.print("Is the student active? (Yes/No): ");
        String active = sc.nextLine();

        System.out.print("Is the student under academic sanction? (Yes/No): ");
        String sanction = sc.nextLine();

        if (active.equalsIgnoreCase("Yes") && sanction.equalsIgnoreCase("No")) {

            System.out.print("Enter Basic Programming grade: ");
            int grade = sc.nextInt();

            sc.nextLine();

            System.out.print("Does the student have a programming competency certificate? (Yes/No): ");
            String certificate = sc.nextLine();

            if (grade >= 80 || certificate.equalsIgnoreCase("Yes")) {

                System.out.print("Enter interview score: ");
                int interviewScore = sc.nextInt();

                if (interviewScore >= 75) {
                    message = "The student is accepted as a lab assistant.";
                } else {
                    message = "Failed! The interview score is below 75.";
                }

            } else {
                message = "Failed! The Basic Programming grade is below 80 and there is no programming competency certificate.";
            }

        } else if (!active.equalsIgnoreCase("Yes")) {
            message = "Failed! The student is not active.";
        } else {
            message = "Failed! The student is currently under academic sanction.";
        }

        System.out.println("\n=== SELECTION RESULT ===");
        System.out.println(message);

        sc.close();
    }
}