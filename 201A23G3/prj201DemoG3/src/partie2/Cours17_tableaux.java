package partie2;

public class Cours17_tableaux {
    public Cours17_tableaux() {
        tester_fusionner();
    }

    private void tester_fusionner() {
        int[] tab1 = {-1, 3};
        int[] tab2;
        int[] f;

        tab2 = new int[]{-3, 7, 4};

        afficher(tab1);
        afficher(tab2);
        f = fusionner(tab1, tab2);
        afficher(f);
    }

    private void afficher(int[] tab) { //surcharge de méthode : même nom de méthode et type différent
        System.out.print('{');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ((i == tab.length - 1) ? "" : ", ")); //lire la valeur à l'indice i
        }
        System.out.println('}');
    }

    private int[] fusionner(int[] t1, int t2[]) {
        int[] tFusion = new int[t1.length + t2.length];
        int idxTabFusion;

        idxTabFusion = 0;
        for (int i = 0; i < t1.length; i++) {
            tFusion[idxTabFusion++] = t1[i];
        }

        for (int i = 0; i < t2.length; i++) {
            tFusion[idxTabFusion++] = t2[i];
        }

        return tFusion;
    }


    public static void main(String[] args) {
        new Cours17_tableaux();
    }
}
