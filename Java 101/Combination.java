import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n,r,c,nf=1,rf=1,Nr,Nrf=1;

        System.out.println("Kümenin eleman sayısını giriniz");
        n=scan.nextInt();

        System.out.println("Kombinasyonların eleman sayısını giriniz");
        r=scan.nextInt();
        
        Nr=n-r;

        do{
            nf*=n;
            n--;

        }while(n>0);
        do{
            rf*=r;
            r--;

        }while(r>0);

        do{
            Nrf*=Nr;
            Nr--;

        }while(Nr>0);

        c=nf/(rf*Nrf);
        
        System.out.println(nf);
        System.out.println("Kombinasyon: "+ c);



    }
}
