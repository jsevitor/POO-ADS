package jogo21;

public abstract class Pessoa {

    private String nome;
    private Mao mao;

    public Pessoa() {
        this.nome = "";
        this.mao = new Mao();
    }

    public void compra(Baralho baralho, Baralho descarte) {
        if (!baralho.temCartas()) {
            baralho.recarregaBaralhoDescarte(descarte);
        } 
        this.mao.pegaCartaBaralho(baralho);
        System.out.println(this.nome + " pegou uma carta. \n");
        //Mao.pausa();
        this.imprimeMao();
    }

    public boolean tem21() {
        if (this.getMao().calculaValorMao() == 21) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimeMao() {
        Mao.pausa();
        System.out.println("Mão do " + this.nome + ": ");
        System.out.println(this.mao + "Total: " + this.mao.calculaValorMao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mao getMao() {
        return mao;
    }

    public void setMao(Mao mao) {
        this.mao = mao;
    }
}
