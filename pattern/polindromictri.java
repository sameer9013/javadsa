public class polindromictri {
    public static void main(String args[]){

        int n = 5;
          //outer loop
        for (int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
               //1st half
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
               //2nd half
            for (int j=2; j<=1; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    
}
