import java.util.*;
import java.lang.Math;


public class HipotenüsBul {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double a,b,c,C;
        System.out.println("A kenarı:");
        a=scan.nextDouble();
        System.out.println("B kenarı:");
        b=scan.nextDouble();
    
        C=Math.pow(a, 2)+Math.pow(b, 2);

        c=Math.sqrt(C);
      
        System.out.println("Hipotenüs:"+c+"\nÜçgenin Çevresi:"+((a+b+c))+"\nAlan:"+(a*b)/2);
    


    }
}
