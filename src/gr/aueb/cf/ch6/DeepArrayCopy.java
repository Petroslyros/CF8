package gr.aueb.cf.ch6;

/**
 * we copy the values of the arrays
 * which in our case are primitives
 */
public class DeepArrayCopy {

    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3};
        int[] arrayCopy;

        arrayCopy = arrDeppCopy(initialArray);

        for(int el: arrayCopy){
            System.out.print(el + " ");
        }
    }

    public static int[] arrDeppCopy(int[] sourceArr){
        int[] destinationArray = new int[sourceArr.length];

        for(int i = 0; i < sourceArr.length; i++){
            destinationArray[i] = sourceArr[i];
        }
        return destinationArray;
    }
}
