import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, X, dentro = 0, fora = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("             DENTRO FORA             ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();
        System.out.println("-------------------------------------");

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite um numero: ");
            X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                dentro += 1;
            } else {
                fora += 1;
            }
        }

        System.out.println("-------------------------------------");
        System.out.println(dentro + " DENTRO");
        System.out.println(fora + " FORA");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        sc.close();
    }

}
