import java.util.Locale;
import java.util.Scanner;

public class L3ex02 {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i = 0, idade = 0, somaIdade = 0;
        System.out.println("Digite as idades: ");

        while (idade >= 0) {
            idade = sc.nextInt();

            if (idade > 0) {
                somaIdade += idade;
                i ++;  
            } 
        }
            
        if (i == 0 && idade < 0) {
            System.out.println("IMPOSSÍVEL CALCULAR!");
        } else {
            double media = (double) somaIdade/i;
            System.out.printf("MEDIA = %.2f%n", media);
        }
        
        sc.close();
    }
}
