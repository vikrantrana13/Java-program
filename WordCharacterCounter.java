import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WordCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text file name: ");
        String fileName = scanner.nextLine();
        
        int wordCount = 0;
        int charCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName);
             Scanner fileScanner = new Scanner(fis)) {
             
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                    charCount += line.replaceAll("\\s+", "").length();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Total words: " + wordCount);
        System.out.println("Total characters (excluding whitespace): " + charCount);
    }
}