package partie2.cours24_ExcerciceTableau;

public class Tableau {


    /**
     * Reçoit en argument 2 tableaux d’entiers et un index.
     * La méthode retourne un nouveau tableau où le deuxième tableau est inséré
     * à l’index du premier.
     * Un IndexOutOfBoundsException est lancé si l’indice est invalide.
     * @param tab1
     * @param tab2
     * @param indexInsertion indice d'insertion
     * @return tableau fusionné
     */
    public static int[] insererTableau (int[] tab1, int[] tab2, int indexInsertion) {
        int[] tabOut = {};
        int iTab1 = 0;
        int iTab2 = 0;

        if (indexInsertion < 0) {
            throw new ArrayIndexOutOfBoundsException("Index d'insertion ne peut pas être négatif");
        }

        tabOut = new int[tab1.length + tab2.length];

        for (int iTabOut = 0; iTabOut < tabOut.length; iTabOut++) { //Pour tout le tabOut
            if (iTabOut < indexInsertion) { //Si avant l'indexInsertion
                tabOut[iTabOut] = tab1[iTab1++]; //copie le tab1
            } else { //égal ou après indexInsertion
                if (iTab2 < tab2.length) { //Si le tab2 n'est pas passé
                    tabOut[iTabOut] = tab2[iTab2++]; //copie le tab2
                }
                else {
                    tabOut[iTabOut] = tab1[iTab1++]; //continuer de copier tab1
                }
            }
        }

        return tabOut;
    }

}
