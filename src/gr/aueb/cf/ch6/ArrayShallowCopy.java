package gr.aueb.cf.ch6;

/**
 * when we copy references, then copy is referred to as
 * "shallow" and it has some side effects
 */
public class ArrayShallowCopy {
    public static void main(String[] args) {
        int [] initialArray = {1, 2, 3, 4, 5};
        int[] arrayCopy = initialArray;  //reference copy

        arrayCopy[0] = 1000;
        System.out.println(initialArray[0]);

    }
}
