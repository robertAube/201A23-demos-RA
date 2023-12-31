package partie2.cours25_ArrayList;

public class ListePizzaTest {
    private ListePizza lPizza;


    public ListePizzaTest() {
        lPizza = new ListePizza();
        ajouterDesPizzas();
        enleverDesPizzas();

    }

    private void enleverDesPizzas() {
        lPizza.enleverPizza(0);
        System.out.println(lPizza);

        lPizza.enleverPizza(new Pizza(1,2,3,"blanc"));
        System.out.println(lPizza);
    }

    private void ajouterDesPizzas() {
        Pizza p = new Pizza(1, 2, 1, "bleu");

        System.out.println(lPizza);


        lPizza.ajouterPizza(new Pizza(1, 2, 1, "bleu"));
        lPizza.ajouterPizza(new Pizza(1, 2, 2, "rouge"));
        lPizza.ajouterPizza(new Pizza(1, 2, 3, "blanc"));
        lPizza.ajouterPizza(new Pizza(1, 2, 4, "gris"));
        lPizza.ajouterPizza(new Pizza(1, 2, 5, "jaune"));

        System.out.println(lPizza);
    }

    public static void main(String[] args) {
        new ListePizzaTest();
    }
}
