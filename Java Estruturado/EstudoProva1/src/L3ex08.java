import java.util.Scanner;

/**
 * L3ex08
 */
public class L3ex08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja tabuada para qual valor? ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int tabuada = N * i;

            System.out.printf("%d x %d = %d \n", N, i, tabuada);
        }
        
        sc.close();
    }
}