package Exercicios;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int Number1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int Number2 = sc.nextInt();

        if (Number1 > Number2) {
            System.out.println("O primeiro numero e maior");
        } else if (Number1 < Number2){
            System.out.println("O segundo numero e maior");
        } else {
            System.out.println("Os numeros sao iguais");
        }

        sc.close();
    }
}
