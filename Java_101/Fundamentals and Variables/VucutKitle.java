import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double kg,boy,endeks;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy=scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kg=scan.nextDouble();

        endeks=kg/(boy*boy);

        System.out.println("Vücut kitle endeksiniz : ");


    }
}
