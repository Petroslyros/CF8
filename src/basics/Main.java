package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[][] arr1 = {{1012, 1136},
                        {1317, 1417},
                        {1015, 1020}};

        System.out.println(parkingLot(arr1));


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


//        if(str.startsWith("Cod")) checks of the string starts with this
//        (str.startsWith("od",1) starts with this string from position 1
//        String s4 = s1.concat(s2);
//        String s5 = s1 + " " + s2;
//        String s6 = s1.concat(" ").concat(s2);
//        System.out.println("*".repeat(10));

//        String replaced1 = s1.replace(" ",":");
//        System.out.println(replaced1);

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

//        subStr = s.substring(1); //"oding Factory"
//        subStr2 = s.substring(1,3);
//        public static void traverse(String s){
//            for(int i = 0; i <s.length(); i++){
//                System.out.print(s.substring(i, i+1));
//            }
//        }

//        int positionOfLasto = cf.lastIndexOf("o"); //11


    }

    public static void starMenu() {}
    static void bubbleSort(int[] pin) {
        int n = pin.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (pin[j - 1] > pin[j]) {
                    temp = pin[j];
                    pin[j] = pin[j - 1];
                    pin[j - 1] = temp;
                }
            }
        }
    }
    static void makeTelephoneWithEnchancedFor() {
        char[][] telephone = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};

        for (char[] rows : telephone) {
            for (char number : rows) {
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

        int low = findFirstIndex(arr, key);
        int high = findLastIndex(arr, key);

        return new int[]{low, high};
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
    public static String caesarEncrypt(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == 'z') {
                sb.append('a');
            } else sb.append((char) (letter + 3));
        }
        return sb.toString();
    }
    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
    public static int parkingLot(int[][] arr) {
        int[][] parkedCars = new int[arr.length * 2][2];
        int row = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                parkedCars[row][0] = arr[i][j];
//                parkedCars[row][1] = j == 0 ? 1 : 0;
                if (j == 0) {
                    parkedCars[row][1] = 1;
                } else {
                    parkedCars[row][1] = 0;
                }
                row++;
            }
        }
        for (int i = 0; i < parkedCars.length; i++) {
            for (int j = parkedCars.length - 1; j > i; j--) {
                if (parkedCars[j - 1][0] > parkedCars[j][0]) {
                    int[] temp = parkedCars[j]; //ΚΡΑΤΑΕΙ ΟΛΗ ΤΗ ΣΕΙΡΑ ΤΟΥ PARKED CARS
                    parkedCars[j] = parkedCars[j - 1]; //ΠΕΡΝΑΕΙ ΟΛΗ ΤΗ ΣΕΙΡΑ ΣΤΗ ΘΕΣΗ ΤΗΣ ΑΛΛΗΣ
                    parkedCars[j - 1] = temp;
                }
            }
        }

        int count = 0;
        int maxParkedCars = 0;

        for (int i = 0; i < parkedCars.length -1; i++) {
            if (parkedCars[i][1] == 1) {
                count++;
            } else {
                count--;
            }
            if (count > maxParkedCars) {
                maxParkedCars = count; //παρακολουθουμε το μεγιστο αριθμο που ανεβηκε το count
            }

        }
        return maxParkedCars;

    }

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        StringBuilder sb = new StringBuilder(x);

        return sb.reverse().equals(sb);

    }


}







