import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String fileName = "student.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file " + fileName + " was not found.");
        } catch (IOException e) {
            System.err.println("Error: An I/O error occurred while reading the file.");
        }
    }
}