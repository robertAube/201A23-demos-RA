package partie2.cours25_ArrayList;

import java.util.ArrayList;

public class ListePizza {
    private ArrayList<Pizza> listePizza;

    public ListePizza() {
        listePizza = new ArrayList<Pizza>();
    }

    public void ajouterPizza(Pizza p) {
        listePizza.add(p);
    }

    public void enleverPizza(int i) {
        listePizza.remove(i);
    }
    public void enleverPizza(Pizza p) {
        listePizza.remove(p);
    }

    public void avancerPizza() {
        for (int i = 0; i < listePizza.size(); i++) {
            listePizza.get(i).avancerX();
        }
    }

    @Override
    public String toString() {
        return "ListePizza{"  + listePizza.toString() +
                '}';
    }
}
