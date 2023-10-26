import java.util.Scanner;

public class DigitSummary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,bol=10,toplam=0;
        
        System.out.println("Sayıyı giriniz: ");
        num=scan.nextInt();
        
        do{
            
            System.out.println((num%bol)/(bol/10));
            bol*=10f;

            toplam=(num%bol)/(bol/10);

            System.out.println(toplam);


        }while(bol<num*10);

        

                        


    }
}