public class Cours08_classeMath {
    public Cours08_classeMath() {
        //tester_fonctionsClassMath();
//        tester_pow();
        tester_sqrt();
    }

    private void tester_sqrt() {
        double a = 4;
        System.out.println(Math.sqrt(a)); //affiche 2.0
    }

    private void tester_pow() {
        double puissance;
        double valeur;

        valeur = 3;
        puissance = 2;
        System.out.println(Math.pow(valeur, puissance)); // affiche 9.0

        valeur = 25.6;
        puissance = 2;
        System.out.println(Math.pow(valeur, puissance)); // affiche 655.3600000000001

        valeur = -3;
        puissance = 3;
        System.out.println(Math.pow(valeur, puissance)); // affiche -27.0

        valeur = 25;
        puissance = 0;
        System.out.println(Math.pow(valeur, puissance)); // affiche 1.0

    }

    private void tester_fonctionsClassMath() {
        int x = -2;
        System.out.println("PI = " + Math.PI); //affiche 3.141592653589793

        System.out.println(Math.abs(-15)); //affiche 15
        System.out.println(Math.abs(-5.7)); //affiche 5.7
        System.out.println(Math.abs(5.7)); //affiche 5.7
        System.out.println(Math.abs(x)); //affiche 5.7

    }

    public static void main(String[] args) {
        new Cours08_classeMath();
    }
}
