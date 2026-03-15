package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student stud = new Student();
        System.out.println("Enter the name of student");
        stud.name = sc.nextLine();
        System.out.println("Enter the grades");
        stud.grade1 = sc.nextDouble();
        stud.grade2 = sc.nextDouble();
        stud.grade3 = sc.nextDouble();
        System.out.printf("Final grade = %.2f%n", stud.sumGrade());
        if (stud.sumGrade() >= 60){
            System.out.println("PASS");
        } else {
            double calc = 60.00 - stud.sumGrade();
            System.out.printf("MISSING %.2f POINTS", calc);
        }
    }
}
