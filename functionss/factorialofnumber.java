import java.util.*;

public class factorialofnumber {
    public static void FactorialOfNumber(int n){
        
        //loop
        if(n<0){
            System.out.println("Invalaid number");
            return;
        }

        int Factorial =1;
        for(int i=n; i>=1; i--){
            Factorial = Factorial*1;
        }
        System.out.println(Factorial);
        return;

    }

    public static void main(String args[]){

        Scanner sc = new scanner(System.in);
        int n = sc.nextInt();

        return(FactorialOfNumber(n));
    }
    
}
