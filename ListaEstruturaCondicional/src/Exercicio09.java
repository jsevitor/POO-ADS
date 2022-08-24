import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, qtde;
        double total = 0;

        System.out.println("-----------------------------------------");
        System.out.println("                LANCHONETE               ");
        System.out.println("-----------------------------------------");
        System.out.print("Código do produto comprado: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        qtde = sc.nextInt();

        switch (codigo) {
            case 1:
                total = qtde * 5.00;
                break;

            case 2:
                total = qtde * 10.50;
                break;

            case 3:
                total = qtde * 7.00;
                break;

            case 4:
                total = qtde * 8.90;
                break;

            case 5:
                total = qtde * 3.50;
                break;

            default:
                System.out.println("Código inválido!");
                break;
        }
        
        System.out.println("-----------------------------------------");
        System.out.printf("Valor a pagar: R$%.2f%n", total);
        System.out.println("-----------------------------------------");

        sc.close();
    }

}
