package jogo21;

public enum ValorCarta {

    AS("As", 11),
    DOIS("Dois", 2),
    TRES("Tres", 3),
    QUATRO("Quatro", 4),
    CINCO("Cinco", 5),
    SEIS("Seis", 6),
    SETE("Sete", 7),
    OITO("Oito", 8),
    NOVE("Nove", 9),
    DEZ("Dez", 10),
    VALETE("Valete", 10),
    DAMA("Dama", 10),
    REI("Rei", 10);
    
    String nomeValorCarta;
    int valorCarta;

    private ValorCarta(String nomeValorCarta, int valorCarta) {
        this.nomeValorCarta = nomeValorCarta;
        this.valorCarta = valorCarta;
    }

    public String toString() {
        return nomeValorCarta;
    }
}
