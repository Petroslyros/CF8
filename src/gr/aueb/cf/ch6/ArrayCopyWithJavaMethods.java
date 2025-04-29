package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Array copy using Java Utility classes and methods
 */
public class ArrayCopyWithJavaMethods {
    public static void main(String[] args) {


    }

    public static int[] addDeepCopy(int[] sourceArray){
        //int[] destinatioArray = new int[sourceArray.length];

        //System.arraycopy(sourceArray,0, destinatioArray,0,sourceArray.length);

        int[] destinatioArray;
        destinatioArray = Arrays.copyOf(sourceArray,sourceArray.length);
        destinatioArray = Arrays.copyOfRange(sourceArray,0,sourceArray.length);

        return destinatioArray;
    }
}
