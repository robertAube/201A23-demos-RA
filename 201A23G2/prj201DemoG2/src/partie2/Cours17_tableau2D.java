package partie2;

public class Cours17_tableau2D {
    public Cours17_tableau2D() {
        jouerAvecTableau2D();
    }

    private void jouerAvecTableau2D() {
        int[][] matrice = {{5, 3, 2}, {-1, 12, 4}};

        System.out.println("matrice[0][1] = " + matrice[0][1]); //3

        for (int ligne = 0; ligne < matrice.length; ligne++) {
            System.out.println("matrice[" + ligne + "][1] = " + matrice[ligne][1]); //3
        }


        for (int ligne = 0; ligne < matrice.length; ligne++) {
            for (int colonne = 0; colonne < matrice[ligne].length; colonne++)
                System.out.println("matrice[" + ligne + "][" + colonne + "] = " + matrice[ligne][colonne]); //3
        }

        afficher(matrice);
    }

    private void afficherOld(int[][] tab2D) {
        for (int ligne = 0; ligne < tab2D.length; ligne++) {
            for (int colonne = 0; colonne < tab2D[ligne].length; colonne++)
                System.out.println("matrice[" + ligne + "][" + colonne + "] = " + tab2D[ligne][colonne]);
        }
    }
    private void afficher(int[][] tab2D) {
        System.out.print('{');
        for (int ligne = 0; ligne < tab2D.length; ligne++) {
            afficher(tab2D[ligne]);
            System.out.print  ((tab2D.length - 1 == ligne) ? "" : ", "); // lire la valeur à l'index i
        }
        System.out.print('}');
    }

    private void afficher(int[] tabInt) { //surcharge de la méthode affichée : même nom de méthode, mais arguments différents
        System.out.print('{');
        for (int i = 0; i < tabInt.length; i++) {
            System.out.print(tabInt[i] + ((tabInt.length - 1 == i) ? "" : ", ")); // lire la valeur à l'index i
        }
        System.out.print('}');
    }
    public static void main(String[] args) {
        new Cours17_tableau2D();
    }
}
