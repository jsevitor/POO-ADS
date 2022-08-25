import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;
        int i = 1;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("                    QUADRANTE                     ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");


        while (i != 0) {
            
            System.out.println("Digite os valores das coordenadas X e Y:");
            x = sc.nextDouble();
            y = sc.nextDouble();
            System.out.println("--------------------------------------------------");

            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE Q1");
                
            } else if (x < 0 && y > 0) {
                System.out.println("QUADRANTE Q2");
                
            } else if (x < 0 && y < 0) {
                System.out.println("QUADRANTE Q3");
            
            } else if (x > 0 && y < 0) {
                System.out.println("QUADRANTE Q4");
            
            }else if (x == 0 || y == 0){
                i = 0;
            }
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        sc.close();        
    }
    
}
