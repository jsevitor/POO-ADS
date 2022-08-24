import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("               MEDIDAS                ");
        System.out.println("--------------------------------------");

        System.out.print("Digite a medida de A: ");
        double A = sc.nextDouble();

        System.out.print("Digite a medida de B: ");
        double B = sc.nextDouble();

        System.out.print("Digite a medida de C: ");
        double C = sc.nextDouble();

        /* AREA DO QUADRADO */
        double areaQuadrado = A * A;
        
        /* AREA DO TRIANGULO */
        double areaTriangulo = (A * B) / 2;

        /* AREA DO TRAPEZIO */
        double areaTrapezio = ((A + B) * C) / 2;

        System.out.println("--------------------------------------");
        System.out.printf("Área do quadrado = %.4f%n", areaQuadrado);
        System.out.printf("Área do triângulo = %.4f%n", areaTriangulo);
        System.out.printf("Área do trapezio = %.4f%n", areaTrapezio);
        System.out.println("--------------------------------------");



        sc.close();
    }   
    
}
