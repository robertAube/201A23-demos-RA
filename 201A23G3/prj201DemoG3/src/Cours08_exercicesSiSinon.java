/**
 * Faire une méthode qui calcule (il fait juste le calculer et ne l’affiche pas) un rabais en fonction
 * d'un montant reçu en argument. (calculerRabais)
 * 	-infini, 100[ -> 0
 * 	[100, 500[ -> 2%
 * 	[500, 1000[ -> 4%
 * 	[1000, infini -> 5%
 * Faire une méthode qui tester_calculerRabais
 */
public class Cours08_exercicesSiSinon {

    public Cours08_exercicesSiSinon() {
        tester_calculerRabaisV2();
    }

    private void tester_calculerRabaisV2() {
        boolean calculerRabaisFonctionne;

        calculerRabaisFonctionne = calculerRabais(0) == 0;
        calculerRabaisFonctionne &= calculerRabais(99.99) == 0;
        calculerRabaisFonctionne &= calculerRabais(100) == 0.02;
        calculerRabaisFonctionne &= calculerRabais(499.99) == 0.02;
        calculerRabaisFonctionne &= calculerRabais(500) == 0.03;
        calculerRabaisFonctionne &= calculerRabais(999.99) == 0.03;
        calculerRabaisFonctionne &= calculerRabais(1000) == 0.05;

        System.out.print("La méthode calculerRabais() ");
        System.out.println(calculerRabaisFonctionne ? "fonctionne." : "ne fonctionne pas.");
    }

    private void tester_calculerRabaisV1() {
        afficherRabais(0);
        afficherRabais(99.99);
        afficherRabais(100);
        afficherRabais(499.99);
        afficherRabais(500);
        afficherRabais(999.99);
        afficherRabais(1000);

    }

    private void afficherRabais(double montant) {
        String str;
        str = "Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant) + '.';
        System.out.println(str);
    }

    private double calculerRabais(double montant) {
        double rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500) {
            rabais = 0.02;
        } else if (montant < 1000) {
            rabais = 0.03;
        } else {
            rabais = 0.05;
        }

        return rabais;
    }

    public static void main(String[] args) {
        new Cours08_exercicesSiSinon();
    }
}
