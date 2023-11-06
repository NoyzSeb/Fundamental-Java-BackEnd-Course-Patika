package Java_101.Arrays_Study;
import java.util.*;


public class arraySorter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the desired series");
        int n= scan.nextInt();
        System.out.println("Please enter the series");
        ArrayList<Integer> arr= new ArrayList<>();

        do{
            arr.add(scan.nextInt());
            n-=1;
        }while(n>0);

        scan.close();
        Collections.sort(arr);
        
        System.out.println("Length of series : "+arr.size()+"\nSorted Series : "+ arr );
    }
}
