import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("             SENHA FIXA               ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Digite a senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            
            if (senha != 2002) {
                System.out.print("Senha Inválida!");
                System.out.print(" Tente novamente: ");
                senha = sc.nextInt();
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Acesso permitido!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
    
}
