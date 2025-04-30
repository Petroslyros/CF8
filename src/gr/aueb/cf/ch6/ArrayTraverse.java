package gr.aueb.cf.ch6;

/**
 * Traversing an array, visits each position of the array
 * and prints the value of each position to the terminal
 */
public class ArrayTraverse {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] grades = {1,2,3,4,5};
        int[] arr3 = new int[] {2,4,6,8,10};

        //traverse with for
        for(int i= 0; i < arr1.length;i++){
            System.out.print(arr1[i] + " |");

        }

        for(int item : arr1){
            System.out.print(item + " ");
        }
        for(int grade: grades){
            System.out.println(grade + " ");
        }
    }
}
