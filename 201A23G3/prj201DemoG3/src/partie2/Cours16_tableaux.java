package partie2;

public class Cours16_tableaux {
    public Cours16_tableaux() {
     //   tester_multiplierValeursDuTab();
        tester_creerTableautEtinitialiser();
    }

    private void tester_creerTableautEtinitialiser() {
        int[] tab = creerTableautEtinitialiser(4, -1);

        afficher(tab);
    }

    private int[] creerTableautEtinitialiser(int lgTab, int valeurInit) {
        int[] nouveauTab;

        nouveauTab = new int[lgTab];
        initialiserTableau(nouveauTab, valeurInit);

        return nouveauTab;
    }


    private void initialiserTableau(int[] tab, int valeurInit) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeurInit;
        }
    }

    private void tester_multiplierValeursDuTab() {
        //créer le tableau et initialiser ses valeurs
        double[] tabDouble = {2.1, -3.2, 4.1};
        double multiplicateur = 2.0;

        afficher(tabDouble);
        multiplierValeursDuTab(tabDouble, multiplicateur);
        System.out.println(multiplicateur);
        afficher(tabDouble);
    }

    private void multiplierValeursDuTab(double[] tab, double multiplicateur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] *= multiplicateur;
        }

        multiplicateur = 3333; //ne change rien

    }

    private void afficher(int[] tab) { //surcharge de méthode : même nom de méthode et type différent
        System.out.print('{');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ((i == tab.length - 1) ? "" : ", ")); //lire la valeur à l'indice i
        }
        System.out.println('}');
    }

    private void afficher(double[] tab) { //surcharge de méthode
        System.out.print('{');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ((i == tab.length - 1) ? "" : ", ")); //lire la valeur à l'indice i
        }
        System.out.println('}');
    }

    public static void main(String[] args) {
        new Cours16_tableaux();
    }
}
