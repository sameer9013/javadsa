public class subsequence {
    public static void Subsequence(String str,int indx, String newstring){
        if(indx==str.length()){
            System.out.println(newstring);
            return;
        }
        char CurrChar=str.charAt(indx);

        //to be
        Subsequence(str, indx+1, newstring+CurrChar);
        //not to be
        Subsequence(str, indx+1, newstring);
    }
    public static void main(String[] args) {
        String str="abc";
        Subsequence(str, 0, "");
    }
    
}
