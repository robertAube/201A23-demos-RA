public class Cours10_while {
    public Cours10_while() {
        //  tester_compterDe1AN();

        tester_afficherNbDeCarDansUneString();
    }

    private void tester_afficherNbDeCarDansUneString() {
        afficherNbDeCarDansUneString("Bonjour le monde", 'n');
        afficherNbDeCarDansUneString("Bonjour le monde", 'a');
        afficherNbDeCarDansUneString("Bonjour le monde", 'e');
        afficherNbDeCarDansUneString("Bonjour le monde", 'B');
        afficherNbDeCarDansUneString("", 'n');
    }

    private void afficherNbDeCarDansUneString(String str, char lettreRecherche) {
        String strAffichage;

        strAffichage = "Il y a " + getNbDeCarDansUneString(str, lettreRecherche) + " caractères '";
        strAffichage += lettreRecherche + "' dans la chaîne \"" + str + "\"";

        System.out.println(strAffichage);
    }

    private int getNbDeCarDansUneString(String str, char lettreRecherche) {
        int compteur; //str.lenght() - str.charAt(index) - while
        int lgStr;
        int index;
        char c;

        lgStr = str.length();

        index = 0;
        compteur = 0;
        while (index < lgStr) {
            c = str.charAt(index);
            if (c == lettreRecherche) {
                compteur += 1;
            }
            index += 1;
        }

        return compteur;
    }

    private void tester_compterDe1AN() {
        compterDe1AN(4); //afficher 1, 2, 3, 4
        compterDe1AN(2); //afficher 1, 2
        compterDe1AN(1); //afficher 1, 2
        compterDe1AN(0); //afficher 1, 2
    }

    private void compterDe1AN(int nbLimite) {
        int compteur = 1;

        System.out.println("Compter de 1 à " + nbLimite);
        while (compteur <= nbLimite) {
            System.out.print(compteur + (compteur == nbLimite ? "" : ", "));
            compteur += 1;
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        new Cours10_while();

    }
}
