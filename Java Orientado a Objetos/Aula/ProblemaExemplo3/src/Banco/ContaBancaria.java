package Banco;

public class ContaBancaria {
    /* ATRIBUTOS DA CLASSE */
    private int numConta;
    private String nomeTitular;
    private double saldo;
    //private double saldo;

    /* MÉTODO CONSTRUTOR */
    public ContaBancaria(int numConta, String nomeTitular, char resposta, double depositoInicial) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;

        if (resposta == 's') {
            this.setSaldo(depositoInicial);
        } else if (resposta == 'n') {
            this.setSaldo(0);
        } 
    }

    /* MÉTODOS PERSONALIZADOS */
    public void dadosConta(String titulo) {
        System.out.println("-----------------------------------------------------");
        System.out.println(titulo);
        System.out.format("Conta: %d, Titular: %s, Saldo: R$ %.2f%n", getNumConta(), getNomeTitular(), getSaldo());
        System.out.println("-----------------------------------------------------");  
    }
    
    public void depositar(double deposito){
        this.setSaldo(getSaldo() + deposito);
    }

    public void sacar(double saque){
        this.setSaldo((getSaldo() - saque) - 5.00);
    }

    /* MÉTODOS GETTERS E SETTERS */
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}