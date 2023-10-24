import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
         int month,day;
         double date;
         Scanner scan = new Scanner(System.in);
         System.out.println("Doğum Ayınızın rakamını giriniz.");
         month=scan.nextInt();

         System.out.println("Doğum gününüzü giriniz.");
         day=scan.nextInt();

         date= month+(day/1000);
         System.out.println(date);

        if(3.20<=date&&date<=3.21){
              System.out.println("Koç");
        }else if(4.21<=date&&date<=5.21){
              System.out.println("Boğa ");

        }else if(5.22<=date&&date<=6.22){
              System.out.println("İkizler ");

        }else if(6.23<=date&&date<=7.22){
              System.out.println("Yengeç");

        }else if(7.23<=date&&date<=8.22){
              System.out.println("Aslan");

        }else if(8.23<=date&&date<=9.22){
              System.out.println("Başak");

        }else if(9.23<=date&&date<=10.22){
              System.out.println("Terazi");

        }else if(10.23<=date&&date<=11.21){
              System.out.println("Akrep");

        }else if(11.22<=date&&date<=12.21){
              System.out.println("Yay");

        }else if(12.22<=date&&date<=1.21){
              System.out.println("Oğlak");

        }else if(1.22<=date&&date<=2.19){
              System.out.println("Kova");

        }else if(2.20<=date&&date<=3.20){
              System.out.println("Balık");

        }
    }
}
