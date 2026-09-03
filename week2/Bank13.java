import java.util.Scanner;

public class Bank13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int init_sav_amount, sav_period;
        double final_sav_amount, interest, interest_percent =0.02; 

        System.out.print("Input your initial savings amount: ");
        init_sav_amount = scanner.nextInt();
        System.out.print("Input your savings period in years: ");
        sav_period = scanner.nextInt();

        interest = init_sav_amount * interest_percent * sav_period;
        final_sav_amount = init_sav_amount + interest;
        System.out.println("Interest: " + interest);
        System.out.println("Final savings amount: " + final_sav_amount);
        
    }
}