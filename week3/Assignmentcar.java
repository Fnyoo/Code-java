import java.util.Scanner;
public class Assignmentcar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int distance;
        int fuel_consumption_per_kilometer = 2;
        double Price_of_1_liter_of_gasoline= 10000;
        double totalfuel;

        System.out.print("distance to be traveled (km): ");
        distance = input.nextInt();

        double fuel = distance / fuel_consumption_per_kilometer;
        totalfuel = fuel * Price_of_1_liter_of_gasoline;

        System.out.println("Total amount of gasoline needed: " + totalfuel + "rupiah");

    }
}
