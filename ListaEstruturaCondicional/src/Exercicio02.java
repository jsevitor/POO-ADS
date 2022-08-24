import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double delta, x1, x2;

        System.out.println("--------------------------------------");
        System.out.println("              BHASKARA                ");
        System.out.println("--------------------------------------");

        System.out.print("Coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        c = sc.nextDouble();

        delta = (Math.pow(b, 2)) - (4 * a * c);
        x1 = ((b * (-1)) + Math.sqrt(delta)) / (2 * a);
        x2 = ((b * (-1)) - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("--------------------------------------");
        
        if (delta > 0) {
            System.out.printf("x1 = %.4f%n", x1);
            System.out.printf("x2 = %.4f%n", x2);
        } else {
            System.out.println("Esta equação não possui raízes reais.");          
        }
        
        System.out.println("--------------------------------------");

        sc.close();
    }

}
