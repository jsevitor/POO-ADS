import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        int idade = 0;
        int i = 0;
        double somaIdades = 0;
        double media = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("            MEDIA IDADES              ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Digite as idades: ");

        while (idade >= 0) {
            idade = sc.nextInt();

            if (idade > 0) {
                somaIdades += idade;
                i ++;                
            }    
        }

        System.out.println("--------------------------------------");
        
        if (i == 0 && idade < 0) {
            System.out.println("IMPOSSÍVEL CALCULAR");
        } else {
            media = somaIdades / i;
            System.out.printf("MÉDIA = %.2f%n", media);
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
}
