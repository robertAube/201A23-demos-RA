public class Cours04Rectangle {
    public Cours04Rectangle() {
        testerAirRectangle();
    }

    //	Écrire une méthode calculerAirRectangle qui reçoit en argument la hauteur et la largeur du rectangle et
    // qui retourne l’air d’un rectangle. Cette fonction ne fait pas d’affichage.
    private int calculerAirRectangle(int hauteur, int largeur) {
        int air;

        air = hauteur * largeur;

        return air;
    }

    //	Écrire une méthode afficherAirRectangle qui reçoit en argument la hauteur et la largeur du rectangle
    // et afficher l’air d’un rectangle.
    private void afficherAirRectangle(int hauteur, int largeur) {
        int air;
        air = calculerAirRectangle(hauteur, largeur);
        System.out.print("L'air d'un rectangle dont la hauteur est " + hauteur);
        System.out.print(" et la largeur est de " + largeur);
        System.out.println(" est de " + air + ".");
    }

//	Écrire une méthode testerAirRectangle qui teste afficherAirRectangle avec différentes valeurs.
    private void testerAirRectangle() {
        afficherAirRectangle(2,3);
        afficherAirRectangle(2,-3);
        afficherAirRectangle(-2,3);
        afficherAirRectangle(0,0);
    }


//	testerAirRectangle doit être appelé par le constructeur de la classe testerAirRectangle.

    public static void main(String[] args) {
        new Cours04Rectangle();
    }
}
