import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
   public static void main(String[] args) {
     List<Integer> fibo_List = new ArrayList<>();
     fibo_List.add(0);
     fibo_List.add(1);

     int i=0;
     int y=1;
      for(int n=0 ; n<8;n++){
          int z=y+i;
          fibo_List.add(z);
          i=y;
          y=z;

        }

     System.out.println(fibo_List);
   }

}
