import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("               CIRCULO                ");
        System.out.println("--------------------------------------");

        System.out.print("Digite o valor do raio do circulo: ");
        double r = sc.nextDouble();

        double area = (Math.PI) * (Math.pow(r, 2));
        System.out.println("--------------------------------------");

        System.out.printf("ÁREA = %.3f%n", area);
        System.out.println("--------------------------------------");

        sc.close();
    }
    
}
