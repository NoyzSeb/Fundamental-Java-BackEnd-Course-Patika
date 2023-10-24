import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DecreasingOrder {
    public static void main(String[] args) {
        int a,b,c;
        List<Integer> order=new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        for(int i =0;i<3;i++){
            order.add(scan.nextInt());
        }
        
        for(int i=1; i<order.size()-1;i++){
            if(order.get(i-1)>order.get(i)){
                Collections.swap(order, i-1, i);
            }
        }
        System.out.println(order.toString());
    } 
}
