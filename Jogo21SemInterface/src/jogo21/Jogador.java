package jogo21;

import java.util.Scanner;

public class Jogador extends Pessoa {

    Scanner sc= new Scanner(System.in);

    public Jogador() {
        super.setNome("Jogador");
    }
    
    public void tomaDecisao(Baralho baralho, Baralho descarte) {
        
        int decisao = 0;
        boolean getNum = true;

        while (getNum) {
            try {
                System.out.println("-----------------------------------------------------");
                System.out.print("Gostaria de [1]. Comprar ou [2]. Passar: ");
                decisao = sc.nextInt();
                System.out.println("-----------------------------------------------------");
                getNum = false;
                Mao.pausa();

            } catch (Exception e) {
                System.out.println("Inválido!");
                sc.next();
            }
        }

        if (decisao == 1) {
            this.compra(baralho, descarte);
            if (this.getMao().calculaValorMao() > 20) {
                return;
            } else {
                this.tomaDecisao(baralho, descarte);
            }
        } else {
            System.out.println("Você passou.\n");
        }
    }
}
