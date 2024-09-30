import java.util.Scanner;

public class getArrayMean {

    public static double getMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Enter number of elements: ");
            String input = scanner.nextLine();
            if (isInteger(input)) {
                n = Integer.parseInt(input);
                if (n > 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                String input = scanner.nextLine();
                if (isInteger(input)) {
                    numbers[i] = Integer.parseInt(input);
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        double mean = getMean(numbers);
        System.out.printf("Mean of Array is %.2f\n", mean);

        scanner.close();
    }
}
