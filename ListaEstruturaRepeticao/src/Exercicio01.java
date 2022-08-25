import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;
        x = 0;
        y = 1;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("              CRESCENTE               ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        while (x != y) {

            System.out.println("Digite dois números: ");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("--------------------------------------");

            if (x > y) {
                System.out.println("DECRESCENTE!");

            } else {
                System.out.println("CRESCENTE!");

            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        sc.close();
    }
}
