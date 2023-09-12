public class Cours07_boolean_si {
    public Cours07_boolean_si() {
        //testerBoolean();
        //tester_afficherSiUnNombreEstPositif();
        //tester_afficherSiUnNombreEstPositifOuNegatif();

        tester_afficherNoteEstReussite();
    }

    private void tester_afficherNoteEstReussite() {
        //Pour faire une sélection verticale avec intelliJ : sélectionner en appuyant sur ALT-souris droite et descendez
        afficherNoteEstReussiteV2(80); //La note 80.0 est une réussite.
        afficherNoteEstReussiteV2(50); //La note 50.0 est un échec.
        afficherNoteEstReussiteV2(59.99999); //reçoit un double
        afficherNoteEstReussiteV2(60);
        afficherNoteEstReussiteV2(0);
        afficherNoteEstReussiteV2(100);
    }

    private void afficherNoteEstReussiteV2(double note) {
        boolean estUnSucces; // type boolean permet de conserver la valeur true ou false
        String str;

        estUnSucces = note >= 60;

        str = "La note " + note + " est ";

        str += estUnSucces ? "une réussite" : "un échec"; //si compact : boolean ? valeurSiVrai : valeurSiFaux

        System.out.println(str + '.');
    }

    private void afficherNoteEstReussiteV1(double note) {
        boolean estUnSucces; // type boolean permet de conserver la valeur true ou false
        String str;

        estUnSucces = note >= 60;

        str = "La note " + note + " est ";

        if (estUnSucces) {
            str += "une réussite";
        } else {
            str += "un échec";
        }

        System.out.println(str + '.');
    }

    private void tester_afficherSiUnNombreEstPositifOuNegatif() {
        afficherSiUnNombreEstPositifOuNegatif(-1);
        afficherSiUnNombreEstPositifOuNegatif(0);
        afficherSiUnNombreEstPositifOuNegatif(1);
    }

    private void afficherSiUnNombreEstPositifOuNegatif(int nb) {
        System.out.print(nb + " est un nombre"); //est commun à tous les nombres
        if (nb >= 0) {
            System.out.print(" positif");
        } else { //est optionnel en java
            System.out.print(" négatif");
        }
        System.out.println('.'); //est commun à tous les nombres
    }

    private void tester_afficherSiUnNombreEstPositif() {
        afficherSiUnNombreEstPositif(-1);
        afficherSiUnNombreEstPositif(0);
        afficherSiUnNombreEstPositif(1);
    }

    private void afficherSiUnNombreEstPositif(int nb) {
        System.out.print(nb + " est un nombre"); //est commun à tous les nombres
        if (nb >= 0) {
            System.out.print(" positif");
        }
        System.out.println('.'); //est commun à tous les nombres
    }


    private void testerBoolean() {
        int i = 0;
        System.out.println("true -> " + true);// true -> true
        System.out.println("false -> " + false);// false -> false
        System.out.println("2 < 3 -> " + (2 < 3));// 2 < 3 -> true
        System.out.println("2 > 3 -> " + (2 > 3));// 2 > 3 -> false
        System.out.println("2 == 3 -> " + (2 == 3));// 2 == 3 -> false
        System.out.println("3 == 3 -> " + (3 == 3));//3 == 3 -> true
        System.out.println("2 >= 3 -> " + (2 >= 3));//2 >= 3 -> false
        System.out.println("3 >= 3 -> " + (3 >= 3));//3 >= 3 -> true
        System.out.println("2 <= 3 && 3 < 4 -> " + (2 <= 3 && 3 < 4));//2 <= 3 && 3 < 4 -> true
        System.out.println("i <= 3 && i < 4 -> " + (i <= 3 && i < 4));//i <= 3 && i < 4 -> true
        System.out.println("2 == 3 && 2 < 4 -> " + (2 == 3 && 2 < 4));//2 == 3 && 2 < 4 -> false
        System.out.println("2 == 3 || 2 < 4 -> " + (2 == 3 || 2 < 4));//2 == 3 || 2 < 4 -> true


        System.out.println("2 != 3 -> " + (2 != 3)); //2 != 3 -> true
        System.out.println("3 != 3 -> " + (3 != 3)); //3 != 3 -> false

        System.out.println("!true -> " + !true); //!true -> false
        System.out.println("!false -> " + !false); //!false -> true
        System.out.println("!(3 == 3) -> " + !(3 == 3)); //!(3 == 3) -> false
    }

    public static void main(String[] args) {
        new Cours07_boolean_si();
    }
}
