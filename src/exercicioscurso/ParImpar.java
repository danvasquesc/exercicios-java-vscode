/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar */

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        int numero;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }

        }

    }

}
