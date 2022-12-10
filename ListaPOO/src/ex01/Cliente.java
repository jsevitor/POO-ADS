package ex01;

public class Cliente {

    private String nome;
    private String enderco;
    private String cpf;
    private int idade;
    
    public Cliente(String nome, String enderco, String cpf, int idade) {
        this.nome = nome;
        this.enderco = enderco;
        this.cpf = cpf;
        this.idade = idade;
    }

    public boolean validaCPF() {
        boolean resultado = false;
        if (this.getCpf().length() == 11) {
            resultado = true;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + 
               ", endereço: " + enderco + 
               ", CPF: " + cpf + 
               ", idade: " + idade + " anos";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderco() {
        return enderco;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}