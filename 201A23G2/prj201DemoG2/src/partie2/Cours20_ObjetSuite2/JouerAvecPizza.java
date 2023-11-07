package partie2.Cours20_ObjetSuite2;

import java.util.Scanner;

public class JouerAvecPizza {
    private Pizza[] listePizza;

    public JouerAvecPizza() {
        jouer1Pizza();
        jouerAvecPlusieursPizzas1();
        jouerAvecPlusieursPizzas2();
      //  usagerCreeUnePizza();
    }

    private void usagerCreeUnePizza() {
        Pizza p; //type complexe vs type primitif
        int x;
        int y;
        boolean xyValide;

        do {
            x = lireInt("Donner X : ");
            y = lireInt("Donner Y : ");
            xyValide = Pizza.xyEstValide(x, y);
            if (!xyValide) {
                System.out.println("x ou y invalide");
            }
        } while (!xyValide);

        p = new Pizza(x, y, lireInt("Donner vitesse : "), lireString("Donner couleur"));

        System.out.println(p);

    }

    private void jouerAvecPlusieursPizzas2() {
        creerPizza();
        afficher(listePizza);
        for (int i = 0; i < listePizza.length; i++) {
            listePizza[i].setXY(i * 2, i * 2);
        }
        afficher(listePizza);
    }

    private void creerPizza() {
        listePizza = new Pizza[4];
        String[] couleurs = {"rouge", "bleu", "vert", "noir"};

        for (int i = 0; i < listePizza.length; i++) {
            listePizza[i] = new Pizza(i * 10, i * 3, 2, couleurs[i]);
        }
    }

    private void jouerAvecPlusieursPizzas1() {
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


    public int lireInt(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }

    public String lireString(String question) {
        String reponseStr;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponseStr = sc.nextLine();

        return reponseStr;
    }


    public static void main(String[] args) { //static fait référence à la classe
        new JouerAvecPizza();

    }
}
