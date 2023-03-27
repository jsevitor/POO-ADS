public class Exemplo1 {

    public static void main(String[] args) {
        /* VARIAVEIS */
        double x = 10.35784;
        double y = 5.5;
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        /* COMANDOS DE SAIDA
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        */
        System.out.println("RESULTADO = " + x + " METROS"); //concatenação string e variavel
        System.out.printf("RESULTADO = %f metros%n", x); //concatenação da variavel dentro da string
        System.out.printf("RESULTADO = %.2f metros e %.2f%n", x, y); //concatenação de duas variaveis
        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda); //concatenação de varios elementos em um mesmo comando de escrita
        
        /* COMANDOS DE CONCATENAÇÃO
           %f = ponto flutuante
           %d = inteiro
           %s = texto
           %n = quebra de linha         
         */
    }
}