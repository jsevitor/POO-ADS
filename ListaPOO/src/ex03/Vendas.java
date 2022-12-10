package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendas {
    Scanner sc = new Scanner(System.in);

    private String nomeCliente;
    private String email;
    private String cpf;
    private String endereco;
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;

    ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    ArrayList<Produto> produto = new ArrayList<Produto>();
    ArrayList<Produto> carrinho = new ArrayList<Produto>();

    public Vendas() {

    }

    public void cadastraCliente(String nomeCliente, String email, String cpf, String endereco) throws InterruptedException {
        cliente.add(new Cliente(nomeCliente, email, cpf, endereco));
        int contasCriadas = cliente.size();
        //System.out.println("-----------------------------------------------");
        System.out.println(" Cliente cadastrado com sucesso!");
        System.out.println(" Total de contas: " + contasCriadas );
        Thread.sleep(800);
    }

    public void cadastraProduto(String nomeProduto, double precoProduto, int quantidadeProduto) throws InterruptedException {
        produto.add(new Produto(nomeProduto, precoProduto, quantidadeProduto));
        //System.out.println("-----------------------------------------------");
        System.out.println(" Produto cadastrado com sucesso!");
        Thread.sleep(800);
    }

    public void buscarCliente(String cpf) throws InterruptedException {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getCpf().equals(cpf)) {
                System.out.println(cliente.get(i));
                break;
            } /*else {
                System.out.println("Cliente não encontrado!");
            }*/
        }
        Thread.sleep(800);
    }

    public void adicionarProduto(char resposta) throws InterruptedException {
        int qtdeCarrinho = 0;
        double precoCarrinho = 0.0;
 
        System.out.println("-----------------------------------------------");

        if (resposta == 's') {
            System.out.print("Infomre o CPF: ");
            cpf = sc.nextLine();

            for (int i = 0; i < cliente.size(); i++) {
                if (cliente.get(i).getCpf().equals(cpf)) {
                    nomeCliente = cliente.get(i).getNome();
                    cpf = cliente.get(i).getCpf();
                    break;
                }
            }
            System.out.print("Produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            System.out.println(produto.size());
     
            for (int i = 0; i < produto.size(); i++) {
                if (produto.get(i).getNomeProduto().equals(nomeProduto)) {
                    String nomeProd = produto.get(i).getNomeProduto();
                    double precoProd = produto.get(i).getPrecoProduto();
                    int qtdeProd = produto.get(i).getQuantidadeProduto();
                    carrinho.add(new Produto(nomeProd, precoProd, quantidade));
                    break;
                }
            }
            System.out.println("Produto adicionado com sucesso!");

        } else if (resposta == 'n') {
            
        }

        Thread.sleep(800);
        System.out.println("===============================================");
        System.out.println(">>> CARRINHO DE COMPRAS ");
        System.out.println(" Cliente: " + nomeCliente + " - " + cpf);

        /*for (int i = 0; i < carrinho.size(); i++) {
            qtdeCarrinho += carrinho.get(i).getQuantidadeProduto();
            precoCarrinho += carrinho.get(i).getPrecoProduto();
            System.out.println(carrinho.get(i));
        }*/

        System.out.println(carrinho.size());

        for (int i = 0; i < carrinho.size(); i++) {
            carrinho.get(i).getQuantidadeProduto();
        }

        double totalCarrinho = qtdeCarrinho * precoCarrinho;
        System.out.println("-----------------------------------------------");
        System.out.println("Itens: " + qtdeCarrinho + "    Valor total: " + totalCarrinho);
        System.out.println("===============================================");
    }

    public void excluirProduto() {

    }

    public void notaFiscal() {
        
    }

    public void exibirCliente() {
        System.out.println("===============================================");
        for (Cliente cliente : cliente) {
            System.out.println(cliente.toString());
        }
        System.out.println("===============================================");
    }

    public void exibirProduto() {
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < produto.size(); i++) {
            System.out.println(produto.get(i));
        }
        System.out.println("-----------------------------------------------");
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }   
}
