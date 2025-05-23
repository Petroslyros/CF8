package gr.aueb.cf.ch6;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5,4,6,3,7,1};
        bubbleSort(arr);

        for(int el: arr){
            System.out.print(el);
        }

    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, i, j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
