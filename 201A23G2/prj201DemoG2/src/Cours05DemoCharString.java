public class Cours05DemoCharString {
    public Cours05DemoCharString() {
//        jouerAvecLeType_char();
        //       jouerAvecLeType_String();
        //      jouerAvecCaracteresSpeciaux();
        // testerMettreEntreGillemets();
        //afficherLaLongueurDUneString();
        //testerMettreEnMAjusculeEtEnMinuscule();
        testerGetCaractereALIndice();
    }

    private void testerGetCaractereALIndice() {
        String str;
        char c;

        str = "Le chat est bleu";
        c = str.charAt(3); //Retourne le caractère à l'indice. Le premier caractère étant à l'indice 0. Le second à l'indice 1 etc
        System.out.println(c);

        afficherLeCarALindice(str, 3);
        afficherLeCarALindice(str, 0);
        afficherLeCarALindice(str, 1);
        afficherLeCarALindice(str, 100); //erreur d'exécution
        afficherLeCarALindice("", 1); //erreur d'exécution
    }

    private void afficherLeCarALindice(String str, int indice) {
        String strAffichage;

        strAffichage = "Dans la chaine " + mettreEntreGuillemets(str);
        strAffichage += ", le caractère à l'indice " + indice;
        strAffichage += " est " + str.charAt(indice) + '.';

        System.out.println(strAffichage);
    }

    private void testerMettreEnMAjusculeEtEnMinuscule() {
        String str;

        str = "Le chat est bleu";
        System.out.println(mettreEnMajuscule(str));
        System.out.println(mettreEnMinuscule(str));
    }

    private String mettreEnMajuscule(String str) {
        String strEnMajuscule;
        strEnMajuscule = str.toUpperCase(); //retourne une chaine tout en majuscule
        return strEnMajuscule;
    }

    private String mettreEnMinuscule(String str) {
        String strEnMinuscule;
        strEnMinuscule = str.toLowerCase(); //retourne une chaine tout en minuscule
        return strEnMinuscule;
    }
    private void afficherLaLongueurDUneString() {
        String str;
        int lgStr;

        str = "Le chat";
        lgStr = str.length();
        System.out.println("La longueur de la chaine " + mettreEntreGuillemets(str) + " est " + lgStr);

        str = "";
        lgStr = str.length();
        System.out.println("La longueur de la chaine " + mettreEntreGuillemets(str) + " est " + lgStr);
    }

    private void testerMettreEntreGillemets() {
        String str;

        str = "Le chat est bleu";
        System.out.println(str + " entre guillemets est " + mettreEntreGuillemets(str));
    }

    private String mettreEntreGuillemets(String str) {
        String strEntreGuillemets;
        strEntreGuillemets = "\"" + str + "\"";
        return strEntreGuillemets;
    }

    private void jouerAvecCaracteresSpeciaux() {
        String str;

        str = "Bonjour\nle\nmonde!"; // \n -> nouvelle ligne
        System.out.println(str);

        str = "il a dit : \"j'ai faim!\"";
        System.out.println(str);
    }

    private void jouerAvecLeType_String() {
        String str;

        str = "Bonjour";

        System.out.println(str); // affiche : Bonjour
        System.out.println(str + " le "); // afficher : Bonjour le
        System.out.println(str); // affiche : Bonjour
        str = str + " le "; //on change str pour "Bonjour le"
        System.out.println(str); // affiche : Bonjour le
        str += "monde!"; //on change str pour "Bonjour le monde!"
        System.out.println(str); // affiche : Bonjour le monde!
    }

    private void jouerAvecLeType_char() {
        char c;

        c = 'a';

        System.out.println(c); // affiche : a

        c = '2';
        System.out.println(c); // affiche : 2

        c = '$';
        System.out.println(c); // affiche : $
    }

    public static void main(String[] args) {
        new Cours05DemoCharString();
    }
}
