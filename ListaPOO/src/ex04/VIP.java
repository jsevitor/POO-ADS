package ex04;

public class VIP extends Ingresso {

    protected double valorAdicional;

    public double ingressoVip(double valorVip) {
        imprimeValor();
        this.setValorAdicional(this.getValorIngresso() + valorVip*5);
        return this.valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }  
}
