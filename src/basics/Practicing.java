package basics;


import java.util.Arrays;

public class Practicing {
    public static void main(String[] args) {


    }

    public static int[] compareGrades(int[] arr1, int[] arr2) {
        int alicePoints = 0;
        int bobPoints = 0;

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] > arr2[i]) {
                alicePoints++;
            } else if(arr2[i] > arr1[i]) {
                bobPoints++;
            }
        }
        return new int[] {alicePoints,bobPoints};

    }

    public static int matrixDiagonal(int[][] arr) {
        int mainDiagonal = 0;
        int secondDiagonal = 0;

        for(int i = 0; i < arr.length; i++) {
            mainDiagonal += arr[i][i];
            secondDiagonal += arr[i][arr.length - 1 -i];
        }

        return Math.abs(mainDiagonal - secondDiagonal);

    }

    public static void hashMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void percentages(int[] arr) {
        int zero = 0;
        int positive = 0;
        int negative = 0;


        for(int i = 0; i< arr.length; i++) {
            if(arr[i] == 0){
                zero++;
            } else if(arr[i] < 0){
                negative++;
            } else {
                positive++;
            }
        }
        System.out.printf("The percentage of positive numbers is: %.6f%n", (positive * 100.0) / arr.length);
        System.out.printf("The percentage of negative numbers is: %.6f%n", (negative * 100.0) / arr.length);
        System.out.printf("The percentage of numbers equal to 0 is : %.6f%n", (zero * 100.0) / arr.length);

    }

    public static void minAndMaxSumOf4OutOf5Numbers(int[] arr) {
        int minNum = arr[0];
        int maxNum = arr[0];
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] < minNum) {
                minNum = arr[i];
            }
            if(arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        int minSum = sum - maxNum;
        int maxSum = sum - minNum;

        System.out.println(minSum + " " + maxSum);
    }

    public static void maxHeightCount(int[] arr) {
        int count = 0;
        int maxHeight = 0;

        for(int num : arr) {
            if(num > maxHeight) {
                maxHeight = num;
            }
        }

        for(int num : arr) {
            if(num == maxHeight){
                count++;
            }
        }
        System.out.println(count);
    }

    public static int[] lowAndHighScore(int[] arr) {
        int countHigh = 0;
        int countLow = 0;
        int highScore = arr[0];
        int lowScore = arr[0];

        for(int score : arr) {
            if(score > highScore) {
                highScore = score;
                countHigh++;
            }
            if(score < lowScore){
                lowScore = score;
                countLow++;
            }
        }

        return new int[] {countHigh, countLow};
    }

    public static int maxIndex(int[] arr) {
        int maxIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int maxNumber(int[] arr) {
        int maxNum = 0;

        for(int num: arr) {
            if(num > maxNum){
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0, 1 και αρνητικοί δεν είναι πρώτοι
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // βρέθηκε διαιρέτης
            }
        }
        return true; // δεν βρέθηκε κανένας διαιρέτης
    }

    public static String reversed(String s) {
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();
    }

    public static void fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;

        while (num1 <= n) {
            System.out.print(num1 + " " );

            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
//    AI
    public static String removeAllDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // assuming ASCII

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }





}
