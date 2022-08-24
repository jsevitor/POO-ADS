import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); //padronização do sistema monetario para ponto como separador 
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("               TERRENO                ");
        System.out.println("--------------------------------------");

        System.out.print("Digite a largura do terreno (m): ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno (m): ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: R$");
        double valorM2 = sc.nextDouble();

        double area = largura * comprimento;
        double precoTerreno = area * valorM2;                
        
        System.out.printf("Área do terreno = %.2f m² \n", area);
        System.out.printf("Preço do terreno = R$%.2f%n", precoTerreno);
        System.out.println("--------------------------------------");

        sc.close();
    }
}
