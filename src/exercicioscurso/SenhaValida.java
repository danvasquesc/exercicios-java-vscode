import java.util.Scanner;

public class SenhaValida {

    public static void main(String[] args) {

        int senha;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite sua senha");
            senha = sc.nextInt();

            while (senha != 2002) {
                System.out.println("Senha inválida. Digite novamente");
                senha = sc.nextInt();
            }

            System.out.println("Acesso Permitido");
        }
    }
}
