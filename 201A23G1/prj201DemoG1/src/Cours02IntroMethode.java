public class Cours02IntroMethode {
    //constructeur de la classe Cours02Introduction (même nom que la classe)
    public Cours02IntroMethode() { //ALT-Insert & Constructor
        System.out.println("je suis le constructeur");
        afficherDateJour(); //appeler la méthode afficherDateJour();
        afficherPrenomNom();
        System.out.println("Dernière ligne du constructeur");
    }

    private void afficherPrenomNom() {
        afficherPrenom();
        System.out.println("Aubé");
    }

    private void afficherPrenom() {
        System.out.print("Robert "); //print sans ln: pas de saut de ligne après.
    }

    private void afficherDateJour() {
        System.out.println("24 août 2023");
    }

    public static void main(String[] args) {
        System.out.println("Première ligne executé");
        new Cours02IntroMethode(); //Instanciation de la classe Cours02Introduction et appelle le constructeur de Cours02Introduction
        System.out.println("Dernière ligne du main");
    }
}
