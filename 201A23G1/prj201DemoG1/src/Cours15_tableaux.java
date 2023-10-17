public class Cours15_tableaux {
    public Cours15_tableaux() {
        //  tester_multiplierValeursDuTab();
        tester_creerTableauEtInitialiser();
    }

    private void tester_creerTableauEtInitialiser() {
        int[] tab;
        tab = creerTableauEtInitialiser(3, 2);
        afficher(tab);
        tab = creerTableauEtInitialiser(0, 2);
        afficher(tab);
        tab = creerTableauEtInitialiser(10, -2);
        afficher(tab);
    }

    private int[] creerTableauEtInitialiser(int longueurTab, int valeurInit) {
        int[] nouveauTab;
        nouveauTab = new int[longueurTab];
        initialiserTableau(nouveauTab, valeurInit);
        return nouveauTab;
    }


    /**
     * Écrire une méthode qui crée un tableau d’une longueur et avec une valeur d’initialisation.
     * Le tableau retourné aura la longueur spécifiée en argument et sera rempli avec la valeur d’initialisation.
     * @param tab
     * @param valeurInit
     */
    private void initialiserTableau(int tab[], int valeurInit) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeurInit;
        }
    }

    private void tester_multiplierValeursDuTab() {
        double[] tabDouble = {2.1, 3.2, 1.4}; //créer le tableau et initialiser ses valeurs
        double nbMultiplicateur;

        nbMultiplicateur = 2;
        afficher(tabDouble);
        multiplierValeursDuTab(tabDouble, nbMultiplicateur);
        System.out.println("Le tableau multiplié par " + nbMultiplicateur);
        afficher(tabDouble);
        System.out.println("Le tableau multiplié par " + nbMultiplicateur);
    }

    /**
     * multiplierValeursDuTab reçoit en argument un tableau de doubles et un nombre multiplicateur qui est également un double.
     * La méthode modifie le tableau en multipliant chacun des éléments pas le nombre multiplicateur.
     * @param tab
     * @param nbMultiplicateur
     */
    private void multiplierValeursDuTab(double[] tab, double nbMultiplicateur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] *= nbMultiplicateur;
        }
        nbMultiplicateur = 0;
    }

    private void afficher(double[] tab) {
        System.out.print('{');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(+tab[i] + ((i == tab.length - 1) ? "" : ", "));
        }
        System.out.print("}\n");
    }

    private void afficher(int[] tab) {
        System.out.print('{');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(+tab[i] + ((i == tab.length - 1) ? "" : ", "));
        }
        System.out.print("}\n");
    }

    public static void main(String[] args) {
        new Cours15_tableaux();
    }
}
