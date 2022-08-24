import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, menor;

        System.out.println("--------------------------------------");
        System.out.println("            MENOR DE TRÊS             ");
        System.out.println("--------------------------------------");

        System.out.print("Primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Segundo valor: ");
        b = sc.nextInt();
        System.out.print("Terceiro valor: ");
        c = sc.nextInt();

        menor = a;

        if (b < a && b < c || b == menor) {
            menor = b;            
        }
        if (c < a && c < b || c == menor) {
            menor = c;            
        }   
        
        System.out.println("--------------------------------------");
        System.out.println("MENOR = " + menor);
        System.out.println("--------------------------------------");
        
        sc.close();    
    }
    
}
