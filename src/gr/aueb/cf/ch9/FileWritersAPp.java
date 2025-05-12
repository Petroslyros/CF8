package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 *
 */
public class FileWritersAPp {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file-writer.txt");
        try {
            fileWriter(fd);
        } catch (IOException e){
            System.out.println("The file has NOT been created, some error occurred");
        }
        try {
            PrintStream ps = new PrintStream("C:/tmp/test.txt", StandardCharsets.UTF_8);
            sayHello(ps);
            sayHello(System.out);
        } catch (IOException e){
            System.out.println("File has not been created");
        }



    }

    public static void fileWriter(File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Coding!");
            fw.flush();
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e); //exception message will automatically typecasted to string
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
           bw.write("Coding!");
           bw.flush();
        }
       catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
    }
}

    public static void printStream(String file) throws IOException {
//        try (PrintStream ps = new PrintStream(file, StandardCharsets.UTF_8)) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(file, true), false, StandardCharsets.UTF_8)) {   // true is append
            ps.println("Printing with print stream");
            ps.flush();
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    /**
     *
     * @param ps
     */
    public static void sayHello(PrintStream ps){
        ps.println("Hello CF");
    }
}
