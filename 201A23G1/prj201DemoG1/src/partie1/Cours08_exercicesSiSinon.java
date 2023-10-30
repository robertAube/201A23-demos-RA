package partie1;

public class Cours08_exercicesSiSinon {
    public Cours08_exercicesSiSinon() {
        tester_calculerRabais();
    }

    private void tester_calculerRabais() {
        boolean calculerRabaisFonctionne;

        calculerRabaisFonctionne = calculerRabais(0) == 0;
        calculerRabaisFonctionne &= calculerRabais(99.99) == 0;
        calculerRabaisFonctionne &= calculerRabais(100) == 0.02;
        calculerRabaisFonctionne &= calculerRabais(499.99) == 0.02;
        calculerRabaisFonctionne &= calculerRabais(500) == 0.05;
        calculerRabaisFonctionne &= calculerRabais(999.99) == 0.05;
        calculerRabaisFonctionne &= calculerRabais(1000) == 0.07;
        calculerRabaisFonctionne &= calculerRabais(1999.99) == 0.07;
        calculerRabaisFonctionne &= calculerRabais(2000) == 0.1;

        System.out.print("La méthode calculerRabais() ");
        System.out.println(calculerRabaisFonctionne ? "fonctionne." : "ne fonctionne pas.");
    }

    private double calculerRabais(double montant) {
        double rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500) {
            rabais = 0.02;
        } else if (montant < 1000) {
            rabais = 0.05;
        } else if (montant < 2000) {
            rabais = 0.07;
        } else {
            rabais = 0.1;
        }

        return rabais;
    }

    public static void main(String[] args) {
        new Cours08_exercicesSiSinon();
    }
}
