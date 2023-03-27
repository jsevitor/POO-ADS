import java.util.Locale;
import java.util.Scanner;

public class L1ex09 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double a = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        double b = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        double c = sc.nextDouble();

        double quadrado = a * a;
        double triangulo = (a * b)/2;
        double trapezio = ((a + b) * c)/2;

        System.out.printf("ÁREA DO QUADRADO = %.4f%n", quadrado);
        System.out.printf("ÁREA DO TRIANGULO = %.4f%n", triangulo);
        System.out.printf("ÁREA DO TRAPEZIO = %.4f%n", trapezio);

        sc.close();
    }
    
}
