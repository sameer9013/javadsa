import java.util.*;
public class permutations {
    public static void PrintPerm(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i=0;i<str.length();i++){
             char CurrChar=str.charAt(i);

             String newstring=str.substring(0,i)+str.substring(i+1);
             printperm()

        }
    }
    public static void main(String[] args) {
        String str="abc";
        PrintPerm(str, "");
    }
    
}
