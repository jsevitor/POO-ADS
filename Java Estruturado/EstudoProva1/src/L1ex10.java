import java.util.Locale;
import java.util.Scanner;

public class L1ex10 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duração em segundos: ");
        int segundos = sc.nextInt();

        int hora = segundos / 3600;
        int resto = segundos % 3600;
        int minuto = resto / 60;
        int segundo = resto % 60;

        System.out.printf("%d:%d:%d", hora, minuto, segundo);

        sc.close();
    }
    
}
