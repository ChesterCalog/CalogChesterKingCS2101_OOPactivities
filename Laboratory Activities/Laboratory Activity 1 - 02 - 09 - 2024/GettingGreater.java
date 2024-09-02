import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Print the header
        System.out.println("Getting the Greater Value");

        // Ask the user for the first character
        System.out.print("Enter the first character: ");
        char ch1 = scanner.next().charAt(0);

        // Ask the user for the second character
        System.out.print("Enter the second character: ");
        char ch2 = scanner.next().charAt(0);

        // Get the ASCII values of the characters
        int ascii1 = (int) ch1;
        int ascii2 = (int) ch2;

        // Determine the greater character using Math.max
        char greaterChar = (ascii1 > ascii2) ? ch1 : ch2;

        // Print the result
        System.out.println("----------------------------------------");
        System.out.println("The character with greater value is: " + greaterChar);
        System.out.println("----------------------------------------");

        // Print ASCII codes
        System.out.println("Showing the ASCII Codes");
        System.out.println(ch1 + ": " + ascii1);
        System.out.println(ch2 + ": " + ascii2);

        // Close the scanner
        scanner.close();
    }
}
