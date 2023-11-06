package Java_101.Arrays_Study;



public class repeatedEvens {
    public static void main(String[] args) {
        int [] arr={0,1,2,2,3,44,4,5,5,6,6};

        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
              for(int y=0;y<arr.length;y++){
                if(arr[y]==arr[i] && i!=y){
                     System.out.println(arr[y]);
                }
            }
           }
        }
    

       
    }
}
