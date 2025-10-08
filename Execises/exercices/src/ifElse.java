import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        float number = s.nextFloat();
        if (number < 0)  {
            System.out.println("Numero e negativo");
        } else if (number > 0){
            System.out.println("Numero é positivo");
        } else {
            System.out.println("Numero 0");
        }
    }
}
