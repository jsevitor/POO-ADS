package ex04;

public class CamaroteSuperior extends VIP {
    //private double valorAdicional;

    public double valorCamSuperior() {
        return ingressoVip(100) + this.getValorAdicional();
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
