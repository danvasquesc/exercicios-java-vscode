import java.util.Scanner;

public class CoordenadasWhile {

    public static void main(String[] args) {

        int x, y;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite a coordenada de X e depois de Y");
            x = sc.nextInt();
            y = sc.nextInt();

            while (x != 0 && y != 0) { /*&& garante que as duas precisam ser verdadeiras pro while continuar, se uma das duas for falsa, ja encerra */
                if (x > 0 && y > 0) {
                    System.out.println("Primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("Segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("Terceiro");
                } else {
                    System.out.println("Quarto");
                }

                System.out.println("Digite a coordenada de X e depois de Y");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }
    }
}