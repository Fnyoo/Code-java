import java.util.Scanner;

public class Assignment1SelectionAttendance13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Has the tuition fee been paid in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String message = uktLunas
                ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                : "Pembayaran UKT belum lunas\nSilakan lunasi UKT terlebih dahulu";
        
        System.out.println(message);
    }
}
