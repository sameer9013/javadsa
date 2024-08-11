public class removedublicacy {
    public static boolean[] map=new boolean[26];

    public static void removeDublicacy(String str,int indx, String newstring){
        if(indx==str.length()){
            System.out.println(newstring);
            return;
        }

        char CurrChar=str.charAt(indx);
        if (map[CurrChar - 'a']== true){
            removeDublicacy(str, indx+1, newstring);
        }else {
            newstring+=CurrChar;  
            map[CurrChar - 'a'] = true;
            removeDublicacy(str, indx+1, newstring);
        }
    }
    public static void main(String[] args) {
        String str="abacd";
        removeDublicacy(str, 0, "");
    }
    
}
