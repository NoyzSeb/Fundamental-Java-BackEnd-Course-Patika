package Java_101.Methods_Study;
import java.util.Scanner;

public class isPrime {

    static void isPrime(int n){
        boolean is=true;
        for(int y=2;y<10;y++){
               if(n!=y && n%y==0){
                  is=false;                 
               }
            }
        if(is){
            System.out.println(n + ": is  PRIME !"); 
        }else{
            System.out.println(n + ": is NOT PRIME !"); 
        }
      
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Please enter the number:");
        num=scan.nextInt();

        scan.close();
        isPrime(num);

    }
}
