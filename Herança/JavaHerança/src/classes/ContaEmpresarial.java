package classes;

public class ContaEmpresarial extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresarial(Integer numero, String proprietario, Double saldo, Double limiteEmprestimo) {
        super(numero, proprietario, saldo); // verifica se existe herança e chama o metodo contrutor vazio da outra classe
        //this.numero = numero;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void pegarEmprestimo(int quantia) {
        if (quantia <= this.limiteEmprestimo) {
            this.saldo += quantia - 10.0;
        }
    }

    @Override
    public String toString() {
        return "ContaEmpresarial [numero= " + numero + ", proprietario = " + proprietario + 
        ", saldo= " + saldo + "limiteEmprestimo= " + limiteEmprestimo + "]";
    }    
}
