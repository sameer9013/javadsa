import java.util.*;

public class calculateaverage {
    public static int AverageOfThree(int a, int b, int c){
        int Average= (a+b+c)/3;
        return Average;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int Average= AverageOfThree(a,b,c);
        System.out.println("Average of 3 number is:"+Average);
    }
    
}
