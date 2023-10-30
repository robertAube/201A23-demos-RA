package partie2;

public class Cours17_tableau2D {
    public Cours17_tableau2D() {
        jouerAvexTableau2DV2();
        //jouerAvexTableau2DV1();
    }

    private void jouerAvexTableau2DV2() {
        int[][] matrice = {{1, 3, 4}, {2, -1, 7}};

        afficher(matrice);
    }

    private void afficher(int[][] tab) {
        //afficher le tableau au complet
        for (int ligne = 0; ligne < tab.length; ligne++) {
            //afficher la ligne
            afficher(tab[ligne]);
        }
    }

    private void afficher(int[] tab) { //surcharge de méthode : même nom de méthode et type différent
        System.out.print('{');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ((i == tab.length - 1) ? "" : ", ")); //lire la valeur à l'indice i
        }
        System.out.println('}');
    }

    private void jouerAvexTableau2DV1() {
        int[][] matrice = {{1, 3, 4}, {2, -1, 7}};

        System.out.println(matrice[0]); //affiche quelque chose comme [I@448139f0 parce que de type int[]
        System.out.println(matrice[0][2]); //affiche 4

        //afficher la 1ière ligne seulement
        for (int colonne = 0; colonne < matrice[0].length; colonne++) {
            System.out.println("matrice[0][" + colonne + "] = " + matrice[0][colonne]);
        }

        //afficher le tableau au complet
        for (int ligne = 0; ligne < matrice.length; ligne++) {
            //afficher la ligne
            for (int colonne = 0; colonne < matrice[ligne].length; colonne++) {
                System.out.println("matrice[" + ligne + "][" + colonne + "] = " + matrice[ligne][colonne]);
            }
        }

    }

    public static void main(String[] args) {
        new Cours17_tableau2D();
    }
}
