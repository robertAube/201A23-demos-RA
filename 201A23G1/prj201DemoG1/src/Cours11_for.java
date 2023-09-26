import javax.imageio.stream.ImageInputStreamImpl;

public class Cours11_for {
    public Cours11_for() {
//        tester_compterDe1AN();
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

        compteur = 0;
        for (index = 0; index < lgStr; index++) {
            c = str.charAt(index);
            if (c == lettreRecherche) {
                compteur += 1;
            }
        }

        return compteur;
    }

    private void tester_compterDe1AN() {
        compterDe1AN(4); //afficher 1, 2, 3, 4
        compterDe1AN(2); //afficher 1, 2
        compterDe1AN(1); //afficher 1
        compterDe1AN(0); //afficher
    }

    private void compterDe1AN(int nbLimite) {
        int compteur;

        System.out.println("Compter de 1 à " + nbLimite);

        //Boucle For
        //for (initialisation du compteur; condition qui doit être vrai pour entrer et poursuivre la boucle; incrémentation du compteur)
        //1 - exécuter la partie 1 du for
        //2 - vérifie la condition de la 2e partie :
        //    -- si c'est vrai : on exécute le code à l'intérieur de la boucle.
        //    -- si c'est faux : on sort de la boucle.
        //3 - Selon le cas, on exécute l'intérieur de la boucle
        //4 - On exécute la 3e partie du for, qui normalement modifie la condition de la partie 2
        //5 - On retourne faire le point 2.

        for (compteur = 1; compteur <= nbLimite; compteur++) {
            System.out.print(compteur + (compteur == nbLimite ? "" : ", "));
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        new Cours11_for();
    }
}
