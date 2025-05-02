import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentInfoWriter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student's Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Roll Number: ");
        String rollNumber = sc.nextLine();
        
        System.out.println("Enter Grade: ");
        String grade = sc.nextLine();
        
        String StuData = String.format("Name %s, Roll Number: %s, Grade: %s%n", name, rollNumber, grade);
        
                try (FileWriter fileWriter = new FileWriter("student.txt", true)) {
                    fileWriter.write(StuData);
                    System.out.println("Student Information Saved Successfully.");
                }catch (IOException e){
                    System.out.println("An error while writing to this file: "+ e.getMessage());
                }finally{
                    sc.close();
        }
    }
}