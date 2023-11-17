package partie2.cours23_equals;

public class EqualsTests {
    public EqualsTests() {
        equalsCoordonnee_test();
        //  equalsDansObjetCoordonne();
    }

    private void equalsCoordonnee_test() {
        System.out.println(retrounerVraiSiCEstLeMemeObjet() == true);
        System.out.println(retournerFalseSiObjetNullEnArgument() == false);
        System.out.println(retournerFalseSiObjetEnArgumentEstDeTypeDifferent() == false);
        System.out.println(retournerVraiSiXetYsontEgaux() == true);
        System.out.println(retournerFalseSiLesXsontDifferentEtYEgaux() == false);
        System.out.println(retournerFalseSiLesYsontDifferentsEtXEgaux() == false);
        System.out.println(retournerFalseSiLesXetYsontDifferents() == false);
    }

    private boolean retournerFalseSiLesXetYsontDifferents() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(2, 1);

        return (c1.equals(c2));
    }

    private boolean retournerFalseSiLesYsontDifferentsEtXEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 1);

        return (c1.equals(c2));
    }

    private boolean retournerFalseSiLesXsontDifferentEtYEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(2, 2);

        return (c1.equals(c2));
    }

    private boolean retournerVraiSiXetYsontEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);

        return (c1.equals(c2));
    }

    private boolean retournerFalseSiObjetEnArgumentEstDeTypeDifferent() {
        Coordonnee c1 = new Coordonnee(1, 2);

        return c1.equals(new Pizza(1, 2, 3, "bleu"));
    }


    private boolean retournerFalseSiObjetNullEnArgument() {
        Coordonnee c1 = new Coordonnee(1, 2);

        return c1.equals(null);
    }

    private boolean retrounerVraiSiCEstLeMemeObjet() {
        Coordonnee c1 = new Coordonnee(1, 2);

        return c1.equals(c1);
    }

    private void equalsDansObjetCoordonne() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);
        Coordonnee c3 = new Coordonnee(2, 2);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c1));
        System.out.println(c1.equals(c3));
    }

    public static void main(String[] args) {
        new EqualsTests();
    }
}
