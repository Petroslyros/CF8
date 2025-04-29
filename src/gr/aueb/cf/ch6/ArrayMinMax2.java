package gr.aueb.cf.ch6;

/**
 * Finds the min and max value of an array
 * assuming that the initial Min value is the MAXINT (Integer.MAX_VALUE)
 * and for the max, the initial max is MININT (Integer.MIN_VALUE)
 */
public class ArrayMinMax2 {
    public static void main(String[] args) {

    }
    public static int getMinPosition(int[] arr){
        if(arr == null || arr.length < 1) return -1;

        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
    public static int getMaxPosition(int[] arr){
        if(arr == null || arr.length < 1) return -1;

        int maxValue = Integer.MIN_VALUE;
        int maxPosition = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
