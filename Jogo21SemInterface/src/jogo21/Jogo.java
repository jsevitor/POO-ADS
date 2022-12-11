package jogo21;

public class Jogo {

    private Baralho baralho, descarte;
    private Banca banca;
    private Jogador jogador;
    private int vitorias, derrotas, empates;
 
    public Jogo() {
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;

        baralho = new Baralho(true); // cria novo baralho com 52 cartas
        descarte = new Baralho(); // cria um baralho vazio para descarte

        banca = new Banca();
        jogador = new Jogador();

        baralho.embaralha();
        iniciaRodada();
    }    

    public void iniciaRodada() {
        
        if (vitorias > 0 || derrotas > 0 || empates > 0) {
            System.out.println("=====================================================");
            System.out.println(">>> Iniciando Nova Mao...");
            pausa();
            System.out.println("\nVitórias: " + vitorias + "   Derrotas: " + derrotas + "   Empates: " + empates);
            System.out.println("=====================================================");
            banca.getMao().descartaMaoBaralho(descarte);
            jogador.getMao().descartaMaoBaralho(descarte);
        }

        if (baralho.cartasRestantes() < 4) {
            baralho.recarregaBaralhoDescarte(descarte);
        }

        // da duas cartas a banca
        banca.getMao().pegaCartaBaralho(baralho);
        banca.getMao().pegaCartaBaralho(baralho);

        // da duas cartas ao jogador
        jogador.getMao().pegaCartaBaralho(baralho);
        jogador.getMao().pegaCartaBaralho(baralho);

        banca.imprimePrimeiraMao();
        jogador.imprimeMao();

        //checa se a banca tem 21
        if (banca.tem21()) {
            banca.imprimeMao();
            
            //checa se o jogador tambem tem 21
            if (jogador.tem21()) {
                System.out.println("\nAmbos possuem 21 \n EMPATE!");
                empates ++;
                iniciaRodada();
            } else {
                System.out.println("\nA banca tem 21. \n JOGADOR PERDEU!");
                banca.imprimeMao();
                derrotas ++;
                iniciaRodada();                
            }
        }

        //checa se o jogador tem 21 para começar
        //se nesse ponto, nos ja soubermos que a banca nao tem 21
        if (jogador.tem21()) {
            System.out.println("\nO jogador tem 21! \n VOCÊ VENCEU!");
            vitorias ++;
            iniciaRodada();
        }

        jogador.tomaDecisao(baralho, descarte);

        if (jogador.getMao().calculaValorMao() > 21) {
            System.out.println("\nJogador ultrapassou 21."); 
            derrotas++;
            iniciaRodada();           
        }

        //vez da banca
        banca.imprimeMao();
        while (banca.getMao().calculaValorMao() < 17) {
            banca.compra(baralho, descarte);
        }

        //checa quem ganhou
        if (banca.getMao().calculaValorMao() > 21) {
            System.out.println("\nBANCA PERDEU!"); // trocar para portugues
            vitorias++;
        } else if (banca.getMao().calculaValorMao() > jogador.getMao().calculaValorMao()) {
            System.out.println("\nJOGADOR PERDEU!");
            derrotas++;
        } else if (jogador.getMao().calculaValorMao() > banca.getMao().calculaValorMao()) {
            System.out.println("\nJOGADOR VENCEU!");
            vitorias++;
        } else {
            System.out.println("\nEMPATE!");
            empates++;
        }
        iniciaRodada();
    }

    public static void pausa(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
