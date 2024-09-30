import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;

        while (true) {
            try {
                System.out.print("Enter the size of the multiplication table: ");
                size = Integer.parseInt(input.nextLine());
                
                if (size <= 0) {
                    System.out.println("Please enter a positive integer.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        printMultiplicationTable(size);
        input.close();
    }

    public static void printMultiplicationTable(int size) {

        System.out.println("Multiplication Table:");

        int[][] table = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}
