public class Cours15_tableaux {
    public Cours15_tableaux() {
        // tester_multiplierValeursDuTab();
        test_creerTableauEtInitaliser();
    }

    private void test_creerTableauEtInitaliser() {
        int[] tab;

        tab = creerTableauEtInitaliser(3, 2);
        afficher(tab);
        tab = creerTableauEtInitaliser(0, 2);
        afficher(tab);
        tab = creerTableauEtInitaliser(10, -1);
        afficher(tab);
    }

    private int[] creerTableauEtInitaliser(int longueurTab, int valeurInit) {
        int[] nouveauTab;
        nouveauTab = new int[longueurTab];
        initialiser(nouveauTab, valeurInit);

        return nouveauTab;
    }

    private void initialiser(int[] tab, int valeurInit) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeurInit;
        }
    }

    private void tester_multiplierValeursDuTab() {
        //créer le tableau et initialiser ses valeurs
        double[] tabDouble = {2.1, 2.5, -12.1};
        double nbMultiplicateur;

        nbMultiplicateur = 2;
        afficher(tabDouble);
        multiplierValeursDuTab(tabDouble, nbMultiplicateur);
        System.out.println("Le tableau multiplié par " + nbMultiplicateur);
        afficher(tabDouble);
    }

    private void multiplierValeursDuTab(double[] tab, double multiplicateur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] *= multiplicateur;
        }
    }

    private void afficher(double[] tabDouble) {
        System.out.print('{');
        for (int i = 0; i < tabDouble.length; i++) {
            System.out.print(tabDouble[i] + ((tabDouble.length - 1 == i) ? "" : ", ")); // lire la valeur à l'index i
        }
        System.out.println('}');
    }

    private void afficher(int[] tabInt) { //surcharge de la méthode afficher: même nom de méthode, mais arguments différents
        System.out.print('{');
        for (int i = 0; i < tabInt.length; i++) {
            System.out.print(tabInt[i] + ((tabInt.length - 1 == i) ? "" : ", ")); // lire la valeur à l'index i
        }
        System.out.println('}');
    }

    /**
     * Retourner un tableau à partir d’une méthode :
     * Écrire une méthode qui crée un tableau d’une longueur et avec une valeur d’initialisation.
     * Le tableau retourné aura la longueur spécifiée en argument et sera rempli avec la valeur d’initialisation.
     */


    public static void main(String[] args) {
        new Cours15_tableaux();
    }
}
