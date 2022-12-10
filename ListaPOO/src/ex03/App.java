package ex03;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean rodar = true;
        Vendas venda = new Vendas();

        while (rodar) {

            System.out.println(" >>>>>>>>>>>>> COMPRE AQUI .COM <<<<<<<<<<<<<< ");
            System.out.println("===============================================");
            System.out.println("| 1. Cadastro de cliente                      |");
            System.out.println("| 2. Cadastro de produto                      |");
            System.out.println("| 3. Buscar cliente                           |");
            System.out.println("| 4. Adicionar produto no carrinho de compras |");
            System.out.println("| 5. Excluir produto do carrinho de compras   |");
            System.out.println("| 6. Nota Fiscal                              |");
            System.out.println("| 7. Sair                                     |");
            System.out.println("===============================================");
            System.out.print("Opção: ");
            String opcao = sc.next();
            System.out.println("===============================================");

            switch (opcao) {
                case "1":
                    /*
                     * sc.nextLine();
                     * System.out.println(">>> CADASTRO DE CLIENTE ");
                     * System.out.print(" Nome: ");
                     * String nomeCliente = sc.nextLine();
                     * System.out.print(" E-mail: ");
                     * String email = sc.nextLine();
                     * System.out.print(" CPF (somente números): ");
                     * String cpf = sc.nextLine();
                     * System.out.print(" Endereço: ");
                     * String endereco = sc.nextLine();
                     * venda.cadastraCliente(nomeCliente, email, cpf, endereco);
                     */

                    // Cliente c = new Cliente(nome, email, cpf, endereco)
                    // listaCliente.add(c); 
                    venda.cadastraCliente("Vitor Oliveira", "vitor@mail.com", "11956726675", "Rua Lazaro - 355");
                    venda.cadastraCliente("Maria Barros", "maria@mail.com", "12345678977", "Rua Luz - 55");
                    venda.cadastraCliente("Pedro Moura", "moura@mail.com", "14725836933", "Av. Azul - 155");
                    System.out.println("===============================================");
                    break;

                case "2":
                    /*
                     * sc.nextLine();
                     * System.out.println(">>> CADASTRO DE PRODUTO ");
                     * System.out.print(" Nome: ");
                     * String nomeProduto = sc.nextLine();
                     * System.out.print(" Preço: ");
                     * Double precoProduto = sc.nextDouble();
                     * System.out.print(" Quantidade: ");
                     * int quantidadeProduto = sc.nextInt();
                     * venda.cadastraProduto(nomeProduto, precoProduto, quantidadeProduto);
                     */
                    venda.cadastraProduto("Camiseta", 29.90, 15);
                    venda.cadastraProduto("Bermuda", 89.90, 12);
                    venda.cadastraProduto("Calca", 150.90, 20);
                    venda.cadastraProduto("Bone", 19.90, 30);
                    System.out.println("===============================================");
                    break;

                case "3":
                    sc.nextLine();
                    System.out.println(">>> BUSCAR CLIENTE ");
                    System.out.print(" CPF: ");
                    String cpf = sc.nextLine();
                    venda.buscarCliente(cpf);
                    System.out.println("===============================================");
                    break;

                case "4":
                    sc.nextLine();
                    System.out.println(">>> ADICIONAR PRODUTOS AO CARRINHO DE COMPRAS ");
                    System.out.println(" Produtos disponíveis: ");
                    venda.exibirProduto();
                    System.out.print(" Deseja adicionar? [s/n]: ");
                    venda.adicionarProduto(sc.next().charAt(0));
                    break;
                case "5":

                    break;
                case "6":
                    venda.exibirCliente();
                    venda.notaFiscal();
                    break;

                case "7":
                    System.out.println("Saindo...");
                    Thread.sleep(500);
                    rodar = false;
                    break;
            }

        }

        sc.close();
    }

}
