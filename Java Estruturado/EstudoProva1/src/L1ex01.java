import java.util.Locale;
import java.util.Scanner;

public class L1ex01 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Valor m²: R$");
        double valorM2 = sc.nextDouble();

        double area = largura * comprimento;
        double valorTerreno = area * valorM2;

        System.out.printf("Área do terreno = %.2f m² %n", area);
        System.out.printf("Preço do terreno = R$ %.2f%n", valorTerreno);
        sc.close();
    }
}
