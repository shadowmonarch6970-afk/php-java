import java.util.Scanner;

class SimpleSorter {
    private int[] numbers;

    public SimpleSorter(int[] numbers) {
        this.numbers = numbers;
    }

    public void sort() {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public void printNumbers() {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        SimpleSorter sorter = new SimpleSorter(nums);
        sorter.sort();

        System.out.println("Sorted array in ascending order:");
        sorter.printNumbers();

        scanner.close();
    }
}

