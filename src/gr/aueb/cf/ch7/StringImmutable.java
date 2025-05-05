package gr.aueb.cf.ch7;

/**
 * Strings are cached in SCP(String constant pool)
 * or Intern Area for efficiency.
 */
public class StringImmutable {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory";

    }
}
