package partie1;

public class Cours13_exercicesIteratives {
    public Cours13_exercicesIteratives() {
//        fctX();
//        tester_inverserString();
        tester_getStringCarre();
    }

    private void fctX() {
        int a = 1;
        int b = 100;

        while (a < b) {
            System.out.println("a = " + a + " b = " + b);
            a += 10;
            b -= 20;
        }
        System.out.println("a = " + a + " b = " + b);
    }


    public void demo_String() {
        String str = "abc";
        int longueur;
        char premierCar;

        longueur = str.length();
        premierCar = str.charAt(0);

    }

    public void tester_inverserString() {

        System.out.println("\"" + inverserString("abC") + "\"");

        System.out.println(inverserString("abC").equals("Cba"));
        System.out.println(inverserString("").equals(""));
        System.out.println(inverserString("54321 $%?").equals("?%$ 12345"));
    }

    private String inverserString(String strAInverser) {
        String strInverse = "";

        for (int i = strAInverser.length() - 1; i >= 0; i--) {
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
        String strCarre = "";

        for (int ligne = 1; ligne <= limite; ligne++) { //faire toutes les lignes
            for (int colonne = 1; colonne <= limite; colonne++) { //faire une ligne
                strCarre += " " + colonne + ligne;
            }
            strCarre += '\n';
        }

        return strCarre;
    }

    public static void main(String[] args) {
        new Cours13_exercicesIteratives();
    }
}
