import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, F = 1;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("              FATORIAL               ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            F *= i;
        }

        System.out.println("-------------------------------------");
        System.out.println("FATORIAL = " + F);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        sc.close();
    }
}
