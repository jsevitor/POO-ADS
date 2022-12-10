package ex04;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Ingresso ingresso = new Ingresso();
        Normal normal = new Normal();
        VIP vip = new VIP();
        CamaroteInferior camaroteinferior = new CamaroteInferior();
        CamaroteSuperior camarotesuperior = new CamaroteSuperior();
       
        System.out.println(" >>> VENDA DE INGRESSOS <<< ");
        System.out.println(" 1. Igresso Normal ");
        System.out.println(" 2. Ingresso VIP ");
        System.out.print(" Opção: ");
        int opcao = sc.nextInt();
        System.out.println("--------------------------------------------");
        ingresso.imprimeValor();

        if (opcao == 1) {
            normal.ingressoNormal();
            
        } else if (opcao == 2) {
            System.out.println(" >>> INGRESSOS VIP ");
            System.out.println(" 1. Camarote Inferior ");
            System.out.println(" 2. Camarote Superior ");
            System.out.print(" Opção: ");
            opcao = sc.nextInt();
            System.out.println("--------------------------------------------");

            if (opcao == 1) {
                System.out.println("Ingresso VIP - Camarote Inferior - R$" + vip.ingressoVip(100));
                camaroteinferior.imprimeLocalizacao("Térreo");
                
            } else if (opcao == 2) {
                System.out.println("Ingresso VIP - Camarote Superior - R$" + camarotesuperior.valorCamSuperior());
            }
        }
        System.out.println("--------------------------------------------");
        sc.close();
    }
    
}
