import java.io.Console;
import java.util.*;

public class KDV_Hesap{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fiyat,kdvli,kdvMiktar;
        final double kdv=0.18;
        System.out.println("Lütfen para miktarını giriniz:");
        fiyat = scan.nextDouble();

        kdvli=fiyat+(fiyat*kdv);
        
        kdvMiktar=kdvli-fiyat;

        System.out.println("Fiyat:"+fiyat+"\nKDV'li Fiyat:"+kdvli+"\nKDV Miktarı:"+kdvMiktar);


    }
}