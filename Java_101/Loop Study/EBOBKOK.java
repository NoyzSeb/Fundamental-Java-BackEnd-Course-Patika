import java.util.Scanner;

public class EBOBKOK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bn,bm,ebob=0,ekok,n=0, m=0;

        System.out.println("EBOB sayılarınızı giriniz.");
        bn=scan.nextInt();
        
        scan.nextLine();
        
        bm=scan.nextInt();

        

       
        if(bn>=bm){
            m=bn;
        }else{
            m=bn;
        }

        do{
            n++;
            if(bn%n==0&&bm%n==0){
                ebob=n;
            }
        }while(n<=m);
         
        ekok=(bn*bm)/ebob;

        System.out.println("Ebob:" + ebob + " Ekok: " + ekok);
        
    }
}
