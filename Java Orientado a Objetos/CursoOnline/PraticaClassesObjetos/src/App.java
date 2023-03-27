public class App {
    public static void main(String[] args) throws Exception {
        
        // Iphone 12, tela de 6.1", 256 gb
        // Galaxy note 20 Ultra, tela de 6.9", 256 gb
        // Xiaomi mi 11 Pro, tela de 6.81", 128 gb
        // <tipoVariavel> nomeVariavel = valor;
        /* Variavel do tipo classe é um objeto,
         * variavel do tipo int, float é um tipo primitivo */
        Celular celularA = new Celular(); // declarando um objeto do tipo Celular = instacear objeto
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular();  // objeto celular B
        celularB.nome = "Galaxy Note 20 Ultra"; // com o estado de nome definido para "Galaxy Note 20 Ultra"
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Andorid";

        Celular celularC; // declarando um objeto chamado celular
        celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";

        System.out.printf("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.printf("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.printf("Celular %s com tela de %.1f, com %dgb e SO %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);


    }
}
