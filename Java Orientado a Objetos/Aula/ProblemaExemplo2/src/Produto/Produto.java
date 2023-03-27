package Produto;
public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    /* MÉTODO CONSTRUTOR */
    public Produto() {

    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /* MÉTODOS PERSONALIZADOS */
    public double valorTotalEstoque() {
        return preco*quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.setQuantidade(getQuantidade() + quantidade);
    }

    public void removerEstoque(int quantidade) {
        this.setQuantidade(getQuantidade() - quantidade);
    }

    public String toString(){
        return nome
        + ", R$ "
        + String.format("%.2f", preco)
        +", "
        +quantidade
        +" unidades, Total: R$ "
        + String.format("%.2f", valorTotalEstoque());        
    }

    /* MÉDOTOS GETTERS E SETTERS */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
