import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sides a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        
        if (a + b > c && b + c > a && a + c > b) {
           
            if (a == b && b == c)
                System.out.println("Equilateral Triangle");
            else if (a == b || b == c || a == c)
                System.out.println("Isosceles Triangle");
            else
                System.out.println("Scalene Triangle");

            
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area: %.2f" , area);
        } 
        else {
            System.out.println("These sides don't form a valid triangle.");
        }
    }
}
