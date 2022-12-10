package ex04;

public class CamaroteInferior extends VIP {

    private String LocalIngresso;
   
    public String acessaLocalizacao(){
        return this.LocalIngresso;
    }

    public void imprimeLocalizacao(String local){
        this.setLocalIngresso(local);
        System.out.println("Local: " + local);
    }

    public String getLocalIngresso() {
        return LocalIngresso;
    }

    public void setLocalIngresso(String localIngresso) {
        LocalIngresso = localIngresso;
    }
}
