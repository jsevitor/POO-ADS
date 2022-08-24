import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnit, dinheiro, troco, valorCompra;
        int qtde;

        System.out.println("----------------------------------------------");
        System.out.println("               TROCO VERIFICADO               ");
        System.out.println("----------------------------------------------");

        System.out.print("Preço unitário do produto: ");
        precoUnit = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtde = sc.nextInt();
        System.out.print("Dinheiro recebido: R$");
        dinheiro = sc.nextDouble();

        valorCompra = precoUnit * qtde;

        System.out.println("----------------------------------------------");

        if (dinheiro > valorCompra) {
            troco = dinheiro - valorCompra;
            System.out.printf("TROCO = R$%.2f%n", troco);            
        } else {
            troco = valorCompra - dinheiro;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS. %n", troco);
        }
        
        System.out.println("----------------------------------------------");    

        sc.close();        
    }
}
