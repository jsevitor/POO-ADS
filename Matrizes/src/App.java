import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int contaNegativo = 0; 
        int[] diagonal = new int[n];
        
        for (int linha = 0; linha < n; linha++) {  // linha
            for (int coluna = 0; coluna < n; coluna++) {  // coluna
                System.out.printf("\nmat[%d][%d]: ", linha, coluna);
                mat[linha][coluna] = sc.nextInt();
                
                if (mat[linha][coluna] < 0) { // <= -1
                    //contaNegativo = contaNegativo + 1;
                    contaNegativo++;
                }

                if (linha == coluna) {
                    diagonal[linha] = mat[linha][coluna];
                }
            }
        }
        System.out.print("Diagonal: ");
        for (int numero : diagonal) {
            System.out.print(numero + " ");
        }
        System.out.println("\nQuantidade de números negativos: "+ contaNegativo);
        
        sc.close();
    }
}
