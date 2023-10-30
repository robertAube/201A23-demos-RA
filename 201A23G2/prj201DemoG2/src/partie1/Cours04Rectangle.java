package partie1;

public class Cours04Rectangle {
    //	testerAirRectangle doit être appelé par le constructeur de la classe partie1.Cours04Rectangle.
    public Cours04Rectangle() {
        testerAirRectangle();
  //      couvertirTexteEnEntier();
    }

    private void couvertirTexteEnEntier() {
        int a = Integer.parseInt("12");
        System.out.println(a);
        a = Integer.parseInt("12b");
        System.out.println(a);
    }

    //	Écrire une méthode calculerAirRectangle qui reçoit en argument la hauteur et la largeur
// du rectangle et qui retourne l’air d’un rectangle. Cette fonction ne fait pas d’affichage.
    private int calculerAirRectangle(int hauteur, int largeur) {
        int air;
        air = hauteur * largeur;
        return air;
    }


//	Écrire une méthode afficherAirRectangle qui reçoit en argument la hauteur
// et la largeur du rectangle et afficher l’air d’un rectangle.
    private void afficherAirRectangle (int hauteur, int largeur) {
        int air = 0;

        air = calculerAirRectangle(hauteur, largeur);

        System.out.print("L'air d'un rectangle de hauteur " + hauteur);
        System.out.print(" et d'une largeur " + largeur);
        System.out.println(" et de " + air + ".");
    }


//	Écrire une méthode testerAirRectangle qui teste afficherAirRectangle avec différentes valeurs.
    private void testerAirRectangle(){
        afficherAirRectangle(0,3);
        afficherAirRectangle(0,3);
        afficherAirRectangle(2,0);
        afficherAirRectangle(2,3);
    }

    public static void main(String[] args) {
        new Cours04Rectangle();
    }
}
