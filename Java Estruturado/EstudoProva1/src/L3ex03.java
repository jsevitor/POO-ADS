import java.util.Scanner;

public class L3ex03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int senha = 0;
        System.out.print("Digite a senha: ");

        while (senha != 2002) {
            senha = sc.nextInt();

            if (senha != 2002) {
                System.out.print("Senha Inválida! Tente novamente: ");
            } else {
                System.out.println("Acesso permitido!");
            }      
        }

        sc.close();
    }
    
}
