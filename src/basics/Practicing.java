package basics;


public class Practicing {
    public static void main(String[] args) {

        fibonacci(7);


    }

    public static void fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int count = 0;

        while(count < n){
            System.out.print(n1 + " ");

            int next = n1 + n2;
            n1 = n2;
            n2 = next;

            count++;
        }
    }


}
