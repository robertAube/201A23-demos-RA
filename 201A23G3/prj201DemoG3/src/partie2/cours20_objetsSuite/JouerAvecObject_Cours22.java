package partie2.cours20_objetsSuite;

public class JouerAvecObject_Cours22 {

    public JouerAvecObject_Cours22() {
        jouerAvecTabeauDObjets2();
        //jouerAvecTabeauDObjets1();
       // jouerAvecPizzaEtObject1();
    }


    private void jouerAvecTabeauDObjets2() {
        Object[] tObjets = {new Pizza(1,2,4,"bleu"), new Coordonnee(5,6), "abcd", 12, 1.0, false, 1.55f};

        Double d = 1.3; // Double est la classe enveloppe du type primitif double

        for (int i = 0; i < tObjets.length; i++) {
            System.out.println(tObjets[i].toString() + " - " + tObjets[i].getClass().getSimpleName());
        }
    }


    private void jouerAvecTabeauDObjets1() {
        Object[] tObjets;
        tObjets = new Object[3];

        tObjets[0] = new Pizza(1,2,4,"bleu");
        tObjets[1] = new Coordonnee(5,6);
        tObjets[2] = "abc";

        for (int i = 0; i < tObjets.length; i++) {
            System.out.println(tObjets[i].toString());
        }
    }

    private void jouerAvecPizzaEtObject1() {
        Pizza p;
        Object o;
        Rien r = new Rien() ;

        p = new Pizza(1,2,4,"bleu");

        p.hashCode(); //On a accès aux méthodes de la classe Object parce que toutes les classes héritent d'Object

        System.out.println(p);

        System.out.println(r.toString());

        o = p;

        ((Pizza)o).avancerX(); //Cast obligatoire : il n'y a pas d'avancerX dans Object

        System.out.println(o.toString());//À l'exécution, on utilise le toString de la classe Pizza
        System.out.println(p.toString());//o & p pointe sur la même instance. Donc cette lige affiche la même chose que la précédente
    }

    public static void main(String[] args) {
        new JouerAvecObject_Cours22();
    }
}
