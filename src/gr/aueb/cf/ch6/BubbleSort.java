package gr.aueb.cf.ch6;

public class BubbleSort {
    public static void main(String[] args) {

    }
    public static int[] bubbleSort(int[] arr){
        for(int i = arr.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    SelectionSort.swap(arr, i , j);
                }
            }
        }
        return arr;
    }

    public static boolean isSymmetric(int[] arr){
        for(int i = 0, j = arr.length; i < j; i++, j--){
            if(arr[i] == arr[j]) return true;
        }
        return false;
    }
}
