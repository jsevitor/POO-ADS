package jogo21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Baralho {

    private ArrayList<Carta> baralho;

    public Baralho() {
        baralho = new ArrayList<Carta>();
    }

    public Baralho(boolean fazerBaralho) {
        baralho = new ArrayList<Carta>();
        if (fazerBaralho) {
            for (Naipes naipes : Naipes.values()) {
                for (ValorCarta rank : ValorCarta.values()) {
                    baralho.add(new Carta(naipes, rank));
                }
            }
        }
    }

    public ArrayList<Carta> obtemCartas() {
        return baralho;
    }

    public void adicionaCarta(Carta carta) {
        baralho.add(carta);        
    }

    public void addCartas(ArrayList<Carta> cartas){
        baralho.addAll(cartas);
    }

    public Carta pegaCarta() {
        //copia a primeira carta do baralho
        Carta cartaPega = new Carta(baralho.get(0));
        baralho.remove(0);
        return cartaPega;
    }

    public void embaralha() {
        Collections.shuffle(baralho, new Random());
    }

    public boolean temCartas() {
        if (baralho.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void baralhoVazio() {
        baralho.clear();
    }

    public void recarregaBaralhoDescarte(Baralho descarte) {
        this.adicionaCarta(descarte.pegaCarta());
        this.embaralha();
        descarte.baralhoVazio();
        System.out.println("As cartas acabaram... \n criando novo baralho a partir do descarte.");
    }

    public int cartasRestantes() {
        return baralho.size();
    }

    @Override
    public String toString() {

        String saida = "";

        for (Carta carta : baralho) {
            saida += carta;
            saida += "\n";
        }

        return saida;
    }
}
