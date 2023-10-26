import java.util.*;

public class MinMax{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0,count=0;
        List<Integer> numberList = new ArrayList<>();

        System.out.println("Kaç tane sayı gireceksiniz.");
        n=scan.nextInt();

        do{
           
            System.out.println(count+" Sayıyı giriniz.");
            numberList.add(scan.nextInt());
            count++;

        }while(count<n);

        for(int i : numberList){
            System.out.println(numberList.indexOf(i)+ " Sayı: "+ i);
        }

        System.out.println("En büyük sayı "+Collections.max(numberList));
        System.out.println("En küçük sayı "+Collections.min(numberList));

        
    }
}