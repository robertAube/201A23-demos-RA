//Configurer IntelliJ pour Francais : File/Settings.../Editor/Natural Language/Français
public class Cours02IntroMethode {
    //Pour faire la méthode constructeur :  ALT-Inser et sélectionner Constructor

    public Cours02IntroMethode() { //constructeur : même nom que ma classe
        System.out.println("Je suis le constructeur");
        afficherDate(); //appeler la méthode afficherDate()
        afficherPrenomEtNom();
        System.out.println("Fin du constructeur");
    }

    private void afficherPrenomEtNom() {
        afficherPrenom();
        afficherNom();
    }

    private void afficherPrenom() {
        System.out.print("Robert ");  //print sans le "ln" ne fait pas le saut de lige après l'affichage
    }

    private void afficherNom() {
        System.out.println("Aubé");
    }

    private void afficherDate() {
        System.out.println("25 août 2023");
    }

    public static void main(String[] args) {
        System.out.println("Première ligne executée");
        new Cours02IntroMethode(); //instanciation de ma propre classe et appelle du constructeur
        System.out.println("Dernière ligne du main");
    }
}
