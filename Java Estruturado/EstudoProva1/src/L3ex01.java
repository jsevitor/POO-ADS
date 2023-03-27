import java.util.Scanner;

public class L3ex01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = 0, y = 1;

        while (x != y){
            System.out.println("Digite dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x > y) {
                System.out.println("DECRESCENTE!");
                
            } else if (y > x) {
                System.out.println("CRESECENTE!");
                
            }
        }

        sc.close();
    }
}
