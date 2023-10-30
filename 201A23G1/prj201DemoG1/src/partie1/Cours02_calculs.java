package partie1;

//file/settings/editor/natural language : changer la langue pour les commentaires
public class Cours02_calculs {
    public Cours02_calculs() {
        //    afficher1Plus1V1();
        //    afficher1Plus1V2();
        //   afficherDesAdditionsAvecDesReels();
        //   afficher2Fois3();
        //   afficher2Moins3();
        //   afficher1DiviserPar2();

        afficherLeNombre(2);
        afficherLeNombre(-2);
        afficherLeNombre(0);
        afficherLeNombre(228);

        afficherDivision(2, 3);
        afficherDivision(1, 3);
        afficherDivision(1, 0);

        afficherRacineCarre(4);
        afficherRacineCarre(-4);
    }

    private void afficherRacineCarre(double nb) {
        double racine;
        racine = Math.sqrt(nb);
        System.out.println("Racine carré de " + nb + " = " + racine);

    }

    private void afficherDivision(int dividende, int diviseur) {
        double quotient;

        quotient = (double) dividende / diviseur; //cast force l'opération à se faire en réel

        System.out.println("dividende / diviseur = " + quotient);
    }

    private void afficherLeNombre(int nombre) {
        System.out.print("Nombre en paramètre (Ou en argument) = ");
        System.out.println(nombre);


    }

    private void afficher1DiviserPar2() {
        int dividende = 2;
        int diviseur;
        double quotient;
        System.out.println(dividende);
//        System.out.println(diviseur); //ne fonctionne pas : diviseur pas initialisé
        diviseur = 3;

        quotient = (double) dividende / diviseur; //cast force l'opération à se faire en réel

        System.out.println("dividende / diviseur = " + quotient);
    }

    private void afficher2Moins3() {
        System.out.println("2 - 3 = " + (2 - 3)); //les parenthèses forcent de commencer par le calcul de 2 - 3
    }

    private void afficher2Fois3() {
        System.out.println("2 * 3 = " + 2 * 3);
    }

    private void afficherDesAdditionsAvecDesReels() {
        double valeur; //déclaration d'une variable de type réel

        valeur = 2.3; //affectation

        System.out.println("valeur = " + valeur); // affiche : valeur = 2.3

        valeur = valeur + 1;

        System.out.println("valeur + 1 = " + valeur); // affiche : valeur = 3.3
    }

    private void afficher1Plus1V2() {
        int reponse; //déclaration d'une variable de type entier

        reponse = 1; //ici le + fait une addition

        System.out.println("1 + 1 = " + reponse); //ici le + fait une concaténation

        reponse = reponse + 3;
        System.out.println("reponse + 3 = " + reponse); //ici le + fait une concaténation
    }

    private void afficher1Plus1V1() {
        System.out.print("1 + 1 = ");
        System.out.println(1 + 1);
    }

    public static void main(String[] args) {
        new Cours02_calculs();
    }
}
