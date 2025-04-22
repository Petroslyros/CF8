package gr.aueb.cf.ch5;

public class FloatDoubleExpr {
    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.1F;
        double doubleNum = 12.5;
        double doubleNum2 = 10d;
        float floatResult = 0.0f;
        double doubleResult = 0.0;
        final double PI = 3.1415;
        final float LIGHT_SPEED = 3.0e5f;
        double div;
        double remaining;

        floatResult = floatNum + intNum;
        doubleResult = doubleNum + floatNum - intNum;
        div = 12.5/3;
        remaining = 12.5 % 3;

        System.out.println("div = " +div);
        System.out.println("Mod: " + remaining);
        System.out.printf("Div : %.2f" , div);
        System.out.printf("Formating : %05.2f ",remaining );
    }
}
