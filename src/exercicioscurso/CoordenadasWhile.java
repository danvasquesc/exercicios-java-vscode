import java.util.Scanner;

public class CoordenadasWhile {

    public static void main(String[] args) {

        int x, y;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite a coordenada de X e depois de Y");
            x = sc.nextInt();
            y = sc.nextInt();

            while (x != 0 || y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("Primeiro");
                }
                else if (x < 0 && y > 0) {
                    System.out.println("Segundo");
                }

            }



        }
        
    }

}
