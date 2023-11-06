package Java_101.Arrays_Study;
import java.util.*;
public class max_min_Arrays {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the reference number.");
        int n= scan.nextInt();
        scan.close();

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        ArrayList<Integer> tempMin=new ArrayList<Integer>();
        ArrayList<Integer> tempMax=new ArrayList<Integer>();

        System.out.println(Arrays.toString(list));

        for(int i:list){
            if(i<n){tempMin.add(i);}
        }
        for(int i:list){
            if(i>n){tempMax.add(i);}
        }
        
        System.out.println("Entered Number : "+n);
        System.out.println("Closest number that larger from entered number : "+ tempMax.get(0));
        System.out.println("Closest number that smaller from entered number : "+ tempMin.get(tempMin.size()-1));
        

    }
}
