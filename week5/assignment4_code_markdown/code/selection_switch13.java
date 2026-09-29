import java.util.Scanner;

public class selection_switch13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD ---");
        System.out.print("Enter current Semester:");
        int semester = sc.nextInt();
        switch (semester) {
            case 1:
                System.out.println("KRS Semester 1 Displayed");
                break;
            case 2:
                System.out.println("KRS Semester 2 Displayed");
                break;
            case 3:
                System.out.println("KRS Semester 3 Displayed");
                break;
            case 4:
                System.out.println("KRS Semester 4 Displayed");
                break;
            case 5:
                System.out.println("KRS Semester 5 Displayed");
                break;
            case 6:
                System.out.println("KRS Semester 6 Displayed");
                break;
            case 7:
                System.out.println("KRS Semester 7 KRS Displayed");
                break;
            case 8:
                System.out.println("KRS Semester 8 KRS Displayed");
                break;
            
            default:
                System.out.println("Invalid semester");
        }
        sc.close();
    }
}
