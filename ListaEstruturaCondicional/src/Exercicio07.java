import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double d1, d2, d3, maior;

        System.out.println("-----------------------------------------");
        System.out.println("                  DARDO                  ");
        System.out.println("-----------------------------------------");

        System.out.println("Digite as três distâncias: ");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        d3 = sc.nextDouble();

        maior = d1;

        if (d2 > d1 && d2 > d3) {
            maior = d2;
        }
        if (d3 > d1 && d3 > d2) {
            maior = d3;
        }

        System.out.println("-----------------------------------------");
        System.out.printf("MAIOR DISTÂNCIA = %.2f%n", maior);
        System.out.println("-----------------------------------------");

        sc.close();
    }

}
