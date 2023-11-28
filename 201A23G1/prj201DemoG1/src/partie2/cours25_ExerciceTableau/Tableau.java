package partie2.cours25_ExerciceTableau;

public class Tableau {

    public static int[] insererTableau(int [] tab1, int [] tab2, int idxInsert) {
        int[] tabOut;
        int iTab1 = 0;
        int iTab2 = 0;

        if (idxInsert < 0 ) {
            throw new IndexOutOfBoundsException(idxInsert + " ne peut pas être négatif!");
        }

        tabOut = new int[tab1.length + tab2.length];

        for (int iTabOut = 0; iTabOut <tabOut.length; iTabOut++) {
            if (iTabOut < idxInsert) {
                tabOut[iTabOut] = tab1[iTab1++];
            } else {
                if (iTab2 < tab2.length) {
                    tabOut[iTabOut] = tab2[iTab2++];
                } else {
                    tabOut[iTabOut] = tab1[iTab1++];
                }
            }
        }

        return tabOut;
    }
}
