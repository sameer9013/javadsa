import java.util.*;

public class checkprime {
    static bolean check(int speed,int distance,int time){
        int dist travelled= speed*time;
        return (dist travelled>=distance);
    }
}
    static int reachCenter(int distance, int time){
        int lowspeed=0;
        int highspeed=200;
        int optimalspeed=200;
        while(lowspeed<=highspeed){
            int midspeed=highspeed-(highspeed-lowspeed)/2;
            if(check(midspeed,distance,time)){
                optimalspeed=midspeed;
                highspeed=midspeed-1;
            }else
            lowspeed= midspeed+1;

        }
        return optimalspeed;
    }
    public static void main(String[] args) {
        int distance=1000, time= 2;
        System.out.println(reachCenter(distance,time));
    }
}
