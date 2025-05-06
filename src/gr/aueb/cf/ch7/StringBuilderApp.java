package gr.aueb.cf.ch7;

/**
 * {@link StringBuilder} is mutable!
 *
 */
public class StringBuilderApp {

    public static void main(String[] args) {
        String concatStr = "";
        StringBuilder sb = new StringBuilder();
        long timeStart = 0L;
        long timeEnd = 0L;
        double StrElapsedTime;
        double sbElapsedTime;

        timeStart = System.currentTimeMillis();
        for(int i = 1; i< 50_000; i++){
            concatStr = concatStr +i;
        }
        timeEnd = System.currentTimeMillis();
        StrElapsedTime = (timeEnd - timeStart) / 1000.0; // διαιρουμε με το 1000 για να παρουμε second

        timeStart = System.currentTimeMillis();
        for(int i = 1; i< 50_000_000; i++){
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String elapsed time: " + StrElapsedTime + "seconds");
        System.out.println("StringBuilder elapsed time: " + sbElapsedTime + "seconds");
    }
}
