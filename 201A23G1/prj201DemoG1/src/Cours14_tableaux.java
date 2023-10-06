public class Cours14_tableaux {
    public Cours14_tableaux() {
        jouerAvecTableau1();
    }

    private void jouerAvecTableau1() {
        int[] notes; //Déclaration du tableau

        notes = new int[4]; // initialise la variable 'notes' avec l'instanciation (création) d'un tableau de 4 éléments.

        notes[0] = 16;
        notes[1] = 20;
        notes[2] = 18;
        notes[3] = 19;
       // notes[4] = 19; //java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        System.out.println("notes[0] = " + notes[0]); // lire la valeur à l'index 0
        System.out.println("notes[1] = " + notes[1]); // lire la valeur à l'index 1
        System.out.println("notes[2] = " + notes[2]); // lire la valeur à l'index 2
        System.out.println("notes[3] = " + notes[3]); // lire la valeur à l'index 3


        for (int i = 0; i < notes.length; i++) {
            System.out.println("notes[" + i + "] = " + notes[i]); // lire la valeur à l'index i
        }

        afficherTableau(notes);
    }

    private void afficherTableau(int[] tabInt) {
        System.out.println("private void afficherTableau(int[] tabInt)");
        for (int i = 0; i < tabInt.length; i++) {
            System.out.println("notes[" + i + "] = " + tabInt[i]); // lire la valeur à l'index i
        }
    }

    public static void main(String[] args) {
        new Cours14_tableaux();
    }
}
