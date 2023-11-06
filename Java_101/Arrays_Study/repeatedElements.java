package Java_101.Arrays_Study;

import java.util.ArrayList;

public class repeatedElements {
    public static void main(String[] args) {
        int[] arr ={10, 20, 20, 10, 10, 20, 5, 20};
        ArrayList<Integer> arrList= new ArrayList<>();
        ArrayList<Integer> tempArrList= new ArrayList<>();
        for(int n:arr){
           arrList.add(n);
        }

        for(int i=0;i<arrList.size();i++){
            int counter=0;
            for(int y=0;y<arrList.size();y++){
                if(arrList.get(i)==arrList.get(y)){
                    counter+=1;

                }
            }
            if(!tempArrList.contains(arrList.get(i))){
                tempArrList.add(arrList.get(i));
                System.out.println(arrList.get(i)+" "+"sayısı dizide "+counter+" geçmiştir.");
            }
            
            
        }

     }
}
