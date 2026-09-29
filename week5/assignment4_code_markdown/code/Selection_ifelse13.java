import java.util.Scanner;

public class Selection_ifelse13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Print KRS SIAKAD ---");
        System.out.print("Enter current Semester: ");
        int semester = sc.nextInt();
        if (semester == 1) {
            System.out.println("KRS Semester 1 Displayed");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 Displayed");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 Displayed");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 Displayed");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 Displayed");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 Displayed");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 KRS Displayed");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 KRS Displayed");
        } else {
            System.out.println("Invalid semester");
        }
        sc.close();
    }
}
