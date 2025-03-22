import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("input.txt"))) {
            String inputLine;
            System.out.println("Enter text (type 'exit' to finish):");
            while (!(inputLine = consoleReader.readLine()).equalsIgnoreCase("exit")) {
            fileWriter.write(inputLine);
            fileWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        String line;
        int lineNumber = 1;

        try {
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + " " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}