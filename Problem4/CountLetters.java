import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];  // Array to hold the count of each letter (A-Z)
        Scanner scan = new Scanner(System.in);

        // Get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // Convert to all upper case
        word = word.toUpperCase();

        // Count frequency of each letter in the string
        for (int i = 0; i < word.length(); i++) {
            try {
                // Try to increment the count for the corresponding letter
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Catch block to handle non-letter characters
                // System.out.println("Not a letter: " + e);  // Previous version
                System.out.println("Not a letter: " + word.charAt(i));  // Improved message
            }
        }

        // Print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
