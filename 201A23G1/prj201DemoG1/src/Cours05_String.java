public class Cours05_String {
    public Cours05_String() {
      //  jouerAvecChaineDeCaracteres();
      //  jouerAvecCaracteresSpeciaux();
//        afficherLaLongueurDUneString();
//        testerMettreEnMajuscule();
        testerGetCaractereALIndice();
    }

    private void testerGetCaractereALIndice() {
        String str = "Bonjour le monde";
        char c; //type caractère

        System.out.println(str.charAt(0));

        c = str.charAt(3);

        System.out.println(c);

        afficherLeCarALIndice(str, 3);
        afficherLeCarALIndice(str, 0);
    }

    private void afficherLeCarALIndice(String str, int i) {
        String strAffichage;

        strAffichage = "Dans la chaine \"" + str + "\"";
        strAffichage += ", le caractère à l'indice " + i;
        strAffichage += " est '" + str.charAt(i) + "'.";
        System.out.println(strAffichage);
    }

    private void testerMettreEnMajuscule() {
        String str;

        str = "Bonjour le monde";
        System.out.println(getMajuscule(str));
        System.out.println(getMinuscule(str));

    }

    private String getMinuscule(String str) {
        String strEnMinuscule;
        strEnMinuscule = str.toLowerCase();
        return strEnMinuscule;
    }

    private String getMajuscule(String str) {
        String strEnMajuscule = "";
        strEnMajuscule = str.toUpperCase();
        return strEnMajuscule;
    }

    private String getStringEntreGilmets(String str) {
        return("\"" + str + "\"");
    }

    private void afficherLaLongueurDUneString() {
        String str ="";
        int longueurStr;

        longueurStr = str.length();

        System.out.println(getStringEntreGilmets(str) + " a une longueur de " + longueurStr);

        str = " Bonjour le monde ";
        longueurStr = str.length();

        System.out.println(getStringEntreGilmets(str) + " a une longueur de " + longueurStr);
    }

    private void jouerAvecCaracteresSpeciaux() {
        String str = "";

        str = "Bonjour\nle\nmonde."; // \n un retour à la ligne
        System.out.println(str);
        str = "Bonjour\tle\tmonde."; // \t est une tabulation
        System.out.println(str);
    }

    private void jouerAvecChaineDeCaracteres() {
        String str;
        str = "Bonjour";

        System.out.println(str); //affiche : Bonjour
        System.out.println(str + " le "); //affiche : Bonjour le
        System.out.println(str); //affiche : Bonjour
        str = str + " le";
        System.out.println(str); //affiche : Bonjour le
        str += " monde."; //on préfère cette syntaxe pour ajouter à une chaîne.
        System.out.println(str); //affiche : Bonjour le monde
    }

    public static void main(String[] args) {
        new Cours05_String();
    }
}
