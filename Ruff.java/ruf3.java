public class ruf3 { 
    public static void PrintSum(int sum,int i,int n ){
        if(i<=n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        PrintSum(sum,i+1 , n);


    }

    public static void main(String[] args) {
        PrintSum("", 0, 5);
    }
}
