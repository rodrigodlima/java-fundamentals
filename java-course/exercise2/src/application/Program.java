package application;


import entities.Employee;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee empl = new Employee();
        System.out.println("Name: ");
        empl.name = sc.nextLine();
        System.out.println("Salary");
        empl.grossSalary = sc.nextDouble();
        System.out.println("Tax:");
        empl.tax = sc.nextDouble();
        System.out.println("Employee:" + empl);
    }
}
