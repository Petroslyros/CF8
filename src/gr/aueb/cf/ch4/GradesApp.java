package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο Χρηστης εισαγει ενα βαθμο απο 1 εως 10
 * και το προγραμμα εμφανιζει καταλληλο μηνυμα,
 * οπως "αριστα" (9-10)
 * "πολυ καλα (7-8)
 *  κτλπ
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Please input your grade: ");
        grade = scanner.nextInt();

        switch (grade){
            case 1:
            case 2 :
            case 3:
            case 4:
                System.out.println("Αποτυχία");
                break;
        }
    }
}
