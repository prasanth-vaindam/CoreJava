import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolOne {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String line = null;
        int i = 0;
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
                BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while ((line = consoleReader.readLine()) != null && line.length() != 0) {
                // System.out.println("Reading from console: " + line);
                // write the lines being read into a file "input.txt" using FileReader

                bw.write(++i + " " + line);
                bw.newLine();

            }
            bw.flush();
            while ((line = reader.readLine()) != null) {
                System.out.println("Reading from file: " + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}