import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = 0;
        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("                   COMBUSTÍVEL                    ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        while (codigo != 4) {
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = sc.nextInt();

            switch (codigo) {
                case 1:
                    alcool += 1;
                    break;

                case 2:
                    gasolina += 1;
                    break;

                case 3:
                    disel += 1;
                    break;

                case 4:
                    System.out.println("MUITO OBRIGADO");
                    break;
            }
        }

        System.out.println("------------------------------------------------");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        sc.close();
    }

}
