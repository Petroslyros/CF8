package basics;

import java.util.Arrays;

public class PracticeBlank {
    public static void main(String[] args) {

        int[][] arr1 = {{1012, 1136},
                        {1317, 1417},
                        {1015, 1020}};

        int[][] meetings = {
                {9, 10},
                {9, 12},
                {11, 13},
                {12, 14}
        };
    }

    public static int minMeetingRooms(int[][] meetings){
        int[][] overlapArr = new int[meetings.length * 2][2];
        int row = 0;

        for(int i = 0; i < meetings.length; i++){
            for(int j = 0; j < meetings[0].length; j++){
                overlapArr[row][0] = meetings[i][j];
                if(j == 0){

                }
            }
        }
    }





}




