import java.util.Scanner;
    
public class Triangle13 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of side a: ");
        int base, height;
        float area;
        System.out.print("Input base: ");

        base = sc.nextInt();
        System.out.print("Input height: ");
        height = sc.nextInt();
        area = (base * height) / 2;

        System.out.println("The area of the triangle is: " + area);
        base = sc.nextInt();
        height = sc.nextInt();

        double final_save_amount;
        System.out.print("Input your initial savings amount:");
    }
}
