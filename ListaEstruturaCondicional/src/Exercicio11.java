import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sal, novoSal, aumento;
        int perc;

        System.out.println("-----------------------------------------");
        System.out.println("                 AUMENTO                 ");
        System.out.println("-----------------------------------------");

        System.out.print("Digite o salário da pessoa: R$");
        sal = sc.nextDouble();

        if (sal <= 1000) {
            perc = 20;
            novoSal = sal + (sal * perc/100);
            aumento = novoSal - sal;
                        
        } else if (sal > 1000 && sal <= 3000) {
            perc = 15;
            novoSal = sal + (sal * perc/100);
            aumento = novoSal - sal;
            
        } else if (sal > 8000) {
            perc = 5;
            novoSal = sal + (sal * perc/100);
            aumento = novoSal - sal;
            
        } else {
            perc = 10;
            novoSal = sal + (sal * perc/100);
            aumento = novoSal - sal;
            
        }        
        
        System.out.println("-----------------------------------------");
        System.out.printf("Novo salário = R$%.2f%n", novoSal);
        System.out.printf("Aumento = R$%.2f%n", aumento);
        System.out.println("Porcentagem = " + perc + "%");
        System.out.println("-----------------------------------------");

        sc.close();
    }
    
}
