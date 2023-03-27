import java.util.Scanner;

public class L3ex04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (i != 0) {
            System.out.println("Digite os valores das coordenadas X e Y:");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > 0 && y > 0){
                System.out.println("QUADRANTE 1");
            } else if (x < 0 && y > 0) {
                System.out.println("QUADRANTE 2");                
            } else if (x < 0 && y < 0) {
                System.out.println("QUADRANTE 3");                
            } else if (x > 0 && y < 0) {
                System.out.println("QUADRANTE 4");                
            } else if (x == 0 || y == 0) {
                i = 0;                
            }
        }
        sc.close();
    }
    
}
