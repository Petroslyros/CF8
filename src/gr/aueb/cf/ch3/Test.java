package gr.aueb.cf.ch3;

public class Test {
    public static void main(String[] args) {
        int i = 0;
        int result = 1;

        while (i < 3) {
            result = result * i;
            i++;
        }

        System.out.println(result);
    }

}
