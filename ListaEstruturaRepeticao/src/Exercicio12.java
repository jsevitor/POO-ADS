import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, X;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("              PAR IMPAR              ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();
        System.out.println("-------------------------------------");

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite um numero: ");
            X = sc.nextInt();

            if (X % 2 == 0 && X > 0) {
                System.out.println("PAR POSITIVO");
            } else if (X % 2 == 0 && X < 0) {
                System.out.println("PAR NEGATIVO");
            } else if (X % 2 == 1 && X > 0) {
                System.out.println("ÍMPAR POSITIVO");
            } else if (X % 2 == -1 && X < 0) {
                System.out.println("ÍMPAR NEGATIVO");
            } else {
                System.out.println("NULO");
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        sc.close();
    }
}
