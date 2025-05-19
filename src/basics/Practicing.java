package basics;

import com.sun.security.jgss.GSSUtil;

public class Practicing {
    public static void main(String[] args) {
        int[][] grid = {{2,3,4},{5,7,6},{4,3,1},{6,9,7},{4,6,3}};
//        for(int i = 0; i < grid.length-1; i++){
//            catchSpider(grid[i][0],grid[i][1],grid[i][2]);
//        }
        int[] arr = {40,30,10,20};
        System.out.println(getStringNTimes("abc",3));
        System.out.println(getStringCharsNTimes("abc",3));
        System.out.println(findTimesChAppearsInString("aaka",3,'a'));
        System.out.println(getAge(arr,50));

    }

    /**
     * Print Frog 1 f the distance of frog 1 from the spider is less than
     * the distance
     * @param frog1pos
     * @param frog2pos
     * @param spiderPos
     */

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

    public static String getStringNTimes(String s,int n){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(s);
        }
        return sb.toString();
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

    public static int findTimesChAppearsInString(String s, int n, char ch){
        if(n > s.length()) return -1;
        StringBuilder sb = new StringBuilder(s);
        int count = 0;

        for(int i = 0; i < n; i++){
            if(ch == sb.charAt(i)){
                count++;
            }
        }
        return count;
    }

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

    public static int getAge(int[] ages, int age){
        int maxAge = 0;
        for(int i = 0; i < ages.length -1; i++){
            if(ages[i] > maxAge){
                maxAge = ages[i];
            }

        }
        if(maxAge < age) return 0;

        return maxAge - age;
    }



}
