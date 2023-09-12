public class Cours07_boolean_si {
    public Cours07_boolean_si() {
        testerAfficherNoteEstReussite();
//        afficherSiUnNombreEstPositif(4);
//        afficherSiUnNombreEstPositif(-1);
//        afficherSiUnNombreEstPositifOuNegatif(4);
//        afficherSiUnNombreEstPositifOuNegatif(-1);

        //testerBoolean();
    }

    private void testerAfficherNoteEstReussite() {
        afficherNoteEstReussiteV3(80);
        afficherNoteEstReussiteV3(50);
        afficherNoteEstReussiteV3(59.99999);
        afficherNoteEstReussiteV3(60);
        afficherNoteEstReussiteV3(0);
        afficherNoteEstReussiteV3(100);
    }

    private void afficherNoteEstReussiteV3(double note) {
        boolean estUnSucces; //type boolean permet de conserver la valeur true ou false
        String str;

        estUnSucces = note >= 60;

        str = "La note " + note + " est une ";
        str += estUnSucces ? "réussite" : "échec"; //si compact : boolean ? valeurSiVrai : valeurSiFaux

        System.out.println(str + '.');
    }

    private void afficherNoteEstReussiteV2(double note) {
        boolean estUnSucces; //type boolean permet de conserver la valeur true ou false
        String str;

        estUnSucces = note >= 60;

        str = "La note " + note + " est une ";
        if (estUnSucces) {
            str += "réussite";
        } else {
            str += "échec";
        }

        System.out.println(str + '.');
    }

    private void afficherNoteEstReussiteV1(double note) {
        boolean estUnSucces; //type boolean permet de conserver la valeur true ou false

        estUnSucces = note >= 60;

        if (estUnSucces) {
            System.out.println("La note " + note + " est une réussite.");
        } else {
            System.out.println("La note " + note + " est un échec.");
        }
    }


    private void afficherSiUnNombreEstPositifOuNegatif(int nb) {
        System.out.print(nb);
        if (nb >= 0) {
            System.out.println(" est un nombre positif.");
        } else {
            System.out.println(" est un nombre négatif.");
        }
        System.out.println("méthode terminée");
    }


    private void afficherSiUnNombreEstPositif(int nb) {
        System.out.print(nb);
        if (nb >= 0) {
            System.out.println(" est un nombre positif.");
        }
        System.out.println("méthode terminée");
    }



    private void testerBoolean() {
        int i = 0;
        System.out.println("true -> " + true); //true -> true
        System.out.println("false -> " + false); //false -> false
        System.out.println("2 < 3 -> " + (2 < 3)); //2 < 3 -> true
        System.out.println("2 > 3 -> " + (2 > 3)); //2 > 3 -> false
        System.out.println("2 == 3 -> " + (2 == 3)); //2 == 3 -> false
        System.out.println("3 == 3 -> " + (3 == 3)); //3 == 3 -> true
        System.out.println("2 >= 3 -> " + (2 >= 3)); //2 >= 3 -> false
        System.out.println("3 >= 3 -> " + (3 >= 3)); //3 >= 3 -> true
        System.out.println("2 <= 3 && 3 < 4 -> " + (2 <= 3 && 3 < 4)); //2 <= 3 && 3 < 4 -> true
        System.out.println("i <= 3 && i < 4 -> " + (i <= 3 && i < 4)); //i <= 3 && i < 4 -> true
        System.out.println("2 == 3 && 2 < 4 -> " + (2 == 3 && 2 < 4)); //2 == 3 && 2 < 4 -> false
        System.out.println("2 == 3 || 2 < 4 -> " + (2 == 3 || 2 < 4)); //2 == 3 || 2 < 4 -> true


        System.out.println("2 != 3 -> " + (2 != 3)); //2 != 3 -> true
        System.out.println("3 != 3 -> " + (3 != 3)); //3 != 3 -> false

        System.out.println("!true -> " + !true); // !true -> false
        System.out.println("!false -> " + !false); // !false -> true
        System.out.println("!(3 == 3) -> " + !(3 == 3)); //!(3 == 3) -> false
    }

    public static void main(String[] args) {
        new Cours07_boolean_si();
    }
}
