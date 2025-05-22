package basics;



public class Practicing {
    public static void main(String[] args) {

        int[][] grid = {{2,3,4},{5,7,6},{4,3,1},{6,9,7},{4,6,3}};
        for(int i = 0; i < grid.length-1; i++){
            catchSpider(grid[i][0],grid[i][1],grid[i][2]);
        }
        int[] arr = {40,30,10,20};
        System.out.println(getStringCharsNTimes("abc",3));

        int[] stockMove = {1,-1,-1,-1,1,1,1,1,-1,-1};


    }
    public static void catchSpider(int frog1pos, int frog2pos, int spiderPos) {
            int dis1;
            int dis2;
            //we need Math abs to get the absolute position of each value
         dis1 = Math.abs(spiderPos - frog1pos);
         dis2 = Math.abs(spiderPos - frog2pos);

        if(dis1 < dis2 ){
            System.out.println("Frog 1");
        } else if(dis2 < dis1){
            System.out.println("Frog 2");
        } else { //dist1 == dis2
            System.out.println("Spider");
        }
    }
    public static String getStringCharsNTimes(String s, int n){
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < n ; i++){
            char letter = s.charAt(i);
            sb.append(letter);
            if(sb.length() == n){
                sb.append(letter);
            }
        }

        return sb.toString();
    }



}
