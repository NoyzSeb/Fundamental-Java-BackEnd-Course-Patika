import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,denom=1;
        float toplam=0f;
        System.out.println("N sayısını giriniz: ");
        n=scan.nextInt();
        
        do{
            
            toplam+=(1f/denom);
            
            denom++;
            

        }while(denom<=n);

        System.out.println(toplam);

    }
}
