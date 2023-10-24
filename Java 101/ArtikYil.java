import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yil;
        
        System.out.println("Yıl giriniz: ");
        yil=scan.nextInt();

        if(yil%100!=0){
           switch(yil%4){
               case 0: System.out.println(yil+" Artık yıldır."); break;
               default: System.out.println(yil+" Artık yıl değildir.");
           }
        }else{
            System.out.println(yil+" Artık yıl değildir.");
        }
    }
}
