import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("              PAGAMENTO               ");
        System.out.println("--------------------------------------");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Valor por hora: R$");
        double valorHora = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horasTrab = sc.nextInt();

        double pgto = horasTrab * valorHora;

        System.out.println("---------------------------------------------------");
        System.out.printf("O pagamento para %s deve ser R$%.2f \n", nome, pgto);
        System.out.println("---------------------------------------------------");



        sc.close();

    }
    
}
