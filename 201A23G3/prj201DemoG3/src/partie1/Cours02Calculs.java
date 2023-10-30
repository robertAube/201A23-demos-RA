package partie1;

//CTRL_ALT_L pour reformater correctent le code: à faire avant chauue remise
public class Cours02Calculs {
    public Cours02Calculs() {
//        afficher1Plus1V1(); //pour changer un nom de méthode shift-f6
//        afficher1Plus1V2();
//        afficherDesAdditionsAvecDesReels();
//        afficher2fois3();

//        afficher2DiviserPar3();
//        afficherDiviser(1, 2);
//        afficherDiviser(4, 5);

        afficherFormuleComplique();
    }

    private void afficherFormuleComplique() {
        System.out.println("1 + 2 * 3 - 4 = 3 -> " + (1 + 2 * 3 - 4));
        System.out.println("1 + 2 * (3 - 4) = -1 -> " + (1 + 2 * (3 - 4)));
    }

    private void afficherDiviser(int dividente, int diviseur) { //il y a 2 paramètres (synonyme : arguments)
        double quotient;

        quotient = (double) dividente / diviseur; //cast force l'opération à se faire en double (réel)

        System.out.println(dividente + " / " + diviseur + " = " + quotient);
    }

    private void afficher2DiviserPar3() {
        double quotient;
        int dividente;
        int diviseur;

        dividente = 2;
        diviseur = 3;

        quotient = (double) dividente / diviseur; //cast force l'opération à se faire en double (réel)

        System.out.println(dividente + " / " + diviseur + " = " + quotient);
    }

    private void afficher2fois3() {
        System.out.println("2 x 3 = " + 2 * 3);
    }

    private void afficherDesAdditionsAvecDesReels() {
        double valeur; //déclaration d'une variable locale de type réel

        valeur = 2.3; //affectation
        System.out.println("valeur = " + valeur); //afficher valeur = 2.3

        valeur = valeur + 1;
        System.out.println("valeur = " + valeur); //afficher valeur = 3.3
    }

    private void afficher1Plus1V2() {
        int reponse; //déclaration d'une variable locale de type entier dont le nom est reponse

        reponse = 1 + 1;
        System.out.println("1 + 1 = " + reponse); //ici le + est une concatenation
        reponse = reponse + 3;
        System.out.println("reponse + 3 = " + reponse);
    }

    private void afficher1Plus1V1() {
        System.out.print("1 + 1 = ");
        System.out.println(1 + 1);
    }

    public static void main(String[] args) {
        new Cours02Calculs();
    }
}
