package jogo21;

public class Carta {

    private Naipes naipe;

    private ValorCarta valorCarta;

    public Carta(Naipes naipe, ValorCarta valorCarta) {
        this.naipe = naipe;
        this.valorCarta = valorCarta;
    }

    public Carta(Carta carta) {
        this.naipe = carta.getNaipe();
        this.valorCarta = carta.getValorCarta();
    }

    public Naipes getNaipe() {
        return naipe;
    }

    public ValorCarta getValorCarta() {
        return valorCarta;
    }

    public int getValor() {
        return valorCarta.valorCarta;
    }

    @Override
    public String toString() {
        return "[" + valorCarta + " de " + naipe + "] (" + this.getValor() + ")";
    }
}
