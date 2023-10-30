package partie1;

public class Cours13_exercicesIteratives {
    public Cours13_exercicesIteratives() {
        tester_inverserString();
        tester_getStringCarre();
    }

    public void tester_inverserString() {

        System.out.println("\"" + inverserString("abC") + "\"");

        System.out.println(inverserString("abC").equals("Cba"));
        System.out.println(inverserString("").equals(""));
        System.out.println(inverserString("54321 $%?").equals("?%$ 12345"));
    }


    private String inverserString(String strAInverser) {
        String strinverse = "";

        for (int index = strAInverser.length() - 1; index >= 0; index--) {
            strinverse += strAInverser.charAt(index);
        }
        return strinverse;
    }


    private void tester_getStringCarre() {
        System.out.println(getStringCarre(1));
        System.out.println(getStringCarre(2));
        System.out.println(getStringCarre(3));
    }

    private String getStringCarre(int limite) {
        String strCarre = "";

        for (int ligne = 1 ; ligne <= limite; ligne++) {  //boucle imbriquer
            for (int colonne = 1; colonne <= limite; colonne++) { //faire une ligne
                strCarre += " " + colonne + ligne;
            }
            strCarre += '\n'; //changer de ligne
        }

        return strCarre;
    }


    public static void main(String[] args) {
        new Cours13_exercicesIteratives();
    }
}
