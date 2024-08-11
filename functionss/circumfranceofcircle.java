import java.util.*;

public class circumfranceofcircle {

    public static double CircumfranceOfCircle(double radious){
        return 2*3.14*radious;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(CircumfranceOfCircle(r));
    }
    
}
