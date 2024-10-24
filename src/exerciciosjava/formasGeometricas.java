/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */



package src.exerciciosjava;

import java.util.Locale;
import java.util.Scanner;

public class formasGeometricas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADOO, RETANGULO;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor de A:");
            A = sc.nextDouble();

            System.out.print("Digite o valor de B:");
            B = sc.nextDouble();

            System.out.print("Digite o valor de C:");
            C = sc.nextDouble();


        }

    }

}
