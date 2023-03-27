public class Exemplo2 {

    public static void main(String[] args) {
        /* ÁREA TRAPÉZIO */
        double b, B, h, area;
        /* em caso de variavel tipo float colocar 'f' junto ao valor da variavel
         * ex: b = 6f;
         */

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B)/2.0 * h;

        System.out.printf("Área do trapezio = %.2f%n", area);
    }
    
}
