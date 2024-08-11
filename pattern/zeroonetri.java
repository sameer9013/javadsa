
public class zeroonetri {
    public static void main(String args[]){
        
        int n=5;

        //outerloop
        for (int i=1; i<=n; i++){

            //inner loop
            for (int j=1; j<=i; j++){

                //create a sum to check even or odd
                int sum=i+j;

                //use if else
               if(sum % 2==0){ 
                System.out.print("1 "); //even value

               } else {  //odd value
                System.out.print("0 ");
               }
            
            }
           System.out.println(); //outer loop
        }


    }
    
}
