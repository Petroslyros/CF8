package gr.aueb.cf.ch8;

public class ExceptionIndexOutOfBoundsApp {

    public static void main(String[] args) {
        String s = getOneOrNUll();

        if(s == null){
            System.out.println("String is null");
            System.exit(1);
        }

        System.out.println(s);
    }

    public static String getOneOrNUll(){
        return null;
    }
}
