import java.util.*;
public class HesapMakinesi {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a,b,c;

        System.out.println("Lütfen ilk sayıyı giriniz:");
        a=scan.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz:");
        b=scan.nextInt();
        
        System.out.println("İşleminize denk gelen rakamı giriniz: \n1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        c=scan.nextInt();

        scan.close();
        
        switch(c){
            case 1: System.out.println("Toplam: "+(a+b)); break;
            case 2: System.out.println("Fark: "+(a-b)); break;
            case 3: System.out.println("Bölme: "+(a/b)); break;
            case 4: System.out.println("Çarpım: "+(a*b)); break;
            default: System.out.println("Lütfen geçerli bir işlem giriniz.");
        }
        

    }
}
