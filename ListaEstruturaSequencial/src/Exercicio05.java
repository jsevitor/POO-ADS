import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("                TROCO                 ");
        System.out.println("--------------------------------------");

        System.out.print("Preço unitário do produto: R$");
        double precoUnit = sc.nextDouble();
        
        System.out.print( "Quantidade comprada: ");
        int qtde = sc.nextInt();

        System.out.print("Dinheiro recebido: R$");
        double dinheiro = sc.nextDouble();
        System.out.println("--------------------------------------");

        double troco = (double) dinheiro - (qtde * precoUnit);

        System.out.printf("TROCO = R$%.2f%n", troco);
        System.out.println("--------------------------------------");        

        sc.close();
    }
    
}
