package partie2.cours25_ArrayList;

import java.util.ArrayList;

public class ListePizza {
    private ArrayList<Pizza> listePizza;  //ArrayList <typeDesObjets> nomListe;

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
        listePizza.remove(p);  // possible grâce à l'utilisation du equals() de Pizza
    }

    public void avancerPizza() {
        for (int i = 0; i < listePizza.size(); i++) {
            listePizza.get(i).avancerX(); // on a pas à faire de cast sur "listePizza.get(i)" parce qu'on a une ArrayList de <Pizza>
        }
    }

    @Override
    public String toString() {
        return "ListePizza{"  + listePizza.toString() + '}';
    }
}
