package partie1;

public class Cours02Calculs {
    //SHIFT F6 - permet de renommer partout
    public Cours02Calculs() {
//        afficher1Plus1V1(); //ALT-ENtER pour créer la méthode
//        afficher1Plus1V2();
//        afficherAdditionsAvecReels();
//        afficher2fois3();
//        afficher2Divise3();
//
//        afficherDiviser(2, 3); //appel de méthode avec 2 arguments ici, c'est l'argument 2 et l'argument 3.
//        afficherDiviser(0, 3); //appel de méthode avec 2 arguments ici, c'est l'argument 2 et l'argument 3.
//        afficherDiviser(1, 3); //appel de méthode avec 2 arguments ici, c'est l'argument 2 et l'argument 3.
//        afficherDiviser(6, 3); //appel de méthode avec 2 arguments ici, c'est l'argument 2 et l'argument 3.
//        afficherDiviser(3, 3); //appel de méthode avec 2 arguments ici, c'est l'argument 2 et l'argument 3.
//
//        afficherFormuleComplique();
//

        afficherForce(1, 2); //F=ma
        afficherForce(2, 3); //F=ma
    }

    private void afficherForce(int masse, int acceleration) {
        int force;
        force = calculerForce(masse, acceleration);

        System.out.println("Avec une masse de " + masse + " et une accélération de " + acceleration + ", nous aurons une force de " + force + ".");

    }

    private int calculerForce(int masse, int acceleration) {
        int force;
        force = masse * acceleration;
        return force;
    }


    private void afficherFormuleComplique() {
        int reponse;

        reponse = 1 + 2 * 3 - 4;
        System.out.println("1 + 2 * 3 - 4 = " + reponse);  //1 + 2 * 3 - 4 = 3

        reponse = 1 + 2 * (3 - 4);
        System.out.println("1 + 2 * (3 - 4) = " + reponse);  //1 + 2 * (3 - 4) = -1

        reponse = 1 + 2 * (3 - -4);
        System.out.println("1 + 2 * (3 - -4) = " + reponse);  //1 + 2 * (3 - -4) = 15
    }

    private void afficherDiviser(int dividente, int diviseur) { //méthode avec 2 arguments (synonyme : paramètres)
        double quotient;

        quotient = (double) dividente / diviseur; //(double) est un cast qui force l'opération à se faire en double (réel)

        System.out.println(dividente + " / " + diviseur + " = " + quotient);
    }


    private void afficher2Divise3() {
        double quotient;
        int dividente;
        int diviseur;

        dividente = 2;
        diviseur = 3;

        quotient = (double) dividente / diviseur; //(double) est un cast qui force l'opération à se faire en double (réel)

        System.out.println(dividente + " / " + diviseur + " = " + quotient);
    }

    private void afficher2fois3() {
        int reponse;

        reponse = 2 * 3;
        System.out.println("2 * 3 = " + reponse);
    }

    private void afficherAdditionsAvecReels() {
        double valeur; //declaration d'une variable locale de type réel

        valeur = 2.3; //affectation
        System.out.println("valeur = " + valeur);

        valeur = valeur + 1;

        System.out.println("valeur = " + valeur);
    }

    private void afficher1Plus1V1() {
        System.out.print("1 + 1 = "); //chaine de caractères
        System.out.println(1 + 1); //calcul
    }

    private void afficher1Plus1V2() {
        int reponse; //déclaration d'une variable locale de type entier dont le nom est reponse.

        reponse = 1 + 1; // affectation (=) prendre la valeur de ce qui a à droite et le mettre à gauche

        System.out.println("1 + 1 = " + reponse); //ici le plus est une concaténation de chaine de caractère.
    }

    public static void main(String[] args) {
        new Cours02Calculs();
    }
}
