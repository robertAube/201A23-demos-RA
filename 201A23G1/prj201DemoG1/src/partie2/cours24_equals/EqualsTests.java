package partie2.cours24_equals;

public class EqualsTests {
    public EqualsTests() {
        equalsCoordonne_test();

//        equalsDansObjectCoordonne();
//        equalsDansObject();
    }


    //IMPORTANT : EXAMEN
    private void equalsCoordonne_test() {
        System.out.println(retourneVraiSiCEstLEMemeObjet() == true);
        System.out.println(retourneFauxSiObjetEnArgumentEstNull() == false);
        System.out.println(retourneFauxSiObjetEnArgumentEstDeTypeDifferent() == false);
        System.out.println(retourneVraiSiXEtYEgal() == true);
        System.out.println(retourneFauxSiLesXSontDifferentsEtYEgal() == false);
        System.out.println(retourneFauxSiLesXEgauxEtYDifferents() == false);
    }

    private boolean retourneFauxSiLesXEgauxEtYDifferents() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 3);
        return c1.equals(c2);
    }

    private boolean retourneFauxSiLesXSontDifferentsEtYEgal() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(2, 2);
        return c1.equals(c2);
    }

    private boolean retourneVraiSiXEtYEgal() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);
        return c1.equals(c2);
    }

    private boolean retourneFauxSiObjetEnArgumentEstDeTypeDifferent() {
        Coordonnee c1 = new Coordonnee(1, 2);

        return c1.equals("");
    }

    private boolean retourneFauxSiObjetEnArgumentEstNull() {
        Coordonnee c1 = new Coordonnee(1, 2);
        return (c1.equals(null));
    }

    private boolean retourneVraiSiCEstLEMemeObjet() {
        Coordonnee c1 = new Coordonnee(1, 2);
        return (c1.equals(c1));
    }

    private void equalsDansObjectCoordonne() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);

        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.equals(c1)); //true
    }

    private void equalsDansObject() {
        Pizza p1 = new Pizza(1, 2, 3, "bleu");
        Pizza p2 = new Pizza(1, 2, 3, "bleu");

        System.out.println(p1.equals(p2)); //false
        System.out.println(p1.equals(p1)); //true
    }

    public static void main(String[] args) {
        new EqualsTests();
    }
}
