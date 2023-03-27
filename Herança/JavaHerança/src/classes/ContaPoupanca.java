package classes;

public class ContaPoupanca extends Conta {
    
    private Double taxaRendimento;

    public ContaPoupanca(Integer numero, String proprietario, Double saldo, Double taxaRendimento) {
        super(numero, proprietario, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void saque(Double quantia) {
        this.saldo -= quantia;
    }

    public void renderJuros() {
        this.saldo += (this.saldo * taxaRendimento)/100;
    }

    @Override
    public String toString() {
        return "Conta Poupança [numero= " + numero + ", proprietario= " + proprietario + ", saldo= " + saldo + 
               "taxaRendimento= " + taxaRendimento + "]";
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    
}
