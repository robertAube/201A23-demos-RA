package partie2.cours18_objet;

import _util.UtilSaisie;

public class JouerAvecPizza {

    public JouerAvecPizza() {
        //jouerAvecUnePizza();
        //   jouerAvecPlusieursPizzas();
        //   jouerAvecPizza();
        // saisirUnePizzaEtAfficher();
        testerConstructeurs();
    }

    private void testerConstructeurs() {
        Pizza p;

        p = new Pizza();

        System.out.println(p);

        p = new Pizza(1 , 2);

        System.out.println(p);
    }

    private void saisirUnePizzaEtAfficher() {
        Pizza p; //type complexe vs type primitif
        int x;
        int y;
        boolean nEstPasValide;
        String message;

        do {
            x = UtilSaisie.lireInt("Donner le x de la pizza : ");
            y = UtilSaisie.lireInt("Donner le y de la pizza : ");
            nEstPasValide = !Pizza.estValideXY(x, y);
            if (nEstPasValide) {
                message = "(" + x + ", " + y + ") n'est pas valide: leur valeur doit être entre [" + Pizza.MIN_XY + ", " + Pizza.MAX_XY + "]";
                System.out.println(message);
            }
        } while (nEstPasValide);


        p = new Pizza(x, y, 5, "rouge");

        System.out.println(p);
    }

    private void jouerAvecPizza() {
        Pizza p; //type complexe vs type primitif

        p = new Pizza(4, 2, 5, "rouge");
        System.out.println(p);
        p.setXY(55, p.getY());
        System.out.println(p);
        p.setXY(16, 0);
        System.out.println(p);
    }

    private void jouerAvecPlusieursPizzas() {
        Pizza[] tabPizza = new Pizza[4];
        String[] couleurs = {"rouge", "bleu", "jaune", "blanc"};

        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i] = new Pizza(i * 10, i * 3, 2, couleurs[i]);
        }
        afficher(tabPizza);
        avancer(tabPizza);
        afficher(tabPizza);
    }

    private void avancer(Pizza[] tabPizza) {
        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i].avancerX();
        }
    }

    private void afficher(Pizza[] tabPizza) {
        for (int i = 0; i < tabPizza.length; i++) {
            System.out.println(tabPizza[i]);
        }
    }

    private void jouerAvecUnePizza() {
        Pizza p; //type complexe vs type primitif
        String s = ""; //type complexe

        p = new Pizza(4, 2, 5, "rouge");

        System.out.println(p.toString()); //toString() est implicite

        p.avancerX();
        System.out.println(p);
        p.avancerX();
        System.out.println(p);
        p.avancerX();
        System.out.println(p);
        //    p.y = 111; //y pas accessible. Il est privé
        System.out.println(p);
    }



    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
