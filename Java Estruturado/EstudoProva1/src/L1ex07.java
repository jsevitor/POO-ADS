import java.util.Locale;
import java.util.Scanner;

public class L1ex07 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Valor por hora: R$");
        double valorHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int horas = sc.nextInt();

        double pagamento = (double) horas * valorHora;

        System.out.printf("O pagamento para %s deve ser R$ %.2f%n", nome, pagamento);

        sc.close();
    }
    
}
