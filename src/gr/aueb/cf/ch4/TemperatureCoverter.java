package gr.aueb.cf.ch4;

public class TemperatureCoverter {
    public static void main(String[] args) {

        System.out.println(celsiusToFahrenheit(18));

        System.out.println(square(5));

        System.out.println(findMax(1,2,3));

        System.out.println(isPrime(7));

    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static int square(int num){
        return num * num;
    }
    public static int findMax(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false; //0s and 1s are not primes
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
