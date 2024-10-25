/* Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.  */
package src.exerciciosinternet;

import java.util.Locale;
import java.util.Scanner;

public class porcentagemVotos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int totalEleitores, votosBrancos, votosNulos, votosValidos;
        double porcentagemBrancos, porcentagemNulos, porcentagemValidos;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o número total de eleitores do município: ");
            totalEleitores = sc.nextInt();

            System.out.print("Digite o número de votos brancos: ");
            votosBrancos = sc.nextInt();

            System.out.print("Digite o número de votos nulos: ");
            votosNulos = sc.nextInt();

            System.out.print("Digite o número de votos válidos: ");
            votosValidos = sc.nextInt();

            /*transforma int em double para resultado sair em double*/
            porcentagemBrancos = ((double) votosBrancos / totalEleitores) * 100;
            porcentagemNulos = ((double) votosNulos / totalEleitores) * 100;
            porcentagemValidos = ((double) votosValidos / totalEleitores) * 100;

        }

    }

}
