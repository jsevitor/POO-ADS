import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0, x, y;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("             SOMA IMPARES            ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Digite dois números: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x < y) {
            for (int i = x; i < y; i++) {
                if (i % 2 == 1 || i % 2 == -1) {
                    soma += i;
                }
            }
        } else {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 == 1 || i % 2 == -1) {
                    soma += i;
                }
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("SOMA DOS ÍMPARES = " + soma);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        sc.close();
    }

}
