import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double fatura = 50.0;

        System.out.println("------------------------------");
        System.out.println("       CONSUMO TELEFONE       ");
        System.out.println("------------------------------");
        System.out.print("Minutos consumidos: ");
        int minutos = sc.nextInt();

         if (minutos > 100) {
            fatura += (minutos - 100) * 2.0;
            System.out.printf("Valor a ser pago: R$ %.2f%n", fatura);
        } else if (minutos > 0 && minutos <= 100) {
            System.out.printf("Valor a ser pago: R$ %.2f%n", fatura);                               
        }else{
            System.out.println("Valor invalido para minutos.");     
        }
        
        System.out.println("------------------------------");
        sc.close();
    }
    
}
