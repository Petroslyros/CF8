package gr.aueb.cf.ch6;

/**
 * finds min and max assuming that the first
 * element is the min element and then compares the next
 * element to the previous
 */
public class ArrayMin {
    public static void main(String[] args) {

    }
    public static int getMinPosition(int[] arr){
        if(arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr){
        if(arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
