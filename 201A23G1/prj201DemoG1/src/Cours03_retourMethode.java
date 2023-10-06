public class Cours03_retourMethode {
    public Cours03_retourMethode() {
        testerAddition();
        testerSoustraction();
    }

    private void testerSoustraction() {
        afficherSoustraction(2, 3);
        afficherSoustraction(5, 3);
    }

    private void afficherSoustraction(int v1, int v2) {
        int difference;
        difference = calculerDifference(v1, v2);
        System.out.println(v1 + " - " + v2 + " = " + difference);
    }

    private int calculerDifference(int v1, int v2) {
        int retourDif;
        retourDif = v1 - v2;
        return retourDif;
    }

    private void testerAddition() {
        int somme;
        somme = calculerSomme(1, 2);
        System.out.println("La somme de 1 + 2 = " + somme);
    }

    private int calculerSomme(int valeur1, int valeur2) {
        int somme;
        somme = valeur1 + valeur2;
        return somme;
    }

    public static void main(String[] args) {
        new Cours03_retourMethode();
    }
}
