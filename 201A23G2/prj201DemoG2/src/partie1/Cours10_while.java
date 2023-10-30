package partie1;

public class Cours10_while {
    public Cours10_while() {
        //tester_compterDe1AN();
//        afficherString("abc"); //abc
//        afficherString("Bonjour"); //abc

        tester_afficherNbCarDansUneString();
    }

    private void tester_afficherNbCarDansUneString() {
        afficherNbCarDansUneString("Pierre", 'i'); // affiche 1
        afficherNbCarDansUneString("Jean est là", 'e'); // affiche 2
        afficherNbCarDansUneString("", 'e'); // affiche 0
    }

    private void afficherNbCarDansUneString(String str, char carARecherche) {
        int index;
        int lgStr;
        int cptDeCar;

        index = 0;
        lgStr = str.length();


        cptDeCar = 0;
        while (index < lgStr) {
            if (str.charAt(index) == carARecherche) {
                cptDeCar += 1;
            }
            index += 1;
        }
        System.out.println("Il y a " + cptDeCar + " '" + carARecherche + "' dans la chaine \"" + str + "\"");
    }

    private void afficherString(String strAAfficher) {
        int index;
        int lgStr;

        index = 0;
        lgStr = strAAfficher.length();


        while (index < lgStr) {
            System.out.print(strAAfficher.charAt(index));
            index += 1;
        }
        System.out.print('\n');
    }

    private void tester_compterDe1AN() {
        compterDe1AN(3); //afficher 1, 2, 3
        compterDe1AN(7); //afficher 1, 2, 3, 4, 5, 6, 7
        compterDe1AN(1); //afficher 1
        compterDe1AN(0); //afficher
    }

    private void compterDe1AN(int nbLimite) {
        int compteur; //variable qui compte de 1 jusqu'à n.

        compteur = 1;
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
