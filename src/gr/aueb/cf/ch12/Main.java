package gr.aueb.cf.ch12;

public class Main {
    public static void main(String[] args) {

        Student alice = new Student();

        //GET
        alice.id = 10;
        alice.firstname = "Alice";
        alice.lastname = "W.";

        //SET
        System.out.println("ID: " + alice.id);
        System.out.println("Firstname: " + alice.firstname);
        System.out.println("Lastname: " + alice.lastname);

    }
}
