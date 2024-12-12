
import java.util.Scanner;

public class ImparesUsandoFor {

    public static void main(String[] args) {

        int x, i;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite um valor inteiro de X");
            x = sc.nextInt();

            for (i = 1; i <= x; i++) {
                if (i % 2 != 0) { /* aqui aprova somente números impares. se for par, nao acontece nada */
                    System.out.println(i);
                }
            }
        }
    }
}
