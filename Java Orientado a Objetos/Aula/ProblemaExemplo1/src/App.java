import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triangulo X (lado a, b e c):");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do triangulo X (lado a, b e c):");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triangulo X: %.4f %n", areaX);
        System.out.printf("Área do triangulo Y: %.4f %n", areaY);

        if (areaX > areaY ) {
            System.out.println("Triangulo com a maior área: X");            
        } else {
            System.out.println("Triangulo com a maior área: Y");
        }

        sc.close();
    }
}
