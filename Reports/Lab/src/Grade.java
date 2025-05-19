// lab 2
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained (0-100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100.");
         }
        

        String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B+";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C+";
        } else if (marks >= 40) {
            grade = "C";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("Grade: " + grade);
        scanner.close();
        
    }
}
