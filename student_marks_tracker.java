import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class student_marks_tracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grade Tracker!");

        // Input loop to enter grades
        while (true) {
            System.out.print("Enter a grade (or type 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int grade = Integer.parseInt(input);
                grades.add(grade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid grade or 'done' to finish.");
            }
        }

        // Calculate average, highest, and lowest grades
        if (!grades.isEmpty()) {
            double average = calculateAverage(grades);
            int highest = Collections.max(grades);
            int lowest = Collections.min(grades);

            System.out.println("\nGrade Summary:");
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        } else {
            System.out.println("No grades entered.");
        }
    }

    // Method to calculate average grade
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
