package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγε 3 αριθμους που αναπαριστουν
 * τις πλευρες ενος ορθογνωιου τριγωνου, εστω
 * α η υποτεινουσα και β, γ, οι καθετες πλευρες του τριγωνου.
 * Το προγραμμα ελεγχει αν το τριγωνο ειναι ορθογωνιο.
 * Ορθογωνιο ειναι ενα τριγωνο που
 * α*α = β*β + γ*γ
 */
public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please input a, b , c (a η υποτεινουσα)");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if(Math.abs(a * a - (b * b + c * c)) < EPSILON){
            isRight = true;
        }


    }
}
