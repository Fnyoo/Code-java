import java.util.Scanner;

public class SiakadForAttendance13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score, highest = 0, lowest = 100;
        int pass = 0, fail = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter Score for student" + i + ":");
            score = sc.nextDouble();

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }

            // Passing threshold: minimum score of 60
            if (score >= 60) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Students passed: " + pass);
        System.out.println("Students failed: " + fail);

        sc.close();
    }
}
