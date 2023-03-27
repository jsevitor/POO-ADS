package Banco;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double deposito = 0;

        System.out.print("Entre com o número da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Entre com o nome do titular: ");
        String nomeTitular = sc.nextLine();
        System.out.print("Voce deseja realizar um deposito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.print("Entre com valor do deposito inicial: "); 
            deposito = sc.nextDouble();
        } 
        String titulo = "Dados da conta: ";
        
        ContaBancaria conta1 = new ContaBancaria(numConta, nomeTitular, resposta, deposito);
        conta1.dadosConta(titulo);

        System.out.print("Entre com o valor para deposito: ");
        deposito = sc.nextDouble();
        conta1.depositar(deposito);
        titulo = "Atualização dos dados da conta:";
        conta1.dadosConta(titulo);

        System.out.print("Entre com o valor para saque: ");
        double saque = sc.nextDouble();
        conta1.sacar(saque);
        conta1.dadosConta(titulo);  
    
        sc.close();
    }
}
