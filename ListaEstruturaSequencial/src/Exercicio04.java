import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("                 SOMA                 ");
        System.out.println("--------------------------------------");

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.printf("SOMA = %d%n", soma);
        System.out.println("--------------------------------------");

        sc.close();
    }

    
}
