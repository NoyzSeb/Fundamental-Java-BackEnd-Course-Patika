import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double elma,armut,domates,muz,patlıcan;
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen elma ağırlığını giriniz : ");
        elma =scan.nextDouble()*3.67;

        System.out.println("Lütfen armut ağırlığını giriniz : ");
        armut=scan.nextDouble()*2.14;

        System.out.println("Lütfen domates ağırlığını giriniz : ");
        domates=scan.nextDouble()*1.11;

        System.out.println("Lütfen muz ağırlığını giriniz : ");
        muz=scan.nextDouble()*0.95;

        System.out.println("Lütfen patlıcan ağırlığını giriniz : ");
        patlıcan=scan.nextDouble()*5.00;

        System.out.println("Toplam Borcunuz : "+(elma+armut+domates+muz+patlıcan) );

        
    }
}
