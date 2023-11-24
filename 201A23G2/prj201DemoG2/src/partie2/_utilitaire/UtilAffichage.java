package partie2._utilitaire;

public class UtilAffichage {
    public static void afficher(int[] tabInt) { //surcharge de la méthode affichée : même nom de méthode, mais arguments différents
        System.out.print('{');
        for (int i = 0; i < tabInt.length; i++) {
            System.out.print(tabInt[i] + ((tabInt.length - 1 == i) ? "" : ", ")); // lire la valeur à l'index i
        }
        System.out.println('}');
    }
}
