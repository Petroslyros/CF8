package basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        generateReportFromCSV("grades.csv", "report.txt");

        int[][] arr1 = {{1012, 1136},
                        {1317, 1417},
                        {1015, 1020}};
        System.out.println(parkingLot(arr1));

        int[] arr = {1, -1, -1, -1, 1, 1, 1, 1, -1, -1};
        System.out.println(stockMoves(arr));


        int[][] grid = {{2, 3, 4}, {5, 7, 6}, {4, 3, 1}, {6, 9, 7}, {4, 6, 3}};
        for (int i = 0; i < grid.length - 1; i++) {
            catchSpider(grid[i][0], grid[i][1], grid[i][2]);
        }

        for(int i = 1; i <= 5; i++) {
            System.out.println(" ".repeat(5-i) + "#".repeat(i));
        }


        //symbol = scanner.next().charAt(0);
        //System.out.printf("%.2d");

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

//        int positionOfLastof = cf.lastIndexOf("o"); //11


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
    public static String caesarEncrypt(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == 'z') {
                sb.append('c');
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
    public static int stockMoves(int[] arr){
        int count = 0;
        int level = 0;
        boolean belowBase = false;

        for(int i = 0; i < arr.length; i++){
            level += arr[i];

            if(level < 0 && !belowBase){
                count++;
                belowBase = true;
            }

            if (level > 0) {
                belowBase = false;
            }
        }
        return count;
    }
    public static void catchSpider(int frog1pos, int frog2pos, int spiderPos) {
        int dis1;
        int dis2;
        //we need Math abs to get the absolute position of each value
        dis1 = Math.abs(spiderPos - frog1pos);
        dis2 = Math.abs(spiderPos - frog2pos);

        if (dis1 < dis2) {
            System.out.println("Frog 1");
        } else if (dis2 < dis1) {
            System.out.println("Frog 2");
        } else { //dist1 == dis2
            System.out.println("Spider");
        }
    }
    // Γράψτε μία μέθοδο που θα λαμβάνει ως είσοδο ένα string s,
    // το πλήθος των πρώτων γραμμάτων που θέλουμε να ελέγξουμε καθώς και τον χαρακτήρα αναζήτησης ch και επιστρέφει
    // το πλήθος των φορών που εμφανίζεται ο χαρακτήρας ch, στους πρώτους n χαρακτήρες του string s.
    // Αν το N > length του string το string να γινεται repeat ωστε το τελικο μηκος του string να ειναι αμεσως μεγαλυτερο
    // απο το μηκος του n
    public static int getCount(String s, char ch, int n){
        int count = 0;
        int iterations = 0;
        int totalCount = 0;
        int remaining = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch) count++;
        }
        iterations = n / s.length();
        totalCount = iterations * count;

        remaining = n % s.length();
        for(int i = 0; i < remaining; i++){
            if(s.charAt(i) == ch){
                totalCount++;
            }
        }
        return totalCount;
    }
    public static void generateReportFromCSV(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(outputFile, StandardCharsets.UTF_8)) {

            String line;
            double classTotal = 0;
            int studentCount = 0;
            int highestGrade = Integer.MIN_VALUE;

            writer.println("Student Averages:");

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int sum = 0;

                for (int i = 1; i < parts.length; i++) {
                    int grade = Integer.parseInt(parts[i]);
                    sum += grade;
                    if (grade > highestGrade) {
                        highestGrade = grade;
                    }
                }

                double average = sum / (double) (parts.length - 1);
                classTotal += average;
                studentCount++;

                writer.printf("%s: %.2f%n", name, average);
            }

            double classAverage = classTotal / studentCount;
            writer.printf("Class Average: %.2f%n", classAverage);
            writer.printf("Highest Grade: %d%n", highestGrade);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
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
    public static void oppositeHashMatrix(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(5-i) + "#".repeat(i));
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
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString().equals(s);
    }
    public static String replaceSpaces(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();

        //we can also use return s.replace(" ", "%20");
    }
    public static int[] twoSum(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    public static int[] leftRotate(int[] arr, int offset) {
        int n = arr.length;
        int[] rotated = new int[n];
        int actualOffset = offset % n;  // για offset μεγαλύτερα από το μήκος του πίνακα

        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - actualOffset) % n;
            rotated[newIndex] = arr[i];
        }
        return rotated;
    }

}







