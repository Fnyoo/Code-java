import java.util.Scanner;

public class CaseStudy2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Activity type (BELMAWA/BAKORMA/Mandiri/PKM/Other): ");
        String activity = input.nextLine().trim();
        boolean eligible = false;
        String reason;

        if (activity.equalsIgnoreCase("BELMAWA")
                || activity.equalsIgnoreCase("BAKORMA")
                || activity.equalsIgnoreCase("Mandiri")) {
            System.out.print("Enter winning place (1/2/3/Honorable Mention/Participant): ");
            String place = input.nextLine().trim();
            eligible = place.equals("1") || place.equals("2") || place.equals("3");
            reason = eligible ? "Eligible based on winning place." : "Only 1st, 2nd, or 3rd place qualifies.";
        } else if (activity.equalsIgnoreCase("PKM")) {
            System.out.print("Was the proposal approved for funding? (yes/no): ");
            eligible = input.nextLine().trim().equalsIgnoreCase("yes");
            reason = eligible ? "PKM proposal was approved for funding." : "PKM proposal was not approved for funding.";
        } else {
            reason = "Other activity types do not receive award funds.";
        }

        if (eligible) {
            System.out.print("How many required documents have been uploaded (0-4)? ");
            int documents = input.nextInt();
            if (documents >= 4) {
                System.out.println("Award fund status: ELIGIBLE");
                System.out.println("Reason: " + reason);
            } else {
                System.out.println("Award fund status: NOT ELIGIBLE");
                System.out.println("Reason: Documents are incomplete.");
                System.out.println("Missing documents: " + Math.max(0, 4 - documents));
            }
        } else {
            System.out.println("Award fund status: NOT ELIGIBLE");
            System.out.println("Reason: " + reason);
        }
        input.close();
    }
}
