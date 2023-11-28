package partie2.cours25_ExerciceTableau;
import partie2._utilitaire.UtilAffichage;

public class ExerciceTabTest {
    public ExerciceTabTest() {
        insererTableauTest();
    }

    private void insererTableauTest() {
        int[] tab1 = {10, 11, 12};
        int[] tab2 = {20, 21};
        int[] tabFusion;

        UtilAffichage.afficher(tab1);
        UtilAffichage.afficher(tab2);

        tabFusion = Tableau.insererTableau(tab1, tab2, 1);

        UtilAffichage.afficher(tabFusion);

        for (int i = -1; i <= tab1.length + 1; i++) {
            System.out.println("Insérer à " + i);
            tabFusion = Tableau.insererTableau(tab1, tab2, i);
            UtilAffichage.afficher(tabFusion);
        }
    }

    public static void main(String[] args) {
        new ExerciceTabTest();
    }
}
