package jogo21;

import java.util.ArrayList;

public class Mao {

    private ArrayList<Carta> mao;

    public Mao() {
        mao = new ArrayList<Carta>();
    }

    public void pegaCartaBaralho(Baralho baralho) {
        mao.add(baralho.pegaCarta());
    }

    public int calculaValorMao() {
        int valor = 0;
        int contaAs = 0; //conta o numero de ases, e o valor atual

        for (Carta carta : mao) {
            //adiciona o valor da carta na mao
            valor += carta.getValor();
            //conta quantos ases foram adicionados
            if (carta.getValor() == 11) {
                contaAs ++;
            }
        }

        if (valor > 21 && contaAs > 0) {
            while (contaAs > 0 && valor > 21) {
                contaAs --;
                valor -= 10;
            }
        }
        return valor;
    }

    public Carta pegaCarta(int idx) {
        return mao.get(idx);
    }

    @Override
    public String toString() {
        String saida = "";
        for (Carta carta : mao) {
            saida += carta + " - ";
        }
        return saida;
    }

    public void descartaMaoBaralho(Baralho descarteBaralho) {
        descarteBaralho.addCartas(mao);
        mao.clear();
    }

    public static void pausa(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
