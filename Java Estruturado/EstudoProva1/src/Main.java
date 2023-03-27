import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        
        int ano = dias/365;
        int resto = dias%365;
        int mes = resto/30;
        int dia = resto%30;
        
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(s)");
        System.out.println(dia + " dia(s)");
    
    }
 
}