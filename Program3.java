package JavaProject1;

public class Program3 {
    public static void main(String[] args) {

        int[] studentScores = {75, 92, 85, 68, 95, 80}; // Example scores for 6 students

        int countAbove80 = 0; // Initialize a counter for scores above 80

        System.out.println("Students with scores above 80:");

        // Iterate through the array to check each student's score
        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] > 80) {
                System.out.println("Student " + (i + 1) + ": " + studentScores[i]);
                countAbove80++; // Increment the counter if the score is above 80
            }
        }

        System.out.println("\nNumber of students with scores above 80: " + countAbove80);
        }
    }

