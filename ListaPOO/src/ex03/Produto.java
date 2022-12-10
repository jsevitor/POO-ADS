package ex03;


public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;
    
    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return " " + nomeProduto + ", R$" + precoProduto + ", " + quantidadeProduto + " unidades";
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
