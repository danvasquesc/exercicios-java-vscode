/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar */

import java.util.Locale;
import java.util.Scanner;

public class ItemQuantidade {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int codigo, quantidade;
        double valorTotal;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o código do item e depois a quantidade deste item:");
            codigo = sc.nextInt();
            quantidade = sc.nextInt();

            if (codigo == 1) {
                
            }

            

        }

    }

}
