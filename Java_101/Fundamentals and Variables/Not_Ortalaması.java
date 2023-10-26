import java.util.*;

public class Not_Ortalaması{
   

    public static void main(String[] args) {
        
        int mat,fiz,tür,kim,müz,tar;
        
        Scanner scan=new Scanner(System.in);

        System.out.println("Matematik Notunu giriniz:");
        mat=scan.nextInt();
        
        System.out.println("Fizik Notunu giriniz:");
        fiz=scan.nextInt();

        System.out.println("Kimya Notunu giriniz:");
        kim=scan.nextInt();

        System.out.println("Türkçe Notunu giriniz:");
        tür=scan.nextInt();

        System.out.println("Müzik Notunu giriniz:");
        müz=scan.nextInt();

        System.out.println("Tarih Notunu giriniz:");
        tar=scan.nextInt();

        scan.close();
       int toplam = (mat+fiz+tür+kim+müz+tar);
       double ort = toplam/6.0;
       String gec=(ort>=60) ? "Geçtiniz":"Kaldınız";

       System.out.println(gec);

    }
}