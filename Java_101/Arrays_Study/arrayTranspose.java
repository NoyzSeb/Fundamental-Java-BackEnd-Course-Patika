package Java_101.Arrays_Study;

import java.util.*;

public class arrayTranspose {
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the row quantity.");
        int r= scan.nextInt();
        System.out.println("Please enter the column quantity.");
        int c= scan.nextInt();
        int tempC=c;
        int tempR=r;
        int[][] mtrx = new int[r][c];
        int[][] Tmtrx = new int[c][r];
        
        do{
          c=tempC;
            do{
               mtrx[tempR-r][tempC-c]=scan.nextInt();
               c--;
            }while(c>0);
           r--;
        }while(r>0);
        
        r=tempR;
        c=tempC;

        do{
          c=tempC;
            do{
               Tmtrx[tempC-c][tempR-r]=mtrx[tempR-r][tempC-c];
               c--;
            }while(c>0);
           r--;
        }while(r>0);
        
        System.out.println("Original Matrix");
        print2D(mtrx);
        System.out.println("Transposed Matrix");
        print2D(Tmtrx);
        scan.close();
    }
}
