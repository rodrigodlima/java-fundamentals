package Exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        if (numero % 2 == 0 ) {
            System.out.println("O numero e par");
        } else {
            System.out.println("O numero é impar");
        }
        sc.close();
    }
}
