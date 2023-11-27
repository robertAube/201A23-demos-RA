package partie2.cours19_ObjectSuite;

import static partie2._utilitaire.UtilSaisie.*;

public class JouerAvecPizza {
    public JouerAvecPizza() {
       // jouer1Pizza();
        //jouerAvecPlusieursPizzas();
        saisirLeXDUnePizza();
    }

    private void saisirLeXDUnePizza() {
        Pizza p;
        int nouveauX;

        do {
            nouveauX = lireInt("Donner un X entre " + Pizza.MIN_XY + " et " + Pizza.MAX_XY + ": ");
        } while (!Pizza.xyEstValide(nouveauX));
        p = new Pizza(1, 2, 5, "rouge");
        p.setX(nouveauX);
        System.out.println(p);
    }




    private void jouerAvecPlusieursPizzas() {
        Pizza[] tabPizza = new Pizza[4];
        String[] couleurs = {"rouge", "bleu", "vert", "noir"};

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

    private void jouer1Pizza() { //non static fait référence à l'instance
        Pizza p; //type complexe vs type primitif
        String s = ""; //type complexe

        p = new Pizza(1, 2, 5, "rouge");

        System.out.println(p.toString()); //toString() est implicite

        p.avancerX();
        System.out.println(p);
        p.avancerX();
        System.out.println(p);
        p.avancerX();
        System.out.println(p);
        p.avancerX();
        System.out.println(p);
    }

    public static void main(String[] args) { //static fait référence à la classe
        new JouerAvecPizza();

    }
}
