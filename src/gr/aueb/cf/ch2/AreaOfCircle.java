package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδό ενός κύλου σύμφωαν με τον τύπο
 * πr^2, όπου π = 3.14, r είναι η ακτίνα
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius;
        double circleArea = 0.0;

        System.out.println("Please provide the area of the circle: ");
        radius = scanner.nextInt();
        circleArea = Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle with radius : %d is %.2f", radius, circleArea);

    }
}
