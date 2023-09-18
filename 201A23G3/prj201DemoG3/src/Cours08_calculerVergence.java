public class Cours08_calculerVergence {

    /**
     * Faire une méthode qui calcule la vergence (C) à partir de la longueur focal (lf).
     * Celle-ci est la capacité d’une lentille à faire dévier les rayons lumineux.
     * <p>
     * o	Cette méthode doit traiter des réels.
     * o	Faire une méthode pour tester la méthode précédente.
     * o	Faire une méthode pour afficher la vergence (C) à partir de la longueur focal (lf).
     * o	Faire une méthode pour tester la méthode précédente.
     * o	Faire une méthode qui demande à l’usager un entier qui représente la longueur focal (lf)
     *      et qui affiche la vergence (C) correspondante.
     */
    public Cours08_calculerVergence() {
//        tester_calculerVergence();
//        tester_afficherVergence();

        demanderLFEtAfficherVergence();
    }

    private void demanderLFEtAfficherVergence() {
        int longeurFocale;

        longeurFocale = lireEntier("Vous voulez calculer la vergence pour quelle longueur focale? ");
        afficherVergence(longeurFocale);
    }

    private double calculerVergence(double longueurFocal) {
        double vergence;

        vergence = 1 / longueurFocal;

        return vergence;
    }

    private void tester_calculerVergence() {
        System.out.println(calculerVergence(2) == 0.5);
        System.out.println(calculerVergence(1) == 1);
    }

    private void afficherVergence(double longueurFocal) {
        String str;

        str = "La vergence d'une lentille dont la longueur focale est de " + longueurFocal;
        str += " est de " + calculerVergence(longueurFocal) + '.';

        System.out.println(str);
    }

    private void tester_afficherVergence() {
        afficherVergence(1);
        afficherVergence(10);
        afficherVergence(5);
    }

    public static void main(String[] args) {
        new Cours08_calculerVergence();
    }
}
