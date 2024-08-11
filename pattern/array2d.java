import java.util.*;

public class array2d {
    public static void main (string args[]){
      Scanner sc = new Scanner(System.in);
      int row =sc.nextInt();
      int cols = sc.nextInt();

      int [][] number = new Int[row][cols];
       
      //input
       //row
       for (int i=0; i<row; i++){
        //col
           for (int j=0; j<cols; j++){
            number[i][j] = sc.nextInt();
           }
        }

       int x = sc.nextInt();

       for (int i=0; i<row; i++){
        for(int j=0; j<cols; j++){
        }
       }
       //compare with x
       if(number[i][j] == x) {
        System.out.println("x found at location(" + i +"," + j +")");
       }
    




    }
    
}
