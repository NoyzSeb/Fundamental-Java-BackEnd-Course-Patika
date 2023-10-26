package Java_101.Methods_Study;
import java.util.Scanner;

public class powerCalc {
    static int power(int base,int pow){
        int result=1;
          
        for(int i=1;i<=pow;i++){
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base,pow;

        System.out.println("Please enter the base digit:");
        base=scan.nextInt();

        System.out.println("Please enter the power digit:");
        pow=scan.nextInt();
        
        scan.close();
        System.out.println(power(base, pow));
    }
}
