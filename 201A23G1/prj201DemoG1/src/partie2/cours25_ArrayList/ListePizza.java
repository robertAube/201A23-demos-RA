package partie2.cours25_ArrayList;


import java.util.ArrayList;

public class ListePizza {
    private ArrayList<Pizza> lPizza; //ArrayList<typeDesObjets> lPizza

    public ListePizza() {
        lPizza = new ArrayList();
    }

    public void ajouterPizza(Pizza p) {
        lPizza.add(p);
    }
    public void enleverPizza(int i) {
        lPizza.remove(i);
    }

    public void enleverPizza(Pizza p) {
        lPizza.remove(p);
    }

    public void avancerLesPizzas() {
        for (int i = 0; i < lPizza.size(); i++) {
            lPizza.get(i).avancerX();
        }
    }

    @Override
    public String toString() {
        return "ListePizza{" + lPizza.toString() + '}';
    }
}
