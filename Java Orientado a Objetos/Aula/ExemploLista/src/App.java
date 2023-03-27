import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
     /* // declaração do vetor
        int[] vetor = new int[10]; */

        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(3);
        System.out.println("Tamanho da lista: "+lista.size());
         System.out.println(lista);
         int valor = lista.get(2);
         System.out.println("O elemento da posição 2 e: " + valor);
         lista.add(4);
         lista.add(5);
         System.out.println("Tamaho da lista: " +lista.size());
         System.out.println(lista);
         lista.remove(2);
         System.out.println(lista);
         int posicao = lista.indexOf(4);
         System.out.println("Posição do elemento de 4 é: " + posicao);
         int ultimaposicao = lista.lastIndexOf(4);
         System.out.println("O ultima ocorrencia do elemento 4: " + ultimaposicao);
         


    }
}
