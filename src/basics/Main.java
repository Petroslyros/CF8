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

}







