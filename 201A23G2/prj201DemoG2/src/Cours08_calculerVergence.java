import java.util.Scanner;

public class Cours08_calculerVergence {
    public Cours08_calculerVergence() {
//        tester_calculerVergence();
//        tester_afficherEtCalculerVergence();
        demanderLFEtAfficherVergence();
    }

    private void demanderLFEtAfficherVergence() {
        int longueurFocale;

        longueurFocale = lireInt("Vous voulez calculer la vergence pour quelle longueur focale? ");
        afficherEtCalculerVergence(longueurFocale);
    }

    private void tester_afficherEtCalculerVergence() {
        afficherEtCalculerVergence(1);
        afficherEtCalculerVergence(2);
        afficherEtCalculerVergence(100);
        afficherEtCalculerVergence(0.5);
    }

    private void afficherEtCalculerVergence(double longueurFocale) {
        String str;
        str = "Pour une longueur focale de " + longueurFocale;
        str += " la vergence est de " + calculerVergence(longueurFocale) + '.';

        System.out.println(str);
    }

    private double calculerVergence(double longueurFocale) {
        double vergence;
        vergence = 1 / longueurFocale;
        return vergence;
    }


    private void tester_calculerVergence() {
        System.out.println(calculerVergence(1) == 1);
        System.out.println(calculerVergence(2) == 0.5);
    }

    public int lireInt(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }
    public String lireString(String question) {
        String reponseStr;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponseStr = sc.nextLine();

        return reponseStr;
    }

    public static void main(String[] args) {
        new Cours08_calculerVergence();
    }
}
