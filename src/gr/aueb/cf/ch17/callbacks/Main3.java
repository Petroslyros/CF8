package gr.aueb.cf.ch17.callbacks;

public class Main3 {
    public static void main(String[] args) {


        doPrint( () -> System.out.println("Hello World"));
        doPrint( () -> System.out.println("Hello Coding!"));
    }

    public static void doPrint(Printable printable){
        printable.print();
    }

    public static void sayHelloWorld(){
        System.out.println("Hello World!");
    }
    public static void sayHelloCoding(){
        System.out.println("Hello Coding!");
    }
}
