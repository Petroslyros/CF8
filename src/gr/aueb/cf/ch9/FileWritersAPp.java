package gr.aueb.cf.ch9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    }

    public static void fileWriter(File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Coding!");
            fw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
           bw.write("Coding!");
           bw.flush();
        }
       catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
    }
}
}
