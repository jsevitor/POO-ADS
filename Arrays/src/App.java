import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Array (vetor) → com um tamanho fixo de 5 posições
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "João";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "José";
        arrayEstatico[3] = "Pedro";
        arrayEstatico[4] = "Aurora";

        // ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("João"); // indice 0 
        arrayDinamico.add("Maria"); // indice 1 
        arrayDinamico.add("José"); // indice 2 
        arrayDinamico.add("Pedro"); // indice 3 
        arrayDinamico.add("Aurora"); // indice 4 

        System.out.println("Imprimindo o Array Estático: ");
        for (int indice = 0; indice < arrayEstatico.length; indice++) {
            System.out.println(arrayEstatico[indice]);
        }
        System.out.println();

        System.out.println("Imprimindo o Array Dinâmico: ");
        for (int indice = 0; indice < arrayDinamico.size(); indice++) {
            System.out.println(arrayDinamico.get(indice));
        }
        System.out.println();

        int ultimo = arrayDinamico.size() - 1;
        System.out.println("Primeira posição: " + arrayDinamico.get(0));
        System.out.println("Última posição: " + arrayDinamico.get(ultimo));

    }
}
