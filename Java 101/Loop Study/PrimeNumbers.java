import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> primeList = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());
        

       for(int i=0; i<=98;i++){
            for(int y=2;y<10;y++){
               if(i!=y && i%y==0){
                  primeList.remove(Integer.valueOf(i));
                 continue;
               }
            }
        }

       System.out.println(primeList);
    }
}
