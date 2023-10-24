import java.util.Scanner;

public class fourAndfivePowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int say;

        System.out.println("Lütfen sayı giriniz.");
        say = scan.nextInt();

        
            for(int j=1;j<say;j*=4){
                System.out.println(j + " -- 4'in kuvveti.");
            }
            


             
             for(int i=1;i<say;i*=5){
                System.out.println(i + " -- 5'in kuvveti.");
            }
            

           
       
        

    }
}
