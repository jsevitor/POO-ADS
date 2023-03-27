import java.util.Scanner;

public class L3ex09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite dois numeros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = x; i < y; i++) {

            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("Soma dos impares = " + soma);
        sc.close();
    }
    
}
