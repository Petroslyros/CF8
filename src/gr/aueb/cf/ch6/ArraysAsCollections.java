package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Categorizes the issues that arrays face in 3
 * categories :
 * 1. Filtering
 * 2. Mapping
 * 3. Aggregate methods (+ predicates)
 */
public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = {1, 10, 11, 17, 21, 34, 50};

    }

    //filtering
    public static int[] filterEven(int[] arr){
        if(arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for(int el : arr){
            if(el % 2 == 0){
                arrayToReturn[count++] = el;
            }
        }
        return Arrays.copyOf(arrayToReturn, count);
        //returns a new array (count == size of the array)
    }

    //mapping
    public static int[] mapToDouble(int[] arr){
        int[] mapped = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
          mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    //Reducing
    public static int sum(int[] arr){
        int sum = 0;
        int count = 0;

        for(int num : arr){
            sum += num;
            count++;
        }
        return sum / count;
    }

    public static boolean anyEven(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) return true;
        }
        return false;
    }
    public static boolean allEven(int[] arr){
        for (int j : arr) {
            if (j % 2 != 0) return true;//found an odd num
        }
        return false;
    }

    public static boolean moreThanTwoEvens(int[] arr){
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
                if (count > 2) return true;

            }
        }
        return false;
    }
    public static boolean moreThanTwoConsecutive(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) return true;
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



}
