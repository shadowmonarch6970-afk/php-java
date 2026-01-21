import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b);

        int next = a + b;
        while (next <= limit) {
            System.out.print(" " + next);
            a = b;
            b = next;
            next = a + b;
        }
    }
}
