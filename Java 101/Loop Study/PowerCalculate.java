import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r,p,sum=1;
        
        System.out.println("Kök giriniz: ");
        r=scan.nextInt();

        System.out.println("Kuvvet giriniz: ");
        p=scan.nextInt();

        for(int i=0; i<p;i++){
            sum*=r;
        }
       
        System.out.println(sum);
    }
}
