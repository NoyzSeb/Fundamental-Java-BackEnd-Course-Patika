import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km,yas,tip;
        double totalPrice,kmPrice=0.10,dc=0;

        Scanner scan=new Scanner(System.in);
        
        System.out.println("Mesafeyi Km türünden giriniz.");
        km=scan.nextInt();
        while(km<0){
           System.out.println("Kilometreyi yanlış girdiniz lütfen tekrar giriniz.");
           km =scan.nextInt();

        }

        System.out.println("Yasinizi giriniz.");
         yas = scan.nextInt();
        while(yas<0){
           System.out.println("Hatalı yaş girdiniz lütfen tekrar giriniz.");
           yas =scan.nextInt();

        }

        System.out.println("Yolculuk tipini giriniz.\n1-Tek Yön\n2-Gidis Donus\n");
        tip=scan.nextInt();
        while(tip!=1&&tip!=2){
           System.out.println("Hatalı tip girdiniz lütfen tekrar giriniz.");
           tip =scan.nextInt();

        }

        if(yas<12){
            dc=5;
        }else if(12<=yas&&yas<=24){
            dc=1;
        }else if(yas>=65){
             dc=3;
        }

        switch(tip){
            case 1: break;
            
            case 2: dc+=2;

        }
        

        totalPrice=(km*kmPrice);
        totalPrice=totalPrice-(totalPrice*(dc/10));
        
        System.out.println(dc);
        System.out.println(totalPrice);
        

    }
}
