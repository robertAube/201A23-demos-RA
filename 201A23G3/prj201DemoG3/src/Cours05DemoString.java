public class Cours05DemoString {
    public Cours05DemoString() {
     //   jouerAvecChaineDeCaracteres();
//        jouerAvecCaracteresSpeciaux();
//        testerGetStringEntreGillemets();
//        afficherLaLongueurDUneString();
//        testerMettreEnMajusculeEtEnMinuscule();
        testerGetCaractereALIndice();

    }

    private void testerGetCaractereALIndice() {
        String str = "Bonjour le monde!";
        char c; // char est une variable de type simple pour contenir un seul caractère

        c = str.charAt(0);
        System.out.println(c); //affiche B

        afficherLeCarALIndice(str, 3);
        afficherLeCarALIndice(str, 0);
        afficherLeCarALIndice(str, 16);
        afficherLeCarALIndice(str, 17);
    }

    private void afficherLeCarALIndice(String str, int indice) {
        String strAffichage;
        strAffichage = "Dans la chaine " + getStringEntreGillemets(str);
        strAffichage += ", le caractère à l'indice " + indice;
        strAffichage += " est '" + str.charAt(indice) + "'.";

        System.out.println(strAffichage);
    }

    private void testerMettreEnMajusculeEtEnMinuscule() {
        String str;

        str = "Bonjour le monde";

        System.out.println(getEnMajuscule(str));
        System.out.println(getEnMinuscule(str));
    }

    private String getEnMinuscule(String str) {
        String strEnMiniscule;
        strEnMiniscule = str.toLowerCase();
        return strEnMiniscule;
    }

    private String getEnMajuscule(String str) {
        String strEnMajuscule = "";
        strEnMajuscule = str.toUpperCase();
        return strEnMajuscule;
    }

    private void afficherLaLongueurDUneString() {
        String str;
        int lgStr;

        str = "Allo Jean";
        lgStr = str.length(); //retourne la longueur de str (nb caractères)
        System.out.println(getStringEntreGillemets(str) + " a une longueur de " + lgStr);

        str = "   Allo Jean  ";
        lgStr = str.length(); //retourne la longueur de str (nb caractères)
        System.out.println(getStringEntreGillemets(str) + " a une longueur de " + lgStr);
    }

    private void testerGetStringEntreGillemets() {
        String str;

        str = "Bonjour";

        System.out.println(getStringEntreGillemets(str));

        str = getStringEntreGillemets(str);

        System.out.println(str);


    }

    private String getStringEntreGillemets(String str) {
        String strEntreGuillemets;
        strEntreGuillemets = "\"" + str + "\"";
        return strEntreGuillemets;
    }

    private void jouerAvecCaracteresSpeciaux() {
        String str;
        str = "Bonjour\nle\nmonde."; // \n -> nouvelle ligne
        System.out.println(str);
        str = "Bonjour\t\tle\t\tmonde."; // \t -> une tabulation
        System.out.println(str);
        str = "\"Bonjour le monde.\""; // \" -> permet de mettre un guillemet dans une chaine de caractères
        System.out.println(str);
    }

    private void jouerAvecChaineDeCaracteres() {
        String str;

        str = "Bonjour";

        System.out.println(str); // affiche : Bonjour
        System.out.println(str + " le "); // affiche : Bonjour le
        System.out.println(str); // affiche : Bonjour
        str = str + " le ";
        System.out.println(str); // affiche : Bonjour le
        str += "monde!!!"; //ajoute à str la chaine "monde!!!" (on préfère cette syntaxe)
        System.out.println(str); // affiche : Bonjour le monde
    }

    public static void main(String[] args) {
        new Cours05DemoString();
    }
}
