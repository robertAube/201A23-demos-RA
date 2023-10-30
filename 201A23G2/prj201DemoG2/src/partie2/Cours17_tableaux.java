package partie2;

public class Cours17_tableaux {
    public Cours17_tableaux() {
        tester_tester_fusionner();
    }

    private void tester_tester_fusionner() {
        int[] tab1;
        int[] tab2 = {-1, 3, 2};
        int[] tabf;

        tab1 = new int[]{1, 2};

        afficher(tab1);
        afficher(tab2);
        tabf = fusionner(tab1, tab2);
        afficher(tabf);

        tabf = fusionner(new int[]{}, new int[]{1, 2, 3, 4, 5, 6});
        afficher(tabf);
    }

    private int[] fusionner(int[] tab1, int[] tab2) {
        int[] tabFusion = new int[tab1.length + tab2.length];
        int j;

        j = 0;
        for (int i = 0; i < tab1.length; i++) {
            tabFusion[j++] = tab1[i];
        }

        for (int i = 0; i < tab2.length; i++) {
            tabFusion[j++] = tab2[i];
        }

        return tabFusion;
    }

    private void afficher(int[] tabInt) { //surcharge de la méthode affichée : même nom de méthode, mais arguments différents
        System.out.print('{');
        for (int i = 0; i < tabInt.length; i++) {
            System.out.print(tabInt[i] + ((tabInt.length - 1 == i) ? "" : ", ")); // lire la valeur à l'index i
        }
        System.out.println('}');
    }

    public static void main(String[] args) {
        new Cours17_tableaux();
    }
}
