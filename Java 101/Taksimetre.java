import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        Scanner scan=new Scanner(System.in);

        System.out.println("Mesafeyi Kilometre Cinsinden Giriniz.");
        km=scan.nextInt();
        
        String tutar=(km*2.20<=20) ? "Borcunuz 30tl" : "Borcunuz "+((km*2.20)+10)+"tl";

        System.out.println(tutar);

    }
}
