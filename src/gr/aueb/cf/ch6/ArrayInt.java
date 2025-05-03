package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποιηση ενοχ πινακα στη Java
 */
public class ArrayInt {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 8;
        arr[2] = 5;
        arr[3] = 9;
        arr[4] = 7;

        System.out.println("First element of the array : " + arr[0]);
        System.out.println("Array length: " + arr.length);
    }
}
