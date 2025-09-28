import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        for (int i=1; i<=10; i++) {
            int result = number*i;
            System.out.println("The result of " +number +" x " +i + " is :" +result);
        }
    }
}
