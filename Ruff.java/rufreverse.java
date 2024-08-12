
public class rufreverse {
    public static void PrintRev(String str,int indx){
        if(indx==0){
            System.out.println(indx);
            return;
        }
        System.out.println(str.charAt(indx));
        PrintRev(str, indx-1);
    }
    public static void main(String[] args) {
        String str= "abcd";
        PrintRev(str,str.length()-1);
    }
    
}
