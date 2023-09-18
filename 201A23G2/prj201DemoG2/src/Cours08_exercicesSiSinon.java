/**
 * Faire une méthode qui calcule (il fait juste le calculer et ne l’affiche pas)
 * un rabais en fonction d'un montant reçu en argument. (calculerRabais)
 * 	-infini, 100[ -> 0
 * 	[100, infini -> 2%
 * Faire une méthode qui tester_calculerRabais
 */
public class Cours08_exercicesSiSinon {
    public Cours08_exercicesSiSinon() {
//        tester_calculerRabaisV1();
        tester_calculerRabaisV2();
    }

    private void tester_calculerRabaisV2() {
        System.out.println(calculerRabais(0) == 0);
        System.out.println(calculerRabais(99.99) == 0);
        System.out.println(calculerRabais(100) == 0.02);
        System.out.println(calculerRabais(499.99) == 0.02);
        System.out.println(calculerRabais(500) == 0.03);
        System.out.println(calculerRabais(799.99) == 0.03);
        System.out.println(calculerRabais(800) == 0.04);
        System.out.println(calculerRabais(999.99) == 0.04);
        System.out.println(calculerRabais(1000) == 0.05);
        System.out.println(calculerRabais(10000) == 0.05);
    }

    private void tester_calculerRabaisV1() {
        afficherCaclulerRabais(0);
        afficherCaclulerRabais(99.99);
        afficherCaclulerRabais(100);
        afficherCaclulerRabais(499.99);
        afficherCaclulerRabais(500);
    }

    private void afficherCaclulerRabais(double montant) {
        String str;

        str = "Pour un montant " + montant + " le rabais est de " + calculerRabais(montant) + '.';

        System.out.println(str);
    }


    /*
	-infini, 100[ -> 0
	[100, 500[ -> 2%
	[500, 800 -> 3%
	[800, 1000 -> 4%
	[1000, infini -> 5%

     */
    private double calculerRabais(double montant) {
        double rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500) {
            rabais = 0.02;
        } else if (montant < 800) {
            rabais = 0.03;
        } else if (montant < 1000) {
            rabais = 0.04;
        } else {
            rabais = 0.05;
        }

        return rabais;
    }


    public static void main(String[] args) {
        new Cours08_exercicesSiSinon();
    }
}
