package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //symbol = scanner.next().charAt(0);
        //System.out.printf("%.2d");
        //Ternary operator

        //STRINGS
        // String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        // String[] foods = new String[3];
        // Arrays.fill(fruits,"pineapple");

        // String upper = str1.toUpperCase();
        // String lower = str2.toLowerCase();
        //if we didn't have equalsIgnoreCase() we would need to:
        //boolean areEqual = str1.toUpperCase().equals(str2.toUpperCase());
        //if(str1.compareToIgnoreCase(str4) > 0)

        //PRINTS THE REVERSE OF A STRING
//        for(int i = s.length() -1; i >= 0; i--){
//            System.out.print(s.charAt(i) + " ");
//        }
        //PALINDROME CHECK
//        StringBuilder sb = new StringBuilder();
//        for(int i = s.length() -1; i >= 0; i--){
//            sb.append(s.charAt(i));
//        }
//        return s.equals(sb.toString());
//    }
//        if(str.startsWith("Cod")) checks of the string starts with this
//        (str.startsWith("od",1) starts with this string from position 1
//        String s4 = s1.concat(s2);
//        String s5 = s1 + " " + s2;
//        String s6 = s1.concat(" ").concat(s2);
//        System.out.println("*".repeat(10));

//        String replaced1 = s1.replace(" ",":");
//        System.out.println(replaced1);

//        subStr = s.substring(1); //"oding Factory"
//        subStr2 = s.substring(1,3);
//        public static void traverse(String s){
//            for(int i = 0; i <s.length(); i++){
//                System.out.print(s.substring(i, i+1));
//            }
//        }

//        int positionOfLasto = cf.lastIndexOf("o"); //11


    }
    public static void starMenu(){}
    static void bubbleSort(int[] pin) {
        int n = pin.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (pin[j - 1] > pin[j]) {
                    temp = pin[j];
                    pin[j] = pin[j -1];
                    pin[j -1] = temp;
                }
            }
        }
    }
    static void makeTelephoneWithEnchancedFor(){
        char[][] telephone = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};

        for(char[] rows : telephone){
            for(char number : rows){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    public static boolean moreThan3Even(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
                if (counter >= 3) return true;
            }
        }
        return false;
    }
    public static boolean moreThan3Consecutives(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                return true;
            }
        }
        return false;
    }
    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10]; //default value is 0

        for (int num : arr) {
            int ending = num % 10;
            int count = endings[ending]++;
            if (count > 2) return true;
        }
        return false;
    }
    public static boolean noMoreThanThreePerDecade(int[] arr) {
        int[] decades = new int[100];

        for (int num : arr) {
            int decade = num / 10;
            decades[decade]++;

            if (decades[decade] > 3) {
                return false;
            }
        }

        return true;
    }
    //BINARY SEARCH
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        if (arr == null) return new int[0];

        int low = findFirstIndex(arr,key);
        int high = findLastIndex(arr,key);

        return new int[]{low,high};
    }
    public static int findFirstIndex(int[] arr, int key) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;

        while (left <= right) {
            middle = (right + left) / 2;
            if (arr[middle] == key) {
                result = middle;
                right = middle - 1;
            } else if (arr[middle] < key) {
                left = middle + 1;
            } else if (arr[middle] > key) {
                right = middle - 1;
            }
        }
        return result;
    }
    public static int findLastIndex(int[] arr, int key) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;

        while (left <= right) {
            middle = (right + left) / 2;
            if (arr[middle] == key) {
                result = middle;
                left = middle + 1;
            } else if (arr[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return result;
    }
    public static int getSecondMinValue(int[] arr) {
        if (arr == null) return -1;

        int minVal = Integer.MAX_VALUE;
        int secondMinVal = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                secondMinVal = minVal;
                minVal = arr[i];
            } else if (arr[i] > minVal && arr[i] < secondMinVal) {
                secondMinVal = arr[i];
            }
        }
        return secondMinVal;
    }
    public static String caesarEncrypt(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(letter == 'z'){
                sb.append('a');
            } else sb.append((char) (letter + 3));
        }
        return sb.toString();
    }
    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
    public static int maxCarsAtSameTime(int[][] arr) {
        int n = arr.length;
        int[][] events = new int[n * 2][2];

        // Step 1: Fill events array with arrival (1) and departure (0)
        for (int i = 0; i < n; i++) {
            events[i * 2][0] = arr[i][0];
            events[i * 2][1] = 1;  // arrival
            events[i * 2 + 1][0] = arr[i][1];
            events[i * 2 + 1][1] = 0;  // departure
        }

        // Step 2: Sort events by time; if equal, departures first
        Arrays.sort(events, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1]; // departure before arrival if time is the same
        });

        // Step 3: Traverse events and compute max count
        int count = 0, maxCount = 0;
        for (int[] event : events) {
            if (event[1] == 1) {
                count++; // arrival
                maxCount = Math.max(maxCount, count);
            } else {
                count--; // departure
            }
        }

        return maxCount;
    }
}