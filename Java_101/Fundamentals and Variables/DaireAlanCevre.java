import java.lang.Math;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class DaireAlanCevre {
    public static void main(String[] args) {
        double r,alan,cevre,dilimAlan,aci;
 
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Dairenin yarı çapını giriniz:");
        r=scan.nextDouble();

        System.out.println("Dilimin merkez açı ölçüsünü giriniz:");
        aci=scan.nextDouble();
        

        alan = Math.PI*(Math.pow(r, 2));
        cevre=2*Math.PI*r;

        dilimAlan=(alan*aci)/360;

        System.out.println("Daire diliminin alanı: "+dilimAlan+"\nDaire alanı: "+alan);

    }
}
