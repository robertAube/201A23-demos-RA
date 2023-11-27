package partie2.cours25_ArrayList;

public class ListePizzaTest {

    private ListePizza lPizza;
    public ListePizzaTest() {
        lPizza = new ListePizza();
        ajouterDesPizzas();
        //enleverDesPizzas();
        avancerPizza_test();
    }

    private void avancerPizza_test() {
        System.out.println(lPizza);
        lPizza.avancerPizza();
        System.out.println(lPizza);
    }

    private void enleverDesPizzas() {
        lPizza.enleverPizza(0);
        System.out.println(lPizza);

        lPizza.enleverPizza(new Pizza(1, 2, 3, "rouge"));
        System.out.println(lPizza);
    }

    private void ajouterDesPizzas() {
        lPizza.ajouterPizza(new Pizza(1, 2, 1, "bleu"));
        lPizza.ajouterPizza(new Pizza(1, 2, 2, "jaune"));
        lPizza.ajouterPizza(new Pizza(1, 2, 3, "rouge"));
        lPizza.ajouterPizza(new Pizza(1, 2, 4, "vert"));
        lPizza.ajouterPizza(new Pizza(1, 2, 5, "blanc"));

        System.out.println(lPizza);
    }

    public static void main(String[] args) {
        new ListePizzaTest();
    }
}
