import java.util.Locale;
import java.util.Scanner;

public class L1ex05 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: R$");
        double precoUnit = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int qtde = sc.nextInt();
        System.out.print("Dinheiro recebido: R$");
        double dinheiro = sc.nextDouble();

        double troco = (double) dinheiro - (precoUnit * qtde);
        
        System.out.printf("TROCO = R$ %.2f%n", troco);

        sc.close();
    }
    
}
