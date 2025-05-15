package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class ch9Homework {
    public static void main(String[] args) {
        String inputFile = "C:/tmp/locations.txt";
        String outputFile = "C:/tmp/locations-formatted.txt";

        try {
            convertFile(inputFile, outputFile);
        } catch (IOException e) {
            System.err.println("Error during file processing: " + e.getMessage());
        }
    }

    public static void convertFile(String input, String output) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

            String line;
            while((line = br.readLine()) != null) {
                // Trim and split line
                String[] parts = line.trim().split(",");
                if (parts.length < 3) continue;

                String location = parts[0].trim();
                String latitude = parts[1].trim();
                String longitude = parts[2].trim();
                // Format line
                String formatted = String.format(
                        "{ location: '%s', latitude: %s, longitude: %s },", location, latitude, longitude);
                bw.write(formatted);
                bw.newLine();
            }
            bw.flush();
            System.out.println("File formatted");

        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

}
