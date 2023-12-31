package partie1;

public class Cours13_ExercicesIteratives {
    public Cours13_ExercicesIteratives() {
        tester_inverserString();
        tester_getStringCarre();
    }

    public void tester_inverserString() {
        System.out.println(inverserString("abC").equals("Cba"));
        System.out.println(inverserString("").equals(""));
        System.out.println(inverserString("54321 $%?").equals("?%$ 12345"));
    }

    private String inverserString(String strAInverser) {
        String strInverse = "";

        for (int i = strAInverser.length(); i >= 0; i--) {
            strInverse += strAInverser.charAt(i);
        }

        return strInverse;
    }

    private void tester_getStringCarre() {
        System.out.println(getStringCarre(1));
        System.out.println(getStringCarre(2));
        System.out.println(getStringCarre(3));
    }

    private String getStringCarre(int limite) {
        String str = "";

        for (int ligne = 1; ligne <= limite; ligne++) { // boucle imbriquée
            for (int colonne = 1; colonne <= limite; colonne++) { //faire une ligne
                str += " " + colonne + "" + ligne;
            }
            str += '\n';
        }
        return str;
    }

    public static void main(String[] args) {
        new Cours13_ExercicesIteratives();
    }
}
