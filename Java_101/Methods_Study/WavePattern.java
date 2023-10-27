package Java_101.Methods_Study;
import java.util.Scanner;

public class WavePattern {
    static void loop(int sayi) {
        System.out.print(sayi + " ");
        if (sayi > 0) {
            loop(sayi - 5);
        }
        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N Number: ");
        int n = scan.nextInt();
        scan.close();
        loop(n);
    }
}
