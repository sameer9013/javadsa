public class invertedhalfpyramid {
    public static void main(String args[]){
        int n = 4;

         //outer loop
        for (int i=1; i<=4;i++){

            //inner loop =space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
              //inner loop =space
            for (int j=1; j<=i;j++){
                 System.out.print("*");
            }
            System.out.println();
        } 
    }
    
}
