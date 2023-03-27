import java.util.Scanner;

public class L2_2_Funcao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Coeficiente a: ");
        double a = sc.nextDouble();
        System.out.println("Coeficiente b: ");
        double b = sc.nextDouble();
        System.out.println("Coeficiente c: ");
        double c = sc.nextDouble();

        double delta = calculoDelta(a, b, c);
        calculoRaizes(a, b, delta);

        sc.close();
    }
    
    public static double calculoDelta(double x, double y, double z) {
        double valorDelta = Math.pow(y, 2) - (4 * x * z);
        return valorDelta;   
    }

    public static void calculoRaizes(double x, double y, double d) {
        double x1 = -(y + Math.sqrt(d)) / 2 * x;
        double x2 = -(y - Math.sqrt(d)) / 2 * x;
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

    }
}
