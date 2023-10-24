import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> primeList = new ArrayList<>();
       

        for(int i=1; i<=100;i++){
            for(int y=1;y<10;y++){
               if(i!=y && i%y==0){
                   continue;
               }
                System.out.println(y);
            }
        }

       // System.out.println(primeList);
    }
}
