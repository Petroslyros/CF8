package gr.aueb.cf.ch6;

public class Ch6Homework {
    public static void main(String[] args) {

        int[] arr = {5,2,3,4,5};
        System.out.println(getMinValPos(arr));
        System.out.println(getMinVal(arr));
        System.out.println(getSecondMinValue(arr));
        System.out.println(getPos(arr,5));

    }

    public static int getMaxPosition(int[] arr, int low, int high){
        if(arr == null || low > high) return -1;

        int maxPos = low;

        for(int i = low + 1; i < high; i++){
            if(arr[i] > arr[maxPos]){
                maxPos = i;
            }
        }
        return maxPos;
    }

    public static int getMinValPos(int[] arr){
        if(arr == null) return -1;
        int minVal = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[minVal]){
                minVal = i;
            }
        }
        return minVal;
    }

    public static int getMinVal(int[] arr){
        if(arr == null) return -1;

        int minVal = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }

    public static int getSecondMinValue(int[] arr){
        if(arr == null) return -1;

        int minVal = arr[0];
        int secondMinVal = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minVal){
                secondMinVal = minVal;
                minVal = arr[i];
            } else if(arr[i] > minVal && arr[i] < secondMinVal){
                secondMinVal = arr[i];
            }
        }
        return secondMinVal;

    }

    public static int getPos(int[] arr, int pos){
        if(arr == null) return -1;
        if(pos < 0) return -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == pos){
                pos = i;
            }
        }
        return pos;
    }

    public static void printEven(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    public static int[] mapToDouble(int[] arr){
        int[] mapped = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static boolean hasOnePositive(int[] arr){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) {
                return true;
            }
        }
        return false;

    }
    public static boolean hasAllPositive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean moreThan3Even(int[] arr){
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                counter++;
                if(counter >= 3) return true;
            }
        }
        return false;
    }
    public static boolean moreThan3Odds(int[] arr){
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                counter++;
                if(counter >= 3) return true;
            }
        }
        return false;
    }
    public static boolean moreThan3Consecutives(int[] arr){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i + 1]  && arr[i] == arr[i+ 2] ){
                return true;
            }
        }
        return false;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr){
        int[] endings = new int[10]; //default value is 0

        for(int num : arr){
            int ending = num % 10;
            int count = endings[ending]++;
            if(count > 2) return true;
        }
        return false;
    }

    public static boolean noMoreThanThreePerDecade(int[] arr) {
        int[] decades = new int[100]; // supports numbers up to 999

        for (int num : arr) {
            int decade = num / 10;
            decades[decade]++;

            if (decades[decade] > 3) {
                return false; // more than 3 in same decade
            }
        }

        return true; // all decades have 3 or fewer numbers
    }


}
