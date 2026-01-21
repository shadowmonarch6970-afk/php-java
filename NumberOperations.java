import java.util.Scanner;

public class NumberOperations {

    private String numberStr;

    // Constructor to initialize the number as a string
    public NumberOperations(String numStr) {
        this.numberStr = numStr;
    }

    // Method to calculate the sum of digits
    public int calculateSumOfDigits() {
        int sum = 0;
        for (char ch : numberStr.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += ch - '0'; // Convert character digit to int
            }
        }
        return sum;
    }

    // Method to calculate the reverse of the number as a string
    public String calculateReverse() {
        return new StringBuilder(numberStr).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String inputNumber = scanner.nextLine();  // Read as string to preserve formatting

        // Create an object of NumberOperations
        NumberOperations numOps = new NumberOperations(inputNumber);

        // Calculate and print the sum of digits
        int sumOfDigits = numOps.calculateSumOfDigits();
        System.out.println("Sum of digits: " + sumOfDigits);

        // Calculate and print the reverse of the number
        String reversedNumber = numOps.calculateReverse();
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}

