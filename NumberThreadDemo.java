import java.util.Arrays;
import java.util.Scanner;

// Thread to display numbers in ascending order
class AscendingThread extends Thread {
    int[] numbers;

    AscendingThread(int[] numbers) {
        this.numbers = numbers.clone(); // clone to avoid external modification
        Arrays.sort(this.numbers);      // sort ascending
    }

    public void run() {
        System.out.println("Ascending Thread Started:");
        for (int num : numbers) {
            System.out.println("Ascending: " + num);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Ascending thread interrupted.");
            }
        }
        System.out.println("Ascending Thread Finished.\n");
    }
}

// Thread to display numbers in descending order
class DescendingThread extends Thread {
    int[] numbers;

    DescendingThread(int[] numbers) {
        this.numbers = numbers.clone();
        Arrays.sort(this.numbers);      // sort ascending first
    }

    public void run() {
        System.out.println("Descending Thread Started:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Descending: " + numbers[i]);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Descending thread interrupted.");
            }
        }
        System.out.println("Descending Thread Finished.\n");
    }
}

// Main class to start threads with user input
public class NumberThreadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int limit = sc.nextInt();

        int[] values = new int[limit];

        System.out.println("Enter " + limit + " values:");

        for (int i = 0; i < limit; i++) {
            values[i] = sc.nextInt();
        }

        AscendingThread ascThread = new AscendingThread(values);
        DescendingThread descThread = new DescendingThread(values);

        ascThread.start();

        // Wait for ascending thread to finish before starting descending thread
        try {
            ascThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for ascending thread.");
        }

        descThread.start();

        // Optional: wait for descending thread to finish before main ends
        try {
            descThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for descending thread.");
        }

        sc.close();
    }
}

