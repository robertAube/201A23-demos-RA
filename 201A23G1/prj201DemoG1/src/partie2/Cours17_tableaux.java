package partie2;

public class Cours17_tableaux {
    public Cours17_tableaux() {
        jouerAvecMatrice();
      //  tester_fusionner();
    }

    private void jouerAvecMatrice() {
        int[][] matrice = {{1, 2 , 3}, {-1, 15, 7}, {12, 1, 8}};

        afficher(matrice);
        matrice[1][0] = 1;
        afficher(matrice);
        matrice = new int[2][3];
        initialiser (matrice, 22);
        afficher(matrice);
    }

    private void initialiser(int[][] tab2D,int newValeur) {
        for (int ligne = 0 ; ligne < tab2D.length; ligne++) { //Pour chaque ligne
            initialiserTableau(tab2D[ligne], newValeur);
        }
    }
    private void initialiserTableau(int tab[], int valeurInit) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeurInit;
        }
    }


    private void tester_fusionner() {
        int[] tab1 = {1, 2, 3};
        int[] tab2 = {-1, -2};

        afficher(fusionner(tab1, tab2));
        afficher(fusionner(new int[]{}, new int[]{3, 2, 1}));
    }

    private int[] fusionner(int[] tab1, int[] tab2) {
        int[] tabSortie;
        int j;

        tabSortie = new int[tab1.length + tab2.length];

        j = 0;
        for (int i = 0; i < tab1.length; i++) {
            tabSortie[j++] = tab1[i];
        }

        for (int i = 0; i < tab2.length; i++) {
            tabSortie[j++] = tab2[i];
        }

        return tabSortie;
    }
    private void afficher(int [][] tab2D) {
        for (int ligne = 0 ; ligne < tab2D.length; ligne++) { //Pour chaque ligne
            afficher(tab2D[ligne]);
        }
    }

    private void afficherOld(int [][] tab2D) {
        for (int ligne = 0 ; ligne < tab2D.length; ligne++) { //Pour chaque ligne
            for (int colonne = 0; colonne < tab2D[ligne].length; colonne++) { // Pour chaque colonne de ma ligne
                System.out.print(tab2D[ligne][colonne] +  ", ");
            }
            System.out.println();
        }
    }

    private void afficher(int[] tab) {
        System.out.print('{');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(+tab[i] + ((i == tab.length - 1) ? "" : ", "));
        }
        System.out.print("}\n");
    }

    public static void main(String[] args) {
        new Cours17_tableaux();
    }
}
