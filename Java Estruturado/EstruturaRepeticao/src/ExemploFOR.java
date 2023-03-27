import java.util.Locale;
import java.util.Scanner;

public class ExemploFOR {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor, soma = 0;

        System.out.print("Digite a quantidade de elementos: ");
        valor = sc.nextInt();

        for (int i = 0; i < valor; i++){
            System.out.print("Digite um numero inteiro: ");
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("A soma do número é: " + soma);

        sc.close();
    }
    
}
