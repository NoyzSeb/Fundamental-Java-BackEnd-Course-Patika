package Java_101.Methods_Study;

public class PolindromNumb {
    static boolean isPolindrom(int number){
            int tmp = number, reverse=0, latestNumber;
            
            while(tmp!=0){
                latestNumber = tmp % 10;
                tmp= tmp/10; 
                reverse = (reverse*10) + latestNumber;
            }
    
            if(reverse==number){
                return true;
            }
            else{
                return false;
            }
        }
    public static void main(String[] args) {
         System.out.println(isPolindrom(2002));
    }
}
