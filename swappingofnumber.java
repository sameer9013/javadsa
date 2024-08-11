
public class swappingofnumber {
    public static void SwappingOfNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
        
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        SwappingOfNumbers(a,b);
    }


}
