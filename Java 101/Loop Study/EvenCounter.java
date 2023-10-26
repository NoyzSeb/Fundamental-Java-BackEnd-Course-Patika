import java.util.Scanner;

public class EvenCounter {
    public static void main(String[] args) {
        int count=0,sum=0,num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayıyı giriniz: ");
        num=scan.nextInt();

        for(int i=3;i<=num;i++){
            
            if(i%3==0) {sum+=i; count++;}

            if(i%4==0) {sum+=i; count++;}
        }
         
        System.out.println("Toplam: " + sum );
        System.out.println("Sayaç: " + count );



    }
}
