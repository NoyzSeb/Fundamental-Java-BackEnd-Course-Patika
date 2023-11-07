package Java_101.OtherStudies;

public class polindrome {

    static boolean isPolindrome(String str){
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isPolindrome("abb"));
    }
}
