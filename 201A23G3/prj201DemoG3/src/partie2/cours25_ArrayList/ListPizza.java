package partie2.cours25_ArrayList;

import partie2.cours23_equals.Pizza;
import java.util.ArrayList;

public class ListPizza {
    private ArrayList<Pizza> lPizza;

    public ListPizza() {
        lPizza = new ArrayList();
    }

    public void ajouterPizza (Pizza p) {
        lPizza.add(p);
    }

    public void supprimerPizza (int index) {
        lPizza.remove(index);
    }

    public void supprimerPizza (Pizza p) {
        lPizza.remove(p); //fait appel à la méthode equals de Pizza
    }

    public void avancerLesPizzas () {
        for (int i = 0; i < lPizza.size(); i++) {
            lPizza.get(i).avancerX();
        }
    }

    @Override
    public String toString() {
        return "ListPizza{" + lPizza.toString() + '}';
    }
}
