package gr.aueb.cf.ch6;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {5,3,1,1,3,5};
        System.out.println(isSymmetrical(arr));

    }

    public static int binarySearch(int[] arr, int value, int low, int high) {
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if (value > arr[mid]) return binarySearch(arr, value, mid + 1, high);
        else return binarySearch(arr, value, low, mid - 1);
    }

    public static boolean isSymmetrical(int[] arr){
        for(int i = 0, j = arr.length -1; i < j; i++,j--){
            if(arr[i] != arr[j]) return false;

        }
         return true;
    }
}
