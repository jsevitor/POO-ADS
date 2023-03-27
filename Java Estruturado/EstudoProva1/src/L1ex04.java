import java.util.Scanner;

public class L1ex04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
