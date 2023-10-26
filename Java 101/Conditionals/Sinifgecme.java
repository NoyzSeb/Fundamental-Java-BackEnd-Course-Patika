import java.util.Scanner;

public class Sinifgecme {
    public static void main(String[] args) {
        int mat,fiz,tür,kim,müz,toplam=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz.");
        mat=scan.nextInt();
        toplam +=(mat>=0&&mat<=100) ? mat:0;
        System.out.println("Fizik notunu giriniz.");
        fiz=scan.nextInt();
        toplam +=(fiz>=0&&fiz<=100) ? fiz:0;
        System.out.println("Türkçe notunu giriniz.");
        tür=scan.nextInt();
        toplam +=(tür>=0&&tür<=100) ? tür:0;
        System.out.println("Kimya notunu giriniz.");
        kim=scan.nextInt();
        toplam +=(kim>=0&&kim<=100) ? kim:0;
        System.out.println("Müzik notunu giriniz.");
        müz=scan.nextInt();
        toplam +=(müz>=0&&müz<=100) ? müz:0;
        
        System.out.println(toplam/5);

        if(toplam/5>=55){
            System.out.println("Geçtiniz.");
        }else{
            System.out.println("Geçemediniz.");
        }

    }
}
