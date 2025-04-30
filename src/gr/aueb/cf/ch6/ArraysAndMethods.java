package gr.aueb.cf.ch6;

public class ArraysAndMethods {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        printArray(arr, 1, arr.length -1);



    }

    /**
     * prints the elemnts of an array
     * @param arr the input array
     */
    public static void printArray(int[] arr){
        for(int el: arr){
            System.out.println(el + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high){
       if(low < 0){
           System.out.println("Low cannot be lower than 0");
       }
       else if(high > arr.length){
           System.out.println("Cannot be higher than array length");
       } else {
           for (int i = low; i < high; i++) {
               System.out.print(arr[i] + " |");
           }
       }
    }
}
