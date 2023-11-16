package partie2.cours20_ObjetSuite2;

public class JouerAvecPizza_Cours21 {
    public JouerAvecPizza_Cours21() {
        jouerAvecGetPizza();
    }

    private void jouerAvecGetPizza() {
        Pizza p1;
        Pizza p2;

        p1 = new Pizza(2,4,5,"rouge");

        System.out.println(p1);

        p2 = p1.get();

        System.out.println(p2);

        p2.avancerX();

        System.out.println(p1);
        System.out.println(p2);
    }

    public static void main(String[] args) {
        new JouerAvecPizza_Cours21();
    }
}
