package partie2.Cours20_ObjetSuite;

public class JouerAvecObject {
    public JouerAvecObject() {
//        jouerAvecPizzaEtObject1();
//        jouerAvecPizzaEtObject2();
        jouerAvecVecteurDObjet();
    }

    private void jouerAvecVecteurDObjet() {
        Object []tabObject = new Object[3];

        tabObject[0] = new Pizza(11,11,33,"bleu");
        tabObject[1] = "Bonjour!";
        tabObject[2] = new Coordonnee(5,9);

        for (int i = 0; i < tabObject.length; i++) {
            System.out.println(tabObject[i].toString());
          //  ((Pizza)tabObject[i]).avancerX(); //Comme tous les objets ne sont pas des pizzas, ça fait une Erreur d'exécution
        }
    }

    private void jouerAvecPizzaEtObject2() {
        Object o;

        o = new Pizza(11,11,33,"bleu");

        System.out.println(o.toString());

        ((Pizza)o).avancerX();

        System.out.println(o.toString());
    }

    private void jouerAvecPizzaEtObject1() {
        Pizza p;
        Object o;

        p = new Pizza(1,1,3,"rouge");
        o = p;

        System.out.println(p.toString());

        ((Pizza)o).avancerX(); //On doit caster pour dire au compilateur qu'à l'exécution l'objet sera une Pizza

        System.out.println(p.toString());
    }


    public static void main(String[] args) {
        new JouerAvecObject();
    }
}
