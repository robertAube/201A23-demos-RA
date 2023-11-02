package partie2.cours18_objet;

public class JouerAvecPizza {

    public JouerAvecPizza() {
        //jouerAvecUnePizza();
        jouerAvecPlusieursPizzas();
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
