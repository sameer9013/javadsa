public class findoccurance {
    public static int first=-1;
    public static int last=-1;
    public static void Occurance(String str, int indx, char element){
        if(indx== str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currchar = str.charAt(indx);
        if(currchar==element){
            if(first==-1){
                first=indx;
            }else {
                last=indx;
            }
        }
        Occurance(str,indx+1,element);
    }
    public static void main(String[] args) {
        String str="abaabcdaefaah";
        Occurance(str,0,'b');
    }

    
}
