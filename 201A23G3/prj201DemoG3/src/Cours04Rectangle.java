public class Cours04Rectangle {
//	testerAirRectangle doit être appelé par le constructeur de la classe Cours04Rectangle.
    public Cours04Rectangle() {
        testerAirRectangle();
    }
//	Écrire une méthode calculerAirRectangle qui reçoit en argument la hauteur et la largeur du rectangle
// et qui retourne l’air d’un rectangle. Cette fonction ne fait pas d’affichage.
    private int calculerAirRectangle(int hauteur, int largeur) {
        int airRectangle;
        airRectangle = hauteur * largeur;
        return airRectangle;
    }

//	Écrire une méthode afficherAirRectangle qui reçoit en argument la hauteur
// et la largeur du rectangle et afficher l’air d’un rectangle.
    public void afficherAirRectangle(int hauteur, int largeur) {
        String str; //String = Variable de type chaine de caractères
        str = "Air d'un rectangle dont la hauteur est de " + hauteur;
        str += " et dont la largeur est de " + largeur; //+= concaténation de ce qui existe déjà dans str
        str += " est de " + calculerAirRectangle(hauteur, largeur) + ".";
        System.out.println(str);
    }

//	Écrire une méthode testerAirRectangle qui teste afficherAirRectangle avec différentes valeurs.
    private void testerAirRectangle(){
        afficherAirRectangle(2,3);
        afficherAirRectangle(2,0);
        afficherAirRectangle(1,3);
    }
    public static void main(String[] args) {
        new Cours04Rectangle();
    }
}
