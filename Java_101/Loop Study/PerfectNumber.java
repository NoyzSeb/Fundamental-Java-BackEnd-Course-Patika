import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int number,n=1, sum=0;

        System.out.println("Bir sayı giriniz.");
        number=scan.nextInt();

        while(n<number-1){
            n++;
            if(number%n==0){
                sum+=n;
            }
        }

        System.out.println(sum);

        if(sum==number){
            System.out.println(number + " Mükemmel sayıdır.");
        }else{
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}
