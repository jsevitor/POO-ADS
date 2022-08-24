import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double fatura = 50.0;

        System.out.println("--------------------------------------");
        System.out.println("              OPERADORA               ");
        System.out.println("--------------------------------------");

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        if (minutos > 100) {
            fatura += (minutos - 100) * 2;            
        } 
        
        System.out.println("--------------------------------------");
        System.out.printf("Valor a pagar: R$%.2f%n", fatura);
        System.out.println("--------------------------------------");

        sc.close();
    }

    
}