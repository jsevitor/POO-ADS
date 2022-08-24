import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hInicial, hFinal, duracao;

        System.out.println("-----------------------------------------");
        System.out.println("              TEMPO DE JOGO              ");
        System.out.println("-----------------------------------------");

        System.out.print("Hora inicial: ");
        hInicial = sc.nextInt();
        System.out.print("Hora final: ");
        hFinal = sc.nextInt();

        if (hInicial > hFinal) {
            duracao = (24 - hInicial) + hFinal;            

        } else if (hInicial == hFinal) {
            duracao = 24;
            
        } else {
            duracao = hFinal - hInicial;        
        }

        System.out.println("-----------------------------------------");
        if (duracao != 1) {
            System.out.printf("O JOGO DUROU %d HORAS %n", duracao);
        } else {
            System.out.printf("O JOGO DUROU %d HORA %n", duracao);     
        }
        System.out.println("-----------------------------------------");

        sc.close();
    }
    
}
