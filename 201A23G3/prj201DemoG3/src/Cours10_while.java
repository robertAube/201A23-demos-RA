public class Cours10_while {
    public Cours10_while() {
//        tester_compterDe1AN();
        tester_afficherNbDeCarDansUneString();
    }

    private void tester_afficherNbDeCarDansUneString() {
        afficherNbDeCarDansUneString("Bonj", 'n'); //affiche 1
        afficherNbDeCarDansUneString("Bonjour le monde", 'a'); //affiche 0
        afficherNbDeCarDansUneString("Bonjour le monde", 'e'); //affiche 2
        afficherNbDeCarDansUneString("Bonjour le monde", 'B'); //affiche 1
        afficherNbDeCarDansUneString("", 'n');  //affiche 0
    }

    private void afficherNbDeCarDansUneString(String str, char lettreAChercher) {
        String strAffichage;

        strAffichage = "Il y a " + getNbDeCarDansUneString(str, lettreAChercher) + " caractères '";
        strAffichage += lettreAChercher + "' dans la chaine \"" + str + "\"";

        System.out.println(strAffichage);
    }


    private int getNbDeCarDansUneString(String str, char lettreAChercher) {
        //str.length() - retourne le nb de car dans str
        //str.charAt(index) - retourne le caractère à l'index (0 étant le premier caractère)
        //while

        int compteur = 0;
        int index = 0;
        int longueur = str.length();
        char c;

        while (index < longueur) {
            c = str.charAt(index);
            if (c == lettreAChercher) {
                compteur += 1;
            }
            index += 1;
        }
        return compteur;
    }

    private void tester_compterDe1AN() {
        compterDe1AN(4); //afficher 1, 2, 3, 4
        compterDe1AN(2); //afficher 1, 2
        compterDe1AN(1); //afficher 1
        compterDe1AN(0); //afficher (rien)
    }

    private void compterDe1AN(int nbLimite) {
        int compteur;

        System.out.print("Compter de 1 à " + nbLimite + " : ");

        compteur = 1;
        while (compteur <= nbLimite) {
            System.out.print(compteur + (compteur == nbLimite ? "" : ", "));// 1, 2, 3, 4
            compteur += 1;
        }
        System.out.print("\n"); //fait un saut de ligne
    }

    public static void main(String[] args) {
        new Cours10_while();
    }
}
