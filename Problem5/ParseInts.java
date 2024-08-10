import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;  // Initialize variables to store each integer value and the sum
        Scanner scan = new Scanner(System.in);  // Scanner to read input from the user
        String line;  // String to hold the entire line of input

        System.out.println("Enter a line of text:");
        Scanner scanLine = new Scanner(scan.nextLine());  // Scanner to read the input line token by token

        // Process each token in the line
        while (scanLine.hasNext()) {
            try {
                // Try to parse the next token as an integer
                val = Integer.parseInt(scanLine.next());
                sum += val;  // Add the integer value to the sum
            } catch (NumberFormatException e) {
                // Catch block to handle non-integer tokens
                // Do nothing and continue to the next token
            }
        }

        // Print the sum of the integers found in the input line
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
