import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = 1, y = 0, i = 1, soma = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("               PARES CONSECUTIVOS               ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        while (x != 0){
            
            System.out.print("Digite um número inteiro: ");
            x = sc.nextInt();
            y = x;

            if (x % 2 == 0) {
                soma += x;
            } else {
                y = x + 1;
                soma += y;
            }

            while (i < 5) {
                y += 2;
                soma += y;    
                i++;
            }

            if (x == 0) {
                break;
            }
            
            System.out.println("SOMA = " + soma);
            System.out.println("------------------------------------------------");
            i = 1;
            soma = 0;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
}
