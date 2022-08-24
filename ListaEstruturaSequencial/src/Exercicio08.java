import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("               CONSUMO                ");
        System.out.println("--------------------------------------");

        System.out.print("Distância percorrida (km): ");
        int distancia = sc.nextInt();

        System.out.print("Combustível gasto (L): ");
        double combustivel = sc.nextDouble();

        double consumoMedio = (double) distancia / combustivel;
        
        System.out.println("--------------------------------------");
        System.out.printf("Consumo Médio = %.3f \n", consumoMedio);
        System.out.println("--------------------------------------");

        sc.close();
    }
    
}
