package basics;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //symbol = scanner.next().charAt(0);

        //System.out.printf("%.2d");                      name.equalsIgnoreCase();

        //Ternary operator
        //String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        // String[] fruits = {"Apple","orange","banana","coconut"};               String[] foods = new String[3];
        // Arrays.fill(fruits,"pineapple");



    }

    static void bubbleSort(int[] pin) {
        int n = pin.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (pin[j - 1] > pin[j]) {
                    temp = pin[j - 1];
                    pin[j - 1] = pin[j];
                    pin[j] = temp;
                }
            }
        }
    }

   //VARARGS
    static double average(double... numbers){
        double sum = 0;

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }

    static void makeTelephone(){
        char[][] telephone = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};

        for(char[] rows : telephone){
            for(char number : rows){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}