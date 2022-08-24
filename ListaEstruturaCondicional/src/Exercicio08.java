import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temperatura, F, C;

        System.out.println("---------------------------------------------------------");
        System.out.println("                       TEMPERATURA                       ");
        System.out.println("---------------------------------------------------------");

        System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().charAt(0);

        System.out.println("---------------------------------------------------------");

        if (escala == 'F' || escala == 'f') {
            
            System.out.print("Digite a temperatura em Fahrenheit: ");
            F = sc.nextDouble();
            temperatura = (F - 32) * 5/9;
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", temperatura);

        } else if (escala == 'C' || escala == 'c') {
            
            System.out.print("Digite a temperatura em Celsius: ");
            C = sc.nextDouble();
            temperatura = (C * 1.8) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", temperatura);

        } else {
            System.out.println("Escala inválida!");
        }

        System.out.println("---------------------------------------------------------");
        sc.close();
    }
    
}
