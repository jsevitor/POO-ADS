import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("                MULTIPLOS                ");
        System.out.println("-----------------------------------------");

        System.out.println("Digite dois números inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("-----------------------------------------");

        if (x % y == 0 || y % x == 0) {
            System.out.println("São mútilplos");      
        } else {
            System.out.println("Não são mútilplos");   
        }

        System.out.println("-----------------------------------------");
        sc.close();
    }
    
}
