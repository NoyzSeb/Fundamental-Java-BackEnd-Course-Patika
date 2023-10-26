package Java_101.Methods_Study;
import java.util.Scanner;

public class calculator {

    static int sum(int a,int b){
        return a+b;
    }
    
    static int sub(int a,int b){
        return a-b;
    }

    static double multiply(int a,int b){
        return a*b;
    }

    static double div(int a,int b){
        return a/b;
    }

    static int power(int base,int pow){
        int result=1;
          
        for(int i=1;i<=pow;i++){
            result *= base;
        }
        return result;
    }

    static int factorial(int a){
        
        if(a==1){
            return 1;
        }

        return a*factorial(a-1);
    }

    static double mod(int a,int b){
        return a%b;
    }

    static void rect_Area_Perimiter(int a,int b){
        int area = a*b,per=(a+b)*2;
      
         
        System.out.println("Area :"+ area + "\n"+ "Perimeter :" + per);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;

        System.out.println("Please enter the first digit:");
        a=scan.nextInt();

        System.out.println("Please enter the second digit:");
        b=scan.nextInt();
        
        System.out.println("Press the number that matches to your willing:\n" + //
                "1-Summary\n"+ //
                "2-Substraction\n"+ //
                "3-Multiply\n"+ //
                "4-Divide\n" + //
                "5-Power\n" + //
                "6-Factorial\n" + //
                "7-Mod\n" + //
                "8-rect_Area_Perimiter");
        c=scan.nextInt();

        scan.close();
        
        switch(c){
            case 1: System.out.println("Summary: " + sum(a,b)); break;
            case 2: System.out.println("Substraction: "+ sub(a,b)); break;
            case 3: System.out.println("Multiply: "+ multiply(a,b)); break;
            case 4: System.out.println("Divide: "+ div(a,b)); break;
            case 5: System.out.println("Power: "+ power(a,b)); break;
            case 6: System.out.println("Factorial: "+ factorial(a)); break;
            case 7: System.out.println("Mod: "+ mod(a,b)); break;
            case 8: rect_Area_Perimiter(a,b); break;
            default: System.out.println("Lütfen geçerli bir işlem giriniz.");
        }
    }
}
