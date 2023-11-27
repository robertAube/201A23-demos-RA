package partie2.cours20_ObjetSuite;

public class Coordonnee_test {
    public Coordonnee_test() {
        tester_coordonnees();
    }

    private void tester_coordonnees() {
        Coordonnee[] tabC = new Coordonnee[5];

        for (int i = 0; i < tabC.length; i++) {
            tabC[i] = new Coordonnee(i, i+1);
            System.out.println(tabC[i]);
            tabC[i].deplacement(10,1);
            System.out.println(tabC[i]);
        }


    }

    public static void main(String[] args) {
        new Coordonnee_test();
    }
}
