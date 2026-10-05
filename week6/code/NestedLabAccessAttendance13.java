import java.util.Scanner;
public class NestedLabAccessAttendance13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasLecturerPermit;
        boolean isLabAssistant;
        
        System.out.println();
        isActiveStudent = sc.nextBoolean();

        System.out.println();
        isSanctioned = sc.nextBoolean();

        System.out.println();
        hasLecturerPermit = sc.nextBoolean();

        System.out.println();
        isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } 
            else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
            } 
            else {
                System.out.println("Access denied: student status does not meet the requirement");
            }
            sc.close();
    }
    
}