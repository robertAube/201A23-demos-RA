//file/Setting.../Editor/Natural Language/Francais
public class Cours02IntroMethode {
    public Cours02IntroMethode() { //constructeur (ALT-INSERT & Constructor) toujours le même nom que la classe et le fichier
        System.out.println("je suis le constructeur");
        afficherPrenomNom(); //appeler la méthode afficherNom()
        afficherDate();
        System.out.println("dernière ligne du constructeur");
    }

    private void afficherDate() {
        System.out.println("24 août 2023");
    }

    private void afficherPrenomNom() {
        afficherPrenom();
        System.out.println("Aubé");
    }

    private void afficherPrenom() {
        System.out.print("Robert "); //print sans ln: pas de saut de ligne après.
    }

    public static void main(String[] args) {
        System.out.println("Première ligne exécuté");
        new Cours02IntroMethode(); //Instancier la classe Cours02IntroMethode et appeler son constructeur.  (ALT-Inser)
        System.out.println("Dernière ligne du main");
    }
}
