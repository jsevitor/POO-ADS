import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String classificacao;
        System.out.println("-----------------------------------------");
        System.out.println("                 GLICOSE                 ");
        System.out.println("-----------------------------------------");
        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        if (glicose <= 100) {
            classificacao = "Normal";   

        } else if (glicose > 140) {
            classificacao = "Diabetes";  

        } else {
            classificacao = "Elevado";  

        }

        System.out.println("-----------------------------------------");
        System.out.println("Classificação: " + classificacao);
        System.out.println("-----------------------------------------");

        sc.close();
    }
    
}
