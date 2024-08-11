
public class Bubble1sort {
    public static void printExBubbleSort(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main (String args[]){
        int arr[]={4,1,3,9,7};

        //Bubble sort
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr[i]> arr[i+1]){

                    //swap
                    int temp= arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        printExBubbleSort(arr);
    } 
    
}
