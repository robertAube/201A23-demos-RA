package partie2.cours20_ObjetSuite;

public class JouerAvecObject_Cours22 {
    public JouerAvecObject_Cours22() {
        // jouerAvecPizzaETObject1();
        // jouerAvecPizzaETObject2();
        jouerAvecUnTableauDObjets1();
    }


    private void jouerAvecUnTableauDObjets1() {
        Object[] tabObjets = new Object[3];

        tabObjets[0] = new Pizza(10, 11, 12, "bleu");
        tabObjets[1] = "Bonjour!!";
        tabObjets[2] = new Coordonnee(2, 4);

        for (int i = 0; i < tabObjets.length; i++) {
            System.out.println(tabObjets[i]);
           //  ((Pizza)tabObjets[i]).avancerX(); //Comme tous les objets ne sont pas des Pizzas, ça fait une erreur d'exécution
        }
    }

    private void jouerAvecPizzaETObject2() {
        Object o;

        o = new Pizza(1, 1, 3, "rouge");

        System.out.println(o.toString());

        ((Pizza) o).avancerX();

        o.toString();

        System.out.println(o.toString());
    }

    private void jouerAvecPizzaETObject1() {
        Pizza p;
        Object o;

        p = new Pizza(1, 1, 3, "rouge");

        System.out.println(p);

        p.hashCode(); //on a accès à des méthodes de la classe Object parce que toutes les classes Héritent d'Object.

        o = p;

        ((Pizza) o).avancerX(); //Cast obligatoire

        System.out.println(o.toString()); //A l'exécution, on utilise le toString de la classe Pizza
        System.out.println(p.toString()); // o & p pointe sur la même instance. Donc cette ligne affiche la même chose que la ligne précédente.
    }

    public static void main(String[] args) {
        new JouerAvecObject_Cours22();
    }
}
