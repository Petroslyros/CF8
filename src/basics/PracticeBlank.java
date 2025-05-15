package basics;

import java.util.Arrays;

public class PracticeBlank {
    public static void main(String[] args) {


    }

    public static int parkingLot(int[][] arr){
        int[][] parkedCars = new int[arr.length * 2][2];
        int row = 0;

        for(int i = 0; i <= arr.length; i++){
            for(int j = 0; j < 2; j++){
                parkedCars[row][0] = arr[i][j];

            }
        }
    }


}




