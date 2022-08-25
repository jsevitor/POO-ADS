import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        double nota1 = -1; 
        double nota2 = 11;
        double media = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("               VALIDAÇÃO DE NOTA                ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        if (nota1 < 0 || nota1 > 10.0){ //verificação primeira nota
            while (nota1 < 0 || nota1 > 10){
                System.out.print("Valor inválido! Tente novamente: ");
                nota1 = sc.nextDouble();
            }
        }

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        if (nota2 < 0 || nota2 > 10.0){ //verificação segunda nota
            while (nota2 < 0 || nota2 > 10){
                System.out.print("Valor inválido! Tente novamente: ");
                nota2 = sc.nextDouble();
            }
        }

        System.out.println("------------------------------------------------");
        media = (nota1 + nota2)/2;
        System.out.printf("MÉDIA = %.2f%n", media);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        sc.close();
    }

}
