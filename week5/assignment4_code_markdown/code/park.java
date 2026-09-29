import java.util.Scanner;

public class park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parkingDuration;
        int totalCost = 0;
        System.out.print("Enter parking duration: ");
        parkingDuration = sc.nextInt();
        if (parkingDuration <= 2) {
            totalCost = 2000;
        } else {
            totalCost = 2000 + (parkingDuration - 2) * 1000;
        }
        System.out.println("The total parking cost for " + parkingDuration
                + " hours is: Rp " + totalCost);
        sc.close();
    }
}
