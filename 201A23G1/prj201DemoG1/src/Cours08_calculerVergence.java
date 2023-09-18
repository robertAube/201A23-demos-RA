public class Cours08_calculerVergence {
    public Cours08_calculerVergence() {
//        tester_calculerVergence();
//        tester_afficherVergence();
        demanderEtAfficherVergence();
    }

    private void demanderEtAfficherVergence() {
        int longueurFocale;

        longueurFocale = lireEntier("Vous voulez calculer la vergence de quelle longueur focale?");
        afficherVergence(longueurFocale);
    }

    private void tester_afficherVergence() {
        afficherVergence(3);
        afficherVergence(0);
        afficherVergence(1);
    }

    private void afficherVergence(double longueurFocale) {
        String str;
        str = "La vergence d'une lentille dont la longueur focale est de " + longueurFocale;
        str += " est de " + calculerVergence(longueurFocale) + '.';

        System.out.println(str);
    }

    private void tester_calculerVergence() {
        System.out.println("tester_calculerVergence()");
        System.out.println(calculerVergence(3) == 0.3333333333333333);
        System.out.println(calculerVergence(1) == 1);
    }

    private double calculerVergence(double longueurFocale) {
        double vergence;
        vergence = 1 / longueurFocale;
        return vergence;
    }

    /*
        o	Faire une méthode qui calcule la vergence (C) à partir de la longueur focal (lf).  Cette méthode doit traiter des réels.
        o	Faire une méthode pour tester la méthode précédente.
        o	Faire une méthode pour afficher la vergence (C) à partir de la longueur focal (lf).
        o	Faire une méthode pour tester la méthode précédente.
        o	Faire une méthode qui demande à l’usager un entier qui représente la longueur focal (lf) et qui affiche la vergence (C) correspondante.
    */
    public static void main(String[] args) {
        new Cours08_calculerVergence();
    }
}
