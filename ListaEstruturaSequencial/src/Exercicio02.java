import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("              RETANGULO               ");
        System.out.println("--------------------------------------");

        System.out.print("Base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do retângulo: ");
        double altura = sc.nextDouble();

        System.out.println("--------------------------------------");

        double area = base * altura;
        double perimetro = (base * 2) + (altura * 2);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("Área = %f%n", area);
        System.out.printf("Perímetro = %f%n", perimetro);
        System.out.printf("Diagonal = %f%n", diagonal);
        System.out.println("--------------------------------------");

        sc.close();
    }    
}
