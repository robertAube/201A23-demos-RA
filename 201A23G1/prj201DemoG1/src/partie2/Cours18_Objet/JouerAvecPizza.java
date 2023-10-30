package partie2.Cours18_Objet;

public class JouerAvecPizza {
    public JouerAvecPizza() {
        //     jouer1();
        jouer2();
    }

    private void jouer2() {
        Pizza[] tabPiz = new Pizza[5];
        String[] couleurs = {"rouge", "bleu", "vert", "noir", "blanc"};

        for (int i = 0; i < tabPiz.length; i++) {
            tabPiz[i] = new Pizza(i * 10, i * 2, 2, couleurs[i]);
        }

        afficher(tabPiz);
        avancerPizza(tabPiz);
        afficher(tabPiz);
    }

    private void afficher(Pizza[] tabPiz) {
        for (int i = 0; i < tabPiz.length; i++) {
            System.out.println(tabPiz[i]);
        }
    }

    public void avancerPizza(Pizza[] pizzas) {
        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i].avancerX();
        }
    }

    private void jouer1() {
        Pizza p;
        String s = "";
        p = new Pizza(1, 2, 2, "rouge");
        System.out.println(p);
        p.avancerX();
        p.avancerX();
        p.avancerX();
        p.avancerX();
        System.out.println(p);
        p.setXY(p.getX(), 0);
        System.out.println(p);
    }

    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
