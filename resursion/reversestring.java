public class reversestring {
    public static void printRev(String str,int indx){
        if (indx == 0) {
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.println(str.charAt(indx));
        printRev(str,indx-1);
    }

    public static void main(String[] args) {
        String str= "789";
        printRev(str,str.length()-1);
    }
    
}
