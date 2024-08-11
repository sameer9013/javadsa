public class PlaceTiles {
    public static int Placetiles(int n,int m){
       if(n == m){
        return 2;
       }
        if(n < m){
            return 1;
        }

        //vertical
        int vertPlacements = Placetiles(n-m, m);

        //horizontal
        int horPlacements = Placetiles(n-1, m);

        return vertPlacements + horPlacements;
    }
    public static void main(String[] args) {
        int  n=4,m=2;
        System.out.println(Placetiles(n, m));
    }
    
}
