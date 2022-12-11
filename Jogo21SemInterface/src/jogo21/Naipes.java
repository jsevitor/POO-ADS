package jogo21;

public enum Naipes {

    OUROS("Ouros"),
    COPAS("Copas"),
    ESPADAS("Espadas"),
    PAUS("Paus");

    String nomeNaipe;

    Naipes(String nomeNaipe) {
        this.nomeNaipe = nomeNaipe;
    }

    public String toString() {
        return nomeNaipe;
    }
}
