package ex03;


public class Cliente {
    private String nome;
    private String email;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String email, String cpf, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return " Dados do cliente: " + "\n " + nome + ", " + email + ", " + cpf + ", " + endereco + "\n";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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

    
}
