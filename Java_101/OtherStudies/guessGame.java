package Java_101.OtherStudies;
import java.util.*;
public class guessGame {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);

        Scanner scan = new Scanner(System.in);
        int right = 0;
        boolean isWin = false;
        boolean isWrong = false;
        while (right < 5) {
            System.out.print("Please enter your guess : ");
           int selected = scan.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please make your guess in between 0-100.");
            }
            
            if (selected == number) {
                System.out.println("Congratulations ! Secret number is : " + number);
                isWin = true;
                break;
            } else {
                right++;
                System.out.println("Wrong guess ! Your remaining right :" + (5-right));
                 
        
                }
            }

            if (!isWin) {
                System.out.println("Game Over !");
            }
    }
}
