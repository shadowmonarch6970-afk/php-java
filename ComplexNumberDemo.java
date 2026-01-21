import java.util.Scanner;

// Complex number class
class Complex {
    double real;
    double imag;

    // Constructor to initialize complex number
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        double sumReal = this.real + c.real;
        double sumImag = this.imag + c.imag;
        return new Complex(sumReal, sumImag);
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

// Main class
public class ComplexNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first complex number
        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();

        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = sc.nextDouble();

        // Input for second complex number
        System.out.print("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();

        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = sc.nextDouble();

        // Create two Complex number objects
        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        System.out.print("\nFirst Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        // Add the two complex numbers
        Complex sum = c1.add(c2);

        // Display the result
        System.out.print("Sum of the Complex Numbers: ");
        sum.display();

        sc.close();
    }
}

