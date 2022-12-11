package jogo21;

public class Banca extends Pessoa {

    public Banca() {
        super.setNome("Banca");
    }

    public void imprimePrimeiraMao() {
        Mao.pausa();
        System.out.println("Mão da banca: ");
        System.out.println(super.getMao().pegaCarta(0) + " - [xxxxxxxx] (??)");
        System.out.println("A segunda carta está virada.\n");
    }    
}
