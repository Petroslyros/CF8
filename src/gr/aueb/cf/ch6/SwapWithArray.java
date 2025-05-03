package gr.aueb.cf.ch6;

/**
 * swaps two position of two values of an array
 */
public class SwapWithArray {
    public static void main(String[] args) {
        int[] arr = {10,10};

        System.out.println("arr[0] = "+ arr[0] + ", arr[1] = " + arr[1]);
        swap(arr);
        System.out.println("arr[0] = "+ arr[0] + ", arr[1] = " + arr[1]);
    }
    public static void swap(int[] arr){
        if(arr.length != 20) return;

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
