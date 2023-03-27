import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String msg = "";
        System.out.println("");
        System.out.print("Escolha um numero de 1 a 7 (1. Dom, 2. Seg, ...): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                //System.out.println("Dia da semana: Domingo");
                msg = "Domingo";
                break;
            case 2:
                //System.out.println("Dia da semana: Segunda-Feira");
                msg = "Segunda-Feira";
                break;
            case 3:
                //System.out.println("Dia da semana: Terça-Feira");
                msg = "Terça-Feira";
                break;
            case 4:
                //System.out.println("Dia da semana: Quarta-Feira");
                msg = "Quarta-Feira";
                break;
            case 5:
                //System.out.println("Dia da semana: Quinta-Feira");
                msg = "Quinta-Feira";
                break;
            case 6:
                //System.out.println("Dia da semana: Sexta-Feira");
                msg = "Sexta-Feira";
                break;
            case 7:
                //System.out.println("Dia da semana: Sabado");
                msg = "Sabado";
                break;        
            default:
                msg = "Valor digitado não corresponde a um dia.";
                break;
        }
        
        System.out.println("Dia da semana: " + msg);
        System.out.println("");
        sc.close();
    }
    
}
