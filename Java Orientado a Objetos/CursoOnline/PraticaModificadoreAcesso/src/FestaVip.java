public class FestaVip {
    // <modificador> <tipo> <nome-atributo>
    private int quantidadeCade = 30;
    private int quantidadeSalgados = 50;

    public void entrar() {
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    // <modificaodr> <retorno-método> <nome-metódo>
    private void beberCafe() {
        quantidadeCade--;
        System.out.println("Bebeu 1 xícara de café");
    }

    private void comerSalgado() {
        quantidadeSalgados--;
        System.out.println("Comeu 5 salgados");
    }
}
