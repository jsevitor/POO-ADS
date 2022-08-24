import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("                IDADES                ");
        System.out.println("--------------------------------------");

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();
        System.out.println("--------------------------------------");

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        String nome2 = sc.next();
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();
        System.out.println("--------------------------------------");

        double mediaIdade = (double) (idade1 + idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.2f anos \n", nome1, nome2, mediaIdade);
        System.out.println("--------------------------------------");

        sc.close();
    }
    
}
