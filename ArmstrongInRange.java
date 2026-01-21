import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start and end range:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;

            int digits = String.valueOf(num).length();

            while (original > 0) {
                int digit = original % 10;
                sum += Math.pow(digit, digits);
                original /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
