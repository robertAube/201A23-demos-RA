public class Cours11_for {
    public Cours11_for() {
        tester_compterDe1AN();
        afficherString_AvecFor("abc"); //abc
        afficherString_AvecFor("Bonjour"); //abc
//
        tester_afficherNbCarDansUneString();
    }

    private void tester_afficherNbCarDansUneString() {
        afficherNbCarDansUneString("Pierre", 'i'); // affiche 1
        afficherNbCarDansUneString("Jean est là", 'e'); // affiche 2
        afficherNbCarDansUneString("", 'e'); // affiche 0
    }

    private void afficherNbCarDansUneString(String str, char carARecherche) {
        int lgStr;
        int cptDeCar;

        lgStr = str.length();

        cptDeCar = 0;
        for(int index = 0; index < lgStr; index++) { //index existe seulement dans la boucle
            if (str.charAt(index) == carARecherche) {
                cptDeCar += 1;
            }
            index += 1;
        }
        System.out.println("Il y a " + cptDeCar + " '" + carARecherche + "' dans la chaine \"" + str + "\"");
    }

    private void afficherString_AvecFor(String strAAfficher) {
        int lgStr;
        lgStr = strAAfficher.length();

        for(int index = 0; index < lgStr; index++) { //index existe seulement dans la boucle
            System.out.print(strAAfficher.charAt(index));
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
        //Boucle for
        //for (Initialisaiton du compteur; condition qui doit être vrai pour entrer et poursuivre la boucle; incrémentation du compteur)
        //1 - Exécuter la partie 1 du for
        //2 - Vérifie la condition de la 2e partie :
        //    -- Si c'est vrai : on exécuter le code à l'intérieur de la boucle = 1 itération
        //    -- Si c'est faux : on sort de la boucle
        //3 - On exécute la 3e partie de la boucle
        //4 - On retourne au point 2.
        for (int compteur = 1; compteur <= nbLimite; compteur++) {
            System.out.print(compteur + (compteur == nbLimite ? "" : ", "));
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        new Cours11_for();
    }
}
