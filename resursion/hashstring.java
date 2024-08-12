import java.util.HashSet;
public class hashstring {
    public static void Subsequence(String str,int indx, String newstring, HashSet<String>Set){
        if(indx==str.length()){
            if(set.Contains(newstring)){
                return;
            } else {
                System.out.println(newstring);
                Set.add(newstring);
                return
            }
        char CurrChar=str.charAt(indx);

        //to be
        Subsequence(str, indx+1, newstring+CurrChar);
        //not to be
        Subsequence(str, indx+1, newstring);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set = newHashSet<>();
        Subsequence(str, 0,"",set);
    }
    
}    
}
