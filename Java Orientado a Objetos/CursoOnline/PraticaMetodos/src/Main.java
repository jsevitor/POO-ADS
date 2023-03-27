public class Main {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;
        /*
        // "Personagem: <nome> (lvl <nivel>) com <forca> de força."
        System.out.format("Personagem: %s (lvl %d) com %d de força.", heroi.nome, heroi.nivel, heroi.forca);
        */
        heroi.mostrarStatus(); // criando um metodo
        /* chamei o metodo atacar e passei como argumento uma String "Hydra" */
        heroi.atacar("Hydra", "Golpe Duplo");
    }
}
