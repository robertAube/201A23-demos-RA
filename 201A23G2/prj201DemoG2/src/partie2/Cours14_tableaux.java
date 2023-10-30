package partie2;

public class Cours14_tableaux {
    public Cours14_tableaux() {
        jouerAvecTableau();
    }

    private void jouerAvecTableau() {
        int[] notes; //declaration d'une référence sur un tableau

        notes = new int[4]; //initisation de la variable 'notes' avec l'instanciation (création) d'un tableau de 4 éléments

        notes[0] = 19; // Écrire la valeur 16 à l'index 0;
        notes[1] = 20; // Écrire la valeur 20 à l'index 1;
        notes[2] = 18; // Écrire la valeur 18 à l'index 2;
        notes[3] = 11; // Écrire la valeur 18 à l'index 3;
        //  notes[4] = 20; // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        System.out.println(" notes[0] = " + notes[0]); //lire la valeur à l'index 0
        System.out.println(" notes[1] = " + notes[1]); //lire la valeur à l'index 1
        System.out.println(" notes[2] = " + notes[2]); //lire la valeur à l'index 2
        System.out.println(" notes[3] = " + notes[3]); //lire la valeur à l'index 3

        for (int i = 0; i < notes.length; i++) {
            System.out.println(" notes[" + i + "] = " + notes[i]); //lire la valeur à l'index i
        }

        afficherTableau(notes);

        initialiserTableau(notes, 0);

        afficherTableau(notes);
    }

    private void initialiserTableau(int[] tabInt, int valeurInit) { //un tableau est passé par une référence la méthode peut donc modifier le tableau
        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = valeurInit;
        }
    }

    private void afficherTableau(int[] tabInt) {
        System.out.println("private void afficherTableau(int[] tabInt)");
        for (int i = 0; i < tabInt.length; i++) {
            System.out.println(" notes[" + i + "] = " + tabInt[i]); //lire la valeur à l'index i
        }
    }

    public static void main(String[] args) {
        new Cours14_tableaux();
    }
}
