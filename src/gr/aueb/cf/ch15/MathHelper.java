package gr.aueb.cf.ch15;

public class MathHelper {

    public MathHelper(){
    }

    public static int getMax(int[] arr){
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static double getArrAvg(int[] arr){
        int count = 0;
        int sum = 0;
        double avg = 0;

        for(int i = 0; i < arr.length; i++){
            count++;
            sum += arr[i];
        }
        avg = (double) sum / count;

        return avg;
    }
}
