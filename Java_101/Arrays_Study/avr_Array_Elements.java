package Java_101.Arrays_Study;
import java.util.Scanner;

public class avr_Array_Elements {
    
    static float harmonic_sum_calc(int n){
        
        if (n==1){
            return 1;
        }
        
        return harmonic_sum_calc(n-1)+((float)1/n);

    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the desired series");
        int n= scan.nextInt();
        scan.close();

        System.out.println((n)/harmonic_sum_calc(n));

    }
}
