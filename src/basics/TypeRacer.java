package basics;

import java.util.Scanner;

public class TypeRacer {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to basics.TypeRacer!");
        System.out.println("Type the following sentence as fast and accurately as you can:");
        System.out.println("\n\"" + sentence + "\"\n");
        System.out.println("Press Enter to start...");
        scanner.nextLine(); // wait for Enter

        long startTime = System.currentTimeMillis();

        String input = scanner.nextLine();

        long endTime = System.currentTimeMillis();
        long timeTakenMillis = endTime - startTime;
        double timeTakenMinutes = timeTakenMillis / 60000.0;

        // Calculate word count
        int wordCount = input.trim().split("\\s+").length;

        // Calculate WPM
        double wpm = wordCount / timeTakenMinutes;

        // Output results
        if (input.equals(sentence)) {
            System.out.println("✅ Great job! You typed it correctly.");
        } else {
            System.out.println("❌ Oops! There were mistakes.");
        }

        System.out.printf("⏱️ Time taken: %.2f seconds\n", timeTakenMillis / 1000.0);
        System.out.printf("📝 Words typed: %d\n", wordCount);
        System.out.printf("🏁 Typing Speed: %.2f WPM\n", wpm);
    }
}
