package partie2.Cours24_equals;

public class EqualsTests {
    public EqualsTests() {

        equalsCoordonnee_test();
        // equalsDansObject_Coordonnee();

    }

    private void equalsCoordonnee_test() {
        System.out.println(retournerVraiSiCEstLeMemeObjet() == true);
        System.out.println(retournerFauxSiObjetEnArgumentEstNull() == false);
        System.out.println(retournerFauxSiObjetEnArgumentEstDeTypeDifferent() == false);
        System.out.println(retournerVraiSiXEtYEgaux() == true);
        System.out.println(retournerFauxSiXSontDifferentsEtYEgaux() == false);
        System.out.println(retournerFauxSiYSontDifferentsEtXEgaux() == false);
        System.out.println(retournerFauxSiXSontDifferentsEtYSontDifferents() == false);
    }

    private boolean retournerFauxSiXSontDifferentsEtYSontDifferents() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(2, 3);
        return c1.equals(c2);
    }

    private boolean retournerFauxSiYSontDifferentsEtXEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 3);
        return c1.equals(c2);
    }

    private boolean retournerFauxSiXSontDifferentsEtYEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(2, 2);
        return c1.equals(c2);
    }

    private boolean retournerVraiSiXEtYEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);
        return c1.equals(c2);
    }

    private boolean retournerFauxSiObjetEnArgumentEstDeTypeDifferent() {
        Coordonnee c1 = new Coordonnee(1, 2);
        return c1.equals(new Pizza());
    }

    private boolean retournerFauxSiObjetEnArgumentEstNull() {
        Coordonnee c1 = new Coordonnee(1, 2);
        return c1.equals(null);
    }

    private boolean retournerVraiSiCEstLeMemeObjet() {
        Coordonnee c1 = new Coordonnee(1, 2);
        return c1.equals(c1);
    }

    private void equalsDansObject_Coordonnee() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);
        Coordonnee c3 = new Coordonnee(11, 12);

        System.out.println(c1.equals(c2)); //true
        System.out.println(c1.equals(c1)); //true
        System.out.println(c1.equals(c3)); //false
    }

    public static void main(String[] args) {
        new EqualsTests();
    }
}
