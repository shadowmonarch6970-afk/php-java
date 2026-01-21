import java.util.Scanner;
class Employee {
    int id;
    String name;
    String designation;     String dept;
    Employee(int id, String name, String designation, String dept) {         
this.id = id;         
this.name = name;         
this.designation = designation;         
this.dept = dept; 
    }
     void displayEmployeeInfo() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + dept);
    }
}
class Salary extends Employee {     
double basic;     
double hra;     
double da;     
double allowance;     
double netSalary;
    Salary(int id, String name, String designation, String dept, double basic) {         
super(id, name, designation, dept);         
this.basic = basic;
this.hra = 1250;                          
this.da = 1.10 * basic;          
this.allowance = 0.35 * basic;       }
      void calculateNetSalary() {
        netSalary = basic + hra + da + allowance;
    }
      void displaySalaryInfo() {
        System.out.println("\nSalary Details:");
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA (110%): " + da);
        System.out.println("Allowance (35%): " + allowance);
        System.out.println("Net Salary: " + netSalary);
    }
}
public class EmployeeSalaryDemo {     
public static void main(String[] args) {         
Scanner sc = new Scanner(System.in);
System.out.print("Enter Employee ID: ");         
int id = sc.nextInt();         
sc.nextLine(); // consume newline
System.out.print("Enter Name: ");         
String name = sc.nextLine();
System.out.print("Enter Designation: ");         
String designation = sc.nextLine();
System.out.print("Enter Department: ");         
String dept = sc.nextLine();
System.out.print("Enter Basic Salary: ");         
double basic = sc.nextDouble();
        Salary emp = new Salary(id, name, designation, dept, basic);
         emp.calculateNetSalary();
         emp.displayEmployeeInfo();
         emp.displaySalaryInfo();
        sc.close();
    }
}