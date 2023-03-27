import java.util.Locale;
import java.util.Scanner;

public class L2_1_Funcao {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a 1ª nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Insira a 2ª nota: ");
        double n2 = sc.nextDouble();

        double nota = notaFinal(n1, n2);

        resultado(nota);

        sc.close();
    }

    public static double notaFinal(double x, double y) {
       double soma = x + y ;
       System.out.printf("NOTA FINAL = %.1f%n", soma);
        return soma;
    }
    
    public static void resultado(double conceito) {
        if (conceito >= 60) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");  
        }
    }
}
