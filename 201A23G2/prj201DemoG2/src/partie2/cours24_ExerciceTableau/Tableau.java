package partie2.cours24_ExerciceTableau;

public class Tableau {

    /**
     * Reçoit en argument 2 tableaux d’entiers et un index. La méthode retourne un nouveau tableau où le
     * deuxième tableau est inséré à l’index du premier.
     * Un IndexOutOfBoundsException est lancé si l’indice est invalide.
     * @param tab1
     * @param tab2
     * @param indexInsertion
     * @return
     */
    public static int[] insererTableau (int [] tab1, int [] tab2, int indexInsertion) {
        int[] tabOut;
        int iTab1 = 0;
        int iTab2 = 0;

        if (indexInsertion < 0) {
            throw new IndexOutOfBoundsException("Index d'insertion ne peut pas être négatif.");
        }

        tabOut = new int[tab1.length + tab2.length];

        for (int iTabout = 0; iTabout < tabOut.length; iTabout++) { //Pour tout le tableau out
            if (iTabout < indexInsertion) { //si avant l'indexInsertion
                tabOut[iTabout] = tab1[iTab1++];  //copie le tab1
            } else {
                if (iTab2 < tab2.length) { // Si le tableau 2 n'est pas passé
                    tabOut[iTabout] = tab2[iTab2++]; //copie du tab2
                }
                else {
                    tabOut[iTabout] = tab1[iTab1++]; //continuer copie du tab1
                }
            }
        }

        return tabOut;
    }
}
