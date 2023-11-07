package Java_101.OtherStudies.MineFieldGame;
import java.util.*;


public class MineSweeper {
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
    public static void strPrint2D(String mat[][])
    {
        // Loop through all rows
        for (String[] row : mat)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    static int[][] minefieldCreator(int r, int c){
        int[][] minefield = new int[r][c];
        int mineAmount=0;
        
        do{
            int mR=(int)(Math.random()*r);
            int mC=(int)(Math.random()*c);
            if(minefield[mR][mC]!=1)
              minefield[mR][mC]=1;
            else{
                mineAmount--;
                continue;
            }
            System.out.println(mR+" "+mC);
            mineAmount++;
        }while(mineAmount<((r*c)/4));
        return minefield;
    }

    static String[][] playMapCreator(int r,int c){
        String [][] playMap= new String[r][c];
        for (String[] row : playMap)  
          Arrays.fill(row, "-");  
        
        return playMap;
    }

    static boolean gamePlay(int r,int c,int[][] minefield,String[][] playMap){
        int mineAmount=0;
        System.out.println(minefield.length);
        try
        {if(minefield[r][c]==1){
           System.out.println("You have failed us! Game Over.");
           System.out.println("Actual mineField.");
            print2D(minefield);
            return false;
        }else{
               
            for(int i=r-1;i<=r+1;i++){
                try {
                    for(int y=c-1;y<=c+1;y++){
                        
                        try {
                            if(minefield[i][y]==1){
                                mineAmount++;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            // TODO: handle exception
                        }
                    }
                } catch (IndexOutOfBoundsException e) {
                    // TODO: handle exception
                }
            }

            
            playMap[r][c]=Integer.toString(mineAmount);
            System.out.println("==================Current Map===============");
            strPrint2D(playMap);
            return true;
        }
    }catch(IndexOutOfBoundsException e){
        System.out.println("Please enter your move in the matrix's bounds");
        return true;
    }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done=false;
        int r,c,pR=0,pC=0;
        int[][] mineField=new int[0][0];
        String[][] playMap=new String[0][0];
        while(!done){
           try {
            System.out.println("Please enter the row amount.");
            r = scan.nextInt();
    
            System.out.println("Please enter the column amount.");
            c=scan.nextInt();
            
            mineField=minefieldCreator(r, c);
            playMap=playMapCreator(r, c);
            print2D(mineField);
            strPrint2D(playMap);
            done=true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please enter valid row and column numbers.");
        }
        }
        
        do{
            System.out.println("Please enter the row value of your movement.");
            pR=scan.nextInt();
            System.out.println("Please enter the column value of your movement.");
            pC=scan.nextInt();
        }while(gamePlay(pR, pC,mineField,playMap));
        
        
        scan.close();
        
    }
}
