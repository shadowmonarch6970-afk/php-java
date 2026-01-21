import java.util.Scanner;

public class VolumeCalculator {

    // Volume of a cube: side³
    public double volume(double side) {
        return side * side * side;
    }

    // Volume of a rectangular box: length × width × height
    public double volume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of a cylinder: π × radius² × height
    public double volume(float radius, float height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();

        System.out.println("Choose a shape to calculate volume:");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Box");
        System.out.println("3. Cylinder");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter side of the cube: ");
                double side = scanner.nextDouble();
                result = vc.volume(side);
                System.out.printf("Volume of Cube: %.2f\n", result);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                result = vc.volume(length, width, height);
                System.out.printf("Volume of Rectangular Box: %.2f\n", result);
                break;

            case 3:
                System.out.print("Enter radius: ");
                float radius = scanner.nextFloat();
                System.out.print("Enter height: ");
                float cylHeight = scanner.nextFloat();
                result = vc.volume(radius, cylHeight);
                System.out.printf("Volume of Cylinder: %.2f\n", result);
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        scanner.close();
    }
}

