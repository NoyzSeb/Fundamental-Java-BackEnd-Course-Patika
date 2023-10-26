import java.util.Scanner;

public class HavayaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int derece=0;
        Scanner scan = new Scanner(System.in);
        derece=scan.nextInt();
        if(derece<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(derece>=5&&derece<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if(derece>=15&&derece<=25){
            System.out.println("Piknik yapabilirsiniz.");            
        }else if(derece>=25){
            System.out.println("Yüzmeye gidebilirsiniz.");            
        }
    }
}
