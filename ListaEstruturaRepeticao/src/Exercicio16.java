import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        int N, qtdeCobaia = 0, totalCobaia = 0, totalCoelho = 0, totalRato = 0, totalSapo = 0;
        double percCoelho = 0, percRato = 0, percSapo = 0;
        char tipoCobaia;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=");
        System.out.println("                EXPERIENCIAS                ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=");

        System.out.print("Quantos casos de teste serão digitados? ");
        N = sc.nextInt();
        System.out.println("--------------------------------------------");

        for (int i = 1; i <= N; i++){

            System.out.print("Quantidade de cobaias: ");
            qtdeCobaia = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            tipoCobaia = sc.next().charAt(0);

            totalCobaia += qtdeCobaia;   //soma total de cobaias

            if (tipoCobaia == 'C') {
                totalCoelho += qtdeCobaia;  //soma total de coelhos
                
            } else if (tipoCobaia == 'R') {  
                totalRato += qtdeCobaia;     //soma total de ratos           
            
            } else if (tipoCobaia == 'S') {
                totalSapo += qtdeCobaia;  //soma total de sapos
            }
        }

        /* Calculo dos percentuais */
        percCoelho = (double) ((totalCoelho * 100) / totalCobaia);
        percRato = (double) ((totalRato * 100) / totalCobaia);
        percSapo = (double) ((totalSapo * 100) / totalCobaia);

        System.out.println("--------------------------------------------");
        System.out.println("RELATÓRIO FINAL: ");
        System.out.printf("Total: %d cobaias %n", totalCobaia);
        System.out.printf("Total de coelhos: %d%n", totalCoelho);
        System.out.printf("Total de ratos: %d%n", totalRato);
        System.out.printf("Total de sapos: %d%n", totalSapo);
        System.out.printf("Percentual de coelhos: %.2f%n", percCoelho);
        System.out.printf("Percentual de ratos: %.2f%n", percRato);
        System.out.printf("Percentual de sapos: %.2f%n", percSapo);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=");

        sc.close();
    }
}
