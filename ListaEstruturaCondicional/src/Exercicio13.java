import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("-----------------------------------------");
        System.out.println("               COORDENADAS               ");
        System.out.println("-----------------------------------------");

        System.out.print("Valor de X: ");
        x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        y = sc.nextDouble();

        System.out.println("-----------------------------------------");

        if (x > 0 && y > 0) {
            System.out.println("Q1");     

        } else if (x < 0 && y >0) {
            System.out.println("Q2"); 
            
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");  
            
        } else if (x > 0 && y <0){
            System.out.println("Q4"); 

        } else if (x != 0 && y == 0){
            System.out.println("Eixo X"); 

        } else if (x == 0 && y != 0){
            System.out.println("Eixo Y");

        } else if (x == 0 && y == 0) {
            System.out.println("Origem"); 
            
        }
        
        System.out.println("-----------------------------------------");
        sc.close();
    }
    
}
