package Produto;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados produto:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + produto);
        System.out.println();

        System.out.print("Entre com o numero de produtos que deseja adicionar no estoque: ");
        quantidade = sc.nextInt();
        produto.adicionarEstoque(quantidade);

        System.out.println();
        System.out.println("Atualização dos Dados do Produto: " + produto.toString());

        System.out.println();
        System.out.print("Entre com o numero de produtos que deseja remover do estoque: ");
        quantidade = sc.nextInt();
        produto.removerEstoque(quantidade);      
        
        System.out.println();
        System.out.println("Atualização dos Dados do Produto: " + produto);

        sc.close();
    }
}
