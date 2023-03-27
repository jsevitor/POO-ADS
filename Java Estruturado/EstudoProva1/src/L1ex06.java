import java.util.Locale;
import java.util.Scanner;

public class L1ex06 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo: ");
        double r = sc.nextDouble();

        double area = Math.PI * (Math.pow(r, 2));

        System.out.printf("ÁREA = %.3f%n", area);
        sc.close();
    }
    
}
