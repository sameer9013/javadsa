public class moveallx {
    public static void moveAllx(String str,int indx, int count, String newstring){
        if(indx==str.length()){
            for(int i=0; i<count; i++){
            newstring+='x';

            }
            System.out.println(newstring);
            return;
        }

        char currChar=str.charAt(indx);
        if (currChar=='x') {
            count++;
            moveAllx(str, indx+1, count, newstring);
        } else {
            newstring+=currChar;
            moveAllx(str, indx+1, count, newstring);
        }
    }


    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllx(str, 0, 0, "");
    }
}
