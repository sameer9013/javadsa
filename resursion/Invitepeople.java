import java.util.*;
public class Invitepeople {
    public static int CallGuest(int n){
        if(n<=1);{
            return 1;
        }
        //single
        int ways1 = CallGuest(n-1);

        //pairs
        int ways2 = (n-1) * CallGuest(n-2);
        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(CallGuest(n));
    }
}
