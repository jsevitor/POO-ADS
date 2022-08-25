import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int p1 = 2, p2 = 3, p3 = 5;
        double x, y, z, media = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("           MEDIA PONDERADA           ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Quantos casos voce vai digitar? ");
        int N = sc.nextInt();
        System.out.println("-------------------------------------");

        for (int i = 1; i <= N; i++){
            System.out.println("Digite três valores: ");
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            media = (x * p1 + y * p2 + z * p3) / (p1 + p2 + p3);

            System.out.println("-------------------------------------");
            System.out.printf("MÉDIA = %.1f%n", media);
            System.out.println("-------------------------------------");
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        sc.close();
    }
}
