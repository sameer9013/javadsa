import java.util.*;

public class multiplytwono {

    public static int MultiplyTwoNo(int a, int b){
     int multiply=a*b;
       return multiply;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multiply = MultiplyTwoNo(a,b);
        System.out.println("multiply of 2 no is:"+multiply);
    }
}
