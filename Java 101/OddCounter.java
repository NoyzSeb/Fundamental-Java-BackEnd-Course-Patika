import java.util.Scanner;

public class OddCounter {
    public static void main(String[] args) {
        int i=0,sum=0;
        
        Scanner scan= new Scanner(System.in);
        
        
        do{
            
            System.out.println("Lütfen Çift Sayı giriniz");
            i=scan.nextInt();
            sum+=i;

        }while(i%3!=0 || i%2==0);

        System.out.println(sum);
    } 
}
