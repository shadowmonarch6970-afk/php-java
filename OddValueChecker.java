import java.util.Scanner;
class OddValExp extends Exception {     
public OddValExp(String message) {         
super(message);
    }
}
public class OddValueChecker {        
static void checkValue(int num) throws OddValExp {         
if (num % 2 != 0) {
throw new OddValExp("Error: The entered value " + num + " is odd!");
        } 
else {
System.out.println("The entered value " + num + " is even.");
        }
    }
public static void main(String[] args) {         
Scanner sc = new Scanner(System.in);         
try {
System.out.print("Enter an integer: ");             
int number = sc.nextInt();
checkValue(number);
        } 
catch (OddValExp e) {
System.out.println(e.getMessage());
        } 
catch (Exception e) {
System.out.println("Invalid input! Please enter an integer.");
        } 
finally {             
sc.close();
        }
    }
}