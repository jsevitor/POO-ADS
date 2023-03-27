package classes;

import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Conta c1 = new Conta(1, "Jorge Washigton", 100.00);
        System.out.println(c1);

        ContaEmpresarial c2 = new ContaEmpresarial(2, "Pietro Inácio Enzo", 17000.00, 100000.00);
        System.out.println(c2);
    }
}
