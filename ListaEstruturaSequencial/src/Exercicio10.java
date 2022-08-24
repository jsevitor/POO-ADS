import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("               DURAÇÃO                ");
        System.out.println("--------------------------------------");

        System.out.print("Digite a duração em segundos: ");
        int segundos = sc.nextInt();

        int hora = segundos / 3600;
        int resultado = segundos - (3600 * hora);
        int minuto = resultado / 60;
        int segundo = resultado - (60 * minuto);

        System.out.println("--------------------------------------");
        System.out.printf("%d:%d:%d \n", hora, minuto, segundo );
        System.out.println("--------------------------------------");

        sc.close();
    }
    
}
